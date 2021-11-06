package files;

import main.*;

class RangedWeaponsFile implements Printable {
	
	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop("Ranged Weapons");
		printer.printSubSubheader("Range");
		// TODO //
		printer.printSubSubheader("Rate of Fire (RoF)");
		// TODO //
		printer.printSubSubheader("Capacity");
		// TODO //
		printer.printSubSubheader("Reload");
		// TODO //
		printer.printSubSubheader("Damage");
		// TODO //
		printer.printHeader_collapsible("Solid Projectile");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Ammo.autopistol_mag);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Las");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Ammo.lascannon_powerPack);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Flame & Plasma");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Ammo.flamer_canister);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Bolt");
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