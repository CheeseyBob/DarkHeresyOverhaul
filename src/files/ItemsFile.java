package files;

import main.*;

class ItemsFile implements PrintableFile {
	private static final String[][] itemSizeTable = {
			{"0", "-70", "Trivial (Jewelery)", "Negligable (Insects)", "-"},
			{"1", "-60", "Small (Pistol)", "Extremely Tiny (Squirrel)", "-"},
			{"2", "-50", "Smallish (SMG)", "Very Tiny (Rabbit)", "-"},
			{"3", "-40", "Standard (Rifle)", "Tiny (Fox)", "-"},
			{"4", "-30", "Largish (Assault Rifle)", "Very Small (Small Dog)", "-"},
			{"5", "-20", "Large (HMG)", "Small (Badger)", "-"},
			{"6", "-10", "Very Large (Rocket Launcher)", "Smallish (Large Dog)", "-"},
			{"7", "0", "Massive", "Average (Human)", "Bicycle"},
			{"8", "10", "Massive (Power Armour)", "Largish (Lion)", "Motorbike"},
			{"9", "20", "Massive", "Large (Brown Bear)", ""},
			{"10", "30", "Massive", "Very Large (Polar Bear)", ""},
			{"11", "40", "Massive", "Extremely Large (Black Rhino)", ""},
			{"12", "50", "Massive", "Massive (White Rhino)", "Small Car"},
			{"13", "60", "Massive", "Massive (Elephant)", "Typical Car"},
			{"14", "70", "Massive", "Massive", "Small Van"},
			{"15", "80", "Massive", "Massive", "Large Van"},
			{"16", "90", "Massive (20 Foot Container)", "Massive (Humpback Whale)", "Small Lorry"},
			{"17", "100", "Massive (40 Foot Container)", "Massive", "Bus"},
			{"18", "110", "Massive", "Massive (Blue Whale)", "Double-Decker Bus"},
	};
	private static final String[] itemAvailabilityTableHeaderList = {
			"Availability", "Modifier", "Price Bracket", "Price Roll", "Crafting Steps"
	};
	private static final String[][] itemAvailabilityTable = {
			{"Ubiquitous ", "Automatic ", "1 ", "1 ", "1"},
			{"Abundant ", "+30 ", "1-10 ", "1d10 ", "2"},
			{"Plentiful ", "+20 ", "10-30 ", "1d10+10 ", "4"},
			{"Common ", "+10 ", "30-100 ", "3d10+30 ", "8"},
			{"Average ", "+0 ", "100-300 ", "10 x (1d10 + 10) ", "16"},
			{"Scarce ", "-10 ", "300-1000 ", "10 x (3d10 + 30) ", "32"},
			{"Rare ", "-20 ", "1000-3000 ", "100 x (1d10 + 10) ", "64"},
			{"Very Rare ", "-30 ", "3000-10,000 ", "100 x (3d10 + 30) ", "128"},
			{"Extremely Rare ", "-40 ", "10,000-30,000 ", "1,000 x (1d10 + 10) ", "256"},
			{"Near Unique ", "-50 ", "30,000-100,000 ", "1,000 x (3d10 + 30) ", "512"},
			{"Unique ", "-60 ", "100,000+ ", "10,000 x (1d10 + 10) ", "1024"},
	};
	
	@Override
	public String filename() {
		return "Items.html";
	}
	
