package net.mcreator.jimsmineshaft.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class ParadiseTicksProcedure {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).sentencedToDeath) {
			if (world instanceof ServerLevel _serverLevel)
				_serverLevel.getGameRules().getRule(GameRules.RULE_DO_IMMEDIATE_RESPAWN).set(true, world.getServer());
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "kill");
				}
			}
			JimsmineshaftMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverLevel)
					_serverLevel.getGameRules().getRule(GameRules.RULE_DO_IMMEDIATE_RESPAWN).set(false, world.getServer());
			});
		}
		if (entity.isAlive() && !entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).sentencedToDeath) {
			if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("jimsmineshaft:paradise"))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 5, 4, false, false));
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.paradise_ticks = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).paradise_ticks + 1;
					_vars.syncPlayerVariables(entity);
				}
				if (entity instanceof Player) {
					if (entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES).paradise_ticks > 740) {
						{
							JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
							_vars.sentencedToDeath = true;
							_vars.syncPlayerVariables(entity);
						}
						if (entity instanceof ServerPlayer player10)
							PacketDistributor.sendToPlayer(player10, new ForceParadiseCrashMessage(""));
					}
				}
			} else {
				{
					JimsmineshaftModVariables.PlayerVariables _vars = entity.getData(JimsmineshaftModVariables.PLAYER_VARIABLES);
					_vars.paradise_ticks = 0;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}