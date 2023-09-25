package files;

import main.*;

class ActionsInDowntimeFile implements PrintableFile {
	
	private static String[] actionsTableHeaders = {
			"Action", "Type", "Requirement", "Test", "Result"
	};
	private static String[][] actionsTable_movement = {
			{"Travel", "Long", "Basic", "-", "Travel for 1 hour"},
			{"Haul", "Long", "Basic", "Strength", "Travel while carrying a heavy object; on failure, Travel and become Fatigued; on critical failure, become Fatigued and don't Travel"},
			{"Navigate", "Long", "Basic Skill", "Intelligence", "Overcome a Navigation Challenge, then Travel"},
			{"Navigate (Avoid Hazard)", "Long", "Basic Skill", "Intelligence", "Oppose a Navigation Hazard during Travel"},
			{"Sneak (Follow Carefully)", "Long", "Basic Skill", "Agility", "Follow a target unseen for 1 hour; lose target on failure; spotted on critical failure"},
			{"Sneak (Follow Closely)", "Long", "Basic Skill", "Agility", "Follow a target unseen for 1 hour; spotted on failure; lose target on critical failure"},
	};
	private static String[][] actionsTable_basic = {
			{"Charm", "Short", "Basic Skill", "Fellowship", "Target becomes Charmed"},
			{"Contemplate", "Long", "Basic Skill", "Intelligence", "Obtain Leads"},
			{"Craft", "Long", "Basic Skill", "Intelligence", "Get progress towards crafting"},
			{"Disguise", "Short", "Basic Skill", "Intelligence", "Become Disguised"},
			{"Haggle", "Short", "Basic Skill", "Fellowship", "Get a discount on a purchase; 10% + 10% per DoS"},
			{"Inspect", "Short", "Basic Skill", "Perception", "Get Clues"},
			{"Inquire", "Long", "Basic Skill", "Fellowship", "Get Clues; gain Attention on critical failure"},
			{"Interrogate", "Long", "Basic Skill", "Willpower", "Get Clues; subject is killed on critical failure"},
			{"Persuade", "Short", "Basic Skill", "Fellowship", "Get a bonus to Disposition"},
			{"Read Person (Gain Insight)", "Short", "Basic Skill", "Perception", "Get Info"},
			{"Reference Lore (Research)", "Long", "Basic Skill", "Intelligence", "Get Clues/Info"},
			{"Rest", "Long", "Basic", "Toughness", "Recover a Wound"},
			{"Search", "Short", "Basic Skill", "Perception", "Get Clues/items"},
			{"Set Trap", "Short", "Basic Skill", "Intelligence", "Create an environmental aspect"},
	};
	private static String[][] actionsTable_advanced = {
			{"Hack", "Short", "Skill", "Intelligence", "Overcome target being Encrypted"},
			{"Perform Surgery", "Long", "Skill", "Intelligence", "Reduce Characteristic Damage of Target by 1 plus 1 per DoS; always inflicts 1d10 Wounds; critical failure inflicts 1d10 Rending Critical Damage"},
			{"Perform Surgery (Attach Bionic)", "Long", "Skill", "Intelligence", "Attach a bionic to the Target; always inflicts 1d10 Wounds; on critical failure, also inflict 1d10 Rending Critical Damage"},
			{"Repair", "Long", "Skill", "Intelligence", "Overcome target being Damaged; consumes 1 Component per level downgraded; on critical failure, target becomes Damaged"},
			{"Treat Wounds", "Long", "Skill", "Intelligence", "Target becomes Treated"},
			{"Unlock", "Short", "Skill", "Intelligence", "Overcome target being Locked"},
			{"Use Tech (Maintain)", "Long", "Skill", "Intelligence", "Target item becomes Maintained; on critical failure, target becomes Damaged"},
			{"Wrangle (Charm)", "Short", "Skill", "Fellowship", "Target becomes Charmed"},
			{"Wrangle (Intimidate)", "Short", "Skill", "Strength", "Target becomes Intimidated"},
	};
	
	@Override
	public String filename() {
		return "ActionsInDowntime.html";
	}
	
	@Override
	public String title() {
		return "Actions in Downtime";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printParagraph("Outside of Combat-Time, time is divided into hour-long segments; each Action a character takes is either a Short Action or a Long Action.");
		printer.printParagraph(
				"A Short Action takes an insignificant portion of the hour. "
				+ "A Short Action can be done as a Long action with a +20 bonus. "
				+ "Any Combat-Time Action can be taken as a Short Action - "
				+ "when doing so, it usually makes sense to have a +30 bonus from doing the Action Carefully after a Full Action Focus.");
		printer.printParagraph(
				"A Long Action takes the hour. "
				+ "A Long Action can be done as a Short Action with a -20 penalty, if it makes sense that it would be possible "
				+ "(Travel, for example, would not).");
		printer.printSubSubheader("Teamwork");
		printer.printParagraph(
				"When characters work together, resolve the Action separately for each character and combine Degrees of Success. "
				+ "The number of characters able to work together on the same Action is capped at the Fellowship Bonus of the character taking the lead. "
				+ "If the results are a mixure of Success, Failure and/or Critical Failure, "
				+ "then apply the effect of any Failures and/or Critical Failures unless doing so would negate the Success.");
		printer.printHeader("Actions Summary");
		printer.printTableTop(true, true, actionsTableHeaders);
		printer.printTableRow_subheader("Movement Actions");
		for(int i = 0; i < actionsTable_movement.length; i ++) {
			printer.printTableRow(actionsTable_movement[i]);
		}
		printer.printTableRow_subheader("Basic Actions");
		for(int i = 0; i < actionsTable_basic.length; i ++) {
			printer.printTableRow(actionsTable_basic[i]);
		}
		printer.printTableRow_subheader("Advanced Actions");
		for(int i = 0; i < actionsTable_advanced.length; i ++) {
			printer.printTableRow(actionsTable_advanced[i]);
		}
		printer.printTableTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}