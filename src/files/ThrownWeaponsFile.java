package files;

import main.*;

class ThrownWeaponsFile implements Printable {
	
	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop("Thrown Weapons");
		printer.printSubSubheader("Range");
		// TODO //
		printer.printSubheader("Throwing Melee Weapons");
		// TODO //
		printer.printSubheader("Throwing Other Items");
		// TODO //
		printer.printSubheader("Scattering");
		// TODO //
		printer.printHeader_collapsible("Grenades");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Ammo.boltPistol_mag);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}