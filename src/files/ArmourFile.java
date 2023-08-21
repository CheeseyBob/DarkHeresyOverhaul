package files;

import main.*;

class ArmourFile implements PrintableFile {
	
	@Override
	public String filename() {
		return "Armour.html";
	}
	
	@Override
	public String title() {
		return "Armour";
	}
	
	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printSubSubheader("Armour Points (AP)");
		printer.printParagraph("When you take a hit, you reduce the damage by the AP of the armour you are wearing (and your Toughness Bonus).");
		printer.printSubheader("Fitting");
		printer.printParagraph("Armour items are assumed to fit size 7 characters (humans). Where this is not the case, the item should have a special rule (and the item size changed accordingly).");
		printer.printHeader_collapsible("Primitive");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Armour.beastHides);
		printer.printCol_item(6, Armour.gangLeathers);
		printer.printCol_item(6, Armour.looseLeathers);
		printer.printCol_item(6, Armour.heavyLeathers);
		printer.printCol_item(6, Armour.chainCoat);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Flack");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Armour.flakJacket);
		printer.printCol_item(6, Armour.flakCoat);
		printer.printCol_item(6, Armour.flakArmour);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Mesh");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Armour.meshVest);
		printer.printCol_item(6, Armour.meshCloak);
		printer.printCol_item(6, Armour.meshArmour);
		printer.printCol_item(6, Armour.meshArmour_coweled);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Carapace");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Armour.carapaceChestplate);
		printer.printCol_item(6, Armour.carapaceArmour);
		printer.printCol_item(6, Armour.heavyCarapace);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Other");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Armour.voidSuit);
		printer.printCol_item(6, Armour.powerArmour);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}