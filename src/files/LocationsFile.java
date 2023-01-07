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
		printer.println("When rolling a new encountered location, determine the following:");
		printer.printList(false,
				"Description",
				"Occupants",
				"Secrets");

		printer.printSubheader_collapsible("Description");
		printer.printCollapsibleTop();
		printer.println("Roll on the Exterior Description, the Ambience and the Notable Feature tables.");
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
		printer.printTableRow("49-50", "Large trophy (sports, etc.)");
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
		printer.printCollapsibleTail();

		printer.printSubheader("Occupants");
		printer.printParagraph("The residents and regular guests for a location are dependent on the location type as specified below.");

		printer.printSubheader_collapsible("Secrets");
		printer.printCollapsibleTop();
		printer.printTableTop(false, true, "d100", "Secret");
		printer.printTableRow("1-8", "Nothing unusual here.");
		printer.printTableRow("9", "Unbeknownst to the others, one of them is hiding from the Adeptus Arbites for past crimes.");
		printer.printTableRow("10", "The residents are sheltering a fugitive who is being hunted by the Adeptus Arbites.");
		printer.printTableRow("11", "Unbeknownst to the residents, this location contains a piece of restricted Adeptus Mechanicus technology.");
		printer.printTableRow("12-13", "Unbeknownst to the others, one of the residents fled the Adeptus Mechanicus.");
		printer.printTableRow("14", "Unbeknownst to the residents, this location contains a lost Adeptus Ministorum relic.");
		printer.printTableRow("15-16", "Unbeknownst to the others, one of the residents fled the Adeptus Ministorum");
		printer.printTableRow("17-18", "They have evaded the Administratum Auditors and haven't ever paid their proper tithes.");
		printer.printTableRow("19-20", "Unbeknownst to the residents, this location contains a stash of treasure from a noble house.");
		printer.printTableRow("21-22", "Unbeknownst to the others, one of them is a disgraced noble.");
		printer.printTableRow("23", "The residents are sheltering a disgraced noble.");
		printer.printTableRow("24", "The residents are slaves to a cruel noble.");
		printer.printTableRow("25-26", "Unbeknownst to the others, one of them is a PDF deserter.");
		printer.printTableRow("27", "The residents are all PDF deserters.");
		printer.printTableRow("28-29", "Unbeknownst to the others, one of them is wanted by the local enforcers.");
		printer.printTableRow("30", "The residents are sheltering a fugitive from the local enforcers.");
		printer.printTableRow("31-32", "Unbeknownst to the residents, this location houses a nest of vermin.");
		printer.printTableRow("33", "Unbeknownst to the others, one or more of the residents keep a nest of vermin here.");
		printer.printTableRow("34", "The residents keep a nest of vermin here.");
		printer.printTableRow("35-36", "Unbeknownst to the others, one or more of them are working for a local gang.");
		printer.printTableRow("37-38", "The residents are, under duress, cooperating with a local gang.");
		printer.printTableRow("39", "This location has been taken over by a local gang.");
		printer.printTableRow("40-41", "Unbeknownst to the others, one of them is an assassin or bounty hunter.");
		printer.printTableRow("42-43", "The residents run this location as a gathering spot for assassins and bounty hunters.");
		printer.printTableRow("44", "The residents live second lives as assassins and bounty hunters.");
		printer.printTableRow("45", "Unbeknownst to the residents, this location is utilised by a criminal cartel.");
		printer.printTableRow("46-47", "Unbeknownst to the others, one or more of the residents are working for a criminal cartel.");
		printer.printTableRow("48-49", "The residents are, under duress, cooperating with a criminal cartel.");
		printer.printTableRow("50", "This location is a front for a criminal cartel.");
		printer.printTableRow("51-52", "Unbeknownst to the others, one of the residents is a mutant.");
		printer.printTableRow("53-54", "The residents are harbouring one or more mutants.");
		printer.printTableRow("55", "Some of the residents are mutants. The others do their utmost to cover up this fact.");
		printer.printTableRow("56", "The residents are mutants.");
		printer.printTableRow("57", "Unbeknownst to the residents, this location contains a piece of heretical technology.");
		printer.printTableRow("58", "Unbeknownst to the others, one of the residents is a heretek.");
		printer.printTableRow("59", "The residents are practising tech-heresy.");
		printer.printTableRow("60-61", "Unbeknownst to the others, one of the residents is an unsanctioned psyker.");
		printer.printTableRow("62", "The residents are harbouring one or more unsanctioned psykers.");
		printer.printTableRow("63", "The residents are unsanctioned psykers.");
		printer.printTableRow("64-65", "Unbeknownst to the residents, this location contains a forgotten heretical text.");
		printer.printTableRow("66-67", "Unbeknownst to the residents, this location is used as a meeting place for a heretical cult.");
		printer.printTableRow("68-69", "Unbeknownst to the others, one of the residents belongs to a heretical cult.");
		printer.printTableRow("70", "The residents belong to a heretical cult.");
		printer.printTableRow("71-72", "Unbeknownst to the residents, this location is used as a meeting place for a xeno worshipping cult.");
		printer.printTableRow("73-74", "Unbeknownst to the others, one of the residents belongs to a xeno worshipping cult.");
		printer.printTableRow("75", "The residents belong to a xeno worshipping cult.");
		printer.printTableRow("76", "Unbeknownst to the residents, there is a forgotten daemonic alter on the premises.");
		printer.printTableRow("77-78", "Unbeknownst to the residents, this location is used as a meeting place for a daemon worshipping cult.");
		printer.printTableRow("79-80", "Unbeknownst to the others, one of the residents belongs to a daemon worshipping cult.");
		printer.printTableRow("81", "The residents belong to a daemon worshipping cult.");
		printer.printTableRow("82-83", "Unbeknownst to the others, one or more of the residents are seditionists.");
		printer.printTableRow("84", "The residents are seditionists.");
		printer.printTableRow("85", "Unbeknownst to the residents, this location is home to a wytch.");
		printer.printTableRow("86-87", "Unbeknownst to the others, one of the residents is consorting with a wytch.");
		printer.printTableRow("88", "The residents consort with a wytch.");
		printer.printTableRow("89-90", "Unbeknownst to the residents, this location contains a xeno-tech item or weapon.");
		printer.printTableRow("91-92", "Unbeknownst to the residents, this location is home to a proscribed xeno.");
		printer.printTableRow("93-94", "Unbeknownst to the others, one of the residents is consorting with a proscribed xeno (sentient).");
		printer.printTableRow("95-96", "Unbeknownst to the others, one of the residents is harboring a proscribed xeno (non-sentient).");
		printer.printTableRow("97", "The residents are harbouring one or more proscribed xenos.");
		printer.printTableRow("98", "Unbeknownst to the residents, this location contains a daemonic artifact.");
		printer.printTableRow("99", "Unbeknownst to the others, one of the residents is in posession of a daemonic artifact.");
		printer.printTableRow("100", "The residents make use of a daemonic artifact contained in this location.");
		printer.printTableTail();
		printer.printCollapsibleTail();
		
		printer.printHeader_collapsible("Upper Hive Main Locations");
		printer.printCollapsibleTop();
		printLocation(UpperHiveMainLocations.nobleSpire, printer);
		printLocation(UpperHiveMainLocations.spaceport, printer);
		printer.printCollapsibleTail();
		printer.println();
		printer.printHeader_collapsible("Upper Hive Encountered Locations");
		printer.printCollapsibleTop();
		printLocation(UpperHiveEncounteredLocations.shop_pets, printer);
		// TODO //
		printer.printCollapsibleTail();
		printer.println();
		printer.printHeader_collapsible("Middle Hive Main Locations");
		printer.printCollapsibleTop();
		printLocation(MiddleHiveMainLocations.manufactorum_plasteel, printer);
		printLocation(MiddleHiveMainLocations.enforcerHeadquarters, printer);
		// TODO //
		printer.printCollapsibleTail();
		printer.println();
		printer.printHeader_collapsible("Middle Hive Encountered Locations");
		printer.printCollapsibleTop();
		printLocation(MiddleHiveEncounteredLocations.ministorumShrine, printer);
		printLocation(MiddleHiveEncounteredLocations.ministorumTemple, printer);
		printLocation(MiddleHiveEncounteredLocations.enforcerStation, printer);
		printLocation(MiddleHiveEncounteredLocations.eatery_standard, printer);
		printLocation(MiddleHiveEncounteredLocations.cheapPubWithRooms, printer);
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
	
	private void printLocation(MainLocation location, DHOPrinter printer) {
		printer.printSubheader(location.name);
		printer.printParagraph("Name: "+location.namingPattern);
		printer.printParagraph("<i>"+location.description+"</i>");
		printer.printParagraph("Locations: "+location.locations);
	}
	
	private void printLocation(Location location, DHOPrinter printer) {
		printer.printSubheader(location.name);
		printer.printParagraph("Name: "+location.namingPattern);
		printer.printParagraph("<i>"+location.description+"</i>");
		printer.printParagraph("Residents: "+location.residents);
		printer.printParagraph("Guests: "+location.guests);
	}
}