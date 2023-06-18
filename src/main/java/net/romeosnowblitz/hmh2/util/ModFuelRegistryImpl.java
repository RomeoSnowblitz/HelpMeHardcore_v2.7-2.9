/*
 * Copyright (c) 2016, 2017, 2018, 2019 FabricMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.romeosnowblitz.hmh2.util;

import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.tag.TagKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

// TODO: Clamp values to 32767 (+ add hook for mods which extend the limit to disable the check?)
public final class ModFuelRegistryImpl implements FuelRegistry {
	private static final Logger LOGGER = LoggerFactory.getLogger(ModFuelRegistryImpl.class);
	private final Object2IntMap<ItemConvertible> itemCookTimes = new Object2IntLinkedOpenHashMap<>();
	private final Object2IntMap<TagKey<Item>> tagCookTimes = new Object2IntLinkedOpenHashMap<>();
	private volatile Map<Item, Integer> fuelTimeCache = null; // thread safe via copy-on-write mechanism

	public ModFuelRegistryImpl() {
		ServerLifecycleEvents.END_DATA_PACK_RELOAD.register((server, serverResourceManager, success) -> {
			if (success) {
				resetCache();
			}
		});
	}

	public Map<Item, Integer> getFuelTimes() {
		Map<Item, Integer> ret = fuelTimeCache;

		if (ret == null) {
			// fuelTimeCache = ret = new IdentityHashMap<>(ModAbstractFurnaceBlockEntity.createModFuelTimeMap()); // IdentityHashMap is faster than vanilla's LinkedHashMap and suitable for Item keys
		}

		return ret;
	}

	@Override
	public Integer get(ItemConvertible item) {
		return getFuelTimes().get(item.asItem());
	}

	@Override
	public void add(ItemConvertible item, Integer cookTime) {
		if (cookTime > 32767) {
			LOGGER.warn("Tried to register an overly high cookTime: " + cookTime + " > 32767! (" + item + ")");
		}

		itemCookTimes.put(item, cookTime.intValue());
		resetCache();
	}

	@Override
	public void add(TagKey<Item> tag, Integer cookTime) {
		if (cookTime > 32767) {
			LOGGER.warn("Tried to register an overly high cookTime: " + cookTime + " > 32767! (" + getTagName(tag) + ")");
		}

		tagCookTimes.put(tag, cookTime.intValue());
		resetCache();
	}

	@Override
	public void remove(ItemConvertible item) {
		add(item, 0);
		resetCache();
	}

	@Override
	public void remove(TagKey<Item> tag) {
		add(tag, 0);
		resetCache();
	}

	@Override
	public void clear(ItemConvertible item) {
		itemCookTimes.removeInt(item);
		resetCache();
	}

	@Override
	public void clear(TagKey<Item> tag) {
		tagCookTimes.removeInt(tag);
		resetCache();
	}

	/*
	public void apply(Map<Item, Integer> map) {
		// tags take precedence before blocks
		for (TagKey<Item> tag : tagCookTimes.keySet()) {
			int time = tagCookTimes.getInt(tag);

			if (time <= 0) {
				for (RegistryEntry<Item> key : Registries.ITEM.iterateEntries(tag)) {
					final Item item = key.value();
					map.remove(item);
				}
			} else {
				ModAbstractFurnaceBlockEntity.addModFuel(map, tag, time);
			}
		}

		for (ItemConvertible item : itemCookTimes.keySet()) {
			int time = itemCookTimes.getInt(item);

			if (time <= 0) {
				map.remove(item.asItem());
			}
		}
	}
	 */

	private static String getTagName(TagKey<?> tag) {
		return tag.id().toString();
	}

	public void resetCache() {
		fuelTimeCache = null;
	}
}
