package main;

public class MeleeWeapon extends Weapon {
	String bonus, hits;

	MeleeWeapon(String name, int size, String bonus, String hits, String damage, Availability availability) {
		super(name, size, damage, availability);
		this.bonus = bonus;
		this.hits = hits;
	}
	
	public MeleeWeapon withSpecialRule(SpecialRule specialRule) {
		return (MeleeWeapon)super.withSpecialRule(specialRule);
	}
	
	// Special Rules //
	public static SpecialRule balanced = new SpecialRule("Balanced",
			"Get a +10 bonus to Parry.");
	public static SpecialRule blunt = new SpecialRule("Blunt",
			"Hits cannot inflict more than the wielder's Strength Bonus in wounds.");
	public static SpecialRule weak = new SpecialRule("Weak",
			"Roll twice for damage and use the lowest.");
	public static SpecialRule selfDestructive = new SpecialRule("Self-Destructive",
			"Whenever you make an attack with this weapon, you must succeed a Toughness Test or become Bleeding Out.");
	public static SpecialRule shocking = new SpecialRule("Shocking",
			"Each wound inflicted makes the target become Stunned.");
	public static SpecialRule unbalanced = new SpecialRule("Unbalanced",
			"Get a -10 penalty to Parry.");
	
	// Unarmed / Improvised //
	public static final MeleeWeapon unarmed_punch = new MeleeWeapon("Punch",
			0, "+10", "2", "1d10+SB Impact", null)
			.withSpecialRule(blunt)
			.withSpecialRule(weak);
	public static final MeleeWeapon unarmed_kick = new MeleeWeapon("Kick",
			0, "+10", "1", "1d10+SB+1 Impact", null)
			.withSpecialRule(blunt)
			.withSpecialRule(weak);
	public static final MeleeWeapon improvisedWeapon_small = new MeleeWeapon("Small Improvised Weapon",
			1, "+10", "2", "1d10+SB+1 Impact", null)
			.withSpecialRule(blunt)
			.withSpecialRule(weak);
	public static final MeleeWeapon improvisedWeapon_smallish = new MeleeWeapon("Smallish Improvised Weapon",
			2, "+20", "2", "1d10+SB+1 Impact", null)
			.withSpecialRule(blunt)
			.withSpecialRule(weak);
	public static final MeleeWeapon improvisedWeapon_standard = new MeleeWeapon("Standard Improvised Weapon",
			3, "+20", "2", "1d10+SB+2 Impact", null)
			.withSpecialRule(blunt)
			.withSpecialRule(weak);
	public static final MeleeWeapon improvisedWeapon_largeish = new MeleeWeapon("Largeish Improvised Weapon",
			4, "+30", "1", "1d10+SB+3 Impact", null)
			.withSpecialRule(blunt)
			.withSpecialRule(weak);
	public static final MeleeWeapon improvisedWeapon_large = new MeleeWeapon("Large Improvised Weapon",
			5, "+30", "1", "1d10+SB+3 Impact", null)
			.withSpecialRule(blunt);
	
	// Impact //
	public static final MeleeWeapon club = new MeleeWeapon("Club",
			3, "+20", "2", "1d10+SB+3 Impact", Availability.UBIQUITOUS)
			.withSpecialRule(blunt)
			.withSpecialRule(weak);
	public static final MeleeWeapon hammer = new MeleeWeapon("Hammer",
			1, "+10", "1", "1d10+SB+2 Impact", Availability.ABUNDANT)
			.withSpecialRule(unbalanced);
	public static final MeleeWeapon shockMaul = new MeleeWeapon("Shock Maul",
			3, "+20", "1", "1d10+SB+2 Impact", Availability.AVERAGE)
			.withSpecialRule(shocking);
	public static final MeleeWeapon shockMaul_mastercrafted = new MeleeWeapon("Mastercrafted Shock Maul",
			3, "+30", "2", "1d10+SB+3 Impact", Availability.VERY_RARE)
			.withSpecialRule(shocking);
	public static final MeleeWeapon staff = new MeleeWeapon("Staff",
			3, "+30", "2", "1d10+SB+2 Impact", Availability.ABUNDANT)
			.withSpecialRule(balanced)
			.withSpecialRule(blunt)
			.withSpecialRule(weak);
	public static final MeleeWeapon staff_astraTelepathica = new MeleeWeapon("Astra Telepathica Staff",
			3, "+30", "2", "1d10+SB+2 Impact", Availability.ABUNDANT)
			.withSpecialRule(balanced)
			.withSpecialRule(blunt)
			.withSpecialRule(weak);
	public static final MeleeWeapon staff_mechanicus = new MeleeWeapon("Mechanicus Staff",
			3, "+30", "2", "1d10+SB+2 Impact", Availability.ABUNDANT)
			.withSpecialRule(balanced)
			.withSpecialRule(blunt)
			.withSpecialRule(weak);
	public static final MeleeWeapon warHammer = new MeleeWeapon("War Hammer",
			3, "+20", "1", "1d10+SB+3 Impact", Availability.PLENTIFUL);
	public static final MeleeWeapon warHammer_ecclesiarchy = new MeleeWeapon("Hammer of Doctrine",
			3, "+20", "1", "1d10+SB+3 Impact", Availability.PLENTIFUL);
	public static final MeleeWeapon warHammer_great = new MeleeWeapon("Great War Hammer",
			4, "+30", "1", "1d10+SB+5 Impact", Availability.COMMON);
	
