package com.massivecraft.massivecore.command.type.enumeration;

import com.massivecraft.massivecore.collections.MassiveMap;
import com.massivecraft.massivecore.collections.MassiveSet;
import com.massivecraft.massivecore.util.MUtil;
import com.massivecraft.massivecore.util.Txt;
import org.bukkit.Sound;

import java.util.Map;
import java.util.Set;

public class TypeSound extends TypeEnum<Sound>
{
	// -------------------------------------------- //
	// DATA
	// -------------------------------------------- //
	// https://hub.spigotmc.org/stash/projects/SPIGOT/repos/bukkit/diff/src/main/java/org/bukkit/Sound.java?until=7898a2a2d2d81308e73e9ed37725f53d7ad37bfc&at=refs%2Fheads%2Fmaster
	
	// Maps every sound in Minecraft 1.8 to the new sound in Minecraft 1.9
	public static Map<String, String> FROM_18_TO_19 = new MassiveMap<>(
		"AMBIENCE_CAVE", "AMBIENT_CAVE",
		"AMBIENCE_RAIN", "WEATHER_RAIN",
		"AMBIENCE_THUNDER", "ENTITY_LIGHTNING_THUNDER",
		"ANVIL_BREAK", "BLOCK_ANVIL_BREAK",
		"ANVIL_LAND", "BLOCK_ANVIL_LAND",
		"ANVIL_USE", "BLOCK_ANVIL_USE",
		"ARROW_HIT", "ENTITY_ARROW_HIT",
		"BURP", "ENTITY_PLAYER_BURP",
		"CHEST_CLOSE", "BLOCK_CHEST_CLOSE",
		"CHEST_OPEN", "BLOCK_CHEST_OPEN",
		"CLICK", "UI_BUTTON_CLICK",
		"DOOR_CLOSE", "BLOCK_WOODEN_DOOR_CLOSE",
		"DOOR_OPEN", "BLOCK_WOODEN_DOOR_OPEN",
		"DRINK", "ENTITY_GENERIC_DRINK",
		"EAT", "ENTITY_GENERIC_EAT",
		"EXPLODE", "ENTITY_GENERIC_EXPLODE",
		"FALL_BIG", "ENTITY_GENERIC_BIG_FALL",
		"FALL_SMALL", "ENTITY_GENERIC_SMALL_FALL",
		
		"FIRE", "BLOCK_FIRE_AMBIENT",
		"FIRE_IGNITE", "ITEM_FLINTANDSTEEL_USE",
		"FIZZ", "ENTITY_GENERIC_EXTINGUISH_FIRE",
		"FUSE", "ENTITY_TNT_PRIMED",
		
		"GLASS", "BLOCK_GLASS_BREAK",
		"HURT_FLESH", "ENTITY_GENERIC_HURT",
		"ITEM_BREAK", "ENTITY_ITEM_BREAK",
		"ITEM_PICKUP", "ENTITY_ITEM_PICKUP",
		"LAVA", "BLOCK_LAVA_AMBIENT",
		"LAVA_POP", "BLOCK_LAVA_POP",
		"LEVEL_UP", "ENTITY_PLAYER_LEVELUP",
		"MINECART_BASE", "ENTITY_MINECART_RIDING",
		"MINECART_INSIDE", "ENTITY_MINECART_INSIDE",
		
		"NOTE_BASS", "BLOCK_NOTE_BASS", // NOTE: Duplicate since 1 less sound in 1.9.
		"NOTE_PIANO", "BLOCK_NOTE_HARP",
		"NOTE_BASS_DRUM", "BLOCK_NOTE_BASEDRUM",
		"NOTE_STICKS", "BLOCK_NOTE_HAT",
		"NOTE_BASS_GUITAR", "BLOCK_NOTE_BASS", // NOTE: Duplicate since 1 less sound in 1.9.
		"NOTE_SNARE_DRUM", "BLOCK_NOTE_SNARE",
		"NOTE_PLING", "BLOCK_NOTE_PLING",
		
		"ORB_PICKUP", "ENTITY_EXPERIENCE_ORB_PICKUP",
		"PISTON_EXTEND", "BLOCK_PISTON_EXTEND",
		"PISTON_RETRACT", "BLOCK_PISTON_CONTRACT",
		"PORTAL", "BLOCK_PORTAL_AMBIENT",
		"PORTAL_TRAVEL", "BLOCK_PORTAL_TRAVEL",
		"PORTAL_TRIGGER", "BLOCK_PORTAL_TRIGGER",
		"SHOOT_ARROW", "ENTITY_ARROW_SHOOT",
		"SPLASH", "ENTITY_GENERIC_SPLASH", // TODO: I'm not sure about this one.
		"SPLASH2", "ENTITY_BOBBER_SPLASH", // TODO: I'm not sure about this one.
		"STEP_GRASS", "BLOCK_GRASS_STEP",
		"STEP_GRAVEL", "BLOCK_GRAVEL_STEP",
		"STEP_LADDER", "BLOCK_LADDER_STEP",
		"STEP_SAND", "BLOCK_SAND_STEP",
		"STEP_SNOW", "BLOCK_SNOW_STEP",
		"STEP_STONE", "BLOCK_STONE_STEP",
		"STEP_WOOD", "BLOCK_WOOD_STEP",
		"STEP_WOOL", "BLOCK_CLOTH_STEP",
		"SWIM", "ENTITY_GENERIC_SWIM",
		"WATER", "BLOCK_WATER_AMBIENT",
		"WOOD_CLICK", "BLOCK_WOOD_BUTTON_CLICK_ON",
		
		// Mob sounds
		"BAT_DEATH", "ENTITY_BAT_DEATH",
		"BAT_HURT", "ENTITY_BAT_HURT",
		"BAT_IDLE", "ENTITY_BAT_AMBIENT",
		"BAT_LOOP", "ENTITY_BAT_LOOP",
		"BAT_TAKEOFF", "ENTITY_BAT_TAKEOFF",
		
		"BLAZE_BREATH", "ENTITY_BLAZE_AMBIENT",
		"BLAZE_DEATH", "ENTITY_BLAZE_DEATH",
		"BLAZE_HIT", "ENTITY_BLAZE_HURT",
		
		"CAT_HISS", "ENTITY_CAT_HISS",
		"CAT_HIT", "ENTITY_CAT_HURT",
		"CAT_MEOW", "ENTITY_CAT_AMBIENT",
		"CAT_PURR", "ENTITY_CAT_PURR",
		"CAT_PURREOW", "ENTITY_CAT_PURREOW",
		
		"CHICKEN_IDLE", "ENTITY_CHICKEN_AMBIENT",
		"CHICKEN_HURT", "ENTITY_CHICKEN_HURT",
		"CHICKEN_EGG_POP", "ENTITY_CHICKEN_EGG",
		"CHICKEN_WALK", "ENTITY_CHICKEN_STEP",
		
		"COW_IDLE", "ENTITY_COW_AMBIENT",
		"COW_HURT", "ENTITY_COW_HURT",
		"COW_WALK", "ENTITY_COW_STEP",
		
		"CREEPER_HISS", "ENTITY_CREEPER_PRIMED",
		"CREEPER_DEATH", "ENTITY_CREEPER_DEATH",
		
		"ENDERDRAGON_DEATH", "ENTITY_ENDERDRAGON_DEATH",
		"ENDERDRAGON_GROWL", "ENTITY_ENDERDRAGON_GROWL",
		"ENDERDRAGON_HIT", "ENTITY_ENDERDRAGON_HURT",
		"ENDERDRAGON_WINGS", "ENTITY_ENDERDRAGON_FLAP",
		
		"ENDERMAN_DEATH", "ENTITY_ENDERMEN_DEATH",
		"ENDERMAN_HIT", "ENTITY_ENDERMEN_HURT",
		"ENDERMAN_IDLE", "ENTITY_ENDERMEN_AMBIENT",
		"ENDERMAN_TELEPORT", "ENTITY_ENDERMEN_TELEPORT",
		"ENDERMAN_SCREAM", "ENTITY_ENDERMEN_SCREAM",
		"ENDERMAN_STARE", "ENTITY_ENDERMEN_STARE",
		
		// Really unsure about all of these
		"GHAST_SCREAM", "ENTITY_GHAST_AMBIENT",
		"GHAST_SCREAM2", "ENTITY_GHAST_SCREAM",
		"GHAST_CHARGE", "ENTITY_GHAST_WARN",
		"GHAST_DEATH", "ENTITY_GHAST_DEATH",
		"GHAST_FIREBALL", "ENTITY_GHAST_SHOOT",
		"GHAST_MOAN", "ENTITY_GHAST_HURT",
		
		"IRONGOLEM_DEATH", "ENTITY_IRONGOLEM_DEATH",
		"IRONGOLEM_HIT", "ENTITY_IRONGOLEM_HURT",
		"IRONGOLEM_THROW", "ENTITY_IRONGOLEM_ATTACK",
		"IRONGOLEM_WALK", "ENTITY_IRONGOLEM_STEP",
		
		"MAGMACUBE_WALK", "ENTITY_MAGMACUBE_SQUISH", // TODO: This is a wild guess.
		"MAGMACUBE_WALK2", "ENTITY_MAGMACUBE_HURT", // TODO: This is a wild guess.
		"MAGMACUBE_JUMP", "ENTITY_MAGMACUBE_JUMP",
		
		"PIG_IDLE", "ENTITY_PIG_AMBIENT",
		"PIG_DEATH", "ENTITY_PIG_DEATH",
		"PIG_WALK", "ENTITY_PIG_STEP",
		
		"SHEEP_IDLE", "ENTITY_SHEEP_AMBIENT",
		"SHEEP_SHEAR", "ENTITY_SHEEP_SHEAR",
		"SHEEP_WALK", "ENTITY_SHEEP_STEP",
		
		"SILVERFISH_HIT", "ENTITY_SILVERFISH_HURT",
		"SILVERFISH_KILL", "ENTITY_SILVERFISH_DEATH",
		"SILVERFISH_IDLE", "ENTITY_SILVERFISH_AMBIENT",
		"SILVERFISH_WALK", "ENTITY_SILVERFISH_STEP",
		
		"SKELETON_IDLE", "ENTITY_SKELETON_AMBIENT",
		"SKELETON_DEATH", "ENTITY_SKELETON_DEATH",
		"SKELETON_HURT", "ENTITY_SKELETON_HURT",
		"SKELETON_WALK", "ENTITY_SKELETON_STEP",
		
		"SLIME_ATTACK", "ENTITY_SLIME_ATTACK",
		"SLIME_WALK", "ENTITY_SLIME_SQUISH",
		"SLIME_WALK2", "ENTITY_SLIME_JUMP",
		
		"SPIDER_IDLE", "ENTITY_SPIDER_AMBIENT",
		"SPIDER_DEATH", "ENTITY_SPIDER_DEATH",
		"SPIDER_WALK", "ENTITY_SPIDER_STEP",
		
		"WITHER_DEATH", "ENTITY_WITHER_DEATH",
		"WITHER_HURT", "ENTITY_WITHER_HURT",
		"WITHER_IDLE", "ENTITY_WITHER_AMBIENT",
		"WITHER_SHOOT", "ENTITY_WITHER_SHOOT",
		"WITHER_SPAWN", "ENTITY_WITHER_SPAWN",
		
		"WOLF_BARK", "ENTITY_WOLF_AMBIENT",
		"WOLF_DEATH", "ENTITY_WOLF_DEATH",
		"WOLF_GROWL", "ENTITY_WOLF_GROWL",
		"WOLF_HOWL", "ENTITY_WOLF_HOWL",
		"WOLF_HURT", "ENTITY_WOLF_HURT",
		"WOLF_PANT", "ENTITY_WOLF_PANT",
		"WOLF_SHAKE", "ENTITY_WOLF_SHAKE",
		"WOLF_WALK", "ENTITY_WOLF_STEP",
		"WOLF_WHINE", "ENTITY_WOLF_WHINE",
		
		"ZOMBIE_METAL", "ENTITY_ZOMBIE_ATTACK_IRON_DOOR",
		"ZOMBIE_WOOD", "ENTITY_ZOMBIE_ATTACK_DOOR_WOOD",
		"ZOMBIE_WOODBREAK", "ENTITY_ZOMBIE_BREAK_DOOR_WOOD",
		"ZOMBIE_IDLE", "ENTITY_ZOMBIE_AMBIENT",
		"ZOMBIE_DEATH", "ENTITY_ZOMBIE_DEATH",
		"ZOMBIE_HURT", "ENTITY_ZOMBIE_HURT",
		"ZOMBIE_INFECT", "ENTITY_ZOMBIE_INFECT",
		"ZOMBIE_UNFECT", "ENTITY_ZOMBIE_VILLAGER_CONVERTED", // TODO: I'm not sure about this one.
		"ZOMBIE_REMEDY", "ENTITY_ZOMBIE_VILLAGER_CURE", // TODO: I'm not sure about this one.
		"ZOMBIE_WALK", "ENTITY_ZOMBIE_STEP",
		
		"ZOMBIE_PIG_IDLE", "ENTITY_ZOMBIE_PIG_AMBIENT",
		"ZOMBIE_PIG_ANGRY", "ENTITY_ZOMBIE_PIG_ANGRY",
		"ZOMBIE_PIG_DEATH", "ENTITY_ZOMBIE_PIG_DEATH",
		"ZOMBIE_PIG_HURT", "ENTITY_ZOMBIE_PIG_HURT",
		
		// Dig Sounds
		"DIG_WOOL", "BLOCK_CLOTH_BREAK",
		"DIG_GRASS", "BLOCK_GRASS_BREAK",
		"DIG_GRAVEL", "BLOCK_GRAVEL_BREAK",
		"DIG_SAND", "BLOCK_SAND_BREAK",
		"DIG_SNOW", "BLOCK_SNOW_BREAK",
		"DIG_STONE", "BLOCK_STONE_BREAK",
		"DIG_WOOD", "BLOCK_WOOD_BREAK",
		
		// Fireworks
		"FIREWORK_BLAST", "ENTITY_FIREWORK_BLAST",
		"FIREWORK_BLAST2", "ENTITY_FIREWORK_BLAST_FAR",
		"FIREWORK_LARGE_BLAST", "ENTITY_FIREWORK_LARGE_BLAST",
		"FIREWORK_LARGE_BLAST2", "ENTITY_FIREWORK_LARGE_BLAST_FAR",
		"FIREWORK_TWINKLE", "ENTITY_FIREWORK_TWINKLE",
		"FIREWORK_TWINKLE2", "ENTITY_FIREWORK_TWINKLE_FAR",
		"FIREWORK_LAUNCH", "ENTITY_FIREWORK_LAUNCH",
		"SUCCESSFUL_HIT", "ENTITY_FIREWORK_SHOOT",
		
		// Horses
		"HORSE_ANGRY", "ENTITY_HORSE_ANGRY",
		"HORSE_ARMOR", "ENTITY_HORSE_ARMOR",
		"HORSE_BREATHE", "ENTITY_HORSE_BREATHE",
		"HORSE_DEATH", "ENTITY_HORSE_DEATH",
		"HORSE_GALLOP", "ENTITY_HORSE_GALLOP",
		"HORSE_HIT", "ENTITY_HORSE_HURT",
		"HORSE_IDLE", "ENTITY_HORSE_AMBIENT",
		"HORSE_JUMP", "ENTITY_HORSE_JUMP",
		"HORSE_LAND", "ENTITY_HORSE_LAND",
		"HORSE_SADDLE", "ENTITY_HORSE_SADDLE",
		"HORSE_SOFT", "ENTITY_HORSE_STEP",
		"HORSE_WOOD", "ENTITY_HORSE_STEP_WOOD",
		
		"DONKEY_ANGRY", "ENTITY_DONKEY_ANGRY",
		"DONKEY_DEATH", "ENTITY_DONKEY_DEATH",
		"DONKEY_HIT", "ENTITY_DONKEY_HURT",
		"DONKEY_IDLE", "ENTITY_DONKEY_AMBIENT",
		
		"HORSE_SKELETON_DEATH", "ENTITY_SKELETON_HORSE_DEATH",
		"HORSE_SKELETON_HIT", "ENTITY_SKELETON_HORSE_HURT",
		"HORSE_SKELETON_IDLE", "ENTITY_SKELETON_HORSE_AMBIENT",
		
		"HORSE_ZOMBIE_DEATH", "ENTITY_ZOMBIE_HORSE_DEATH",
		"HORSE_ZOMBIE_HIT", "ENTITY_ZOMBIE_HORSE_HURT",
		"HORSE_ZOMBIE_IDLE", "ENTITY_ZOMBIE_HORSE_AMBIENT",
		
		// Villager
		"VILLAGER_DEATH", "ENTITY_VILLAGER_DEATH",
		"VILLAGER_HAGGLE", "ENTITY_VILLAGER_TRADING",
		"VILLAGER_HIT", "ENTITY_VILLAGER_HURT",
		"VILLAGER_IDLE", "ENTITY_VILLAGER_AMBIENT",
		"VILLAGER_NO", "ENTITY_VILLAGER_NO",
		"VILLAGER_YES", "ENTITY_VILLAGER_YES"
	);
	
