package files;

import main.*;

class OvermapFile implements PrintableFile {
	
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
			{"16-40", "Procession of nobles (Ld10 + Hd10 servants + 2d10 guards"},
			{"41-50", "Procession of ministorum priests"},
			{"51-60", "Servo-skulls (1d10) doing surveillance [quiet]"},
			{"61-70", "Servitors (1d10) cleaning the streets"},
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
			{"11-18", "Ministorum shrine"},
			{"19-20", "Ministorum temple 'a temple to saint ___'"},
			{"21-30", "Enforcer station"},
			{"31-40", "Shop selling food"},
			{"41-45", "Shop selling clothing and apparel"},
			{"46-55", "Black-market dealer selling weapons and armour"},
			{"56-60", "Shop selling tech items"},
			{"61-65", "Specialist shop selling a specific kind of item"},
			{"66-70", "Eatery - Poor Provisions"},
			{"71-75", "Eatery - Standard Provisions"},
			{"76-85", "Shady bar - Poor Provisions (booze); [Underworld hirelings?]"},
			{"86-93", "Cheap pub with rooms - Poor Accomodation and Provisions (food & booze)"},
			{"94-00", "Pub with rooms - Standard Accomodation and Provisions (food & booze)"},
	};
	private static final String[][] encountersTable_middleHive = {
			{"01-10", "Roll twice and combine the results"},
			{"11-15", "Street urchins begging (1d10)"},
			{"16-20", "Beggars asking for food or gelt (1d10 Dregs)"},
			{"21-23", "Gamblers (Ld10+1) [small crowd]"},
			{"24-26", "Entertainers performing stunts (juggling knives, etc.) (Ld10 Entertainers)"},
			{"27-30", "Entertainers busking (Ld10 Entertainers)"},
			{"31-37", "Scum brawling in the street (Ld10+1 Dregs)"},
			{"38-40", "Scum knife-fighting in the street (Ld10+1 Dregs)"},
			{"41-43", "Petty criminals pickpocketing people on the street (Ld10 Outlaws)"},
			{"44-45", "Petty criminals mugging people in an alleyway (Ld10 Renegades)"},
			{"46-50", "Street vendors (Ld10) selling food - Poor Quality Provisions"},
			{"51-54", "Street vendors (Ld10) selling trinkets"},
			{"55-58", "Street vendors (Ld10) selling random items"},
			{"59-60", "Street vendors (Ld10) selling illicit goods"},
			{"61-70", "Ministorum confessors (Ld10) preaching to the masses"},
			{"71-74", "Servitors (Ld10) hauling goods"},
			{"75-78", "Servitors (Ld10) hauling refuse"},
			{"79-80", "Tech-priests (Ld10) maintaining infrastructure"},
			{"81-83", "Administratum scribes (Ld10) auditing businesses"},
			{"84-85", "Administratum scribes (Ld10) collecting taxes"},
			{"86-90", "Enforcers (Ld10) on patrol"},
			{"91-93", "Enforcers (Ld10) escorting a detainee to the cells"},
			{"94-95", "Enforcers (Ld10) roughing someone up"},
			{"96-97", "Enforcers (Ld10) searching a building"},
			{"98", "Arbitrators (Ld10) escorting a captured psyker to the cells"},
			{"99", "Kill Squad Troopers (Ld10) enforcing an execution warrant"},
			{"00", "Unsactioned psyker activity"},
	};

	private static final String[][] disrepairTable_underhive = {
			{"all", "Dark (1d10)"},
			{"01-10", "Roll twice and combine the results"},
			{"11-30", "Collapsed (1d10)"},
			{"31-40", "Flooded (1d10)"},
			{"41-50", "Sewage (1d10)"},
			{"51-52", "Toxic Liquid (Fatigue) (1d10)"},
			{"53-54", "Toxic Liquid (Lingering Fatigue) (1d10)"},
			{"55-56", "Toxic Liquid (Lethal) (1d10)"},
			{"57-58", "Toxic Liquid (Lingering Lethal) (1d10)"},
			{"59-60", "Toxic Liquid (Neurotoxin) (1d10)"},
			{"61-62", "Toxic Liquid (Lingering Neurotoxin) (1d10)"},
			{"63-64", "Toxic Liquid (Convulsions) (1d10)"},
			{"65-66", "Toxic Liquid (Pain) (1d10)"},
			{"67-68", "Toxic Liquid (Paralysis) (1d10)"},
			{"69-70", "Toxic Liquid (Lingering Paralysis) (1d10)"},
			{"71-72", "Toxic Gas (Fatigue) (1d10)"},
			{"73-74", "Toxic Gas (Lingering Fatigue) (1d10)"},
			{"75-76", "Toxic Gas (Lethal) (1d10)"},
			{"77-78", "Toxic Gas (Lingering Lethal) (1d10)"},
			{"79-80", "Toxic Gas (Neurotoxin) (1d10)"},
			{"81-82", "Toxic Gas (Lingering Neurotoxin) (1d10)"},
			{"83-84", "Toxic Gas (Convulsions) (1d10)"},
			{"85-86", "Toxic Gas (Pain) (1d10)"},
			{"87-88", "Toxic Gas (Paralysis) (1d10)"},
			{"89-90", "Toxic Gas (Lingering Paralysis) (1d10)"},
			{"91-00", "Radiation (1d10)"}
	};
	private static final String[][] mainLocationsTable_underhive = {
			{"01-85", "Old abandoned site (roll on the Middle Hive Main Location table)"},
			{"86-90", "Ancient abandoned site (roll on the Upper Hive Main Location table)"},
			{"91-00", "Major vertical interchange (1d10 passages downwards to Hive Floor Locations)"},
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
			{"all", "Dark (10)"},
			{"all", "Collapsed (1d10)"},
			{"01-40", "The same disrepair of the above underhive area"},
			{"41-80", "The same disrepair of the above underhive area, upgraded by 1d10"},
			{"81-00", "The same disrepair of the above underhive area, plus another roll on the Underhive Disrepair table"},
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
		printer.printParagraph("Each layer is divided into Areas as a hex grid. Each Area has:");
		printer.printList(false,
				"One Main Location",
				"A list of additional locations",
				"States of Disrepair (for the Underhive)"
		);
		printer.printParagraph("The Main Location (and Disrepair if applicable) should be determined when the Area is generated. "
				+ "Additional locations are added as they are encountered.");
		printer.printParagraph("<i>The GM should roll some results for each table ahead of time, in order to save time during play.</i>");
		
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