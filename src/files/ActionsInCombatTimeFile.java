package files;

import main.*;

class ActionsInCombatTimeFile implements PrintableFile {
	
	private static String[] actionsTableHeaders = {
			"Action", "Type", "Requirement", "Test", "Result"
	};
	private static String[][] actionsTable_general = {
			{"[Action] Carefully", "Full Action", "Basic", "*", "Main Action with a +10 bonus"},

			{"Distract", "Secondary Action", "Basic", "-", "Give a -10 penalty to an Action or Reaction"},
			{"Focus", "Secondary Action", "Basic", "-", "Get a +10 bonus to an Action or Reaction"},

			{"Brace", "Reaction", "Basic", "-", "Get a +10 bonus to a passive Reaction"},
			{"Reflex", "Reaction", "Basic Skill", "Perception", "Act before another character when waiting"},

			{"Wait to [Action]", "*", "Basic", "*", "Take the chosen Action later in the round"},
	};
	private static String[][] actionsTable_movement = {
			{"Run", "Main Action", "Basic Skill", "Agility", "Become Running , then Move 2 times"},

			{"Drag Heavy Object", "Full Action", "Basic", "Strength", "Move target 1m; +1m per DoS"},
			{"Move And [Action]", "Full Action", "Basic", "*", "Move and [Main/Secondary Action] during the movement."},
			{"Run (Full)", "Full Action", "Basic Skill", "Agility", "Become Running , then Move 3 times"},

			{"Move", "Secondary Action", "Basic", "-", "Move up to Movement (AB)"},
	};
	private static String[][] actionsTable_fight = {
			{"Attack (Melee)", "Main Action", "Basic", "Weapon Skill", "Target takes a hit"},
			{"Attack (Ranged)", "Main Action", "Basic", "Ballistic Skill", "Target takes a hit"},
			{"Grapple", "Main Action", "Basic Skill", "Strength", "Target becomes Grappled"},
			{"Grapple (Break)", "Main Action", "Basic Skill", "Strength", "Overcome Grappled"},
			{"Knock Down", "Main Action", "Basic Skill", "Strength", "Target becomes Prone"},
			{"Stun", "Main Action", "Basic Skill", "Weapon Skill", "Target becomes Stunned [may remove]"},

			{"Attack Heavily (Melee)", "Full Action", "Basic", "Weapon Skill", "Attack (Melee); +1 damage per DoS"},
			{"Attack Repeatedly (Melee)", "Full Action", "Basic", "Weapon Skill", "Attack (Melee); extra hit per DoS"},
			{"Attack Repeatedly (Ranged)", "Full Action", "Basic", "Ballistic Skill", "Attack (Ranged); extra hit per DoS"},
			{"Attack Precisely (Ranged)", "Full Action", "Basic", "Ballistic Skill", "Attack (Ranged); -10 penalty to target's Cover per DoS"},
			{"Charge (Attack)", "Full Action", "Basic", "Weapon Skill", "Move 3 times then Attack (Melee); +1 damage per level of Running"},
			{"Charge (Knock Down)", "Full Action", "Basic Skill", "Strength", "Move 3 times then Knock Down; +10 bonus per level of Running"},
			{"Manoeuvre", "Full Action", "Basic", "Weapon Skill", "Attack (Melee); move target 1m + 1m per DoS"},

			{"Reload", "Secondary Action", "Basic", "-", "Get 1 step towards reloading a firearm"},

			{"Dodge", "Reaction", "Basic Skill", "Agility", "Avoid ranged or melee hits"},
			{"Duck", "Reaction", "Basic", "Cover", "Use Cover with a +10 bonus, then get Full Cover"},
			{"Parry", "Reaction", "Basic Skill", "Weapon Skill", "Avoid melee hits"},
			{"Steady", "Reaction", "Basic", "Strength", "Oppose becoming Prone"},

			{"Resist (Mentally)", "Passive", "Basic", "Willpower", "Oppose becoming or overcome being Frenzied, Frightened, Pinned, etc."},
			{"Resist (Physically)", "Passive", "Basic", "Toughness", "Oppose becoming or overcome being Poisoned, Stunned, etc."},
			{"Use Cover", "Passive", "Basic", "Cover", "Avoid ranged hits"},
	};
	private static String[][] actionsTable_stealth = {
			{"Conceal (Self)", "Main Action", "Basic Skill", "Agility", "Become Concealed"},
			{"Conceal (Object)", "Main Action", "Basic Skill", "Intelligence", "Target becomes Concealed"},
			{"Sneak", "Main Action", "Basic Skill", "Agility", "Avoid being noticed during your next Action [needs some thought]"},

			{"Deceive", "Passive", "Basic Skill", "Fellowship", "Come across as speaking truthfully"},
			{"Notice", "Passive", "Basic Skill", "Perception", "Get Clues or Detect something"},
			{"Read Person (Sense Deception)", "Passive", "Basic Skill", "Perception", "Tell whether someone is lying to you"},
	};
	private static String[][] actionsTable_other = {
			{"Administer Drug", "Main Action", "Basic Skill", "Intelligence", "Use a drug item (effect depends on the item)"},
			{"Command", "Main Action", "Basic Skill", "Fellowship", "Get a bonus to Disposition"},
			{"Inspire", "Main Action", "Basic Skill", "Fellowship", "Target becomes Inspired"},
			{"Intimidate", "Main Action", "Basic Skill", "Strength", "Target becomes Intimidated"},
			{"Reference Lore (Assist)", "Main Action", "Basic Skill", "Intelligence", "Create an Aspect which gives a bonus"},
			{"Treat Wounds (First Aid)", "Main Action", "Skill", "Intelligence", "Target becomes Treated (max 1 level)"},
			{"Use Tech", "Main Action", "Skill", "Intelligence", "Use a tech item (effect depends on the item)"},

			{"Reference Lore (Identify)", "Passive", "Basic Skill", "Intelligence", "Get Clues/Info"},
			{"Sense Immaterium", "Passive", "Skill", "Willpower", "Get Clues or Detect something"},

			{"Focus Power", "*", "Talent", "Willpower", "Use a Psychic Power"},
	};
	
