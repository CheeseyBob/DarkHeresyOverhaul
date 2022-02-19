package files;

import main.*;

class MiscItemsFile implements PrintableFile {
	
	@Override
	public String filename() {
		return "MiscItems.html";
	}
	
	@Override
	public String title() {
		return "Misc Items";
	}
	
	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printHeader_collapsible("Clothing");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Clothing.ragCastings);
		printer.printCol_item(6, Clothing.coveralls);
		printer.printCol_item(6, Clothing.uniform);
		printer.printCol_item(6, Clothing.bodyglove);
		printer.printCol_item(6, Clothing.imperialRobes);
		printer.printCol_item(6, Clothing.streetClothes);
		printer.printCol_item(6, Clothing.smartClothes);
		printer.printCol_item(6, Clothing.billowRobe);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Equipment");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, MiscItem.chrono);
		printer.printCol_item(6, MiscItem.filtrationPlugs);
		printer.printCol_item(6, MiscItem.lampPack);
		printer.printCol_item(6, MiscItem.respirator);
		printer.printCol_item(6, MiscItem.explosiveCollar);
		printer.printCol_item(6, MiscItem.microBead);
		printer.printCol_item(6, MiscItem.microBead_encrypted);
		printer.printCol_item(6, MiscItem.infraRedGoggles);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Other");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, MiscItem.lhoSticks);
		printer.printCol_item(6, MiscItem.lhoSticks_quality);
		printer.printCol_item(6, MiscItem.bombTimer);
		printer.printCol_item(6, MiscItem.regicideSet);
		printer.printCol_item(6, MiscItem.glowGlobe);
		printer.printCol_item(6, MiscItem.dropHarness);
		printer.printCol_item(6, MiscItem.handVox);
		printer.printCol_item(6, MiscItem.laudHailer);
		printer.printCol_item(6, MiscItem.manacles);
		printer.printCol_item(6, MiscItem.oxygenTank);
		printer.printCol_item(6, MiscItem.remoteDetonator);
		printer.printCol_item(6, MiscItem.explosiveCharge);
		printer.printCol_item(6, MiscItem.portableScreamer);
		printer.printCol_item(6, MiscItem.screamer);
		printer.printCol_item(6, MiscItem.voxCaster);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}