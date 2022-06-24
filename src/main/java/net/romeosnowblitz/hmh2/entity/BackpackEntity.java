package net.romeosnowblitz.hmh2.entity;


import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.romeosnowblitz.hmh2.item.inventory.ImplementedInventory;
import net.romeosnowblitz.hmh2.recipe.FreezerRecipe;
import net.romeosnowblitz.hmh2.screen.BackpackScreenHandler;
import net.romeosnowblitz.hmh2.screen.FreezerScreenHandler;
import net.romeosnowblitz.hmh2.util.ModFuelRegistry;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class BackpackEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(3, ItemStack.EMPTY);


    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 72;
    private int fuelTime = 0;
    private int maxFuelTime = 0;

    public BackpackEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.BACKPACK, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                switch (index) {
                    case 0: return BackpackEntity.this.progress;
                    case 1: return BackpackEntity.this.maxProgress;
                    case 2: return BackpackEntity.this.fuelTime;
                    case 3: return BackpackEntity.this.maxFuelTime;
                    default: return 0;
                }
            }

            public void set(int index, int value) {
                switch(index) {
                    case 0: BackpackEntity.this.progress = value; break;
                    case 1: BackpackEntity.this.maxProgress = value; break;
                    case 2: BackpackEntity.this.fuelTime = value; break;
                    case 3: BackpackEntity.this.maxFuelTime = value; break;
                }
            }

            public int size() {
                return 4;
            }
        };
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("Backpack");
    }


    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new BackpackScreenHandler(syncId, inv, this, this.propertyDelegate);
    }
}