	public static Map<String, Set<String>> FROM_19_TO_18 = MUtil.reverseIndex(FROM_18_TO_19);
	
	// -------------------------------------------- //
	// VALUE OF
	// -------------------------------------------- //
	
	public static Sound valueOf(String string)
	{
		string = get().prepareOptionKey(string);
		return get().getOptions().get(string);
	}
	
	// -------------------------------------------- //
	// INSTANCE & CONSTRUCT
	// -------------------------------------------- //
	
	private static TypeSound i = new TypeSound();
	public static TypeSound get() { return i; }
	public TypeSound()
	{
		super(Sound.class);
		this.setHelp(
			Txt.parse("<RED>https://hub.spigotmc.org/stash/projects/SPIGOT/repos/bukkit/browse/src/main/java/org/bukkit/Sound.java")
		);
	}
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public Set<String> getNamesInner(Sound value)
	{
		// Create
		Set<String> ret = new MassiveSet<>();
		
		// Fill
		for (String id : this.getIdsInner(value))
		{
			ret.add(Txt.getNicedEnumString(id));
		}
		
		// Return
		return ret;
	}
	
	@Override
	public Set<String> getIdsInner(Sound value)
	{
		// Create
		Set<String> ret = new MassiveSet<>();
		
		// Fill
		String current = value.name();
		ret.add(current);
		
		String from18to19 = FROM_18_TO_19.get(current);
		if (from18to19 != null) ret.add(from18to19);
		
		Set<String> from19to18 = FROM_19_TO_18.get(current);
		if (from19to18 != null) ret.addAll(from19to18);
		
		// Return
		return ret;
	}

}
