package main;

public class RangedWeapon extends Weapon {
	String range, rof, capacity, reload;

	RangedWeapon(String name, int size, String range, String rof, String capacity, String reload, String damage, Availability availability) {
		super(name, size, damage, availability);
		this.range = range;
		this.rof = rof;
		this.capacity = capacity;
		this.reload = reload;
	}
	
	public RangedWeapon withSpecialRule(SpecialRule specialRule) {
		return (RangedWeapon)super.withSpecialRule(specialRule);
	}
	
	// Special Rules //
	public static SpecialRule ablative = new SpecialRule("Ablative",
			"Hits from this weapon damage cover, armour and other items.");
	public static SpecialRule accurate = new SpecialRule("Accurate",
			"Get an extra +10 bonus when you Attack after you Aim.");
	public static SpecialRule bayonet = new SpecialRule("Bayonet",
			"This counts as a Melee Weapon with the following stats:<br>"
			+ "Bonus: +10<br>"
			+ "Hits: 2<br>"
			+ "Damage: 1d10+SB+2 Rending");
	public static SpecialRule beltFed = new SpecialRule("Belt-Fed",
			"Ammo is not contained in the weapon, but drawn from a container which must be placed beside the weapon.");
	public static SpecialRule burningHits = new SpecialRule("Burning Hits",
			"Each hit makes the target become Burning.");
	public static SpecialRule electricPower = new SpecialRule("Electric Power",
			"This weapon uses N electric power per shot instead of consuming ammo.");
	public static SpecialRule feedLine = new SpecialRule("Feed Line",
			"Ammo is not contained in the weapon, but drawn from a container via a feed line.");
	public static SpecialRule overcharge = new SpecialRule("Overcharge",
			"Before you Attack, you can spend up to 3 additional ammo. Doing so reduces the RoF to 1 for that attack and gives a 1d10 bonus to damage for each additional ammo spent. The additional ammo spent counts towards jamming.");
	public static SpecialRule overheats = new SpecialRule("Overheats",
			"When this weapon jams, roll a d10:<br>"
			+ "1-5: The Jammed aspect is upgraded. You take 1d10 Energy damage unless you drop the weapon.<br>"
			+ "6-9: The weapon becomes Damaged. You take 1d10+2 Energy damage and drop the weapon.<br>"
			+ "10: The weapon explodes and is destroyed. You and anyone within 4m takes a hit from the weapon.");
	public static SpecialRule reliable = new SpecialRule("Reliable",
			"This weapon cannot become Jammed.");
	public static SpecialRule scatterShot = new SpecialRule("Scatter Shot",
			"Within 10m, each hit counts as 2 hits. Within 5m each hit counts as 3 hits.");
	public static SpecialRule scoped = new SpecialRule("Scoped",
			"If you Aim as a Full Action, you ignore penalties from range.");
	public static SpecialRule spray = new SpecialRule("Spray",
			"Use double the range bonus/penalty. Maximum hits is N when you Attack or 2N if you Attack Repeatedly. Treat failure as a single hit. You can apply each hit to any target within a 45 degree arc.");
	public static SpecialRule storm = new SpecialRule("Storm",
			"Get a +10xN bonus to Attack Repeatedly (Ranged) and give a -10xN penalty to oppose becoming Pinned when you use Suppressing Fire.");
	public static SpecialRule suppressingFire = new SpecialRule("Suppressing Fire ",
			"When you Attack Repeatedly with this weapon, you can spend your Reaction to fire twice as many shots and make all characters within 20m in a 45 degree arc become Pinned.");
	
