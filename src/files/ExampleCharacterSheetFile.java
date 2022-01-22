package files;

import main.*;

class ExampleCharacterSheetFile implements PrintableFile {
	
	@Override
	public String filename() {
		return "ExampleCharacterSheet.html";
	}
	
	@Override
	public String title() {
		return "Example Character Sheet";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printCharacterSheet(true, NPC.example);
		printer.printFileTail();
	}
}