	@Override
	public String title() {
		return "Items";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.println();
		printer.println();
		printer.printSubheader_collapsible("Sizes");
		printer.printCollapsibleTop();
		printer.printTableTop(new String[] {
				"Size", "Bonus", "Items", "Characters", "Vehicles", ""
		}, true, true);
		for(int size = 0; size <= 18; size ++) {
			printer.printTableRow(itemSizeTable[size]);
		}
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printSubheader_collapsible("Equipment");
		printer.printCollapsibleTop();
		printer.printParagraph("A character can carry items whose sizes add up to at most 2x the character's size. Each carried item can have size up to SB+1.");
		printer.printParagraph("In addition to this, a character have equipped clothing, armour and other items, and can hold an item in each hand.");
		printer.printTableTop("Item Size", "Held Item", false, true);
		printer.printTableRow("SB", "use without penalty");
		printer.printTableRow("SB+1", "use with -20 penalty");
		printer.printTableRow("SB+2", "can carry but not use");
		printer.printTableRow("SB+3", "can Haul only");
		printer.printTableRow("SB+4", "can Drag only");
		printer.printTableRow("SB+5", "cannot pick up");
		printer.printTableTail();
		printer.printParagraph("For items held with multiple hands, treat SB as 1 higher. Aditionally, a ranged weapon can be braced against terrain or a bipod/tripod as a Secondary Action, in which case treat SB as 1 higher.");
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printSubheader_collapsible("Money and Availability");
		printer.printCollapsibleTop();
		printer.printTableTop("Social Class", "Baseline Gelt/Day", "Peak Gelt/Day", "Description", true, true);
		printer.printTableRow("Outcasts", "-", "-", "Those that have no rightful place within the structure of Imperial society, living below even the lowest classes.");
		printer.printTableRow("Drudging Classes", "5", "10", "Those that work in the fields, manufactorums and hives of the Imperium, by far making up the bulk of mankind.");
		printer.printTableRow("Military Class", "10", "20", "Those that fight.");
		printer.printTableRow("Supine Class", "15", "30", "Those that serve classes better than themselves, benefiting from the wealth of their masters.");
		printer.printTableRow("Learned Class", "20", "50", "Those that make their way with knowledge.");
		printer.printTableRow("Trading Class", "25", "75", "Those that buy and sell or have specialist trades with which to make their living.");
		printer.printTableRow("Mechanicus", "30", "90", "Those that follow the Machine God are a class unto themselves.");
		printer.printTableRow("Ministorum", "40", "120", "Those of the Cult of the Emperor and benefit greatly from the uncounted wealth of His domain.");
		printer.printTableRow("Nobility", "500", "-", "Those born to wealth and power by right of blood.");
		printer.printTableTail();
		printer.println();
		printer.println();
		printer.printTableTop(itemAvailabilityTableHeaderList, false, true);
		for(int i = 0; i < 11; i ++) {
			printer.printTableRow(itemAvailabilityTable[i]);
		}
		printer.printTableTail();
		printer.println();
		printer.println();
		printer.printTableTop("Services (1 Day's Work)", "Availability", false, true);
		printer.printTableRow("Labourer", "Abundant");
		printer.printTableRow("Soldier", "Plentiful");
		printer.printTableRow("Skilled Artisan", "Common");
		printer.printTableTail();
		printer.printTableTop("Provisions (1 Meal)", "Availability", false, true);
		printer.printTableRow("Poor (Vermin Meat, Hydro-Fungus, Silt Ale)", "Ubiquitous");
		printer.printTableRow("Standard (Nutri-Paste, Round of Amasec)", "Abundant");
		printer.printTableRow("Good (Roasted Vex Worm, Quality Amasec)", "Plentiful");
		printer.printTableRow("Best (Vintage Amasec)", "Common");
		printer.printTableTail();
		printer.printTableTop("Accomodation (1 Night)", "Availability", false, true);
		printer.printTableRow("Poor (Hab Sleeper Capsule)", "Abundant");
		printer.printTableRow("Standard (Small Lodge Room)", "Plentiful");
		printer.printTableRow("Good (Spacious Lodgings)", "Common");
		printer.printTableRow("Best (Grand Hall Lodgings)", "Average");
		printer.printTableTail();
		printer.printTableTop("Transportation (1 Journey)", "Availability", false, true);
		printer.printTableRow("Poor (Sub-level Conveyer)", "Abundant");
		printer.printTableRow("Standard (Light Civ Ground Vehicle, Atmospheric Flight)", "Plentiful");
		printer.printTableRow("Good (Long Distance Atmospheric Flight)", "Common");
		printer.printTableRow("Best (Low Orbital Flight, Sedan Chair)", "Average");
		printer.printTableTail();
		printer.printTableTop("Medical Care (1 Day/Visit)", "Availability", false, true);
		printer.printTableRow("Poor (Feral World Shaman)", "Plentiful");
		printer.printTableRow("Standard (Trained Medic)", "Common");
		printer.printTableRow("Good (Trained Doctor, Med-Servitor)", "Average");
		printer.printTableRow("Best (Skilled Physician)", "Scarce");
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printSubheader_collapsible("Aquiring Items - Purchase and Requisition");
		printer.printCollapsibleTop();
		printer.printParagraph("Characters can aquire items and services either through payment and barter, or by using their influence and authority to requisition what is needed. First, they must locate someone or somewhere which has the desired item available.");
		printer.printParagraph("To find a suitable location in the overmap area, use Inquire or Search (or simply Travel to a previously found location). The item's availability modifier applies to this roll. The type of area will also affect the difficulty and the potential outcomes.");
		printer.println("<b>Trade:</b>");
		printer.printList(true, new String[] {
				"Roll to determine the starting price (selling items uses the bracket below the buying price).",
				"Haggle to determine discount (optional).",
				"Make the trade."
		});
		printer.println("<b>Requisition:</b>");
		printer.printList(true, new String[] {
				"Either Command or Persuade the NPC (possibly after Intimidating or having to Deceive). Succeeding here will give a bonus to their Disposition (critical failure a penalty).",
				"The NPC makes a Disposition Test. This is modified by the justification given (see the below table), the availability of the item and whether you reveal you are working for the Inquisition (+30).",
				"If the Disposition Test is successful, the NPC gives you the item(s)."
		});
		printer.printTableTop("Justification", "Modifier", false, true);
		printer.printTableRow("nonsensical", "automatic failure");
		printer.printTableRow("none or very poor", "-30");
		printer.printTableRow("poor", "-10");
		printer.printTableRow("decent", "+10");
		printer.printTableRow("excellent", "+30");
		printer.printTableRow("crazy to refuse", "automatic success");
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printSubheader_collapsible("Crafting and Repair");
		printer.printCollapsibleTop();
		printer.println("<b>Crafting:</b>");
		printer.printList(false, new String[] {
				"Materials: a number of components equal to the size of the item.",
				"Designs: tech items require designs.",
				"Difficulty: apply the availability modifier to the Craft Test.",
				"The steps of progress needed to complete the item given in the item availability table.",
				"For particularly lengthy crafting projects, make one roll each day and multiply the number of steps of progress by the number of hours worked.",
		});
		printer.println("<b>Repair:</b>");
		printer.printList(false, new String[] {
				"Materials: each level of the Damaged aspect that is overcome consumes 1 component.",
				"Designs: not required for repairs.",
				"Difficulty: apply the availability modifier to the Craft Test.",
		});
		printer.printParagraph("Crafting materials are Size 1 and have an availability two steps higher than the item they are for. Designs have an availability one lower than the item and generally come in the form of info on a data-slate.");
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}