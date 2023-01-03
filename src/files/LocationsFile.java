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

		printer.printSubSubheader("Location Descriptions");
		printer.println("When rolling a new location, roll on the Exterior Description, the Ambience and the Notable Feature tables.");
		printer.printList(false,
				"Upper Hive - roll two d100 and use the highest result.",
				"Middle Hive - roll one d100.",
				"Underhive - roll two d100 and use the lowest result.");
		
		printer.printTableTop(false, true, "d100", "Exterior Description");
		printer.printTableRow("01-05", "Damaged");
		printer.printTableRow("06-15", "Filthy");
		printer.printTableRow("16-20", "Grafitti");
		printer.printTableRow("21-35", "Secluded");
		printer.printTableRow("36-45", "Inconspicuous");
		printer.printTableRow("46-60", "Gaudy");
		printer.printTableRow("61-80", "Well-kept");
		printer.printTableRow("81-90", "New");
		printer.printTableRow("91-00", "Ornate");
		printer.printTableTail();

		printer.printTableTop(false, true, "d100", "Ambience");
		printer.printTableRow("01-02", "Covered in fungus");
		printer.printTableRow("03-04", "Intermittent shaking");
		printer.printTableRow("05-07", "Intrusive pipework");
		printer.printTableRow("08-10", "Sloping floor");
		printer.printTableRow("11-13", "No furniture");
		printer.printTableRow("14-18", "Filthy");
		printer.printTableRow("19-21", "Damaged");
		printer.printTableRow("22-26", "Run-down");
		printer.printTableRow("27-29", "Uncomfortably hot");
		printer.printTableRow("30-32", "Chemical smell");
		printer.printTableRow("33-35", "Strong draft");
		printer.printTableRow("36-40", "Dingy");
		printer.printTableRow("41-43", "Unadorned");
		printer.printTableRow("44-48", "Vibrantly painted");
		printer.printTableRow("49-51", "Smoke-filled");
		printer.printTableRow("52-56", "Loud music");
		printer.printTableRow("57-59", "Soft music");
		printer.printTableRow("60-62", "Little knickknacks everywhere");
		printer.printTableRow("63-65", "Hanging beads");
		printer.printTableRow("66-68", "Hanging ribbons");
		printer.printTableRow("69-71", "Incense or perfume smell");
		printer.printTableRow("72-76", "Brightly lit");
		printer.printTableRow("77-79", "Fairy-lights");
		printer.printTableRow("80-82", "RGB lighting");
		printer.printTableRow("83-85", "Chilled air");
		printer.printTableRow("86-87", "Loose creature(s)");
		printer.printTableRow("88-90", "Silent");
		printer.printTableRow("91-95", "Well-kept");
		printer.printTableRow("96-00", "New");
		printer.printTableTail();
		
		printer.printTableTop(false, true, "d100", "Notable Feature");
		printer.printTableRow("01-02", "Awkwardly-placed pillars");
		printer.printTableRow("03-04", "Built around a huge pillar");
		printer.printTableRow("05-06", "Deep channel");
		printer.printTableRow("07-11", "Pit");
		printer.printTableRow("12-13", "Hunk of broken machinery");
		printer.printTableRow("14-15", "Large boulder");
		printer.printTableRow("16-18", "Large brazier");
		printer.printTableRow("19-20", "War trophy/trophies");
		printer.printTableRow("21-22", "Row of skulls");
		printer.printTableRow("23-27", "Weapon display rack");
		printer.printTableRow("28-29", "Dividing screen");
		printer.printTableRow("30-34", "Stage");
		printer.printTableRow("35-39", "Raised dais");
		printer.printTableRow("40-41", "Dividing curtain");
		printer.printTableRow("42-43", "Large inscribed slab");
		printer.printTableRow("44-46", "Wall-mural");
		printer.printTableRow("47-48", "Disco-ball");
		printer.printTableRow("49-50", "Large sports trophy");
		printer.printTableRow("51-55", "Several statues");
		printer.printTableRow("56-60", "Large statue");
		printer.printTableRow("61-63", "Large pict-display (TV screen)");
		printer.printTableRow("64-65", "Caged creature(s)");
		printer.printTableRow("66-70", "Shrine alcove");
		printer.printTableRow("71-72", "Arcade game cabinet");
		printer.printTableRow("73-74", "Floor mozaic");
		printer.printTableRow("75-76", "Dazzling sun-globe");
		printer.printTableRow("77-78", "Ceiling art");
		printer.printTableRow("79-80", "Sarcophagus");
		printer.printTableRow("81-82", "Water feature");
		printer.printTableRow("83-84", "Small pool");
		printer.printTableRow("85-86", "Mirror ceiling");
		printer.printTableRow("87-88", "Large holographic display");
		printer.printTableRow("89-90", "Terrarium");
		printer.printTableRow("91-92", "Aquarium");
		printer.printTableRow("93-94", "Bookshelves");
		printer.printTableRow("95-96", "Glass floor");
		printer.printTableRow("97-98", "Large plant");
		printer.printTableRow("99-00", "Tree");
		printer.printTableTail();
		
		// TODO ...
		
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
		printLocation(MiddleHiveEncounteredLocations.ministorumshrine, printer);
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