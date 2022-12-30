package files;

import main.*;

class ActionsInDowntimeFile implements PrintableFile {
	
	private static String[] actionsTableHeaders = {
			"Action", "Type", "Requirement", "Test", "Result"
	};
	private static String[][] actionsTable_movement = {
			{"Travel", "Long", "Basic", "-", "Travel for 1 hour"},
			{"Haul", "Long", "Basic", "Strength", "Travel while carrying a heavy object; on failure, become Fatigued after Travel; on critical failure, become Fatigued before Travel"},
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
			{"Rest", "Extended", "Basic", "Toughness", "Takes 10-TB hours; Overcome Bleeding Out completely; reduce Wounds"},
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
			{"Wrangle", "Short", "Skill", "Fellowship", "Get a bonus to Disposition"},
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
		printer.printParagraph(
				"Any reasonable number of Short or turn-time Actions can be done without spending an hour. "
				+ "A Short Action can be done as a Long action with a +20 bonus. "
				+ "A Long Action can be done as a Short Action with a -20 penalty (unless it involves travel). "
				+ "When a turn-time Action is taken, it can usually be assumed to have a +30 bonus from a Full Action Focus and doing the Action Carefully. "
				+ "Extended actions take multiple hours.");
		printer.printParagraph(
				"When characters work together, resolve the Action separately for each character and combine Degrees of Success. "
				+ "The number of characters able to work together on the same Action is capped at the Fellowship Bonus of the character taking the lead.");
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