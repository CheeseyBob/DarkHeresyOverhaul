package files;

import main.*;

class ToolsFile implements PrintableFile {
	
	@Override
	public String filename() {
		return "Tools.html";
	}
	
	@Override
	public String title() {
		return "Tools";
	}
	
	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printHeader_collapsible("Worn");
		printer.printCollapsibleTop();
		printer.printSubSubheader("Bonus");
		printer.printParagraph("The bonus you get to relevant Tests when using the tool.");
		printer.printRowTop();
		printer.printCol_item(6, Tool.gasMask);
		printer.printCol_item(6, Tool.cameleolineCloak);
		printer.printCol_item(6, Tool.photoVisor);
		printer.printCol_item(6, Tool.photoContacts);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Held");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Tool.dataSlate);
		printer.printCol_item(6, Tool.pictRecorder);
		printer.printCol_item(6, Tool.writingKit);
		printer.printCol_item(6, Tool.dataSlate_biolock);
		printer.printCol_item(6, Tool.dataSlate_lore);
		printer.printCol_item(6, Tool.lockpick);
		printer.printCol_item(6, Tool.psyFocus);
		printer.printCol_item(6, Tool.smallRelic);
		printer.printCol_item(6, Tool.scroll_lore);
		printer.printCol_item(6, Tool.auspex);
		printer.printCol_item(6, Tool.autoquill);
		printer.printCol_item(6, Tool.combiTool);
		printer.printCol_item(6, Tool.desktopAutoquill);
		printer.printCol_item(6, Tool.excruciatorKit);
		printer.printCol_item(6, Tool.grapnel);
		printer.printCol_item(6, Tool.lascutter);
		printer.printCol_item(6, Tool.magnoculars);
		printer.printCol_item(6, Tool.multiKey);
		printer.printCol_item(6, Tool.smallishRelic);
		printer.printCol_item(6, Tool.stummer);
		printer.printCol_item(6, Tool.surgicalTools);
		printer.printCol_item(6, Tool.tome_lore);
		printer.printCol_item(6, Tool.dataTome_lore);
		printer.printCol_item(6, Tool.industrialLascutter);
		printer.printCol_item(6, Tool.relic);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}