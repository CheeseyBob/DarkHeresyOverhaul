class Item {
	String name;
	int size;
	
	Item(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	public String getFullName(boolean isItemEquipped) {
		if(isItemEquipped) {
			return name;
		} else {
			return name+" ["+size+"]";
		}
	}
	
	// Melee Weapons //
	public static final Item unarmed_punch = new Item("Punch", 0);
	public static final Item unarmed_kick = new Item("Kick", 0);
	public static final Item improvisedWeapon_small = new Item("Small Improvised Weapon", 1);
	public static final Item improvisedWeapon_smallish = new Item("Smallish Improvised Weapon", 2);
	public static final Item improvisedWeapon_standard = new Item("Standard Improvised Weapon", 3);
	public static final Item improvisedWeapon_largeish = new Item("Largeish Improvised Weapon", 4);
	public static final Item improvisedWeapon_large = new Item("Large Improvised Weapon", 5);
	public static final Item club = new Item("Club", 3);
	public static final Item knife = new Item("Knife", 1);
	public static final Item hammer = new Item("Hammer", 1);
	public static final Item spear = new Item("Spear", 3);
	public static final Item spear_savage = new Item("Savage Spear", 3);
	public static final Item staff = new Item("Staff", 3);
	public static final Item longDagger = new Item("Long Dagger", 1);
	public static final Item warHammer = new Item("War Hammer", 3);
	public static final Item greatWarHammer = new Item("Great War Hammer", 4);
	public static final Item shortsword = new Item("Shortsword", 2);
	public static final Item chainsword = new Item("Chainsword", 3);
	public static final Item longsword = new Item("Longsword", 3);
	public static final Item shockMaul = new Item("Shock Maul", 3);
	
	// Ranged Weapons //
	public static final Item laspistol = new Item("Laspistol", 1);
	public static final Item laspistol_powerPack = new Item("Laspistol Power Pack", 1);
	public static final Item pistol = new Item("Pistol", 1);
	public static final Item pistol_mag = new Item("Pistol Mag", 1);
	public static final Item stubber = new Item("Stubber", 3);
	public static final Item stubber_mag = new Item("Stubber Mag", 1);
	public static final Item autopistol = new Item("Autopistol", 1);
	public static final Item autopistol_mag = new Item("Autopistol Mag", 1);
	public static final Item lasgun = new Item("Lasgun", 3);
	public static final Item lasgun_bayonet = new Item("Lasgun with Bayonet", 3);
	public static final Item lasgun_powerPack = new Item("Lasgun Power Pack", 1);
	public static final Item pumpActionShotgun = new Item("Pump-Action Shotgun", 3);
	public static final Item pumpActionShotgun_mag = new Item("Pump-Action Shotgun Mag", 1);
	public static final Item arbitesShotgun = new Item("Arbites Shotgun", 3);
	public static final Item arbitesShotgun_mag = new Item("Arbites Shotgun Mag", 1);
	public static final Item autostubber = new Item("Autostubber", 4);
	public static final Item autostubber_mag = new Item("Autostubber Mag", 1);
	public static final Item combatShotgun = new Item("Combat Shotgun", 3);
	public static final Item combatShotgun_mag = new Item("Combat Shotgun Mag", 1);
	public static final Item flamer = new Item("Flamer", 3);
	public static final Item flamer_canister = new Item("Flamer Canister", 1);
	public static final Item handFlamer = new Item("Hand Flamer", 2);
	public static final Item handFlamer_canister = new Item("Hand Flamer Canister", 1);
	public static final Item huntingRifle = new Item("Hunting Rifle", 4);
	public static final Item huntingRifle_scoped = new Item("Scoped Hunting Rifle", 4);
	public static final Item huntingRifle_mag = new Item("Hunting Rifle Mag", 1);
	public static final Item heavyStubber = new Item("Heavy Stubber", 5);
	public static final Item heavyStubber_mag = new Item("Heavy Stubber Mag", 2);
	public static final Item heavyStubber_beltFed = new Item("Belt-Fed Heavy Stubber", 5);
	public static final Item heavyStubber_beltBox = new Item("Heavy Stubber Belt Box", 3);
	public static final Item longLas = new Item("Long Las", 4);
	public static final Item longLas_powerPack = new Item("Long Las Power Pack", 1);
	public static final Item lascannon = new Item("Lascannon", 5);
	public static final Item lascannon_powerPack = new Item("Lascannon Power Pack", 2);
	public static final Item plasmaGun = new Item("Plasma Gun", 4);
	public static final Item plasmaGun_canister = new Item("Plasma Gun Canister", 2);
	public static final Item plasmaGun_feedLine = new Item("Plasma Gun with Feed Line", 4);
	public static final Item plasmaGun_tank = new Item("Plasma Gun Tank", 4);
	public static final Item plasmaPistol = new Item("Plasma Pistol", 2);
	public static final Item plasmaPistol_canister = new Item("Plasma Pistol Canister", 1);
	
	// Thrown Weapons //
	public static final Item fragHandGrenade = new Item("Frag Hand-Grenade", 1);
	public static final Item oversizedFragHandGrenade = new Item("Oversized Frag Hand-Grenade", 2);
	public static final Item krakHandGrenade = new Item("Krak Hand-Grenade", 1);
	
	// Consumables //
	public static final Item canOfRecaf = new Item("Can of Recaf", 1);
	public static final Item fullMeal = new Item("Full Meal", 1);
	public static final Item rationBox = new Item("Ration Box", 1);
	public static final Item qualityMeal = new Item("Quality Meal", 1);
	public static final Item injector_stimm = new Item("Injector (Stimm)", 1);
	public static final Item bioPatch_stimm = new Item("Bio-Patch (Stimm)", 1);
	public static final Item medkit = new Item("Medkit", 2);
	public static final Item multiInjector_stimm = new Item("Multi-Injector (Stimm)", 2);
	public static final Item sacredMachineOil = new Item("Vial of Sacred Machine Oil", 1);
	public static final Item qualityMedkit = new Item("Quality Medkit", 3);
	
	// Tools //
	public static final Item dataSlate = new Item("Data-Slate", 1);
	public static final Item pictRecorder = new Item("Pict Recorder", 1);
	public static final Item writing = new Item("Writing Kit", 1);
	public static final Item dataSlate_lore = new Item("Data-Slate (A Lore Topic)", 1);
	public static final Item lockpick = new Item("Lockpick", 0);
	public static final Item psyFocus = new Item("Psy-Focus", 1);
	public static final Item smallRelic = new Item("Small Relic", 1);
	public static final Item scroll_lore = new Item("Scroll (A Lore Topic)", 1);
	public static final Item auspex = new Item("Auspex", 1);
	public static final Item autoquill = new Item("Autoquill", 1);
	public static final Item combiTool = new Item("Combi-Tool", 1);
	public static final Item desktopAutoquill = new Item("Desktop Autoquill", 3);
	public static final Item excruciatorKit = new Item("Excruciator Kit", 1);
	public static final Item gasMask = new Item("Gas Mask", 2);
	public static final Item grapnel = new Item("Grapnel", 3);
	public static final Item lascutter = new Item("Lascutter", 1);
	public static final Item magnoculars = new Item("Magnoculars", 1);
	public static final Item multiKey = new Item("Multi-Key", 1);
	public static final Item smallishRelic = new Item("Smallish Relic", 2);
	public static final Item stummer = new Item("Stummer", 1);
	public static final Item surgicalTools = new Item("Surgical Tools", 1);
	public static final Item tome_lore = new Item("Tome (A Lore Topic)", 2);
	public static final Item cameleolineCloak = new Item("Cameleoline Cloak", 2);
	public static final Item dataTome_lore = new Item("Data-Tome (A Lore Topic)", 1);
	public static final Item industrialLascutter = new Item("Industrial Lascutter", 3);
	public static final Item photoVisor = new Item("Photo-Visor", 1);
	public static final Item relic = new Item("Relic", 3);
	public static final Item photoContacts = new Item("Photo-Contacts", 0);
	
	// Clothing //
	public static final Item ragCastings = new Item("Rag Castings", 3);
	public static final Item coveralls = new Item("Coveralls", 3);
	public static final Item arbitesUniform = new Item("Arbites Uniform", 3);
	public static final Item enforcerUniform = new Item("Enforcer Uniform", 3);
	public static final Item uniform = new Item("Uniform", 3);
	public static final Item bodyglove = new Item("Bodyglove", 3);
	public static final Item imperialRobes = new Item("Imperial Robes", 3);
	public static final Item streetClothes = new Item("Street Clothes", 3);
	public static final Item billowRobe = new Item("Billow Robe", 3);
	
	// Misc Items //
	public static final Item gelt = new Item("Gelt", 0);
	public static final Item lhoSticks = new Item("Pack of Lho-Sticks", 0);
	public static final Item bombTimer = new Item("Bomb Timer", 1);
	public static final Item chrono = new Item("Chrono", 0);
	public static final Item filtrationPlugs = new Item("Filtration Plugs", 0);
	public static final Item regicideSet = new Item("Regicide Set", 2);
	public static final Item glowGlobe = new Item("Glow Globe", 1);
	public static final Item dropHarness = new Item("Drop Harness", 2);
	public static final Item handVox = new Item("Hand-Vox", 1);
	public static final Item lampPack = new Item("Lamp Pack", 2);
	public static final Item manacles = new Item("Manacles", 1);
	public static final Item oxygenTank = new Item("Oxygen Tank", 3);
	public static final Item remoteDetonator = new Item("Remote Detonator", 1);
	public static final Item respirator = new Item("Respirator", 2);
	public static final Item explosiveCharge = new Item("Explosive Charge", 1);
	public static final Item explosiveCollar = new Item("Explosive Collar", 2);
	public static final Item portableScreamer = new Item("Portable Screamer", 2);
	public static final Item screamer = new Item("Screamer", 4);
	public static final Item microBead = new Item("Micro-Bead", 0);
	public static final Item voxCaster = new Item("Vox Caster", 6);
	public static final Item encryptedMicroBead = new Item("Encrypted Micro-Bead", 0);
	public static final Item infraRedGoggles = new Item("Infra-Red Goggles", 2);
}

class Armour extends Item {
	String armour;
	
	Armour(String name, int size, String armour) {
		super(name, size);
		this.armour = armour;
	}
	
	@Override
	public String getFullName(boolean isItemEquipped) {
		return name+" ["+armour+"]";
	}
	
	public static final Armour beastHides = new Armour("Beast Hides", 4, "1 AP");
	public static final Armour gangLeathers = new Armour("Gang Leathers", 4, "1 AP");
	public static final Armour heavyLeathers = new Armour("Heavy Leathers", 5, "2 AP");
	public static final Armour looseLeathers = new Armour("Loose Leathers", 5, "1 AP, 3 vs Rending");
	public static final Armour chainCoat = new Armour("Chain Coat", 5, "2 AP, 4 vs Cutting");
	public static final Armour voidSuit = new Armour("Void Suit", 6, "1 AP");
	public static final Armour flakJacket = new Armour("Flak Jacket", 5, "2 AP, 4 vs Explosive");
	public static final Armour flakCoat = new Armour("Flak Coat", 5, "2 AP, 4 vs Explosive & Rending");
	public static final Armour flakArmour = new Armour("Flak Armour", 6, "3 AP, 5 vs Explosive");
	public static final Armour meshVest = new Armour("Mesh Vest", 3, "3 AP, 5 vs Energy");
	public static final Armour carapaceChestplate = new Armour("Carapace Chestplate", 5, "4 AP, 6 vs Impact");
	public static final Armour meshCloak = new Armour("Mesh Cloak", 4, "3 AP, 5 vs Energy & Rending");
	public static final Armour meshArmour = new Armour("Mesh Armour", 6, "4 AP, 6 vs Energy");
	public static final Armour coweledMeshArmour = new Armour("Coweled Mesh Armour", 6, "4 AP, 6 vs Energy & Rending");
	public static final Armour carapaceArmour = new Armour("Carapace Armour", 6, "5 AP, 7 vs Impact");
	public static final Armour heavyCarapace = new Armour("Heavy Carapace", 7, "6 AP, 8 vs Impact, Restrctive");
	public static final Armour powerArmour = new Armour("Power Armour", 8, "9 AP, Restrictive");
}