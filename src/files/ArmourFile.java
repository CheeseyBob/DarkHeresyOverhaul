package files;

import main.*;

class ArmourFile implements Printable {
	
	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop("Armour");
		printer.printSubSubheader("Armour Points (PA)");
		// TODO //
		printer.printSubheader("Fitting");
		// TODO //
		printer.printHeader_collapsible("Primitive");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Ammo.stubber_mag);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Flack");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Ammo.stubber_mag);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Mesh");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Ammo.stubber_mag);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Carapace");
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