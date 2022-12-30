package files;

import main.*;

class OvermapFile implements PrintableFile {
	
	private static final String[][] gettingLostTable = {
			{"01-10", "Travel up a layer"},
			{"11-20", "Travel 2 areas left of the intended area"},
			{"21-45", "Travel 1 area left of the intended area"},
			{"46-55", "Travel in circles (don't change area)"},
			{"56-80", "Travel 1 area right of the intended area"},
			{"81-90", "Travel 2 areas right of the intended area"},
			{"91-00", "Travel down a layer"},
	};
	private static final String[][] encounterDistanceTable = {
			{"Upper Hive", "6d10m"},
			{"Middle Hive", "5d10m"},
			{"Underhive", "4d10m"},
			{"Collapsed Area", "3d10m"},
			{"Totally Collapsed Area", "2d10m"},
	};
	
	private static final String[][] mainLocationsTable_upperHive = {
			{"01-50", "Noble Spire"},
			{"51-60", "Spaceport"},
			{"61-67", "Planetary Defence Force complex"},
			{"68-70", "Adeptus Arbites precinct-fortress 'fort ___'"},
			{"71-77", "Adeptus Ministorum cathedral-complex 'the cathedral of saint ___'"},
			{"78-80", "Adeptus Mechanicus spire"},
			{"81-84", "Adeptus Administratum spire (offices and archive halls)"},
			{"85-87", "Magistratum Bloodsquare (executions and trials by combat)"},
			{"88-90", "Adeptus Astra Telepathica spire (uninhabited besides 1-6 astropaths and servitors)"},
			{"91-93", "Stadium (music concerts and theatre)"},
			{"94-95", "Stadium (vehicle races)"},
			{"96-00", "Stadium (bloodsport)"},
	};
	private static final String[][] encounteredLocations_upperHive = {
			{"01-10", "Arbite checkpoint"},
			{"11-15", "Ministorum shrine 'a shrine to saint ___'"},
			{"16-20", "Ministorum temple 'a temple to saint ___'"},
			{"21-30", "Gourmet dining venue"},
			{"31-35", "Exhibition hall displaying and selling fine art"},
			{"36-40", "Luxury spa"},
			{"41-45", "Library"},
			{"46-47", "Shop selling pets (including approved xenos)"},
			{"48-60", "Shop selling high-fashion clothing"},
			{"61-70", "Shop selling high-quality misc items"},
			{"71-78", "Shop selling high-quality tech items"},
			{"79-80", "Shop selling exotic tech items"},
			{"81-88", "Shop selling high-quality weapons"},
			{"89-90", "Shop selling exotic weapons"},
			{"91-98", "Shop selling high-quality armour"},
			{"99-00", "Shop selling exotic armour"},
	};
	private static final String[][] encountersTable_upperHive = {
			{"01-10", "Roll twice and combine the results"},
			{"11-15", "Quiet streets"},
			{"16-40", "Procession of nobles"},
			{"41-50", "Procession of ministorum priests"},
			{"51-60", "Servo-skulls doing surveillance"},
			{"61-70", "Servitors cleaning the streets"},
			{"71-74", "Cherub servitor delivering a message-scroll"},
			{"75", "Cherub servitor delivering an item"},
			{"76-80", "Tech-priests maintaining infrastructure"},
			{"81-85", "Administratum scribes auditing businesses"},
			{"86-92", "Arbitrators on patrol"},
			{"93-94", "Arbitrators on patrol in a vehicle"},
			{"95-97", "Arbitrators escorting a detainee to the cells"},
			{"98-99", "Arbitrators searching a building"},
			{"00", "Assassin stalking a noble"},
	};
	
