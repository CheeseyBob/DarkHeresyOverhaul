package files;

import main.*;

class CharacterCreationFile implements PrintableFile {
	
	private static String[] getBackgroundTableHeaderList() {
		String[] list = new String[HomeWorld.list.length + 1];
		for(int i = 0; i < HomeWorld.list.length; i ++) {
			list[i] = HomeWorld.list[i].name;
		}
		list[HomeWorld.list.length] = "Background";
		return list;
	}
	
	private static String[] getBackgroundTableRow(int row) {
		String[] list = new String[HomeWorld.list.length + 1];
		for(int i = 0; i < HomeWorld.list.length; i ++) {
			list[i] = HomeWorld.backgroundRollList[i][row];
		}
		list[HomeWorld.list.length] = Background.list[row].name;
		return list;
	}
	
	private static String[] getRoleTableHeaderList() {
		String[] list = new String[Background.list.length + 1];
		for(int i = 0; i < Background.list.length; i ++) {
			list[i] = Background.list[i].name;
		}
		list[Background.list.length] = "Role";
		return list;
	}
	
	private static String[] getRoleTableRow(int row) {
		String[] list = new String[Background.list.length + 1];
		for(int i = 0; i < Background.list.length; i ++) {
			list[i] = Background.roleRollList[i][row];
		}
		list[Background.list.length] = Role.list[row].name;
		return list;
	}
	
	private static String[] getQuirksTableRow(int row) {
		String[] list = new String[HomeWorld.list.length + 1];
		list[0] = HomeWorld.QuirksTable.rollList[row];
		for(int i = 0; i < HomeWorld.list.length; i ++)
			list[i+1] = HomeWorld.list[i].quirksTable[row];
		return list;
	}
	
	private static String[][] divinationsList = {
			{"01-02", "Thought begets Heresy."},
			{"03-04", "Heresy begets Retribution."},
			{"05-06", "Do not ask why you serve, only how."},
			{"07-08", "Only the insane have strength enough to prosper."},
			{"09-10", "Innocence is an illusion."},
			{"11-12", "Dark dreams lie upon the heart."},
			{"13-14", "The pain of the bullet is ecstasy compared to damnation."},
			{"15-16", "The soul wavers in the Void."},
			{"17-18", "Darkness stalks us all."},
			{"19-20", "Mutation without; corruption within."},
			{"21-22", "The alien speaks naught but lies."},
			{"23-24", "Even one who has nothing can still offer his life."},
			{"25-27", "Truth is subjective."},
			{"28-29", "What is worth doing is worth dying for."},
			{"30-31", "A wandering mind will find itself in dark places."},
			{"32-33", "The light of the Emperor gives us strength."},
			{"34-37", "Violence solves everything."},
			{"38-39", "There are no civillians in the battle for survival."},
			{"40-41", "To war is human."},
			{"42-43", "An unbroken spirit serves the Emperor until death."},
			{"44-45", "Ignorance is a blessing."},
			{"46-47", "Humans must die so that humanity can endure."},
			{"48-49", "Suffering is naught but an instructor."},
			{"50-51", "There is nothing to fear but failure."},
			{"52-54", "The wise learn from the deaths of others."},
			{"55-56", "A suspicious mind is a safe mind."},
			{"57-58", "Be watchful; be wary."},
			{"59-62", "Trust in your fear."},
			{"63-64", "There is no substitute for zeal."},
			{"65-66", "To admit defeat is to be defeated."},
			{"67-68", "Both strength and weakness come from within."},
			{"69-70", "Victory is its own reward."},
			{"71-72", "Destruction brings salvation."},
			{"73-74", "It is better to die for the Emperor than live for yourself."},
			{"75-78", "Never forgive; never forget."},
			{"79-80", "Doubt not your strength."},
			{"81-82", "Faith is a shield."},
			{"83-84", "Serve only the Emperor's will."},
			{"85-86", "Trust in the Emperor."},
			{"87-88", "Obey without question; command without doubt."},
			{"89-90", "Success is measured in blood."},
			{"91-94", "The truth is terrible to bear."},
			{"95-96", "Hatred is the Emperor’s greatest gift."},
			{"97-98", "Only in death does duty end."},
			{"99-00", "Everything you have been told is a lie."},
	};

	
	@Override
	public String filename() {
		return "CharacterCreation.html";
	}
	