	@Override
	public String filename() {
		return "ActionsInCombatTime.html";
	}
	
	@Override
	public String title() {
		return "Actions in Combat-Time";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printParagraph(
				"Each character can take 1 Main Action and 1 Secondary Action on their turn (in any order). "
				+ "Anything involving a Test will typically be a Main Action; anything simple enough to not need a test will typically be a Secondary Action. "
				+ "A character can take Full Action, which is equivalent to a combined Main Action and Secondary Action, instead of taking those actions separately.");
		printer.printParagraph("Additionally, between the start of their turn and the start of their next turn, each character can take 1 Reaction and take Passive Actions any number of times. "
				+ "Reactions cover things done in opposition to another character's Action. "
				+ "Passive Action covers anything which doesn't require the character to do anything (for example, resisting fear).");
		printer.printParagraph("In general, a Main Action is a Test to either hit a target with an attack, create an advantage, or overcome an Aspect. "
				+ "You can take any Secondary Action instead of a Main Action.");
		printer.printParagraph("A Secondary Action is either a simple action which doesn't require a Test, or a supplementary action which gives a temporary ±10 modifier to something.");
		printer.printParagraph("A Full Action is an improved Main Action - either with a +10 bonus to the Test, or with Degrees of Success giving some extra effect. "
				+ "Alternatively, any Secondary Action can be taken as a Full Action - this applies the effect twice, but counts as a single Action.");
		printer.printParagraph("Reactions and Passive Actions are a Test to oppose another character's Action or to overcome an Aspect on the character. "
				+ "Alternatively, a Reaction can be a +10 bonus to something.");
		printer.printSubheader("Stacking Bonuses");
		printer.printParagraph("The bonuses/penalties from the actions you take are temporary - they last until the next Action or Reaction you take. "
				+ "This doesn't apply to taking the same Secondary Action twice in one turn, as doing so counts as a single action giving a ±20 bonus/penalty until your next Action or Reaction. "
				+ "Bonuses you get from Advantages last until the Advantage is overcome. "
				+ "All bonuses and penalties stack.");
		printer.printSubheader("Waiting");
		printer.printParagraph("You can choose to Wait until some point between the end of your turn and the start of your next turn to take your Action. "
				+ "Declare the action you will take during your turn; choose the moment to take that action as it happens. "
				+ "Use Reflexes to resolve your action before another character's if both characters are trying to act at the same time. "
				+ "For example, you may choose to shoot at an enemy when they pop out of cover on their turn. "
				+ "This would be waiting with a Ranged Attack action and you would make a Test to see if your shot is resolved before their action.");
		printer.printSubheader("Moving Past Opponents");
		printer.printParagraph("If your movement puts you adjacent to another character at any point (besides the spot where you started), they can choose to take their next turn immediately (before you continue your movement), unless you end your movement at that point. "
				+ "This applies to the entire movement on your turn, not just a single Move Secondary Action.");
		printer.printSubheader("Slow Movement");
		printer.printParagraph("If your Agility Bonus is 0, then you can still Move 1m, but you cannot Run. "
				+ "If your Agility is 0, then you are unable to move.");
		printer.printSubheader("Teamwork");
		printer.printParagraph("The first way to work together is to take an action which confirs a bonus to the other character, or a penalty to their intended target. "
				+ "The other way to work together is to simply perform the same Action with the same Target. "
				+ "If doing the latter, the characters working together can act simultaneously by Waiting, in which case Degress of Success can be combined.");
		printer.printSubheader("Interacting with items, objects and the inventory");
		printer.printParagraph("A character can make a number of Interactions up to their Agility Bonus each turn. "
				+ "A character can take a Secondary Action to make a further AB Interactions. "
				+ "Interactions with objects are things like opening/closing doors, etc. "
				+ "A more complex interaction with an item/object may take a whole Secondary Action or Full Action. "
				+ "Inventory Interactions are things like picking up, placing, putting away and taking out items of a usable size. "
				+ "Larger objects would take a whole Secondary Action to equip/unequip.");
	
		printer.printHeader("Actions Summary");
		printer.printTableTop(true, true, actionsTableHeaders);
		printer.printTableRow_subheader("General Actions");
		for(int i = 0; i < actionsTable_general.length; i ++) {
			printer.printTableRow(actionsTable_general[i]);
		}
		printer.printTableRow_subheader("Movement Actions");
		for(int i = 0; i < actionsTable_movement.length; i ++) {
			printer.printTableRow(actionsTable_movement[i]);
		}
		printer.printTableRow_subheader("Fight Actions");
		for(int i = 0; i < actionsTable_fight.length; i ++) {
			printer.printTableRow(actionsTable_fight[i]);
		}
		printer.printTableRow_subheader("Stealth Actions");
		for(int i = 0; i < actionsTable_stealth.length; i ++) {
			printer.printTableRow(actionsTable_stealth[i]);
		}
		printer.printTableRow_subheader("Other Actions");
		for(int i = 0; i < actionsTable_other.length; i ++) {
			printer.printTableRow(actionsTable_other[i]);
		}
		printer.printTableTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}