	private static final String[][] mainLocationsTable_middleHive = {
			{"01-05", "Manufactorum (producing refined metal)"},
			{"06-08", "Manufactorum (producing plasteel)"},
			{"09-10", "Manufactorum (producing fabric)"},
			{"11-15", "Manufactorum (producing a mechanical component)"},
			{"16-20", "Manufactorum (producing an electronic component)"},
			{"21-25", "Manufactorum (producing a finished item)"},
			{"26-30", "Manufactorum (culturing algae)"},
			{"31-35", "Manufactorum (processing chemicals)"},
			{"36-45", "Manufactorum (processing foodstuffs)"},
			{"46-50", "Manufactorum (packaging food)"},
			{"51-60", "Local enforcer headquarters"},
			{"61-65", "Sewage treatment plant"},
			{"66-70", "Refuse recycling plant"},
			{"71-75", "Power generation plant"},
			{"76-80", "Arena (bloodsport)"},
			{"81-90", "Commercial hub (arcade)"},
			{"91-00", "Transport hub (interchange)"},
	};
	private static final String[][] encounteredLocations_middleHive = {
			{"01-05", "Roll twice and combine the results"},
			{"06-10", "Reroll - this is a front for organized crime"},
			{"11-18", "Ministorum shrine 'a shrine to saint ___'"},
			{"19-20", "Ministorum temple 'a temple to saint ___'"},
			{"21-30", "Enforcer station"},
			{"31-40", "Shop selling food"},
			{"41-45", "Shop selling clothing and apparel"},
			{"46-50", "Shop selling weapons"},
			{"51-55", "Shop selling armour"},
			{"56-60", "Shop selling tech items"},
			{"61-65", "Specialist shop selling a specific kind of item"},
			{"66-75", "Eatery"},
			{"76-85", "Shady bar"},
			{"86-00", "Pub with food and rooms available"},
	};
	private static final String[][] encountersTable_middleHive = {
			{"01-10", "Roll twice and combine the results"},
			{"11-15", "Street urchins"},
			{"16-20", "Beggars"},
			{"21-23", "Gamblers"},
			{"24-26", "Entertainers performing stunts (juggling knives, etc.)"},
			{"27-30", "Entertainers busking"},
			{"31-37", "Scum brawling"},
			{"38-40", "Scum knife-fighting"},
			{"41-43", "Petty criminals pickpocketing people on the street"},
			{"44-45", "Petty criminals mugging people in an alleyway"},
			{"46-50", "Street vendors selling food"},
			{"51-54", "Street vendors selling trinkets"},
			{"55-58", "Street vendors selling random items"},
			{"59-60", "Street vendors selling illicit goods"},
			{"61-70", "Ministorum confessors preaching to the masses"},
			{"71-74", "Servitors hauling goods"},
			{"75-78", "Servitors hauling refuse"},
			{"79-80", "Tech-priests maintaining infrastructure"},
			{"81-83", "Administratum scribes auditing businesses"},
			{"84-85", "Administratum scribes collecting taxes"},
			{"86-90", "Enforcers on patrol"},
			{"91-93", "Enforcers escorting a detainee to the cells"},
			{"94-95", "Enforcers roughing someone up"},
			{"96-97", "Enforcers searching a building"},
			{"98", "Arbitrators escorting a captured psyker to the cells"},
			{"99", "Kill Squad Troopers enforcing an execution warrant"},
			{"00", "Unsactioned psyker energance"},
	};
	
