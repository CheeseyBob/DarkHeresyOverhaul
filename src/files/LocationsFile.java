package files;

import main.*;
import main.locations.*;


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
		printer.printHeader_collapsible("Upper Hive Main Locations");
		printer.printCollapsibleTop();
		printLocation(UpperHiveMainLocations.nobleSpire, printer);
		printLocation(UpperHiveMainLocations.spaceport, printer);
		printLocation(UpperHiveMainLocations.pdfComplex, printer);
		printLocation(UpperHiveMainLocations.adeptusArbitesPrecinctFortress, printer);
		printLocation(UpperHiveMainLocations.adeptusMinistorumCathedralComplex, printer);
		printLocation(UpperHiveMainLocations.adeptusMechanicusSpire, printer);
		printLocation(UpperHiveMainLocations.adeptusAdministratumSpire, printer);
		printLocation(UpperHiveMainLocations.magistratumBloodsquare, printer);
		printLocation(UpperHiveMainLocations.adeptusAstraTelepathicaSpire, printer);
		printLocation(UpperHiveMainLocations.staduim, printer);
		printer.printCollapsibleTail();
		printer.println();
		printer.printHeader_collapsible("Upper Hive Encountered Locations");
		printer.printCollapsibleTop();
		printLocation(UpperHiveEncounteredLocations.arbiteCheckpoint, printer);
		// TODO //
		printer.printCollapsibleTail();
		printer.println();
		printer.printHeader_collapsible("Middle Hive Main Locations");
		printer.printCollapsibleTop();
		// TODO //
		printer.printCollapsibleTail();
		printer.println();
		printer.printHeader_collapsible("Middle Hive Encountered Locations");
		printer.printCollapsibleTop();
		// TODO //
		printer.printCollapsibleTail();
		printer.println();
		printer.printHeader_collapsible("Underhive Main Locations");
		printer.printCollapsibleTop();
		// TODO //
		printer.printCollapsibleTail();
		printer.println();
		printer.printHeader_collapsible("Underhive Encountered Locations");
		printer.printCollapsibleTop();
		// TODO //
		printer.printCollapsibleTail();
		printer.println();
		printer.printHeader_collapsible("Hive Floor Encountered Locations");
		printer.printCollapsibleTop();
		// TODO //
		printer.printCollapsibleTail();
		printer.println();
		printer.printFileTail();
	}
	
	private void printLocation(Location location, DHOPrinter printer) {
		printer.printSubheader(location.name);
		printer.printParagraph("Name: "+location.namingPattern);
		printer.printParagraph(location.description);
	}
}