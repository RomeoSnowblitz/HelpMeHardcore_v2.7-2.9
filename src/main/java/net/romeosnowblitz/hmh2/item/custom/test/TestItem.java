package net.romeosnowblitz.hmh2.item.custom.test;


import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.include.com.google.common.collect.ImmutableMap;

import java.util.Map;

/*
public class TestItem extends Item {
    protected static final ImmutableMap PATH_STATES;protected static final Map<Block, Block> STRIPPED_BLOCKS;private final Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;

    public TestItem(int attackDamage, float attackSpeed, int plusHealth,  Settings settings) {
        super(settings);
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "Weapon modifier", attackDamage, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ATTACK_SPEED, new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_ID, "Weapon modifier", attackSpeed, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_ID, "Weapon modifier", plusHealth, EntityAttributeModifier.Operation.ADDITION));this.attributeModifiers = builder.build();}



    public boolean isEnchantable(ItemStack stack) {
        return stack.getCount() == 1;
    }public int getEnchantability() {
        return 1;
    }public boolean hasGlint(ItemStack stack) {
        return false;
    }
    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner) {return !miner.isCreative();}public boolean isSuitableFor(BlockState state) {return state.isOf(Blocks.COBWEB);}
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {if (state.isOf(Blocks.COBWEB)) {return 15.0F;} else {Material material = state.getMaterial();
        return material != Material.PLANT && material != Material.REPLACEABLE_PLANT && !state.isIn(BlockTags.LEAVES) && material != Material.GOURD ? 1.0F : 1.5F;}}
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {if (entity instanceof Saddleable saddleable && entity.isAlive()) {if (!saddleable.isSaddled() && saddleable.canBeSaddled()) {
        if (!user.world.isClient) {saddleable.saddle(SoundCategory.NEUTRAL);entity.world.emitGameEvent(entity, GameEvent.EQUIP, entity.getPos());stack.decrement(1);}return ActionResult.success(user.world.isClient);}}
        if (stack.hasCustomName() && !(entity instanceof PlayerEntity)) {if (!user.world.isClient && entity.isAlive()) {entity.setCustomName(stack.getName());
            if (entity instanceof MobEntity) {((MobEntity)entity).setPersistent();}stack.decrement(1);}return ActionResult.success(user.world.isClient);} else {return ActionResult.PASS;}}public ActionResult useOnBlock(ItemUsageContext context) {createParticles(context.getWorld(), context.getBlockPos(), 100);
        if (context.getPlayer().getStackInHand(Hand.OFF_HAND).isOf(Items.RAW_COPPER)) {World world = context.getWorld();BlockPos blockPos = context.getBlockPos();BlockState blockState = world.getBlockState(blockPos);
            if (blockState.isIn(BlockTags.FENCES)) {PlayerEntity playerEntity = context.getPlayer();if (!world.isClient && playerEntity != null) {playerEntity.addStatusEffect(
                    new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 100, 100));}return ActionResult.success(world.isClient);} else {return ActionResult.PASS;}}
        if (context.getPlayer().getStackInHand(Hand.OFF_HAND).isOf(Items.COMPASS)) {World world = context.getWorld();PlayerEntity playerEntity = context.getPlayer();ItemStack itemStack = context.getStack();
            boolean bl = !playerEntity.getAbilities().creativeMode && itemStack.getCount() == 1;if (bl) {ItemStack itemStack2 = new ItemStack(Items.CHARCOAL, 1);
                NbtCompound nbtCompound = itemStack.hasNbt() ? itemStack.getNbt().copy() : new NbtCompound();itemStack2.setNbt(nbtCompound);if (!playerEntity.getAbilities().creativeMode) {itemStack.decrement(1);}
                if (!playerEntity.getInventory().insertStack(itemStack2)) {playerEntity.dropItem(itemStack2, false);}}return ActionResult.success(world.isClient);}
        if (context.getPlayer().getStackInHand(Hand.OFF_HAND).isOf(Items.STICK)) {World world = context.getWorld();BlockPos blockPos = context.getBlockPos();PlayerEntity playerEntity = context.getPlayer();
            BlockState blockState = world.getBlockState(blockPos);Optional<BlockState> optional = Optional.ofNullable(STRIPPED_BLOCKS.get(blockState.getBlock())).map((block) -> block.getDefaultState().with(
                    PillarBlock.AXIS, blockState.get(PillarBlock.AXIS)));Optional<BlockState> optional2 = Oxidizable.getDecreasedOxidationState(blockState);Optional<BlockState> optional3 =
                    Optional.ofNullable((Block)((BiMap)HoneycombItem.WAXED_TO_UNWAXED_BLOCKS.get()).get(blockState.getBlock())).map((block) -> block.getStateWithProperties(blockState));
            ItemStack itemStack = context.getStack();Optional<BlockState> optional4 = Optional.empty();if (optional.isPresent()) {world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                optional4 = optional;} else if (optional2.isPresent()) {world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_SCRAPE, SoundCategory.BLOCKS, 1.0F, 1.0F);world.syncWorldEvent(playerEntity, 3005, blockPos, 0);optional4 = optional2;} else if (optional3.isPresent()) {
                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_AXE_WAX_OFF, SoundCategory.BLOCKS, 1.0F, 1.0F);world.syncWorldEvent(playerEntity, 3004, blockPos, 0);optional4 = optional3;}
            if (optional4.isPresent()) {if (playerEntity instanceof ServerPlayerEntity) {Criteria.ITEM_USED_ON_BLOCK.trigger((ServerPlayerEntity)playerEntity, blockPos, itemStack);}
                world.setBlockState(blockPos, optional4.get(), 11);world.emitGameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Emitter.of(playerEntity, optional4.get()));
                if (playerEntity != null) {itemStack.damage(1, playerEntity, (p) -> p.sendToolBreakStatus(context.getHand()));}return ActionResult.success(world.isClient);} else {return ActionResult.PASS;}}
        if (context.getPlayer().getStackInHand(Hand.OFF_HAND).isOf(Items.IRON_INGOT)) {if(context.getPlayer() instanceof ServerPlayerEntity serverPlayer) {if (serverPlayer.getStatHandler().getStat(Stats.USED.getOrCreateStat(Items.EGG)) >= 10) {
                    serverPlayer.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 1000));}}World world = context.getWorld();BlockPos blockPos = context.getBlockPos();BlockState blockState = world.getBlockState(blockPos);
            if (context.getSide() == Direction.DOWN) {return ActionResult.PASS;} else {PlayerEntity playerEntity = context.getPlayer();BlockState blockState2 = PATH_STATES.get(blockState.getBlock());BlockState blockState3 = null;
                if (blockState2 != null && world.getBlockState(blockPos.up()).isAir()) {world.playSound(playerEntity, blockPos, SoundEvents.ITEM_SHOVEL_FLATTEN, SoundCategory.BLOCKS, 1.0F, 1.0F);blockState3 = blockState2;
                } else if (blockState.getBlock() instanceof CampfireBlock && blockState.get(CampfireBlock.LIT)) {if (!world.isClient()) {world.syncWorldEvent(null, 1009, blockPos, 0);}
                    CampfireBlock.extinguish(context.getPlayer(), world, blockPos, blockState);blockState3 = blockState.with(CampfireBlock.LIT, false);}if (blockState3 != null) {if (!world.isClient) {
                        world.setBlockState(blockPos, blockState3, 11);world.emitGameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Emitter.of(playerEntity, blockState3));if (playerEntity != null) {
                            context.getStack().damage(1, playerEntity, (p) -> p.sendToolBreakStatus(context.getHand()));}}return ActionResult.success(world.isClient);} else {return ActionResult.PASS;}}}
        if (context.getPlayer().getStackInHand(Hand.OFF_HAND).isOf(Items.FLINT)) {PlayerEntity playerEntity = context.getPlayer();World world = context.getWorld();BlockPos blockPos = context.getBlockPos();
            BlockState blockState = world.getBlockState(blockPos);if (!CampfireBlock.canBeLit(blockState) && !CandleBlock.canBeLit(blockState) && !CandleCakeBlock.canBeLit(blockState)) {BlockPos blockPos2 = blockPos.offset(context.getSide());
                if (AbstractFireBlock.canPlaceAt(world, blockPos2, context.getPlayerFacing())) {world.playSound(playerEntity, blockPos2, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, world.getRandom().nextFloat() * 0.4F + 0.8F);
                    BlockState blockState2 = AbstractFireBlock.getState(world, blockPos2);world.setBlockState(blockPos2, blockState2, 11);world.emitGameEvent(playerEntity, GameEvent.BLOCK_PLACE, blockPos);ItemStack itemStack = context.getStack();
                    if (playerEntity instanceof ServerPlayerEntity) {Criteria.PLACED_BLOCK.trigger((ServerPlayerEntity) playerEntity, blockPos2, itemStack);itemStack.damage(1, playerEntity, (p) -> p.sendToolBreakStatus(context.getHand()));}
                    return ActionResult.success(world.isClient());} else {return ActionResult.FAIL;}} else {world.playSound(playerEntity, blockPos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F,
                    world.getRandom().nextFloat() * 0.4F + 0.8F);world.setBlockState(blockPos, blockState.with(Properties.LIT, true), 11);world.emitGameEvent(playerEntity, GameEvent.BLOCK_CHANGE, blockPos);
                if (playerEntity != null) {context.getStack().damage(1, playerEntity, (p) -> p.sendToolBreakStatus(context.getHand()));}return ActionResult.success(world.isClient());}}return ActionResult.PASS;}
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {if (user.getStackInHand(Hand.OFF_HAND).isOf(Items.EMERALD)) {ItemStack itemStack = user.getStackInHand(hand);
            world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_ENDER_PEARL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F));
            user.getItemCooldownManager().set(this, 20);if (!world.isClient) {EnderPearlEntity enderPearlEntity = new EnderPearlEntity(world, user);enderPearlEntity.setItem(itemStack);
                enderPearlEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 1.5F, 1.0F);world.spawnEntity(enderPearlEntity);}user.incrementStat(Stats.USED.getOrCreateStat(this));
            if (!user.getAbilities().creativeMode) {itemStack.decrement(1);}return TypedActionResult.success(itemStack, world.isClient());}
        if (user.getStackInHand(Hand.OFF_HAND).isOf(Items.EGG)) {ItemStack itemStack = user.getStackInHand(hand);world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_EGG_THROW,
                SoundCategory.PLAYERS, 0.5F, 0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F));if (!world.isClient) {EggEntity eggEntity = new EggEntity(world, user);eggEntity.setItem(itemStack);
                eggEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 1.5F, 1.0F);world.spawnEntity(eggEntity);}user.incrementStat(Stats.USED.getOrCreateStat(this));
                if (!user.getAbilities().creativeMode) {itemStack.decrement(1);}return TypedActionResult.success(itemStack, world.isClient());}
        if (user.getStackInHand(Hand.OFF_HAND).isOf(Items.PUMPKIN_SEEDS)) {ItemStack itemStack = user.getStackInHand(hand);world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_SNOWBALL_THROW,
                SoundCategory.NEUTRAL, 0.5F, 0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F));if (!world.isClient) {SnowballEntity snowballEntity = new SnowballEntity(world, user);snowballEntity.setItem(itemStack);
                snowballEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 1.5F, 1.0F);world.spawnEntity(snowballEntity);}user.incrementStat(Stats.USED.getOrCreateStat(this));
            if (!user.getAbilities().creativeMode) {itemStack.decrement(1);}return TypedActionResult.success(itemStack, world.isClient());}return ItemUsage.consumeHeldItem(world, user, hand);}
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.EAT;
    }public int getMaxUseTime(ItemStack stack) {
        return 20;
    }
    public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {user.playSound(SoundEvents.ITEM_SPYGLASS_STOP_USING, 1.0F, 1.0F);}
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {if (user instanceof ServerPlayerEntity serverPlayerEntity) {Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
        serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));}if (user instanceof PlayerEntity && !((PlayerEntity)user).getAbilities().creativeMode) {stack.decrement(1);}
        if (!world.isClient) {user.clearStatusEffects();}return stack.isEmpty() ? new ItemStack(Items.BUCKET) : stack;}
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {stack.damage(1, attacker, (e) -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));return true;}
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {if (state.getHardness(world, pos) != 0.0F) {
        stack.damage(2, miner, (e) -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));}return true;}
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {tooltip.add(Text.translatable("Here is some Text").formatted(Formatting.GRAY));
        if(context.isAdvanced()){tooltip.add(Text.translatable("Here is some Advanced Text").formatted(Formatting.RED));}}
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {return slot == EquipmentSlot.MAINHAND ? this.attributeModifiers : super.getAttributeModifiers(slot);}
    public static void createParticles(WorldAccess world, BlockPos pos, int count) {if (count == 0) {count = 15;}BlockState blockState = world.getBlockState(pos);if (!blockState.isAir()) {double d = 0.5D;double e;
            if (blockState.isOf(Blocks.WATER)) {count *= 3;e = 1.0D;d = 3.0D;} else if (blockState.isOpaqueFullCube(world, pos)) {pos = pos.up();count *= 3;d = 3.0D;e = 1.0D;} else {e = blockState.getOutlineShape(world, pos).getMax(Direction.Axis.Y);}
            world.addParticle(ParticleTypes.HAPPY_VILLAGER, (double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, 0.0D, 0.0D, 0.0D);Random random = world.getRandom();
            for(int i = 0; i < count; ++i) {double f = random.nextGaussian() * 0.02D;double g = random.nextGaussian() * 0.02D;double h = random.nextGaussian() * 0.02D;double j = 0.5D - d;
                double k = (double)pos.getX() + j + random.nextDouble() * d * 2.0D;double l = (double)pos.getY() + random.nextDouble() * e;double m = (double)pos.getZ() + j + random.nextDouble() * d * 2.0D;
                if (!world.getBlockState((new BlockPos(k, l, m)).down()).isAir()) {world.addParticle(ParticleTypes.HAPPY_VILLAGER, k, l, m, f, g, h);}}}}
    static {PATH_STATES = (new ImmutableMap.Builder()).put(Blocks.DIAMOND_BLOCK, Blocks.EMERALD_BLOCK.getDefaultState()).put(Blocks.EMERALD_BLOCK, Blocks.DIAMOND_BLOCK.getDefaultState()).build();
        STRIPPED_BLOCKS = (new ImmutableMap.Builder()).put(Blocks.OAK_LOG, Blocks.BIRCH_LOG).put(Blocks.BIRCH_LOG, Blocks.OAK_LOG).build();}
}

 */
