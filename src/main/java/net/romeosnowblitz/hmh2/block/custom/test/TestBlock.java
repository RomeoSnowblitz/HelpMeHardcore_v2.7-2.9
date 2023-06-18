package net.romeosnowblitz.hmh2.block.custom.test;

/*
public class TestBlock extends Block {
    public static final IntProperty AGE;
    public static final int MAX_AGE = 15;
    protected static final int field_31045 = 1;
    private final RegistryKey<ConfiguredFeature<?, ?>> featureKey;
    public static final BooleanProperty LIT;
    public TestBlock(Settings settings, RegistryKey<ConfiguredFeature<?, ?>> featureKey) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(AGE, 0));
        this.featureKey = featureKey;
    }




    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        if(world.isClient()){
            Direction north = Direction.NORTH;Direction south = Direction.SOUTH;Direction east= Direction.EAST;Direction west = Direction.WEST;

           if(placer.getHorizontalFacing() == north) {placer.setVelocity(0, 4, -8);}
           if(placer.getHorizontalFacing() == south) {placer.setVelocity(0, 4, 8);}
           if(placer.getHorizontalFacing() == east) {placer.setVelocity(8, 4, 0);}
           if(placer.getHorizontalFacing() == west) {placer.setVelocity(-8, 4, 0);}
           if(placer.isSneaking() && placer.getHorizontalFacing() == north) {placer.setVelocity(0, 4, 8);}
           if(placer.isSneaking() && placer.getHorizontalFacing() == south)  {placer.setVelocity(0, 4, -8);}
           if(placer.isSneaking() && placer.getHorizontalFacing() == east)  {placer.setVelocity(-8, 4, 0);}
           if(placer.isSneaking() && placer.getHorizontalFacing() == west)  {placer.setVelocity(8, 4, 0);}

        }
        if (world.getDimension().ultrawarm()) {
            world.setBlockState(pos, Blocks.SPONGE.getDefaultState(), 3);
            world.syncWorldEvent(2009, pos, 0);
            world.playSound((PlayerEntity)null, pos, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 1.0F, (1.0F + world.getRandom().nextFloat() * 0.2F) * 0.7F);
        }
    }

    private static boolean isLapisNearby(WorldView world, BlockPos pos) {
        Iterator<BlockPos> var2 = BlockPos.iterate(pos.add(-4, 0, -4), pos.add(4, 1, 4)).iterator();
        BlockPos blockPos;do {if (!var2.hasNext()) {return false;}blockPos = var2.next();
        } while(!world.getBlockState(blockPos).isOf(Blocks.LAPIS_BLOCK));return true;
    }

    private static boolean isRedstoneNearby(WorldView world, BlockPos pos) {
        Iterator<BlockPos> var2 = BlockPos.iterate(pos.add(-4, 0, -4), pos.add(4, 1, 4)).iterator();
        BlockPos blockPos;do {if (!var2.hasNext()) {return false;}blockPos = var2.next();
        } while(!world.getBlockState(blockPos).isOf(Blocks.REDSTONE_BLOCK));return true;
    }
    private static boolean isCoalNearby(WorldView world, BlockPos pos) {
        Iterator<BlockPos> var2 = BlockPos.iterate(pos.add(-4, 0, -4), pos.add(4, 1, 4)).iterator();
        BlockPos blockPos;do {if (!var2.hasNext()) {return false;}blockPos = var2.next();
        } while(!world.getBlockState(blockPos).isOf(Blocks.COAL_BLOCK));return true;
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (!state.canPlaceAt(world, pos)) {
            world.scheduleBlockTick(pos, this, 1);
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        this.update(world, pos);
        super.neighborUpdate(state, world, pos, sourceBlock, sourcePos, notify);
    }

    protected void update(World world, BlockPos pos) {
        if (this.absorbWater(world, pos)) {
            world.setBlockState(pos, Blocks.WET_SPONGE.getDefaultState(), 2);
            world.syncWorldEvent(2001, pos, Block.getRawIdFromState(Blocks.LAVA.getDefaultState()));
        }
    }

    private boolean absorbWater(World world, BlockPos pos) {
        Queue<Pair<BlockPos, Integer>> queue = Lists.newLinkedList();
        queue.add(new Pair(pos, 0));
        int i = 0;

        while(!queue.isEmpty()) {
            Pair<BlockPos, Integer> pair = (Pair)queue.poll();
            BlockPos blockPos = (BlockPos)pair.getLeft();
            int j = (Integer)pair.getRight();
            Direction[] var8 = Direction.values();
            int var9 = var8.length;

            for(int var10 = 0; var10 < var9; ++var10) {
                Direction direction = var8[var10];
                BlockPos blockPos2 = blockPos.offset(direction);
                BlockState blockState = world.getBlockState(blockPos2);
                FluidState fluidState = world.getFluidState(blockPos2);
                Material material = blockState.getMaterial();
                if (fluidState.isIn(FluidTags.LAVA)) {
                    if (blockState.getBlock() instanceof FluidDrainable && !((FluidDrainable)blockState.getBlock()).tryDrainFluid(world, blockPos2, blockState).isEmpty()) {
                        ++i;
                        if (j <100000) {
                            queue.add(new Pair(blockPos2, j + 1));
                        }
                    } else if (blockState.getBlock() instanceof FluidBlock) {
                        world.setBlockState(blockPos2, Blocks.AIR.getDefaultState(), 3);
                        ++i;
                        if (j < 100000) {
                            queue.add(new Pair(blockPos2, j + 1));
                        }
                    } else if (material == Material.UNDERWATER_PLANT || material == Material.REPLACEABLE_UNDERWATER_PLANT) {
                        BlockEntity blockEntity = blockState.hasBlockEntity() ? world.getBlockEntity(blockPos2) : null;
                        dropStacks(blockState, world, blockPos2, blockEntity);
                        world.setBlockState(blockPos2, Blocks.AIR.getDefaultState(), 3);
                        ++i;
                        if (j < 100000) {
                            queue.add(new Pair(blockPos2, j + 1));
                        }
                    }
                }
            }

            if (i > 1000000) {
                break;
            }
        }
        return i > 0;
    }

    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {

        if (world instanceof ServerWorld && !entity.hasVehicle() && !entity.hasPassengers() && entity.canUsePortals() && VoxelShapes.matchesAnywhere(VoxelShapes.cuboid(entity.getBoundingBox().offset((double)(-pos.getX()), (double)(-pos.getY()), (double)(-pos.getZ()))), state.getOutlineShape(world, pos), BooleanBiFunction.AND)) {
            RegistryKey<World> registryKey = world.getRegistryKey() == World.END ? World.OVERWORLD : World.END;
            ServerWorld serverWorld = ((ServerWorld)world).getServer().getWorld(registryKey);
            if (serverWorld == null) {
                return;
            }
            entity.moveToWorld(serverWorld);
        }

        if (world instanceof ServerWorld && entity instanceof PlayerEntity) {
            world.breakBlock(new BlockPos(pos), true, entity);
        }
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (player.canModifyBlocks()) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN, 1000));
            world.playSound(player, pos, SoundEvents.BLOCK_AMETHYST_BLOCK_HIT, SoundCategory.BLOCKS, 1.0F, 0.5F + world.random.nextFloat() * 1.2F);
            ItemEntity itemEntity = new ItemEntity(world, (double) pos.getX() + 0.5, (double) pos.getY() + 1, (double) pos.getZ() + 0.5, new ItemStack(Items.BONE_MEAL));
            world.spawnEntity(itemEntity);
            //this.teleport(state, world, pos);
        }
        if (itemStack.isOf(Items.SHEARS)) {
            if (!world.isClient) {
                Direction direction = hit.getSide();
                Direction direction2 = direction.getAxis() == Direction.Axis.Y ? player.getHorizontalFacing().getOpposite() : direction;
                world.playSound((PlayerEntity) null, pos, SoundEvents.BLOCK_PUMPKIN_CARVE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                world.setBlockState(pos, (BlockState) Blocks.CARVED_PUMPKIN.getDefaultState().with(CarvedPumpkinBlock.FACING, direction2), 11);
                ItemEntity itemEntity = new ItemEntity(world, (double) pos.getX() + 0.5D + (double) direction2.getOffsetX() * 0.65D, (double) pos.getY() + 0.1D, (double) pos.getZ() + 0.5D + (double) direction2.getOffsetZ() * 0.65D, new ItemStack(Items.PUMPKIN_SEEDS, 4));
                itemEntity.setVelocity(0.05D * (double) direction2.getOffsetX() + world.random.nextDouble() * 0.02D, 0.05D, 0.05D * (double) direction2.getOffsetZ() + world.random.nextDouble() * 0.02D);
                world.spawnEntity(itemEntity);
                itemStack.damage(1, player, (playerx) -> {
                    playerx.sendToolBreakStatus(hand);
                });
                world.emitGameEvent(player, GameEvent.SHEAR, pos);
                player.incrementStat(Stats.USED.getOrCreateStat(Items.SHEARS));
            }
        }
        return ActionResult.SUCCESS;
    }

    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (entity instanceof LivingEntity) {
            ((LivingEntity) entity).heal(1);
            entity.setInNetherPortal(pos);
        }
        super.onSteppedOn(world, pos, state, entity);
    }

    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        if (!world.isClient && world.random.nextFloat() < fallDistance - 0.5F && entity instanceof LivingEntity && (entity instanceof PlayerEntity || world.getGameRules().getBoolean(GameRules.DO_MOB_GRIEFING)) && entity.getWidth() * entity.getWidth() * entity.getHeight() > 0.512F) {
            primeTnt(world, pos);
        }
        super.onLandedUpon(world, state, pos, entity, fallDistance);
    }

    public void onProjectileHit(World world, BlockState state, BlockHitResult hit, ProjectileEntity projectile) {
        Block x = Blocks.GOLD_BLOCK;
        BlockPos blockPos = hit.getBlockPos();

        if (!world.isClient && projectile.isOnFire()) {
            world.setBlockState(blockPos.up(), x.getDefaultState());
            world.playSound(null, blockPos, SoundEvents.BLOCK_AMETHYST_BLOCK_HIT, SoundCategory.BLOCKS, 1.0F, 0.5F + world.random.nextFloat() * 1.2F);
            LightningEntity lightningEntity = EntityType.LIGHTNING_BOLT.create(world);
            lightningEntity.refreshPositionAfterTeleport(Vec3d.ofBottomCenter(blockPos.up()));
            world.spawnEntity(lightningEntity);
        }
        if (projectile.isOnFire() || !projectile.isOnFire()) {
            teleport(state, world, blockPos);
            explode(state, world, blockPos);
        }

    }



    public void onBlockBreakStart(BlockState state, World world, BlockPos pos, PlayerEntity player) {
        light(state, world, pos);
        super.onBlockBreakStart(state, world, pos, player);
    }

    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
        if (world instanceof World world2) {
            if (!world2.isAir(pos.up()) && !world2.isAir(pos.up().up()) && !world2.isAir(pos.up().up().north()) &&
                    !world2.isAir(pos.up().up().south()) && !world2.isAir(pos.up().up().east()) && !world2.isAir(pos.up().up().west()) &&
                    !world2.isAir(pos.up().up().north().east()) && !world2.isAir(pos.up().up().north().west()) &&
                    !world2.isAir(pos.up().up().south().east()) && !world2.isAir(pos.up().up().south().west())) {
                world2.setBlockState(pos.up(), Blocks.AIR.getDefaultState());
                world2.setBlockState(pos.up().up(), Blocks.AIR.getDefaultState());
                world2.setBlockState(pos.up().up().north(), Blocks.AIR.getDefaultState());
                world2.setBlockState(pos.up().up().south(), Blocks.AIR.getDefaultState());
                world2.setBlockState(pos.up().up().east(), Blocks.AIR.getDefaultState());
                world2.setBlockState(pos.up().up().west(), Blocks.AIR.getDefaultState());
                world2.setBlockState(pos.up().up().north().east(), Blocks.AIR.getDefaultState());
                world2.setBlockState(pos.up().up().north().west(), Blocks.AIR.getDefaultState());
                world2.setBlockState(pos.up().up().south().east(), Blocks.AIR.getDefaultState());
                world2.setBlockState(pos.up().up().south().west(), Blocks.AIR.getDefaultState());
            }
        }
        ItemEntity itemEntity = new ItemEntity((World) world, pos.getX(),pos.getY(),pos.getZ(), new ItemStack(ModBlocks.TEST_BLOCK));
        world.spawnEntity(itemEntity);

        BlockPos blockPos = pos.up();
        SoldierBeeEntity soldierBeeEntity = MobEntities.SOLDIER_BEE.create((World) world);
        if (world.isAir(blockPos)) {
            soldierBeeEntity.refreshPositionAndAngles((double)pos.getX() + 0.5, pos.getY(), (double)pos.getZ() + 0.5, 0.0f, 0.0f);
            world.spawnEntity(soldierBeeEntity);
        }

        if (isCoalNearby(world, pos)) {
            explode(state, (World) world, pos);
        }
    }
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack stack) {
        player.incrementStat(Stats.MINED.getOrCreateStat(this));
        player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 100));
        player.addExhaustion(0.005F);
        primeTnt(world, pos);
        dropStacks(state, world, pos, blockEntity, player, stack);
    }

    public void onDestroyedByExplosion(World world, BlockPos pos, Explosion explosion) {
        dropExperience((ServerWorld) world, pos, 10000);
    }

    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        Block x = Blocks.IRON_BLOCK;
        BlockPos blockPos = pos.up();
        if (!world.isAir(blockPos)) {
            world.setBlockState(pos.north(), x.getDefaultState());
        }
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        //world.removeBlock(pos, false); This will make the Block Decay
        BlockPos blockPos = pos.down();
        Block y = Blocks.CARVED_PUMPKIN;
        Block x = Blocks.IRON_BLOCK;
        if (world.getBlockState(pos.down()).isOf(Blocks.DIAMOND_BLOCK)) {
            int i;
            for(i = 1; world.getBlockState(pos.down(i)).isOf(this); ++i) {
            }
            if (i < 3) {
                int j = state.get(AGE);
                if (j == 15) {
                    world.setBlockState(pos, x.getDefaultState());
                    world.setBlockState(pos.up(), x.getDefaultState());
                    world.setBlockState(pos.up().north(), x.getDefaultState());
                    world.setBlockState(pos.up().south(), x.getDefaultState());
                    world.setBlockState(pos.up().up(), y.getDefaultState());
                } else {
                    world.setBlockState(pos, state.with(AGE, j + 1), 4);
                }

            }
        }
        if(world.isAir(blockPos) || !world.isAir(blockPos)){
            //this.teleport(state, world, pos);
        }
        if (isLapisNearby(world, pos)) {
            world.getServer().getOverworld().setTimeOfDay(6000L);
        }
        if (isRedstoneNearby(world, pos)) {
            Optional<? extends RegistryEntry<ConfiguredFeature<?, ?>>> optional = world.getRegistryManager().get(RegistryKeys.CONFIGURED_FEATURE).getEntry(this.featureKey);
            if (optional.isEmpty()) {
            } else {
                world.removeBlock(pos, false);
                if (((ConfiguredFeature)((RegistryEntry)optional.get()).value()).generate(world, world.getChunkManager().getChunkGenerator(), random, pos)) {
                } else {
                    world.setBlockState(pos, state, 3);
                }
            }
        }
        super.randomTick(state, world, pos, random);
    }

    public boolean emitsRedstonePower(BlockState state) {
        return true;
    }

    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return 15;
    }

    private static void spawnParticles(World world, BlockPos pos) {
        Random random = world.random;
        Direction[] var5 = Direction.values();
        int var6 = var5.length;
        for(int var7 = 0; var7 < var6; ++var7) {
            Direction direction = var5[var7];
            BlockPos blockPos = pos.offset(direction);
            if (!world.getBlockState(blockPos).isOpaqueFullCube(world, blockPos)) {
                Direction.Axis axis = direction.getAxis();
                double e = axis == Direction.Axis.X ? 0.5D + 0.5625D * (double)direction.getOffsetX() : (double)random.nextFloat();
                double f = axis == Direction.Axis.Y ? 0.5D + 0.5625D * (double)direction.getOffsetY() : (double)random.nextFloat();
                double g = axis == Direction.Axis.Z ? 0.5D + 0.5625D * (double)direction.getOffsetZ() : (double)random.nextFloat();
                world.addParticle(ParticleTypes.HAPPY_VILLAGER, (double)pos.getX() + e, (double)pos.getY() + f, (double)pos.getZ() + g, 0.0D, 0.0D, 0.0D);
            }
        }
    }

    private void explode(BlockState state, World world, BlockPos explodedPos) {
        world.removeBlock(explodedPos, false);
        Objects.requireNonNull(explodedPos);
        final boolean bl2 = world.getFluidState(explodedPos.up()).isIn(FluidTags.LAVA);
        ExplosionBehavior explosionBehavior = new ExplosionBehavior() {
            public Optional<Float> getBlastResistance(Explosion explosion, BlockView world, BlockPos pos, BlockState blockState, FluidState fluidState) {
                return pos.equals(explodedPos) && bl2 ? Optional.of(Blocks.LAVA.getBlastResistance()) : super.getBlastResistance(explosion, world, pos, blockState, fluidState);
            }
        };
        Vec3d vec3d = explodedPos.toCenterPos();
        world.createExplosion(null, DamageSource.badRespawnPoint(vec3d), explosionBehavior, vec3d, 2.0F, true, World.ExplosionSourceType.BLOCK);
    }

    public static void primeTnt(World world, BlockPos pos) {
        primeTnt(world, pos, null);
    }

    private static void primeTnt(World world, BlockPos pos, @Nullable LivingEntity igniter) {
        if (!world.isClient) {
            TntEntity tntEntity = new TntEntity(world, (double)pos.getX() + 0.5D, pos.getY(), (double)pos.getZ() + 0.5D, igniter);
            world.spawnEntity(tntEntity);
            world.playSound(null, tntEntity.getX(), tntEntity.getY(), tntEntity.getZ(), SoundEvents.ENTITY_TNT_PRIMED, SoundCategory.BLOCKS, 1.0F, 1.0F);
            world.emitGameEvent(igniter, GameEvent.PRIME_FUSE, pos);
        }
    }

    private void teleport(BlockState state, World world, BlockPos pos) {
        WorldBorder worldBorder = world.getWorldBorder();

        for(int i = 0; i < 1000; ++i) {
            BlockPos blockPos = pos.add(world.random.nextInt(16) - world.random.nextInt(16), world.random.nextInt(8) - world.random.nextInt(8), world.random.nextInt(16) - world.random.nextInt(16));
            if (world.getBlockState(blockPos).isAir() && worldBorder.contains(blockPos)) {
                if (world.isClient) {
                    for(int j = 0; j < 128; ++j) {
                        double d = world.random.nextDouble();
                        float f = (world.random.nextFloat() - 0.5F) * 0.2F;
                        float g = (world.random.nextFloat() - 0.5F) * 0.2F;
                        float h = (world.random.nextFloat() - 0.5F) * 0.2F;
                        double e = MathHelper.lerp(d, (double)blockPos.getX(), (double)pos.getX()) + (world.random.nextDouble() - 0.5D) + 0.5D;
                        double k = MathHelper.lerp(d, (double)blockPos.getY(), (double)pos.getY()) + world.random.nextDouble() - 0.5D;
                        double l = MathHelper.lerp(d, (double)blockPos.getZ(), (double)pos.getZ()) + (world.random.nextDouble() - 0.5D) + 0.5D;
                        world.addParticle(ParticleTypes.PORTAL, e, k, l, (double)f, (double)g, (double)h);
                    }
                } else {
                    world.setBlockState(blockPos, state, 2);
                    world.removeBlock(pos, false);
                }

                return;
            }
        }

    }

    private static void light(BlockState state, World world, BlockPos pos) {
        if (!(Boolean) state.get(LIT)) {
            world.setBlockState(pos, (BlockState) state.with(LIT, true), 3);
        }
    }

    public boolean hasRandomTicks(BlockState state) {
        return (Boolean)state.get(LIT);
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if ((Boolean)state.get(LIT)) {
            spawnParticles(world, pos);
        }

    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE, LIT);
    }



    static {
        AGE = Properties.AGE_15;
        LIT = RedstoneTorchBlock.LIT;
    }

}

 */
