package files;

import main.*;

class ActionsOverviewFile implements PrintableFile {
	
	@Override
	public String filename() {
		return "ActionsOverview.html";
	}
	
	@Override
	public String title() {
		return "Actions Overview";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printHeader("Tests");
		printer.printParagraph("A Characteristic Test (for some Characteristic) is done as follows:");
		printer.printList(true,
				"Roll a d100 and compare to the Characteristic (plus/minus modifiers).",
				"If the roll is <= Characteristic, the Test is a success.",
				"If the roll is > 90 + Characteristic Bonus, the Test is a critical failure.",
				"Otherwise the test is a failure.",
				"If the Test is a success, the Degrees of Success = tens digit of the roll."
		);
		
		
		printer.printHeader("Attack");
		printer.printParagraph("The procedure for resolving an Attack action is as follows:");
		printer.printList(true,
				"Determine how many hits there are.",
				"Determine how many hits are avoided by the defence."
		);
		printer.printParagraph("Then, for each hit not avoided:");
		printer.printList(true,
				"Determine damage.",
				"Apply that damage to the target."
		);
		
		printer.printSubheader("Determining Hits");
		printer.printParagraph("Ranged Attacks and Melee Attacks involve making a Weapon Skill or Ballistic Skill Test to see how many hits the target takes."
				+ "A successful test means the target takes a hit."
				+ "Some kinds of Attack actions can give multiple hits - these are capped by the Rate of Fire or Hits stats of the weapon used.");
		
		printer.printSubSubheader("Attacks Using Multiple Weapons");
		printer.printParagraph("If the attack was made using multiple weapons and/or against multiple targets, make one Test using the weapon/target which gives the lowest modifier. Assign hits to each weapon as you wish, not exceeding the Hits/RoF stat for each weapon.");
		printer.printParagraph("If a character makes an attack with a mixture of ranged and melee weapons (for example, using a sword and pistol in close combat), then use the lower of the attacking character's Ballistic Skill and Weapon Skill to determine hits.");
		
		printer.printSubSubheader("Targeting Specific Locations");
		printer.printParagraph("If a character wishes to target a specific location (e.g. a character's arm) simply treat that as the target - use the Size bonus/penalty for the size of the area being targeted.");
		
		printer.printSubSubheader("Firing Into Melee");
		printer.printParagraph("If you are firing at a target engaged in melee combat, each adjacent character makes a Cover Test with Cover Characteristic 50 plus a modifier for the Size difference between themselves and the target. Each character takes one hit plus one per Degree of Success - if the character is directly between you and the target, these hits come from the hits you scored in your Ballistic Skill Test; otherwise these hits come from your misses.");
		
		printer.printSubheader("Determining Hits Affected By Defence");
		printer.printParagraph("If the attack is opposed, the opposing character makes a Test to determine how many hits are affected by the defence. A success affects one hit plus one for each Degree of Success. For Reactions, such as Dodge or Parry, each affected hit is removed. For Passive Opposition, such as Cover, each affected hit has its damage reduced by some amount when it is applied to the target.");
		
		printer.printSubheader("Determining Damage");
		printer.printParagraph("Roll the damage stat for the weapon used. Damage dice are always d10 and these explode on a 10 (reroll and add the result until a 10 is not rolled).");
		
		printer.printSubheader("Applying Damage");
		printer.printParagraph("If the hit was affected by defence, then reduce the damage accordingly. Then reduce the damage by the target's Armour Points and Toughness Bonus. Any remaining damage deals Wounds to the target and may cause Critical Damage.");
		
		printer.printSubSubheader("Cover [needs changing]");
		printer.printParagraph("If a character is partially concealed behind an object, they are in Half Cover; if they are totally concealed, they are in Full Cover. Some objects will not be able to totally conceal a character (for example, railings or a thin pillar). Cover is relative to each given line of sight, so a character in cover from one direction may not be in cover from another direction.");
		printer.printParagraph("When a character is behind an object, ducking behind it to take Full Cover or popping out to take Half Cover are quick enough to not require spending an Action. A character can be in Full Cover at the start of their turn, pop out of cover to shoot, then duck back down to end their turn in Full Cover again - but if their action is interrupted (by another character doing Reflex), they will only count as having Half Cover.");
		printer.printParagraph("A Cover Test depends on whether the target is in Half Cover or Full Cover. Full Cover automatically affects all hits. For Half Cover, make a Test against a base Cover Characteristic of 50 (plus any modifiers) to determine the number of hits affected - one plus one per Degree of Success.");
		printer.printParagraph("A hit affected by cover has its damage reduced by the cover's Armour Points in addition to the target's Armour Points.");
		printer.printList(false,
				"4 AP - Light Wood, Armour-glass, Light Metal",
				"8 AP - Heavy Wood, Flakboard, Sandbags, Ice",
				"16 AP - Rockcrete, Thick Iron, Stone",
				"32 AP - Plasteel, Armaplas"
		);
		
		printer.printSubSubheader("Damaging Cover and Items");
		printer.printParagraph("Some weapons can damage cover. When a piece of cover is hit by such a weapon, the AP is reduced by the damage at the same time as the damage is reduced by the AP. Once the AP reaches 0, the cover is destroyed.");
		printer.printParagraph("When an item is hit by such a weapon, give it an AP value using the table. For each multiple of the AP value it takes in damage, the item becomes Damaged. Worn armour becomes Damaged if the damage exceeds the AP.");
		
		printer.printSubSubheader("Weapon Jams");
		printer.printParagraph("Whenever you fire a ranged weapon, if the number of shots fired that turn plus the roll is higher than 100, the weapon becomes Jammed.");
		
		printer.printSubSubheader("Powered Items");
		printer.printParagraph("When you use a powered weapon or tool and suffer a critical failure, the item becomes Out Of Power.");
		
		
		printer.printHeader("Create Advantage");
		printer.printParagraph("Create Advantage involves making a Test to place an Aspect on something. This may be opposed by another character (generally the target of the action). The Aspect confers a ±10 modifier to something and may prevent or allow certain actions. The Aspect lasts until it is Overcome.");
		printer.printParagraph("Duplicate Aspects attached to the same thing combine into a single upgraded Aspect. Each time an Aspect is upgraded, the modifier it confers increases by ±10.");
		printer.printParagraph("Each degree of Success on the Test upgrades the Aspect by another level. The maximum level an Aspect can reach in this way is the Characteristic Bonus of the Characteristic used in the Test.");
		
		printer.printSubSubheader("Assist");
		printer.printParagraph("Reference Lore to create an Aspect which gives a bonus to something, such as decrypting a message, operating an archeotech device, parrying attacks from a xeno beast.");
		printer.printList(false,
				"Success: Create the Aspect; each Degree of Success upgrades the Aspect.",
				"Failure: You don't create the Aspect."
		);
		printer.printParagraph("The item's Availibility or the character's Obscurity will give a modifier to the Test.");
		
		printer.printSubSubheader("Set Trap");
		printer.printParagraph("...");
		
		
		printer.printHeader("Overcome");
		printer.printParagraph("Overcome involves making a Test to overcome something (anything which isn't covered by other mechanics). Depending on what is being attempted, success on the Test may mean the obstacle is overcome, or it may mean some increment of progress towards the goal has been achieved. If it makes sense, each Degree of Success gives an additional increment of progress (decide what increments make the most sense for each situation).");
		printer.printParagraph("For overcoming Aspects, a success on the Test means the Aspect gets downgraded one step, plus one per Degree of Success, to a maximum of the Characteristic Bonus of the Characteristic used for the Test. Downgrading an unupgraded Aspect means it is completely overcome and is removed.");
		
		printer.printSubSubheader("Crafting");
		printer.printParagraph("Craft to get steps of progress towards creating an item.");
		printer.printList(false,
				"Success: Get 1 step of progress plus 1 per Degree of Success.",
				"Failure: No progress is made.",
				"Critical Failure: No progress is made and a component is wasted."
		);
		
		printer.printSubSubheader("Detect");
		printer.printParagraph("Notice or Sense Immaterium when there is a hidden character or item in order to detect it.");
		printer.printList(false,
				"Success: You detect the thing.",
				"Failure: You don't detect the thing."
		);
		
		printer.printSubSubheader("Get Clues and Get Leads");
		printer.printParagraph("Inspect, Inquire, Interrogate, Notice, Reference Lore, Search or Sense Immaterium to obtain Clues for an investigation; Contemplate to obtain Leads.");
		printer.printList(false,
				"Success: Reveal 1 Clue/Lead plus 1 per Degree of Success.",
				"Failure: No Clue/Lead is revealed.",
				"Critical Failure: No further Clues/Leads can be obtained."
		);
		printer.printParagraph("When relevant, an item's Availibility or a character's Obscurity can give a modifier to the Test.");
		
		printer.printSubSubheader("Get Info");
		printer.printParagraph("Read Person or Reference Lore to reveal points of information such as Characteristics, Traits, Talents or Personality.");
		printer.printList(false,
				"Success: Reveal 1 point of into plus 1 per Degree of Success.",
				"Failure: No info is revealed.",
				"Critical Failure: No further information can be obtained."
		);
		printer.printParagraph("The item's Availibility or the character's Obscurity will give a modifier to the Test.");
		printer.printParagraph("Point-by-point identification should only be done for unique items and characters, or those that are sufficiently unusual (e.g. archeotech, xenos or daemons). Less unusual items and character types can be revealed in whole with a successful Test, while reasonably common items and character types do not need to be identified.");
		
		printer.printSubSubheader("Movement");
		printer.printParagraph("Run (or other Agility Tests) to increase your movement speed.");
		printer.printList(false,
				"Success: Get 1 point of bonus movement plus 1 per Degree of Success.",
				"Failure: No bonus movement.",
				"Critical Failure: Normally no effect, but depends on the situation."
		);
		printer.printParagraph("Examples of situations where critical failure has an effect:");
		printer.printList(false,
				"If in Difficult Terrain, become Prone.",
				"If climbing, fall (1d10 Impact damage, plus 1 per meter fallen)."
		);
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}