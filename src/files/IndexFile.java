package files;

import main.*;

class IndexFile implements PrintableFile {
	
	@Override
	public String filename() {
		return "DarkHeresyOverhaul.html";
	}
	
	@Override
	public String title() {
		return "Dark Heresy Overhaul";
	}
	
	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printParagraph("This is an adaptation of the Dark Heresy rules system (drawing from both first and second edition) with the following goals:");
		printer.printList(false, new String[] {
				"Reduce unneccesary rules complexity (especially from the player perspective).",
				"Give more structure to non-combat activities (especially from the GM perspective).",
				"Generally make the rules more cohesive, to make it easier for the GM to make rulings and to make it possible to play using a fiction-first approach.",
				"Remove or work around anything which removes player agency (like turn-skipping and forced actions).",
		});
		printer.println();
		printer.println();
		printer.printHeader("Contents");
		printer.printRowTop();
		printer.printColTop(4);
		printer.printSubheader("Characters");
		for(PrintableFile file : FileList.section_characters()) {
			printer.printLink(file, true);
		}
		printer.printColTail();
		printer.printColTop(4);
		printer.printSubheader("Playing the Game");
		for(PrintableFile file : FileList.section_playingTheGame()) {
			printer.printLink(file, true);
		}
		printer.printColTail();
		printer.printColTop(4);
		printer.printSubheader("Running the Game");
		for(PrintableFile file : FileList.section_runningTheGame()) {
			printer.printLink(file, true);
		}
		printer.printColTail();
		printer.printRowTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}