	// Energy //
	public static final RangedWeapon laspistol = new RangedWeapon("Laspistol",
			1, "80m", "2", "12 Power", "2", "1d10+1 Energy", Availability.PLENTIFUL)
			.withSpecialRule(electricPower.withParameter("1"))
			.withSpecialRule(reliable);
	public static final RangedWeapon laspistol_heretek = new RangedWeapon("Heretek Laspistol",
			1, "320m", "1", "12 Power", "2", "1d10+5 Energy", Availability.RARE)
			.withSpecialRule(electricPower.withParameter("3"))
			.withSpecialRule(overcharge.withParameter("3"))
			.withSpecialRule(overheats);
	public static final RangedWeapon lasgun = new RangedWeapon("Lasgun",
			3, "160m", "3", "18 Power", "2", "1d10+2 Energy", Availability.COMMON)
			.withSpecialRule(electricPower.withParameter("1"))
			.withSpecialRule(reliable);
	public static final RangedWeapon lasgun_bayonet = new RangedWeapon("Lasgun with Bayonet",
			3, "160m", "3", "18 Power", "2", "1d10+2 Energy", Availability.AVERAGE)
			.withSpecialRule(electricPower.withParameter("1"))
			.withSpecialRule(reliable)
			.withSpecialRule(bayonet);
	public static final RangedWeapon flamer = new RangedWeapon("Flamer",
			3, "10m", "2", "12 Fuel", "4", "1d10+1 Energy", Availability.SCARCE)
			.withSpecialRule(burningHits)
			.withSpecialRule(spray.withParameter("3"));
	public static final RangedWeapon handFlamer = new RangedWeapon("Hand Flamer",
			2, "10m", "2", "6 Fuel", "4", "1d10+1 Energy", Availability.SCARCE)
			.withSpecialRule(burningHits)
			.withSpecialRule(spray.withParameter("3"));
	public static final RangedWeapon longLas = new RangedWeapon("Long Las",
			4, "640m", "1", "20 Power", "2", "1d10+3 Energy", Availability.SCARCE)
			.withSpecialRule(electricPower.withParameter("2"))
			.withSpecialRule(accurate)
			.withSpecialRule(reliable);
	public static final RangedWeapon longLas_scoped = new RangedWeapon("Scoped Long Las",
			4, "640m", "1", "20 Power", "2", "1d10+3 Energy", Availability.SCARCE)
			.withSpecialRule(electricPower.withParameter("2"))
			.withSpecialRule(reliable)
			.withSpecialRule(scoped);
	public static final RangedWeapon lascannon = new RangedWeapon("Lascannon",
			5, "1280m", "1", "40 Power", "4", "3d10+8 Energy", Availability.VERY_RARE)
			.withSpecialRule(electricPower.withParameter("20"))
			.withSpecialRule(ablative);
	public static final RangedWeapon plasmaGun = new RangedWeapon("Plasma Gun",
			4, "320m", "2", "12 Plasma", "4", "1d10+5 Energy", Availability.VERY_RARE)
			.withSpecialRule(ablative)
			.withSpecialRule(overcharge.withParameter("3"))
			.withSpecialRule(overheats);
	public static final RangedWeapon plasmaGun_feedLine = new RangedWeapon("Plasma Gun with Feed Line",
			4, "320m", "2", "* Plasma", "10", "1d10+5 Energy", Availability.VERY_RARE)
			.withSpecialRule(ablative)
			.withSpecialRule(feedLine)
			.withSpecialRule(overcharge.withParameter("3"))
			.withSpecialRule(overheats);
	public static final RangedWeapon plasmaPistol = new RangedWeapon("Plasma Pistol",
			2, "160m", "2", "6 Plasma", "4", "1d10+5 Energy", Availability.VERY_RARE)
			.withSpecialRule(ablative)
			.withSpecialRule(overcharge.withParameter("3"))
			.withSpecialRule(overheats);
	
	// Explosive //
	public static final RangedWeapon boltPistol = new RangedWeapon("Bolt Pistol",
			2, "?", "?", "? Bolts", "?", "? Explosive", Availability.RARE);
	
	// Impact //
	public static final RangedWeapon pistol = new RangedWeapon("Pistol",
			1, "80m", "3", "9 Bullets", "2", "1d10+2 Impact", Availability.PLENTIFUL);
	public static final RangedWeapon pistol_arbites = new RangedWeapon("Arbites Pistol",
			1, "80m", "3", "9 Bullets", "2", "1d10+5 Impact", Availability.AVERAGE);
	public static final RangedWeapon stubber = new RangedWeapon("Stubber",
			3, "320m", "3", "9 Bullets", "2", "1d10+2 Impact", Availability.PLENTIFUL);
	public static final RangedWeapon autopistol = new RangedWeapon("Autopistol",
			1, "80m", "6", "18 Bullets", "2", "1d10+1 Impact", Availability.COMMON)
			.withSpecialRule(suppressingFire);
	public static final RangedWeapon pumpActionShotgun = new RangedWeapon("Pump-Action Shotgun",
			3, "40m", "2", "12 Shells", "2", "1d10+3 Impact", Availability.COMMON)
			.withSpecialRule(scatterShot);
	public static final RangedWeapon shotgun_arbites = new RangedWeapon("Arbites Shotgun",
			3, "40m", "2", "12 Shells", "2", "1d10+5 Impact", Availability.AVERAGE)
			.withSpecialRule(scatterShot);
	public static final RangedWeapon autostubber = new RangedWeapon("Autostubber",
			4, "320m", "6", "36 Bullets", "2", "1d10+2 Impact", Availability.AVERAGE)
			.withSpecialRule(suppressingFire);
	public static final RangedWeapon combatShotgun = new RangedWeapon("Combat Shotgun",
			3, "40m", "3", "18 Shells", "2", "1d10+3 Impact", Availability.AVERAGE)
			.withSpecialRule(scatterShot);
	public static final RangedWeapon huntingRifle = new RangedWeapon("Hunting Rifle",
			4, "640m", "2", "6 Bullets", "2", "1d10+5 Impact", Availability.SCARCE)
			.withSpecialRule(accurate)
			.withSpecialRule(reliable);
	public static final RangedWeapon huntingRifle_scoped = new RangedWeapon("Scoped Hunting Rifle",
			4, "640m", "2", "6 Bullets", "2", "1d10+5 Impact", Availability.SCARCE)
			.withSpecialRule(scoped)
			.withSpecialRule(reliable);
	public static final RangedWeapon heavyStubber = new RangedWeapon("Heavy Stubber",
			5, "320m", "10", "60 Bullets", "4", "1d10+3 Impact", Availability.SCARCE)
			.withSpecialRule(suppressingFire)
			.withSpecialRule(storm.withParameter("1"));
	public static final RangedWeapon heavyStubber_beltFed = new RangedWeapon("Belt-Fed Heavy Stubber",
			5, "320m", "10", "* Bullets", "6", "1d10+3 Impact", Availability.SCARCE)
			.withSpecialRule(suppressingFire)
			.withSpecialRule(storm.withParameter("1"))
			.withSpecialRule(beltFed);
	
	// Rending //
	
}