	private static final String[][] disrepairTable_underhive = {
			{"01-10", "Roll twice and combine the results"},
			{"11-20", "partially collapsed"},
			{"21-25", "totally collapsed"},
			{"26-35", "partially flooded"},
			{"36-40", "totally flooded"},
			{"41-48", "polluted (sewage)"},
			{"49-50", "heavily polluted (sewage)"},
			{"51-58", "polluted (toxic liquid)"},
			{"59-60", "heavily polluted (toxic liquid)"},
			{"61-68", "polluted (toxic gas)"},
			{"69-70", "heavily polluted (toxic gas)"},
			{"71-78", "polluted (radiation)"},
			{"79-80", "heavily polluted (radiation)"},
			{"81-95", "Poorly lit"},
			{"96-00", "No power"},
	};
	private static final String[][] mainLocationsTable_underhive = {
			{"01-85", "Old abandoned site (roll on the Middle Hive Main Location table)"},
			{"86-90", "Ancient abandoned site (roll on the Upper Hive Main Location table)"},
			{"91-00", "Major vertical interchange (multiple passages downwards)"},
	};
	private static final String[][] encounteredLocations_underhive = {
			{"01-05", "Roll twice and combine the results"},
			{"06-08", "Vermin lair (wing-rats)"},
			{"09-10", "Vermin lair (giant rats)"},
			{"11-12", "Vermin lair (giant insects)"},
			{"13-15", "Vermin lair (feral beasts)"},
			{"16-20", "Hideout of a lone madman"},
			{"21-30", "Drug den"},
			{"31-45", "Gang hideout"},
			{"46-50", "Large gang hideout"},
			{"51-54", "Hideout of an unsanctioned psyker who is laying low"},
			{"55", "Hideout of a small group of unsanctioned psykers who are laying low"},
			{"56-59", "Hideout of an unsanctioned psyker who is offering their services"},
			{"60", "Hideout of a small group of unsanctioned psykers who are offering their services"},
			{"61-70", "Hideout of a group of seditionists"},
			{"71-73", "Hideout of a cult practising extreme sadism"},
			{"74-75", "Hideout of a cult practising cannibalism"},
			{"76", "Hideout of a cult worshiping xeno gods"},
			{"77", "Hideout of a cult worshiping xenos"},
			{"78-80", "Hideout of a cult worshiping daemons"},
			{"81-85", "Hideout of a heretek making and selling drugs"},
			{"86-90", "Hideout of a heretek making and selling tech items and weapons"},
			{"91-95", "Hideout of mutant outcasts"},
			{"96-00", "Passage downwards (roll on the Hive Floor Locations table)"},
	};
	private static final String[][] encountersTable_underhive = {
			{"01-10", "Roll twice and combine the results"},
			{"11-20", "Dregs scrounging around for food"},
			{"21-25", "Madman raving at people in the street"},
			{"26-30", "Addicts tripping out ('scavvies/wasters')"},
			{"31-35", "Petty criminals pickpocketing people on the street"},
			{"36-38", "Petty criminals mugging people in an alleyway"},
			{"39-40", "Petty criminals breaking into a building"},
			{"41-50", "Mutants raiding"},
			{"51-65", "Gangers loitering"},
			{"66-68", "Gangers roughing up someone"},
			{"69-70", "Gangers performing an armed robbery"},
			{"71-73", "Heretek scavenging for tech"},
			{"74-75", "Heretek scavenging for chemicals"},
			{"76-77", "Heretek selling proscribed drugs"},
			{"78-79", "Heretek selling proscribed arms"},
			{"80", "Heretek hunting for test-subjects"},
			{"81-83", "Bounty hunter out looking for a job"},
			{"84-85", "Bounty hunter persuing/stalking a target"},
			{"86-88", "Redemptionists hunting for sinners"},
			{"89-90", "Redemptionists holding an impromptu stake-burning ('the purifying fire')"},
			{"91-98", "Tech-priests repairing power lines (escorted by combat-servitors)"},
			{"99-00", "Dissolute nobles hunting poor people for sport"},
	};
	
	private static final String[][] disrepairTable_hiveFloor = {
			{"01-50", "No power and totally collapsed, in addition to the disrepair of the above underhive area"},
			{"51-80", "No power and totally collapsed, in addition to the disrepair of the above underhive area, but the disrepair is worse (partially flooded becomes totally flooded, etc.)"},
			{"81-00", "No power and totally collapsed, in addition to the disrepair of the above underhive area, but the disrepair is worse (roll an additional effect on the Underhive Disrepair table)"},
	};
	private static final String[][] encounteredLocations_hiveFloor = {
			{"01-05", "Roll twice and combine the results"},
			{"06-08", "Vermin lair (wing-rats)"},
			{"09-12", "Vermin lair (giant rats)"},
			{"13-16", "Vermin lair (giant insects)"},
			{"17-20", "Vermin lair (feral beasts)"},
			{"21-40", "Camp of mutant outcasts"},
			{"41-47", "Extensive settlement of mutant outcasts"},
			{"48-50", "Camp of warp-tainted mutant abominations"},
			{"51-55", "Ancient noble's crypt"},
			{"56-58", "Tech-priest archeotech excavation"},
			{"59", "Populated area recently cut off from the hive"},
			{"60", "Isolated tunnel-tribe unaware of the wider hive"},
			{"61-64", "Lair of a powerful heretek controlling a swarm of servo-skulls"},
			{"65-68", "Lair of a powerful heretek controlling an army of servitors"},
			{"69", "Lair of a powerful heretek controlling an army of AI drones"},
			{"70", "Cabal of powerful hereteks"},
			{"71-74", "Lair of xeno beasts"},
			{"75-78", "Lair of a large xeno monster"},
			{"79-80", "Camp of sentient xenos"},
			{"81-83", "Temple of a cult practising extreme sadism"},
			{"84-85", "Temple of a cult practising cannibalism"},
			{"86", "Temple of a cult worshiping xeno gods"},
			{"87", "Temple of a cult worshiping xenos"},
			{"88-90", "Temple of a cult worshiping daemons"},
			{"91-94", "Lair of a witch"},
			{"95", "Coven of witches"},
			{"96-97", "Abandoned temple with an altar through which a daemon speaks"},
			{"98-99", "Abandoned temple with a random item on an altar which is possessed by a daemon"},
			{"00", "Abandoned temple-crypt within which is interred a bound daemonhost"},
	};
	
