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
				printer.printSubSubheader(path.name);
				printer.println("<b>Characteristic Increases</b>");
				printer.printList(false, path.characteristicsIncreaseList);
				printer.println("<b>Special Rules</b>");
				printer.printList(false, path.specialRuleList);
				printer.println("<b>Skills</b>");
				printer.printList(false, path.skillList);
				printer.println("<b>Items</b>");
				printer.printList(false, path.itemList);
				printer.printColTail();
			}
			printer.printRowTail();
			printer.printCollapsibleTail();
			printer.println();
			printer.println();
		}
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
		printer.printHeader("Spend Experience and Equip Gear");
		printer.printParagraph("Each character should have 8 different Aptitudes, including General. "
				+ "If you took the same Aptitude more than once, you can choose any Characteristic as an Aptitude to make up for this.");
		printer.println("<b>Equipment</b>");
		printer.printList(false, new String[] {
				"Take any Ubiquitous or Abundant items as you can want (and can carry).",
				"You can swap out items from your background for different ones of the same availability.",
				"You can also take any 1 Scarce item or 2 Average items.",
		});
		printer.println("<b>Experience</b>");
		printer.printList(false, new String[] {
				"You start with 10 XP.",
				"Buy any Advances you wish with this XP (see Character Advancement). Keep any XP you don't spend.",
		});
		printer.println();
		printer.println();
		printer.printHeader("Bringing the Character to Life");
		printer.printParagraph("xxxxxxxx");
		
		
		// TODO //
		
		
		printer.printFileTail();
	}
}