package files;

import main.*;

class ToolsFile implements Printable {
	
	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop("Tools");
		printer.printHeader_collapsible("Equipment");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Ammo.boltPistol_mag);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Other");
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