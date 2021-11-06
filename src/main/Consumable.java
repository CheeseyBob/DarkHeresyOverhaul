package main;

class Consumable extends Item {

	Consumable(String name, int size) {
		super(name, size);
	}
	
	public static final Item canOfRecaf = new Item("Can of Recaf", 1);
	public static final Item fullMeal = new Item("Full Meal", 1);
	public static final Item rationBox = new Item("Ration Box", 1);
	public static final Item qualityMeal = new Item("Quality Meal", 1);
	public static final Item injector_stimm = new Item("Injector (Stimm)", 1);
	public static final Item injector_deTox = new Item("Injector (De-Tox)", 1);
	public static final Item bioPatch_stimm = new Item("Bio-Patch (Stimm)", 1);
	public static final Item medkit = new Item("Medkit", 2);
	public static final Item multiInjector_stimm = new Item("Multi-Injector (Stimm)", 2);
	public static final Item sacredMachineOil = new Item("Vial of Sacred Machine Oil", 1);
	public static final Item qualityMedkit = new Item("Quality Medkit", 3);
}