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
		printer.printTableTop("d100", "Home World", "Bonus", "Penalty", false, true);
		for(int i = 0; i < HomeWorld.list.length; i ++) {
			printer.printTableRow(
					HomeWorld.rollList[i],
					HomeWorld.list[i].name,
					HomeWorld.list[i].getCharacteristicBonus(),
					HomeWorld.list[i].getCharacteristicPenalty());
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
		printer.printTableTop(getBackgroundTableHeaderList(), true, true);
		for(int i = 0; i < Background.list.length; i ++) {
			printer.printTableRow(getBackgroundTableRow(i));
		}
		printer.printTableTail();
		printer.println();
		printer.println();
		printer.printSubheader("Determine Role");
		printer.printTableTop(getRoleTableHeaderList(), true, true);
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
			printer.printTableTop("", true, false);
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
		printer.printParagraph("xxxxxxxx");
		
		// ...
		
		printer.println("<b>Age</b>");
		printer.printParagraph("xxxxxxxx");
		
		printer.println("<b>Appearance - Build</b>");
		printer.printParagraph("[Feral World: Rangy / Lean / Muscular / Squat / Strapping]");
		printer.printParagraph("[Hive World: Runt / Scrawny / Wiry / Lanky / Brawny]");
		printer.printParagraph("[Imperial World: Slender / Svelte / Fit / Well-Built / Stocky]");
		printer.printParagraph("[Void Born: Skeletal / Stunted / Gaunt / Gangling / Spindly]");
		
		printer.println("<b>Appearance - Colouration</b>");
		printer.printParagraph("xxxxxxxx");
		
		printer.println("<b>Appearance - Quirls</b>");
		printer.printParagraph("xxxxxxxx");
		
		printer.println("<b>Subculture</b>");
		printer.printParagraph("[Feral World superstitions / Hive subcultures / Void Born ship traditions / etc.]");
		
		printer.println("<b>Divination</b>");
		printer.printParagraph("[this should just be a prompt for backstory/roleplaying with no effect on stats]");
		printer.printParagraph("[combine the 1e and 2e tables]");

		printer.printSubheader_collapsible("Divinations");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printColTop(6);
		printer.printTableTop("d100", "Divination", false, true);
		printer.printTableRow("xx-xx", "Mutation without; corruption within.");
		printer.printTableRow("xx-xx", "Only the insane have strength enough to prosper.");
		printer.printTableRow("xx-xx", "Innocence is an illusion.");
		printer.printTableRow("xx-xx", "Dark dreams lie upon the heart.");
		printer.printTableRow("xx-xx", "The pain of the bullet is ecstasy compared to damnation.");
		printer.printTableRow("xx-xx", "The soul wavers in the Void.");
		printer.printTableRow("xx-xx", "Darkness stalks us all.");
		printer.printTableRow("xx-xx", "The alien speaks naught but lies.");
		printer.printTableRow("xx-xx", "Fight the enemy without.");
		printer.printTableRow("xx-xx", "Find the enemy within.");
		printer.printTableRow("xx-xx", "Fear the enemy beyond.");
		printer.printTableRow("xx-xx", "Even one who has nothing can still offer his life.");
		printer.printTableRow("xx-xx", "Truth is subjective.");
		printer.printTableRow("xx-xx", "What is worth doing is worth dying for.");
		printer.printTableRow("xx-xx", "A wandering mind will find itself in dark places.");
		printer.printTableRow("xx-xx", "Stray not from the light of the Emperor.");
		printer.printTableRow("xx-xx", "There are no civillians in the battle for survival.");
		printer.printTableRow("xx-xx", "Violence solves everything.");
		printer.printTableRow("xx-xx", "Die with your spirit unbroken.");
		printer.printTableRow("xx-xx", "To war is human.");
		printer.printTableRow("xx-xx", "A boon to your allies is a bane to your enemies.");
		printer.printTableRow("xx-xx", "Ignorance is a blessing.");
		printer.printTableRow("xx-xx", "Humans must die so that humanity can endure.");
		printer.printTableRow("xx-xx", "In the darkness, follow the light of Terra.");
		printer.printTableRow("xx-xx", "Suffering is naught but an instructor.");
		printer.printTableRow("xx-xx", "There is nothing to fear but failure.");
		printer.printTableTail();
		printer.printColTail();
		printer.printColTop(6);
		printer.printTableTop("d100", "Divination", false, true);
		printer.printTableRow("xx-xx", "Thought begets Heresy.");
		printer.printTableRow("xx-xx", "Heresy begets Retribution.");
		printer.printTableRow("xx-xx", "Do not ask why you serve, only how.");
		printer.printTableRow("xx-xx", "The wise learn from the deaths of others.");
		printer.printTableRow("xx-xx", "A suspicious mind is a healthy mind.");
		printer.printTableRow("xx-xx", "There is no substitute for zeal.");
		printer.printTableRow("xx-xx", "To admit defeat is to be defeated.");
		printer.printTableRow("xx-xx", "Both strength and weakness come from within.");
		printer.printTableRow("xx-xx", "Victory is its own reward.");
		printer.printTableRow("xx-xx", "Be watchful; be wary.");
		printer.printTableRow("xx-xx", "Trust in your fear.");
		printer.printTableRow("xx-xx", "Destruction brings salvation.");
		printer.printTableRow("xx-xx", "It is better to die for the Emperor than live for yourself.");
		printer.printTableRow("xx-xx", "Never forgive; never forget.");
		printer.printTableRow("xx-xx", "Doubt not your strength.");
		printer.printTableRow("xx-xx", "Faith is a shield.");
		printer.printTableRow("xx-xx", "Serve only the Emperor's will.");
		printer.printTableRow("xx-xx", "Better crippled in body than corrupt in mind.");
		printer.printTableRow("xx-xx", "Trust in the Emperor.");
		printer.printTableRow("xx-xx", "Obey without question; command without doubt.");
		printer.printTableRow("xx-xx", "Success is measured in blood.");
		printer.printTableRow("xx-xx", "The truth is terrible to bear.");
		printer.printTableRow("xx-xx", "Hatred is the Emperor’s greatest gift.");
		printer.printTableRow("xx-xx", "Only in death does duty end.");
		printer.printTableRow("xx-xx", "Everything you have been told is a lie.");
		printer.printTableTail();
		printer.printColTail();
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		
		printer.println("<b>Nature</b>");
		printer.printParagraph("[personality / desire / hate]");
		
		printer.println("<b>Name</b>");
		printer.printParagraph("xxxxxxxx");
		
		
		// TODO //
		
		
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
}