	@Override
	public String filename() {
		return "Overmap.html";
	}
	
	@Override
	public String title() {
		return "Overmap";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printParagraph("The map is divided into three vertical layers:");
		printer.printList(false,
				"Upper Hive",
				"Middle Hive",
				"Underhive"
		);
		printer.printParagraph("Each layer is divided into areas, arranged as a hex grid. Each area has:");
		printer.printList(false,
				"One Main Location",
				"A list of additional locations",
				"One or more states of Disrepair (for the Underhive)"
		);
		printer.printParagraph("The Main Location (and Disrepair if applicable) should be determined when the area is generated. "
				+ "Additional locations are added as they are encountered.");
		
		printer.printParagraph("<i>The GM may wish to roll results for the Encounter and Location Encounter tables ahead of time, in order to save time preparing the encounters.</i>");
		
		printer.printSubheader_collapsible("Procedure for Travel");
		printer.printCollapsibleTop();
		printer.printParagraph("Travelling to an adjacent area or between layers takes an hour. "
				+ "Arriving in an area equates to arriving at the Main Location for that area. "
				+ "Once in an area, travelling to a specific location takes an hour. "
				+ "So travelling to a location in an adjacent area takes 2 hours, for example.");
		printer.printSubSubheader("1 - Is there a Navigation Challenge or Navigation Hazard?");
		printer.println(
				"If so, resolve the characters' Navigate Action(s). "
				+ "Note progress against any Navigation Challenge and whether the characters have become lost.");
		printer.printSubSubheader("2 - When/where do the encounters happen?");
		printer.println("There is one Location Encounter and one regular Encounter. "
				+ "Roll a d10 for each - the encounter with the lowest roll occurs first; doubles means they happen together.");
		printer.printSubSubheader("3 - Is the Location Encounter a repeat?");
		printer.println("Roll a d10. If this position in the list of encountered locations for this area is empty, roll a new Encountered Location and add it to the list. "
				+ "Otherwise, the location in the rolled position is encountered.");
		printer.printSubSubheader("3 - Roll up the encounters");
		printer.println("Use the tables for the area the characters are currently in.");
		printer.printSubSubheader("4 - Resolve the encounters");
		printer.printSubSubheader("5 - Advance time");
		printer.println("Whether the characters continue travelling or abandon the travel to do something else after the encounter, time advances by an hour.");
		printer.printSubSubheader("6 - Resolve the Travel");
		printer.println("If the characters are lost, use the table to determine where they end up.");
		printer.println("Otherwise, if the characters don't still have a Navigation Challenge to overcome, they Travel successfully: "
				+ "If their destination is in the same area, then they arrive. "
				+ "Otherwise, they move into the adjacent area in their intended direction.");
		printer.printCollapsibleTail();
		
		printer.printSubheader_collapsible("Procedure for Non-Travel");
		printer.printCollapsibleTop();
		printer.printSubSubheader("1 - Does an encounter happen?");
		printer.println("Roll a d10. On a roll of 1, there is an Encounter.");
		printer.printSubSubheader("2 - Roll up the encounter");
		printer.printSubSubheader("3 - Resolve the encounter");
		printer.printSubSubheader("4 - Resolve the non-travel Action");
		printer.println("If the characters decide to abandon the Action they were performing after the encounter, skip advancing time and don't roll another encounter for this hour.");
		printer.printSubSubheader("5 - Advance time");
		printer.printCollapsibleTail();
		
		
		printer.printSubheader_collapsible("Procedure for Encounters");
		printer.printCollapsibleTop();
		printer.printList(false,
				"Determine encounter distance using the table.",
				"Determine NPC disposition (if relevant).",
				"Determine whether the party and/or encountered party is surprised (if relevant).",
				"Run the encounter."
		);		
		printer.printSubSubheader("Encounter Distance");
		printer.printTableTop(false, true, "Area", "Distance");
		printer.printTableRow("Upper Hive", "6d10m");
		printer.printTableRow("Middle Hive", "5d10m");
		printer.printTableRow("Underhive", "4d10m");
		printer.printTableRow("Collapsed (1-5)", "3d10m");
		printer.printTableRow("Collapsed (6-10)", "2d10m");
		printer.printTableTail();
		printer.printCollapsibleTail();
		

		printer.printSubheader_collapsible("Navigation Challenges and Navigation Hazards");
		printer.printCollapsibleTop();
		printer.printSubSubheader("Navigation Challenges");
		// TODO ...
		printer.printList(false,
				"If there is a Navigation Challenge, the characters must Navigate successfully in order to Overcome this and Travel.",
				"If there is a Navigation Hazard, the characters must Navigate successfully to avoid the hazard, assuming they are capable of doing so - radiation, for example, would automatically affect characters who cannot detect it.",
				"Otherwise, no Test is required to Travel.");
		printer.println("Examples of different levels of Navigation Challenge:");
		printer.printList(false,
				"Navigation Challenge (1) - following directions to a new location.",
				"Navigation Challenge (2) - retracing steps when lost.",
				"Navigation Challenge (3) - following unclear directions.",
				"Navigation Challenge (N) - disrepair in the area, e.g. Collapsed(N), Flooded(N), Dark(N).");
		
		printer.printSubSubheader("Navigation Hazards");
		printer.printList(false,
				"Sewage",
				"Toxic liquid",
				"Toxic gas",
				"Radiation");
		// TODO ...
		printer.printCollapsibleTail();
		
		printer.printSubheader_collapsible("Getting Lost");
		printer.printCollapsibleTop();
		printer.printTableTop(false, true, "Roll", "Effect");
		for(int i = 0; i < gettingLostTable.length; i ++) {
			printer.printTableRow(gettingLostTable[i]);
		}
		printer.printTableRow_note("Treat invalid results as going in circles.");
		printer.printTableTail();
		printer.printCollapsibleTail();
		
		printMapLayerTables(printer, "Upper Hive",
				null,
				mainLocationsTable_upperHive,
				encounteredLocations_upperHive,
				encountersTable_upperHive);
		printer.println();
		printer.println();
		printMapLayerTables(printer, "Middle Hive",
				null,
				mainLocationsTable_middleHive,
				encounteredLocations_middleHive,
				encountersTable_middleHive);
		printer.println();
		printer.println();
		printMapLayerTables(printer, "Underhive",
				disrepairTable_underhive,
				mainLocationsTable_underhive,
				encounteredLocations_underhive,
				encountersTable_underhive);
		printer.println();
		printer.println();
		printMapLayerTables(printer, "Hive Floor",
				disrepairTable_hiveFloor,
				null,
				encounteredLocations_hiveFloor,
				null);
		printer.println();
		printer.println();
		printer.printFileTail();
	}
	
