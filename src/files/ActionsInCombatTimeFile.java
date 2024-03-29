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

			{"Attack Heavily (Melee)", "Full Action", "Basic", "Weapon Skill", "Attack (Melee); +1 damage per DoS"},
			{"Attack Repeatedly (Melee)", "Full Action", "Basic", "Weapon Skill", "Attack (Melee); extra hit per DoS"},
			{"Attack Repeatedly (Ranged)", "Full Action", "Basic", "Ballistic Skill", "Attack (Ranged); extra hit per DoS"},
			{"Attack Precisely (Ranged)", "Full Action", "Basic", "Ballistic Skill", "Attack (Ranged); -10 penalty to target's Cover per DoS"},
			{"Charge (Attack)", "Full Action", "Basic", "Weapon Skill", "Move 3 times then Attack (Melee); +1 damage per 5m moved"},

			{"Reload", "Secondary Action", "Basic", "-", "Get 1 step towards reloading a firearm"},

			{"Dodge", "Reaction", "Basic Skill", "Agility", "Avoid ranged or melee hits"},
			{"Duck", "Reaction", "Basic", "Cover", "Use Cover with a +10 bonus, then get Full Cover"},
			{"Parry", "Reaction", "Basic Skill", "Weapon Skill", "Avoid melee hits"},

			{"Resist (Mentally)", "Passive", "Basic", "Willpower", "Oppose becoming or overcome being Frenzied, Frightened, Pinned, etc."},
			{"Resist (Physically)", "Passive", "Basic", "Toughness", "Oppose becoming or overcome being Poisoned, Stunned, etc."},
			{"Use Cover", "Passive", "Basic", "Cover", "Avoid ranged hits"},
	};
	private static String[][] actionsTable_fight_other = {
			{"Grapple", "Main Action", "Basic Skill", "Strength", "Target becomes Grappled"},
			{"Grapple (Break)", "Main Action", "Basic Skill", "Strength", "Overcome Grappled"},
			{"Knock Down", "Main Action", "Basic Skill", "Strength", "Target becomes Prone"},
			{"Stun", "Main Action", "Basic Skill", "Weapon Skill", "Target becomes Stunned [may remove]"},

			{"Charge (Knock Down)", "Full Action", "Basic Skill", "Strength", "Move 3 times then Knock Down; +10 bonus per 5m moved"},
			{"Manoeuvre", "Full Action", "Basic", "Weapon Skill", "Attack (Melee) then Move self and Target"},

			{"Steady", "Reaction", "Basic", "Strength", "Oppose becoming Prone"},
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
			{"Treat Wounds (First Aid)", "Main Action", "Skill", "Intelligence", "Overcome the Target being Bleeding Out"},
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
				"In Combat Time, the characters in the scene each take turns one after the other. "
				+ "The first character to take their turn in a scene is whoever the GM determines acts first (this may call for Notice or Reflex Tests). "
				+ "The PCs' turns all happen consecutively in whatever order the players see fit. "
				+ "Similarly, the NPCs' turns all happen consecutively as determined by the GM. "
				+ "Once all characters have taken a turn, keep going in the same order until there is no need for Combat Time anymore.");
		printer.printParagraph(
				"On their turn, a character can take 1 Main Action and 1 Secondary Action (in any order). "
				+ "Alternatively, the character can take 1 Full Action (which is equivalent to a combined Main Action and Secondary Action), or 2 Secondary Actions. "
				+ "Additionally, between the start of their turn and the start of their next turn, a character can take 1 Reaction and take Passive Actions any number of times.");
		printer.printList(false,
				"A Main Action involves a Test to either (a) hit a target with an Attack, (b) Create an Advantage, or (c) Overcome something. ", 
				"A Secondary Action is a supplementary action which gives a one-time ±10 modifier to something or some other simple action which doesn't require a Test. ",
				"A Full Action is an improved Main Action - either with a +10 bonus to the Test, or with Degrees of Success giving some extra effect. ",
				"A Reaction is done to oppose to another character's Action. ",
				"A Passive Action is any action which doesn't require the character to do anything. ");
		printer.printParagraph(
				"A character can take the same Secondary Action twice on their turn, "
				+ "which can be counted as a single Full Action giving a one-time modifier of ±20 instead of ±10, if applicable.");

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
		printer.printParagraph("If a character's movement puts them adjacent to another character at any point"
				+ " - including the point where they started from, but not the point where they end their turn - "
				+ "the other character can choose to take their next turn immediately.");
		
		printer.printSubheader("Slow Movement");
		printer.printParagraph("If your Agility Bonus is 0, then you can still Move 1m, but you cannot Run. "
				+ "If your Agility is 0, then you are unable to move.");
		
		printer.printSubheader("Interacting with items, objects and the inventory");
		printer.printParagraph("A character can make a number of Interactions up to their Agility Bonus each turn. "
				+ "A character can take a Secondary Action to make a further AB Interactions. "
				+ "Interactions with objects are things like opening/closing doors, etc. "
				+ "A more complex interaction with an item/object may take a whole Secondary Action or Full Action. "
				+ "Inventory Interactions are things like picking up, placing, putting away and taking out items of a usable size. "
				+ "Larger objects would take a whole Secondary Action to equip/unequip.");
	
		
		printer.printHeader("Actions Summary");
		printer.printTableTop(true, true, actionsTableHeaders);
		printTableSection(printer, "General Actions", actionsTable_general);
		printTableSection(printer, "Movement Actions", actionsTable_movement);
		printTableSection(printer, "Common Fight Actions", actionsTable_fight);
		printTableSection(printer, "Other Fight Actions", actionsTable_fight_other);
		printTableSection(printer, "Stealth Actions", actionsTable_stealth);
		printTableSection(printer, "Other Actions", actionsTable_other);
		printer.printTableTail();
		
		
		printer.printFileTail();
	}
	
	private static void printTableSection(DHOPrinter printer, String subheader, String[][] entries) {
		printer.printTableRow_subheader(subheader);
		for(int i = 0; i < entries.length; i ++) {
			printer.printTableRow(entries[i]);
		}
	}
}