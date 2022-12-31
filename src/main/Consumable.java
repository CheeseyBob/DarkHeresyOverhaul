package main;

public class Consumable extends Item {
	int uses;

	Consumable(String name, int size, int uses, Availability availability) {
		super(name, size, availability);
		this.uses = uses;
	}
	
	public Consumable withSpecialRule(SpecialRule specialRule) {
		return (Consumable)super.withSpecialRule(specialRule);
	}
	
	// Special Rules //
	private static SpecialRule alcohol = new SpecialRule("Alcohol",
			"Become "+Aspect.inebriated+" when consuming this item.");
	private static SpecialRule recafRule = new SpecialRule("Recaf",
			"Get a +20 bonus to overcome being Fatigued.");
	private static SpecialRule mealRule_rations = new SpecialRule("Meal (Rations)",
			"Long Action Toughness Test; overcome being Fatigued (maximum 1 level).");
	private static SpecialRule mealRule_poor = new SpecialRule("Meal (Poor)",
			"Long Action Toughness Test with +20 bonus; overcome being Fatigued (maximum 1 level).");
	private static SpecialRule mealRule = new SpecialRule("Meal",
			"Long Action Toughness Test with +40 bonus; overcome being Fatigued (maximum 1 level).");
	private static SpecialRule impressive1 = new SpecialRule("Impressive",
			"Get a +10 bonus to Charm when given to the target.");
	private static SpecialRule impressive2 = new SpecialRule("Very Impressive",
			"Get a +20 bonus to Charm when given to the target.");

	private static SpecialRule application_lethalPoison = new SpecialRule("Lethal Poison",
			"After a dose is applied to a Rending Melee Weapon, the next hit which inflicts wounds makes the target become Poisoned(Lethal)(N).");
	private static SpecialRule bioPatchRule = new SpecialRule("Bio-Patch",
			"Get a +40 bonus to Administer Drug.");
	private static SpecialRule dose_deTox = new SpecialRule("Dose of De-Tox",
			"Allows Administer Drug to make the target Drugged(De-Tox)(N).");
	private static SpecialRule dose_stimm = new SpecialRule("Dose of Stimm ",
			"Allows Administer Drug to make the target Drugged(Stimm)(N).");
	private static SpecialRule injectionMishap = new SpecialRule("Injection Mishap ",
			"If Administer Drug fails, the aspect is downgraded. On a critical failure, the target takes 1d10-TB wounds.");
	private static SpecialRule safeMisapplication = new SpecialRule("Safe Misapplication",
			"If Administer Drug fails, no aspect is created.");
	
	private static SpecialRule medkitRule = new SpecialRule("Medkit",
			"Get a +20 bonus to Treat Wounds.");
	private static SpecialRule qualityMedkitRule = new SpecialRule("Quality Medkit",
			"Get a +40 bonus to Treat Wounds.");
	
	private static SpecialRule sacredMachineOilRule = new SpecialRule("Sacred Machine Oil",
			"Full Action; automatically overcome target item being Jammed.");
	
	// Food //
	public static final Consumable canOfRecaf = new Consumable("Can of Recaf",
			1, 1, Availability.UBIQUITOUS)
			.withSpecialRule(recafRule);
	public static final Consumable rationBox = new Consumable("Ration Box",
			1, 3, Availability.UBIQUITOUS)
			.withSpecialRule(mealRule_rations);
	public static final Consumable booze_poor = new Consumable("Can of Booze (Poor)",
			1, 1, Availability.UBIQUITOUS)
			.withSpecialRule(alcohol);
	public static final Consumable booze_standard = new Consumable("Bottle of Booze (Standard)",
			2, 3, Availability.ABUNDANT)
			.withSpecialRule(alcohol)
			.withSpecialRule(impressive1);
	public static final Consumable booze_good = new Consumable("Bottle of Booze (Good)",
			2, 3, Availability.PLENTIFUL)
			.withSpecialRule(alcohol)
			.withSpecialRule(impressive2);
	public static final Consumable booze_best = new Consumable("Bottle of Booze (Best)",
			2, 3, Availability.COMMON)
			.withSpecialRule(alcohol)
			.withSpecialRule(impressive2);
	public static final Consumable meal_poor = new Consumable("Meal (Poor)",
			1, 1, Availability.UBIQUITOUS)
			.withSpecialRule(mealRule_poor);
	public static final Consumable meal_standard = new Consumable("Meal (Standard)",
			1, 1, Availability.ABUNDANT)
			.withSpecialRule(mealRule);
	public static final Consumable meal_good = new Consumable("Meal (Good)",
			1, 1, Availability.PLENTIFUL)
			.withSpecialRule(mealRule)
			.withSpecialRule(impressive1);
	public static final Consumable meal_best = new Consumable("Meal (Best)",
			1, 1, Availability.COMMON)
			.withSpecialRule(mealRule)
			.withSpecialRule(impressive2);
	
	// Drugs //
	public static final Consumable bioPatch_stimm = new Consumable("Bio-Patch (Stimm)",
			1, 1, Availability.COMMON)
			.withSpecialRule(dose_stimm.withParameter("2"))
			.withSpecialRule(bioPatchRule)
			.withSpecialRule(safeMisapplication);
	public static final Consumable injector_deTox = new Consumable("Injector (De-Tox)",
			1, 1, Availability.COMMON)
			.withSpecialRule(dose_deTox.withParameter("3"))
			.withSpecialRule(injectionMishap);
	public static final Consumable injector_stimm = new Consumable("Injector (Stimm)",
			1, 1, Availability.PLENTIFUL)
			.withSpecialRule(dose_stimm.withParameter("3"))
			.withSpecialRule(injectionMishap);
	public static final Consumable multiInjector_stimm = new Consumable("Multi-Injector (Stimm)",
			2, 5, Availability.COMMON)
			.withSpecialRule(dose_stimm)
			.withSpecialRule(injectionMishap);
	public static final Consumable vial_lethalPoison_3 = new Consumable("Vial of Lethal Poison (3)",
			1, 3, Availability.COMMON)
			.withSpecialRule(application_lethalPoison.withParameter("3"));
	public static final Consumable vial_lethalPoison_5 = new Consumable("Vial of Lethal Poison (5)",
			1, 3, Availability.RARE)
			.withSpecialRule(application_lethalPoison.withParameter("5"));
	
	// Medkits //
	public static final Consumable medkit = new Consumable("Medkit",
			2, 3, Availability.COMMON)
			.withSpecialRule(medkitRule);
	public static final Consumable qualityMedkit = new Consumable("Quality Medkit",
			3, 5, Availability.AVERAGE)
			.withSpecialRule(qualityMedkitRule);
	
	// Other //
	public static final Consumable sacredMachineOil = new Consumable("Vial of Sacred Machine Oil",
			1, 1, Availability.COMMON)
			.withSpecialRule(sacredMachineOilRule);
}