	private void printMapLayerTables(DHOPrinter printer, String name,
			String[][] disrepairTable,
			String[][] mainLocationsTable,
			String[][] encounteredLocations,
			String[][] encountersTable) {
		printer.printHeader_collapsible(name);
		printer.printCollapsibleTop();
		if(disrepairTable != null) {
			printer.printSubSubheader(name+" Disrepair");
			printer.printTableTop(true, true, "Roll", "Disrepair");
			for(int i = 0; i < disrepairTable.length; i ++) {
				printer.printTableRow(disrepairTable[i]);
			}
			printer.printTableTail();
		}
		if(mainLocationsTable != null) {
			printer.printSubSubheader(name+" Main Locations");
			printer.printTableTop(true, true, "Roll", "Location");
			for(int i = 0; i < mainLocationsTable.length; i ++) {
				printer.printTableRow(mainLocationsTable[i]);
			}
			printer.printTableTail();
		}
		if(encounteredLocations != null) {
			printer.printSubSubheader(name+" Encountered Locations");
			printer.printTableTop(true, true, "Roll", "Location");
			for(int i = 0; i < encounteredLocations.length; i ++) {
				printer.printTableRow(encounteredLocations[i]);
			}
			printer.printTableTail();
		}
		if(encountersTable != null) {
			printer.printSubSubheader(name+" Encounters");
			printer.printTableTop(true, true, "Roll", "Encounter");
			for(int i = 0; i < encountersTable.length; i ++) {
				printer.printTableRow(encountersTable[i]);
			}
			printer.printTableTail();
		}
		printer.printCollapsibleTail();
	}
}