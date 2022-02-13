package files;

import main.*;

class CharacterAdvancementFile implements PrintableFile {
	
	private static String[][] characteristicAdvanceXPCostTable = {
			{"1st (+5)", "2 XP"},
			{"2nd (+10)", "4 XP"},
			{"3rd (+15)", "8 XP"},
			{"4th (+20)", "16 XP"},
			{"5th (+25)", "32 XP"},
	};
	
	private static String[][] skillAdvanceXPCostTable = {
			{"+0", "4 XP"},
			{"+10", "2 XP"},
			{"+20", "4 XP"},
			{"+30", "8 XP"},
	};
	
	private static String[] skillAdvanceTableHeaders = {
			"Skill", "Aptitude 1", "Aptitude 2", "Basic", "Use"
	};
	
	@Override
	public String filename() {
		return "CharacterAdvancement.html";
	}
	
	@Override
	public String title() {
		return "Character Advancement";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printParagraph("Each different Advance has an XP cost and two associated Aptitudes. When you take an Advance, the amount of XP you spend depends on how many matching Aptitudes you have:");
		printer.printList(false, new String[] {
				"Both Aptitues: you spend half the written XP cost.",
				"One Aptitue: you spend the written XP cost.",
				"Neither Aptitue: you spend double the written XP cost.",
		});
		printer.printParagraph("There are three different kinds of Advance:");
		printer.printList(false, new String[] {
				"<b>Characteristic Advances</b> increase a Characteristic by 5. You can take this up to 5 times for each Characteristic, with the XP cost going up each time. The XP costs and associated Aptitudes are shown in the tables below.",
				"<b>Skill Advances</b> increase the bonus for a Skill by 10, or aquire a non-basic skill at a +0 bonus. You can take this up to a +30 bonus for each skill. Skills, their XP costs and associated Aptitudes are shown in the tables below.",
				"<b>Talent Advances</b> give your character the benefit of a Talent. Talents, their XP costs and associated Aptitudes are listed in the Talents section.",
		});
		printer.println();
		printer.println();
		printer.printHeader("Advancement After Character Creation");
		printer.printParagraph("During play, taking Advances should be justified by the character's actions in one of the following ways.");
		printer.printList(false, new String[] {
				"<b>Experience:</b> After the character uses a Characteristic or Skill, they can take an Advance for that Characteristic or Skill.",
				"<b>Inspiration:</b> Before taking an action, you can spend a Fate Point to allow the character to take a Talent Advance and then use that Talent.",
				"<b>Training:</b> The character can spend time training or studying. If they have access to the appropriate resources, a successful Long Action Test using the appropriate Characteristic allows them to take any Advance.",
		});
		printer.println();
		printer.println();
		printer.printHeader("Characteristics");
		printer.printTableTop("Advance", "XP Cost", false, true);
		for(int i = 0; i < characteristicAdvanceXPCostTable.length; i ++) {
			printer.printTableRow(characteristicAdvanceXPCostTable[i]);
		}
		printer.printTableTail();
		printer.printTableTop("Characteristic", "Aptitude 1", "Aptitude 2", false, true);
		printCharacteristicTableRow(Characteristic.WS, printer);
		printCharacteristicTableRow(Characteristic.BS, printer);
		printCharacteristicTableRow(Characteristic.S, printer);
		printCharacteristicTableRow(Characteristic.T, printer);
		printCharacteristicTableRow(Characteristic.Ag, printer);
		printCharacteristicTableRow(Characteristic.Int, printer);
		printCharacteristicTableRow(Characteristic.Per, printer);
		printCharacteristicTableRow(Characteristic.WP, printer);
		printCharacteristicTableRow(Characteristic.Fel, printer);
		printer.printTableTail();
		printer.println();
		printer.println();
		printer.printHeader("Skills");
		printer.printParagraph("If a Skill is labelled as basic, all characters are assumed to have the Skill at +0, so the +0 advance does not need to be taken.");
		printer.printTableTop("Advance", "XP Cost", false, true);
		for(int i = 0; i < skillAdvanceXPCostTable.length; i ++) {
			printer.printTableRow(skillAdvanceXPCostTable[i]);
		}
		printer.printTableTail();
		printer.printTableTop(skillAdvanceTableHeaders, false, true);
		printer.printTableRow_subheader("General Skills");
		printSkillTableRow(Skill.navigate, printer);
		printSkillTableRow(Skill.notice, printer);
		printSkillTableRow(Skill.reflex, printer);
		printSkillTableRow(Skill.run, printer);
		printer.printTableRow_subheader("Combat Skills");
		printSkillTableRow(Skill.dodge, printer);
		printSkillTableRow(Skill.grapple, printer);
		printSkillTableRow(Skill.knockDown, printer);
		printSkillTableRow(Skill.parry, printer);
		printSkillTableRow(Skill.stun, printer);
		printer.printTableRow_subheader("Investigation Skills");
		printSkillTableRow(Skill.contemplate, printer);
		printSkillTableRow(Skill.inquire, printer);
		printSkillTableRow(Skill.inspect, printer);
		printSkillTableRow(Skill.interrogate, printer);
		printSkillTableRowWithFootnote(Skill.referenceLore, printer, "*");
		printSkillTableRow(Skill.search, printer);
		printer.printTableRow_subheader("Social Skills");
		printSkillTableRow(Skill.charm, printer);
		printSkillTableRow(Skill.command, printer);
		printSkillTableRow(Skill.deceive, printer);
		printSkillTableRow(Skill.inspire, printer);
		printSkillTableRow(Skill.intimidate, printer);
		printSkillTableRow(Skill.persuade, printer);
		printSkillTableRow(Skill.readPerson, printer);
		printer.printTableRow_subheader("Stealth Skills");
		printSkillTableRow(Skill.conceal, printer);
		printSkillTableRow(Skill.disguise, printer);
		printSkillTableRowWithFootnote(Skill.hack, printer, "**");
		printSkillTableRow(Skill.sneak, printer);
		printSkillTableRow(Skill.unlock, printer);
		printer.printTableRow_subheader("Specialist Skills");
		printSkillTableRow(Skill.administerDrug, printer);
		printSkillTableRowWithFootnote(Skill.craft, printer, "*");
		printSkillTableRow(Skill.haggle, printer);
		printSkillTableRowWithFootnote(Skill.performSurgery, printer, "**");
		printSkillTableRowWithFootnote(Skill.repair, printer, "*");
		printSkillTableRow(Skill.senseImmateruim, printer);
		printSkillTableRow(Skill.setTrap, printer);
		printSkillTableRow(Skill.treatWounds, printer);
		printSkillTableRow(Skill.useTech, printer);
		printSkillTableRow(Skill.wrangle, printer);
		printer.printTableTail();
		printer.printParagraph("*Requires a Talent for each area of use (except "+Skill.referenceLore.name+" with Common Lore areas).");
		printer.printParagraph("**Hack requires Use Tech; Perform Surgery requires Treat Wounds.");
		printer.println();
		printer.println();
		printer.printFileTail();
	}
	
	private static void printCharacteristicTableRow(Characteristic characteristic, DHOPrinter printer) {
		String[] columnEntries = {
				characteristic.fullName(),
				characteristic.aptitude1().fullName(),
				characteristic.aptitude2().fullName(),
		};
		printer.printTableRow(columnEntries);
	}
	
	private static void printSkillTableRow(Skill skill, DHOPrinter printer) {
		String[] columnEntries = {
				skill.name,
				skill.aptitude1.fullName(),
				skill.aptitude2.fullName(),
				skill.isBasic ? "Yes" : "No",
				skill.usage,
		};
		printer.printTableRow(columnEntries);
	}
	
	private static void printSkillTableRowWithFootnote(Skill skill, DHOPrinter printer, String footnoteMarker) {
		String[] columnEntries = {
				skill.name + footnoteMarker,
				skill.aptitude1.fullName(),
				skill.aptitude2.fullName(),
				skill.isBasic ? "Yes" : "No",
				skill.usage,
		};
		printer.printTableRow(columnEntries);
	}
}