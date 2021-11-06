package files;

import main.*;

class MiscItemsFile implements Printable {
	
	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop("Misc Items");
		printer.printHeader_collapsible("Clothing");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Ammo.stubber_mag);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Equipment");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Ammo.stubber_mag);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Other");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Ammo.stubber_mag);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}