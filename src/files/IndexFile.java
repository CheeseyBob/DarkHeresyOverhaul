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
		printer.printList(false,
				"Reduce unneccesary rules complexity (especially from the player perspective).",
				"Give more structure to non-combat activities (especially from the GM perspective).",
				"Generally make the rules more cohesive, to make it easier for the GM to make rulings and to make it possible to play using a fiction-first approach.",
				"Remove or work around anything which removes player agency (like turn-skipping and forced actions)."
		);
		
		printer.printHeader("Contents");
		printer.printRowTop();
		printSectionContents(printer,
				"Characters",
				Files.exampleCharacterSheet,
				Files.characterCreation,
				Files.characterAdvancement,
				Files.talents,
				Files.traits,
				Files.bionics,
				Files.psychicPowers,
				Files.items,
				Files.ammo,
				Files.armour,
				Files.consumables,
				Files.meleeWeapons,
				Files.rangedWeapons,
				Files.thrownWeapons,
				Files.tools,
				Files.miscItems);
		printSectionContents(printer,
				"Playing the Game",
				Files.fatePoints,
				Files.actionsOverview,
				Files.actionsInCombatTime,
				Files.actionsInDowntime,
				Files.aspects,
				Files.criticalDamage,
				Files.fearAndInsanity,
				Files.corruptionAndMutation,
				Files.psychicPhenomena);
		printSectionContents(printer,
				"Running the Game",
				Files.proceduresOfPlay,
				Files.npcs,
				Files.adeptusAdministratum,
				Files.adeptusArbites,
				Files.adeptusAstraTelepathica,
				Files.adeptusMechanicus,
				Files.adeptusMinistorum,
				Files.imperialGuard,
				Files.outcasts,
				Files.investigation,
				Files.lore,
				Files.overmap,
				Files.locations,
				Files.groupsAndEvents);
		printer.printRowTail();
		
		printer.printFileTail();
	}
	
	private void printSectionContents(DHOPrinter printer, String sectionTitle, PrintableFile... files) {
		printer.printColTop(4);
		printer.printSubheader(sectionTitle);
		for(PrintableFile file : files)
			printer.printLink(file, true);
		printer.printColTail();
	}
}