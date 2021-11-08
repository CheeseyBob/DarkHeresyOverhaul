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
	private static SpecialRule recafRule = new SpecialRule("Recaf",
			"Get a +20 bonus to overcome being Fatigued.");
	private static SpecialRule fullMealRule = new SpecialRule("Full Meal",
			"Long Action Toughness Test with +20 bonus; overcome being Fatigued (maximum 1 level).");
	private static SpecialRule mealRule = new SpecialRule("Meal",
			"Long Action Toughness Test; overcome being Fatigued (maximum 1 level).");
	private static SpecialRule qualityMealRule = new SpecialRule("Full Meal",
			"Long Action Toughness Test with +40 bonus; overcome being Fatigued (maximum 1 level).");

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
	public static final Consumable fullMeal = new Consumable("Full Meal",
			1, 1, Availability.UBIQUITOUS)
			.withSpecialRule(fullMealRule);
	public static final Consumable rationBox = new Consumable("Ration Box",
			1, 3, Availability.UBIQUITOUS)
			.withSpecialRule(mealRule);
	public static final Consumable qualityMeal = new Consumable("Quality Meal",
			1, 1, Availability.ABUNDANT)
			.withSpecialRule(qualityMealRule);
	
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