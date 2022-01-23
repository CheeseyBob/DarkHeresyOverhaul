package files;

import main.*;

class LocationsFile implements PrintableFile {
	
	@Override
	public String filename() {
		return "Locations.html";
	}
	
	@Override
	public String title() {
		return "Locations";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printSubheader("Noble Spire - 'House ___ Spire'");
		printer.printParagraph("[house name; known for; notable members]");
		// TODO //
		printer.printSubheader("Spaceport - 'Port ___'");
		// TODO //
		printer.printFileTail();
	}
}