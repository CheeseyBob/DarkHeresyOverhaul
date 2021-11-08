package files;

import main.*;

class ConsumablesFile implements Printable {
	
	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop("Consumables");
		printer.printHeader_collapsible("Food");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Consumable.canOfRecaf);
		printer.printCol_item(6, Consumable.fullMeal);
		printer.printCol_item(6, Consumable.rationBox);
		printer.printCol_item(6, Consumable.qualityMeal);
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