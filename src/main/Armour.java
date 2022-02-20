package main;

public class Armour extends Item {
	String ap;
	
	Armour(String name, int size, String armour, Availability availability) {
		super(name, size, availability);
		this.ap = armour;
	}
	
	@Override
	public String nameWhenEquipped() {
		return super.nameWhenEquipped()+"<br>["+ap+"]";
	}
	
	public Armour withSpecialRule(SpecialRule specialRule) {
		return (Armour)super.withSpecialRule(specialRule);
	}
	
	// Special Rules //
	public static SpecialRule restrictive = new SpecialRule("Restrictive",
			"If your Agility is over 30, it counts as 30 while wearing this.");
	public static SpecialRule powerArmourRules = new SpecialRule("Power Armour",
			"Your size counts as the size of this armour. Uses 20+2d10 Power/hour. While powered, get a +20 bonus to Strength, otherwise all actions require a Strength Test.");
	public static SpecialRule resistantToEnergy = new SpecialRule("Resistant To Energy",
			"Get a +2 bonus to AP against Energy damage.");
	public static SpecialRule resistantToExplosive = new SpecialRule("Resistant To Explosive",
			"Get a +2 bonus to AP against Explosive damage.");
	public static SpecialRule resistantToImpact = new SpecialRule("Resistant To Impact",
			"Get a +2 bonus to AP against Impact damage.");
	public static SpecialRule resistantToRending = new SpecialRule("Resistant To Rending",
			"Get a +2 bonus to AP against Rending damage.");
	public static SpecialRule voidSuitRules = new SpecialRule("",
			"Protects you from the void of space and allows you to breathe from oxygen tanks.");
	
	public static final Armour beastHides = new Armour("Beast Hides",
			4, "1 AP", Availability.ABUNDANT);
	public static final Armour gangLeathers = new Armour("Gang Leathers",
			4, "1 AP", Availability.ABUNDANT);
	public static final Armour heavyLeathers = new Armour("Heavy Leathers",
			5, "2 AP", Availability.PLENTIFUL);
	public static final Armour looseLeathers = new Armour("Loose Leathers",
			5, "1 AP, 3 vs Rending", Availability.PLENTIFUL)
			.withSpecialRule(resistantToRending);
	public static final Armour chainCoat = new Armour("Chain Coat",
			5, "2 AP, 4 vs Rending", Availability.COMMON)
			.withSpecialRule(resistantToRending);
	public static final Armour voidSuit = new Armour("Void Suit",
			6, "1 AP", Availability.COMMON)
			.withSpecialRule(voidSuitRules);
	public static final Armour flakJacket = new Armour("Flak Jacket",
			5, "2 AP, 4 vs Explosive", Availability.COMMON)
			.withSpecialRule(resistantToExplosive);
	public static final Armour flakCoat = new Armour("Flak Coat",
			5, "2 AP, 4 vs Explosive & Rending", Availability.AVERAGE)
			.withSpecialRule(resistantToExplosive)
			.withSpecialRule(resistantToRending);
	public static final Armour flakArmour = new Armour("Flak Armour",
			6, "3 AP, 5 vs Explosive", Availability.AVERAGE)
			.withSpecialRule(resistantToExplosive);
	public static final Armour meshVest = new Armour("Mesh Vest",
			3, "3 AP, 5 vs Energy", Availability.AVERAGE)
			.withSpecialRule(resistantToEnergy);
	public static final Armour carapaceChestplate = new Armour("Carapace Chestplate",
			5, "4 AP, 6 vs Impact", Availability.SCARCE)
			.withSpecialRule(resistantToImpact);
	public static final Armour meshCloak = new Armour("Mesh Cloak",
			4, "3 AP, 5 vs Energy & Rending", Availability.SCARCE)
			.withSpecialRule(resistantToEnergy)
			.withSpecialRule(resistantToRending);
	public static final Armour meshArmour = new Armour("Mesh Armour",
			6, "4 AP, 6 vs Energy", Availability.SCARCE)
			.withSpecialRule(resistantToEnergy);
	public static final Armour meshArmour_coweled = new Armour("Coweled Mesh Armour",
			6, "4 AP, 6 vs Energy & Rending", Availability.RARE)
			.withSpecialRule(resistantToEnergy)
			.withSpecialRule(resistantToRending);
	public static final Armour carapaceArmour = new Armour("Carapace Armour",
			6, "5 AP, 7 vs Impact", Availability.RARE)
			.withSpecialRule(resistantToImpact);
	public static final Armour heavyCarapace = new Armour("Heavy Carapace",
			7, "6 AP, 8 vs Impact", Availability.RARE)
			.withSpecialRule(resistantToImpact)
			.withSpecialRule(restrictive);
	public static final Armour powerArmour = new Armour("Power Armour",
			8, "9 AP", Availability.EXTREMELY_RARE)
			.withSpecialRule(powerArmourRules)
			.withSpecialRule(restrictive);
}