	@Override
	public String title() {
		return "Character Creation";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printHeader("Roll Up The Character");
		printer.printParagraph("After rolling a character, you can Burn a Fate Point to bench that character and roll a new one.");
		printer.println();
		printer.println();
		printer.printSubheader("Determine Home World");
		printer.printTableTop(false, true, "d100", "Home World", "Bonus 1", "Bonus 2", "Penalty");
		for(int i = 0; i < HomeWorld.list.length; i ++) {
			printer.printTableRow(
					HomeWorld.rollList[i],
					HomeWorld.list[i].name,
					HomeWorld.list[i].bonusCharacteristic1.fullName(),
					HomeWorld.list[i].bonusCharacteristic2.fullName(),
					HomeWorld.list[i].penaltyCharacteristic.fullName());
		}
		printer.printTableTail();
		printer.println();
		printer.println();
		printer.printSubheader("Determine Characteristics");
		printer.println(
				"	<ol>" + "\n" + 
				"		<li>Roll 2d10+20 to determine each of the 9 Characteristics.</li>"+ "\n" + 
				"		<ul>" + "\n" + 
				"			<li>For Characteristics in the bonus column on the Determine Home World table, reroll and keep the highest.</li>" + "\n" + 
				"			<li>For Characteristics in the penalty column, reroll and keep the lowest.</li>" + "\n" + 
				"		</ul>" + "\n" + 
				"		<li>Set your Maximum Wounds to 7.</li>" + "\n" + 
				"	</ol>");
		printer.println();
		printer.println();
		printer.printSubheader("Determine Background");
		printer.printTableTop(true, true, getBackgroundTableHeaderList());
		for(int i = 0; i < Background.list.length; i ++) {
			printer.printTableRow(getBackgroundTableRow(i));
		}
		printer.printTableTail();
		printer.println();
		printer.println();
		printer.printSubheader("Determine Role");
		printer.printTableTop(true, true, getRoleTableHeaderList());
		for(int i = 0; i < Role.list.length; i ++) {
			printer.printTableRow(getRoleTableRow(i));
		}
		printer.printTableTail();
		printer.println();
		printer.println();
		printer.printHeader("Role");
		printer.printParagraph("You get all the Aptitudes listed under your Role.");
		printer.printRowTop();
		for(Role role : Role.list) {
			printer.printColTop(3);
			printer.printSubSubheader(role.name);
			printer.printList(false, role.aptitudeList);
			printer.printColTail();
		}
		printer.printRowTail();
		printer.println();
		printer.println();
		printer.printHeader("Home World");
		printer.printParagraph("Choose an Aptitude and a Talent listed under your Home World.");
		printer.println();
		printer.println();
		for(HomeWorld homeWorld : HomeWorld.list) {
			printer.printSubheader_collapsible(homeWorld.name);
			printer.printCollapsibleTop();
			printer.printParagraph("<b>Aptitude:</b> "+homeWorld.getAptitudes());
			printer.printTableTop(true, false, "");
			for(SpecialRule special : homeWorld.specialRuleList) {
				printer.printTableRow_specialRule(special);
			}
			printer.printTableTail();
			printer.printCollapsibleTail();
			printer.println();
			printer.println();
		}
		printer.printHeader("Background");
		printer.printParagraph("Choose an Aptitude and a starting package listed under your Background.");
		printer.println();
		printer.println();
		for(Background background : Background.list) {
			printer.printSubheader_collapsible(background.name);
			printer.printCollapsibleTop();
			printer.printParagraph("<b>Aptitude:</b> "+background.aptitude);
			printer.printRowTop();
			for(Background.Path path : background.backgroundPathList) {
				printer.printColTop(4);
				printBackgroundPath(path, printer);
				printer.printColTail();
			}
			printer.printRowTail();
			printer.printCollapsibleTail();
			printer.println();
			printer.println();
		}
		printer.printHeader("Spend Experience and Equip Gear");
		printer.printParagraph("Each character should have 8 different Aptitudes, including General. "
				+ "If you took the same Aptitude more than once, you can choose any Characteristic as an Aptitude to make up for this.");
		printer.println("<b>Equipment</b>");
		printer.printList(false, new String[] {
				"Take any Ubiquitous or Abundant items as you want (and can carry).",
				"If you wish, you can swap out items from your background for different ones of the same availability.",
				"You can also take any 1 item of Average availability or any 2 items up to Common availability.",
		});
		printer.println("<b>Experience</b>");
		printer.printList(false, new String[] {
				"You start with 5 XP.",
				"Buy any Advances you wish with this XP (see Character Advancement). Keep any XP you don't spend.",
		});
		printer.println();
		printer.println();
		printer.printHeader("Bringing the Character to Life");
		printer.printParagraph("The tables in this section are purely to help bring the character to life and have no direct mechanical effects. "
				+ "You may reroll, pick a result, or even come up with something not listed, if you so desire.");

		printer.printSubheader("Age");
		printer.printTableTop(false, true, "Home World", "Youth", "Adult", "Mature", "Aged");
		for(int i = 0; i < HomeWorld.list.length; i ++)
			printer.printTableRow(HomeWorld.list[i].ageTable);
		printer.printTableTail();

		printer.printSubheader("Build");
		printer.printTableTop(false, true, "Home World", "Scrawny", "Slender", "Lanky", "Squat", "Fit", "Tall", "Stocky", "Brawny", "Strapping");
		for(int i = 0; i < HomeWorld.list.length; i ++)
			printer.printTableRow(HomeWorld.list[i].buildTable);
		printer.printTableTail();

		printer.printSubheader("Complexion");
		printer.printTableTop(false, true, "Home World", "Dark", "Tan", "Light", "Pale");
		for(int i = 0; i < HomeWorld.list.length; i ++)
			printer.printTableRow(HomeWorld.list[i].complexionTable);
		printer.printTableTail();

		printer.printSubheader("Eyes");
		printer.printTableTop(false, true, "Home World", "Brown", "Green", "Blue", "Grey", "Yellow", "Black", "Red", "Violet");
		for(int i = 0; i < HomeWorld.list.length; i ++)
			printer.printTableRow(HomeWorld.list[i].eyesTable);
		printer.printTableTail();

		printer.printSubheader("Hair");
		printer.printTableTop(false, true, "Home World", "Black", "Brown", "Blonde", "Grey", "Red", "Ginger", "White", "Dyed");
		for(int i = 0; i < HomeWorld.list.length; i ++)
			printer.printTableRow(HomeWorld.list[i].hairTable);
		printer.printTableTail();

		printer.printSubheader("Quirks");
		printer.printTableTop(true, true, HomeWorld.QuirksTable.top());
		for(int i = 0; i < HomeWorld.QuirksTable.rollList.length; i ++)
			printer.printTableRow(getQuirksTableRow(i));
		printer.printTableTail();

		printer.printSubheader("Subculture");
		/*XXX*/printer.printParagraph("[Feral World superstitions / Hive subcultures / Void Born ship traditions / etc.]");
		printer.printRowTop();
		for(HomeWorld homeworld : HomeWorld.list) {
			printer.printColTop(6);
			printer.printSubSubheader(homeworld.name);
			printSubcultureTable(homeworld, printer);
			printer.printColTail();
		}
		printer.printRowTail();
		
		printer.printSubheader("Nature");
		
		printer.printTableTop(false, true, "d100", "What do they desire?");
		printer.printTableRow("01-10", "Only to stay alive");
		printer.printTableRow("11-17", "Ensure their loved ones are saved");
		printer.printTableRow("18-24", "A moment of peace and quiet");
		printer.printTableRow("25-31", "The favour of a loved one");
		printer.printTableRow("32-38", "The betterment of mankind");
		printer.printTableRow("39-45", "The blessings of the God-Emperor");
		printer.printTableRow("46-52", "Truth");
		printer.printTableRow("53-59", "Justice");
		printer.printTableRow("60-66", "Vengeance for a loved one");
		printer.printTableRow("67-73", "The sector cleansed of heresy");
		printer.printTableRow("74-80", "Mankind’s survival, over individual lives");
		printer.printTableRow("81-87", "Wealth and riches");
		printer.printTableRow("88-94", "Power and glory");
		printer.printTableRow("95-00", "Violence and death");
		printer.printTableTail();
		
		printer.printTableTop(false, true, "d100", "What do they despise?");
		printer.printTableRow("01-10", "The Dark Powers");
		printer.printTableRow("11-20", "Cults");
		printer.printTableRow("21-30", "Xenos");
		printer.printTableRow("31-40", "Mutants");
		printer.printTableRow("41-50", "Wytches");
		printer.printTableRow("51-60", "Traitors");
		printer.printTableRow("61-70", "Blasphemers");
		printer.printTableRow("71-77", "War");
		printer.printTableRow("78-85", "Being wrong");
		printer.printTableRow("86-92", "Losing a fight");
		printer.printTableRow("93-00", "A flaw in themselves");
		printer.printTableTail();
		
		printer.printTableTop(false, true, "d100", "What are they willing to sacrifice?");
		printer.printTableRow("01-20", "Others, but not themselves");
		printer.printTableRow("21-40", "Their flesh, but not their mind");
		printer.printTableRow("41-60", "Their life, but not their honour");
		printer.printTableRow("61-80", "Everything but their faith");
		printer.printTableRow("81-00", "Even their very soul");
		printer.printTableTail();

		printer.printTableTop(false, true, "d100", "How did they meet their inquisitor?");
		printer.printTableRow("01-05", "Chosen due to an Administratum error");
		printer.printTableRow("06-15", "Sold as chattle");
		printer.printTableRow("16-30", "Hired as a mercenary");
		printer.printTableRow("31-45", "Fought in a battle together");
		printer.printTableRow("46-60", "A chance meeting");
		printer.printTableRow("61-75", "Uncovered heresy and informed the inquisition");
		printer.printTableRow("76-85", "Accused the inquisitor of heresy");
		printer.printTableRow("86-95", "Selected by their employer for inquisitorial service");
		printer.printTableRow("96-00", "Sought out for recruitment");
		printer.printTableTail();

		printer.printTableTop(false, true, "d100", "What does the inquisition mean to them?");
		printer.printTableRow("01-12", "A duty to defend the Imperium");
		printer.printTableRow("13-24", "A chance to serve a worthy cause");
		printer.printTableRow("25-36", "A holy role ordained by the Emperor");
		printer.printTableRow("37-50", "A position of respect");
		printer.printTableRow("51-64", "Orders to be followed without question");
		printer.printTableRow("65-76", "Orders which must be followed or else");
		printer.printTableRow("77-88", "A chance to gain power");
		printer.printTableRow("89-00", "Nothing more than a job");
		printer.printTableTail();
		
		printer.printSubheader("Name");
		printer.printSubSubheader("Male Names");
		printer.printTableTop(true, true, "d100", "Primitive", "Low", "High", "Archaic", "Informal");
		printer.printTableRow("01–03", "Arl", "Barak", "Atellus", "Alaric", "Able");
		printer.printTableRow("04–06", "Bruul", "Cain", "Brutis", "Attilas", "Bones");
		printer.printTableRow("07–09", "Dar", "Dariel", "Callidon", "Barbosa", "Crisis");
		printer.printTableRow("10–13", "Frak", "Eli", "Castus", "Cortez", "Cutter");
		printer.printTableRow("14–16", "Fral", "Enoch", "Drustos", "Constantine", "Dekko");
		printer.printTableRow("17–20", "Garm", "Frastus", "Flavion", "Cromwell", "Dakka");
		printer.printTableRow("21–23", "Grish", "Gaius", "Gallus", "Dorn", "Frag");
		printer.printTableRow("24–27", "Grak", "Garvel", "Haxtes", "Drake", "Flair");
		printer.printTableRow("28–30", "Hak", "Hastus", "Intios", "Eisen", "Finial");
		printer.printTableRow("31–33", "Jarr", "Ignace", "Jastilus", "Ferrus", "Grim");
		printer.printTableRow("34–37", "Kar", "Ishmael", "Kaltos", "Grendel", "Gob");
		printer.printTableRow("38–40", "Kaarl", "Jericus", "Litilus", "Guilliman", "Gunner");
		printer.printTableRow("41–44", "Krell", "Klightus", "Lupus", "Havelock", "Hack");
		printer.printTableRow("45–47", "Lek", "Lazerus", "Mallear", "Iacton", "Jakes");
		printer.printTableRow("48–50", "Mar", "Mordeci", "Metalus", "Jaghatai", "Krak");
		printer.printTableRow("51–54", "Mir", "Mithras", "Nihilius", "Khan", "Lug");
		printer.printTableRow("55–57", "Narl", "Nicodemus", "Novus", "Leman", "Mongrel");
		printer.printTableRow("58–60", "Orl", "Pontius", "Octus", "Lionus", "Plex");
		printer.printTableRow("61–63", "Phrenz", "Quint", "Praetus", "Magnus", "Rat");
		printer.printTableRow("64–66", "Quarl", "Rabalias", "Quintos", "Mercutio", "Red");
		printer.printTableRow("67–69", "Roth", "Reestheus", "Raltus", "Nixios", "Sawney");
		printer.printTableRow("70–72", "Ragaa", "Silvanus", "Ravion", "Ramirez", "Scab");
		printer.printTableRow("73–75", "Stig", "Solomon", "Regis", "Serghar", "Scammer");
		printer.printTableRow("76–79", "Strang", "Thaddius", "Severus", "Sigismund", "Skive");
		printer.printTableRow("80–82", "Thak", "Titus", "Silon", "Tybalt", "Shanks");
		printer.printTableRow("83–85", "Ulth", "Uriah", "Tauron", "Vern", "Shiv");
		printer.printTableRow("86–89", "Varn", "Varnias", "Trantor", "Wolfe", "Sham");
		printer.printTableRow("90–93", "Wrax", "Xerxes", "Venris", "Wollsey", "Stern");
		printer.printTableRow("94–96", "Yarn", "Zaddion", "Victus", "Zane", "Stubber");
		printer.printTableRow("97–00", "Zek", "Zuriel", "Xanthis", "Zarkov", "Verbal");
		printer.printTableTail();
		
		printer.printSubSubheader("Female Names");
		printer.printTableTop(true, true, "d100", "Primitive", "Low", "High", "Archaic", "Informal");
		printer.printTableRow("01–03", "Arla", "Akadia", "Atella", "Aenid", "Alpha");
		printer.printTableRow("04–06", "Brulla", "Chaldia", "Brutilla", "Albia", "Blaze");
		printer.printTableRow("07–09", "Darl", "Cyrine", "Callidia", "Borgia", "Blue");
		printer.printTableRow("10–13", "Fraka", "Diona", "Castella", "Cimbria", "Cat");
		printer.printTableRow("14–16", "Fraal", "Deatrix", "Drustilla", "Devi", "Calamity");
		printer.printTableRow("17–20", "Garma", "Ethina", "Flavia", "Ephese", "Dame");
		printer.printTableRow("21–23", "Grisha", "Ephrael", "Gallia", "Euphrati", "Dice");
		printer.printTableRow("24–27", "Graki", "Fenria", "Haxta", "Inez", "Flair");
		printer.printTableRow("28–30", "Haka", "Gaia", "Intias", "Imperatrice", "Gold");
		printer.printTableRow("31–33", "Jarra", "Galatia", "Jestilla", "Jemadar", "Gunner");
		printer.printTableRow("34–37", "Karna", "Hazael", "Kalta", "Jezail", "Hack");
		printer.printTableRow("38–40", "Kaarli", "Isha", "Litila", "Joss", "Halo");
		printer.printTableRow("41–44", "Krella", "Ishta", "Lupa", "Kadis", "Lady");
		printer.printTableRow("45–47", "Lekka", "Jedia", "Mallia", "Kali", "Luck");
		printer.printTableRow("48–50", "Marlla", "Judicca", "Meta", "Lethe", "Modesty");
		printer.printTableRow("51–54", "Mira", "Lyra", "Nihila", "Mae", "Moll");
		printer.printTableRow("55–57", "Narla", "Magdela", "Novia", "Millicent", "Pistol");
		printer.printTableRow("58–60", "Orla", "Narcia", "Octia", "Merica", "Plex");
		printer.printTableRow("61–63", "Phrix", "Ophilia", "Praetia", "Midkiff", "Pris");
		printer.printTableRow("64–66", "Quali", "Phebia", "Quintilla", "Megehra", "Rat");
		printer.printTableRow("67–69", "Rotha", "Qualia", "Raltia", "Odessa", "Red");
		printer.printTableRow("70–72", "Ragaana", "Rhia", "Ravia", "Orlean", "Ruby");
		printer.printTableRow("73–75", "Stigga", "Salomis", "Regia", "Plath", "Scarlet");
		printer.printTableRow("76–79", "Stranga", "Solaria", "Scythia", "Severine", "Spike");
		printer.printTableRow("80–82", "Thakka", "Thyratia", "Sila", "Thiopia", "Steel");
		printer.printTableRow("83–85", "Ultha", "Thebe", "Taura", "Thrace", "Starr");
		printer.printTableRow("86–89", "Varna", "Uriel", "Trantia", "Tzarine", "Trauma");
		printer.printTableRow("90–93", "Wraxa", "Veyda", "Venria", "Venus", "Trick");
		printer.printTableRow("94–96", "Yarni", "Xantippe", "Xanthia", "Walperga", "Trix");
		printer.printTableRow("90–00", "Zekka", "Ziapatra", "Zethina", "Zetkin", "Zee");
		printer.printTableTail();

		//printer.printSubheader("Divinations");
		//printDivinationsTable(1, printer);
		
		printer.printFileTail();
	}
	
