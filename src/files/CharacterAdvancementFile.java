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
	
	private static String[][] characteristicAdvanceAptitudeTable = {
			{"Weapon Skill", "Weapon Skill", "Offence"},
			{"Ballistic Skill", "Ballistic Skill", "Finesse"},
			{"Strength", "Strength", "Offence"},
			{"Toughness", "Toughness", "Defence"},
			{"Agility", "Agility", "Finesse"},
			{"Intelligence", "Intelligence", "Knowledge"},
			{"Perception", "Perception", "Fieldcraft"},
			{"Willpower", "Willpower", "Psyker"},
			{"Fellowship", "Fellowship", "Social"},
	};
	
	private static String[][] skillAdvanceXPCostTable = {
			{"Aquire", "4 XP"},
			{"+10", "2 XP"},
			{"+20", "4 XP"},
			{"+30", "8 XP"},
	};
	
	private static String[] skillAdvanceTableHeaders = {
			"Skill", "Aptitude 1", "Aptitude 2", "Basic", "Use"
	};
	
	private static String[][] skillAdvanceTable_general = {
			{"Navigate", "Intelligence", "Fieldcraft", "Yes", "Long"},
			{"Notice", "Perception", "General", "Yes", "Passive"},
			{"Reflex", "Perception", "General", "Yes", "Reaction"},
			{"Run", "Agility", "General", "Yes", "Action"},
	};
	
	private static String[][] skillAdvanceTable_combat = {
			{"Dodge", "Agility", "Finesse", "Yes", "Reaction"},
			{"Grapple", "Strength", "Offense", "Yes", "Action"},
			{"Knock Down", "Strength", "Offense", "Yes", "Action"},
			{"Parry", "Weapon Skill", "Defence", "Yes", "Reaction"},
			{"Stun", "Weapon Skill", "Offense", "Yes", "Action"},
	};
	
	private static String[][] skillAdvanceTable_investigation = {
			{"Contemplate", "Intelligence", "Knowledge", "Yes", "Long"},
			{"Inquire", "Fellowship", "Social", "Yes", "Long"},
			{"Inspect", "Perception", "General", "Yes", "Short"},
			{"Interrogate", "Willpower", "Social", "Yes", "Long"},
			{"Reference Common Lore", "Intelligence", "General", "Yes", "Varies"},
			{"Reference Forbidden Lore*", "Intelligence", "Knowledge", "No", "Varies"},
			{"Reference Scholastic Lore*", "Intelligence", "Knowledge", "No", "Varies"},
			{"Search", "Perception", "General", "Yes", "Short"},
	};
	
	private static String[][] skillAdvanceTable_social = {
			{"Charm", "Fellowship", "Social", "Yes", "Short"},
			{"Command", "Fellowship", "Leadership", "Yes", "Action"},
			{"Deceive", "Fellowship", "Social", "Yes", "Passive"},
			{"Inspire", "Fellowship", "Leadership", "Yes", "Action"},
			{"Intimidate", "Strength", "Social", "Yes", "Action"},
			{"Persuade", "Fellowship", "Social", "Yes", "Short"},
			{"Read Person", "Perception", "Social", "Yes", "Passive"},
	};
	
	private static String[][] skillAdvanceTable_stealth = {
			{"Conceal", "Agility", "Fieldcraft", "Yes", "Action"},
			{"Disguise", "Intelligence", "Social", "Yes", "Short"},
			{"Hack**", "Intelligence", "Tech", "No", "Short"},
			{"Unlock", "Intelligence", "Fieldcraft", "No", "Short"},
			{"Sneak", "Agility", "Finesse", "Yes", "Varies"},
	};
	
	private static String[][] skillAdvanceTable_specialist = {
			{"Administer Drug", "Intelligence", "Fieldcraft", "Yes", "Action"},
			{"Craft*", "Intelligence", "Tech", "Yes", "Long"},
			{"Haggle", "Fellowship", "Social", "Yes", "Short"},
			{"Perform Surgery**", "Intelligence", "Knowledge", "No", "Long"},
			{"Repair*", "Intelligence", "Tech", "Yes", "Long"},
			{"Sense Immaterium", "Willpower", "Psyker", "No", "Passive"},
			{"Set Trap", "Intelligence", "Fieldcraft", "Yes", "Short"},
			{"Treat Wounds", "Intelligence", "Fieldcraft", "No", "Long"},
			{"Use Tech", "Intelligence", "Tech", "No", "Action"},
			{"Wrangle", "Fellowship", "Fieldcraft", "No", "Short"},
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
		for(int i = 0; i < characteristicAdvanceAptitudeTable.length; i ++) {
			printer.printTableRow(characteristicAdvanceAptitudeTable[i]);
		}
		printer.printTableTail();
		printer.println();
		printer.println();
		printer.printHeader("Skills");
		printer.printParagraph("If a Skill is labelled as basic, all characters are assumed to have the Skill at +0. This means the Skill does not need to be aquired with an Advance.");
		printer.printTableTop("Advance", "XP Cost", false, true);
		for(int i = 0; i < skillAdvanceXPCostTable.length; i ++) {
			printer.printTableRow(skillAdvanceXPCostTable[i]);
		}
		printer.printTableTail();
		printer.printTableTop(skillAdvanceTableHeaders, false, true);
		printer.printTableRow_subheader("General Skills");
		for(int i = 0; i < skillAdvanceTable_general.length; i ++) {
			printer.printTableRow(skillAdvanceTable_general[i]);
		}
		printer.printTableRow_subheader("Combat Skills");
		for(int i = 0; i < skillAdvanceTable_combat.length; i ++) {
			printer.printTableRow(skillAdvanceTable_combat[i]);
		}
		printer.printTableRow_subheader("Investigation Skills");
		for(int i = 0; i < skillAdvanceTable_investigation.length; i ++) {
			printer.printTableRow(skillAdvanceTable_investigation[i]);
		}
		printer.printTableRow_subheader("Social Skills");
		for(int i = 0; i < skillAdvanceTable_social.length; i ++) {
			printer.printTableRow(skillAdvanceTable_social[i]);
		}
		printer.printTableRow_subheader("Stealth Skills");
		for(int i = 0; i < skillAdvanceTable_stealth.length; i ++) {
			printer.printTableRow(skillAdvanceTable_stealth[i]);
		}
		printer.printTableRow_subheader("Specialist Skills");
		for(int i = 0; i < skillAdvanceTable_specialist.length; i ++) {
			printer.printTableRow(skillAdvanceTable_specialist[i]);
		}
		printer.printTableTail();
		printer.printParagraph("*Requires a Talent for each area of use.");
		printer.printParagraph("**Hack requires Use Tech; Perform Surgery requires Treat Wounds.");
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}