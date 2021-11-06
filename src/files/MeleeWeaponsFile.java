package files;

import main.*;

class MeleeWeaponsFile implements Printable {
	
	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop("Melee Weapons");
		printer.printSubSubheader("Bonus");
		// TODO //
		printer.printSubSubheader("Hits");
		// TODO //
		printer.printSubSubheader("Damage");
		// TODO //
		printer.printHeader_collapsible("Unarmed / Improvised");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Ammo.stubber_mag);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Impact");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Ammo.stubber_mag);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Rending");
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