	private static void printBackgroundPath(Background.Path path, DHOPrinter printer) {
		printer.printSubSubheader(path.name);
		if(path.characteristicList.length > 0) {
			printer.println("<b>Characteristic Advances</b>");
			printer.printList(false, path.characteristicList);
		}
		if(path.talentList.length > 0) {
			printer.println("<b>Talents</b>");
			printer.printList(false, path.talentList);
		}
		if(path.bionicList.length > 0) {
			printer.println("<b>Bionics</b>");
			printer.printList(false, path.bionicList);
		}
		if(path.skillList.length > 0) {
			printer.println("<b>Skills</b>");
			printer.printList(false, path.skillList);
		}
		if(path.itemList.length > 0) {
			printer.println("<b>Items</b>");
			printer.printList(false, path.itemList);
		}
		if(path.psychicPowerXP != null) {
			printer.println("<b>Psychic Powers</b>");
			printer.printParagraph(path.psychicPowerXP);
		}
	}
	
	private static void printSubcultureTable(HomeWorld homeworld, DHOPrinter printer) {
		printer.printTableTop(false, true);
		for(int i = 0; i < homeworld.subcultureTable.length; i ++)
			printer.printTableRow(homeworld.subcultureTable[i]);
		printer.printTableTail();
	}
	
	private static void printDivinationsTable(int numberOfColumns, DHOPrinter printer) {
		printer.printRowTop();
		int rowsPerColumn = divinationsList.length / numberOfColumns;
		for(int c = 0; c < numberOfColumns; c ++) {
			printer.printColTop(12/numberOfColumns);
			printer.printTableTop(false, true, "d100", "Divination");
			for(int i = c*rowsPerColumn; i < (c+1)*rowsPerColumn; i ++) {
				printer.printTableRow(divinationsList[i][0], divinationsList[i][1]);
			}
			printer.printTableTail();
			printer.printColTail();
		}
		printer.printRowTail();
	}
}