	// Rending //
	public static final MeleeWeapon chainsword = new MeleeWeapon("Chainsword",
			3, "+20", "1", "1d10+SB+5 Rending", Availability.AVERAGE)
			.withSpecialRule(tearing);
	public static final MeleeWeapon chainsword_mastercrafted = new MeleeWeapon("Mastercrafted Chainsword",
			3, "+30", "2", "1d10+SB+8 Rending", Availability.VERY_RARE)
			.withSpecialRule(tearing);
	public static final MeleeWeapon knife = new MeleeWeapon("Knife",
			1, "+0", "3", "1d10+SB+1 Rending", Availability.UBIQUITOUS)
			.withSpecialRule(weak);
	public static final MeleeWeapon knife_mono = new MeleeWeapon("Mono-Knife",
			1, "+0", "3", "1d10+SB+1 Rending", Availability.ABUNDANT);
	public static final MeleeWeapon knife_psykanaMercyBlade = new MeleeWeapon("Psykana Mercy Blade",
			1, "+0", "3", "1d10+SB+2 Rending", Availability.PLENTIFUL)
			.withSpecialRule(weak);
	public static final MeleeWeapon longDagger = new MeleeWeapon("Long Dagger",
			1, "+10", "3", "1d10+SB+2 Rending", Availability.PLENTIFUL)
			.withSpecialRule(weak);
	public static final MeleeWeapon longDagger_mono = new MeleeWeapon("Long Mono-Dagger",
			1, "+10", "3", "1d10+SB+2 Rending", Availability.COMMON);
	public static final MeleeWeapon longsword = new MeleeWeapon("Longsword",
			3, "+30", "2", "1d10+SB+3 Rending", Availability.AVERAGE);
	public static final MeleeWeapon longsword_mono = new MeleeWeapon("Mono-Longsword",
			3, "+30", "2", "1d10+SB+3 Rending", Availability.SCARCE)
			.withSpecialRule(tearing);
	public static final MeleeWeapon shortsword = new MeleeWeapon("Shortsword",
			2, "+20", "2", "1d10+SB+2 Rending", Availability.COMMON);
	public static final MeleeWeapon shortsword_ecclesiarchy = new MeleeWeapon("Blade of Piety",
			2, "+20", "2", "1d10+SB+2 Rending", Availability.COMMON);
	public static final MeleeWeapon shortsword_mono = new MeleeWeapon("Mono-Shortsword",
			2, "+20", "2", "1d10+SB+2 Rending", Availability.AVERAGE)
			.withSpecialRule(tearing);
	public static final MeleeWeapon spear = new MeleeWeapon("Spear",
			3, "+10", "2", "1d10+SB+2 Rending", Availability.ABUNDANT)
			.withSpecialRule(balanced);
	public static final MeleeWeapon spear_savage = new MeleeWeapon("Savage Spear",
			3, "+10", "2", "1d10+SB+3 Rending", Availability.PLENTIFUL)
			.withSpecialRule(balanced);
	
	// Attacks from Mutations //
	public static final MeleeWeapon talons = new MeleeWeapon("Talons",
			0, "+10", "3", "1d10+SB+CB Rending", null)
			.withSpecialRule(weak);
	public static final MeleeWeapon scytheArm = new MeleeWeapon("Scythe-Arm",
			0, "+30", "2", "1d10+SB+2xCB Rending", null)
			.withSpecialRule(balanced);
	public static final MeleeWeapon boneBlades = new MeleeWeapon("Bone-Blades",
			0, "+10", "3", "1d10+SB+CB Rending", null)
			.withSpecialRule(selfDestructive);
	public static final MeleeWeapon razorFangs = new MeleeWeapon("Razor Fangs",
			0, "+0", "1", "1d10+SB+CB Rending", null)
			.withSpecialRule(weak);
	public static final MeleeWeapon tailWhip = new MeleeWeapon("Tail Whip",
			0, "+30", "2", "1d10+SB Impact", null)
			.withSpecialRule(blunt)
			.withSpecialRule(weak);
	
}