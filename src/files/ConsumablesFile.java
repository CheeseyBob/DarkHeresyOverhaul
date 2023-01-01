package files;

import main.*;

class ConsumablesFile implements PrintableFile {
	
	@Override
	public String filename() {
		return "Consumables.html";
	}
	
	@Override
	public String title() {
		return "Consumables";
	}
	
	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printHeader_collapsible("Food");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Consumable.canOfRecaf);
		printer.printCol_item(6, Consumable.meal_poor);
		printer.printCol_item(6, Consumable.booze_poor);
		printer.printCol_item(6, Consumable.rationBox);
		printer.printCol_item(6, Consumable.booze_standard);
		printer.printCol_item(6, Consumable.meal_standard);
		printer.printCol_item(6, Consumable.booze_good);
		printer.printCol_item(6, Consumable.meal_good);
		printer.printCol_item(6, Consumable.booze_best);
		printer.printCol_item(6, Consumable.meal_best);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Drugs");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Consumable.bioPatch_stimm);
		printer.printCol_item(6, Consumable.injector_deTox);
		printer.printCol_item(6, Consumable.injector_stimm);
		printer.printCol_item(6, Consumable.multiInjector_stimm);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Medkits");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Consumable.medkit);
		printer.printCol_item(6, Consumable.qualityMedkit);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Poisons");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Consumable.vial_lethalPoison_3);
		printer.printCol_item(6, Consumable.vial_lethalPoison_5);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Other");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Consumable.sacredMachineOil);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}