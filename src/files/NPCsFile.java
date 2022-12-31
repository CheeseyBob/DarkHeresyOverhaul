package files;

import main.*;

class NPCsFile implements PrintableFile {
	
	private static String[][] startingDispositionTable = {
			{"Servant of the Imperium", "50+2d10"},
			{"Awe of the Inquisition", "60+2d10"},
			{"Hatred of the Inquisition", "20+2d10"},
			{"Other or unaware who PCs are", "40+2d10"},
	};
	
	private static String[][] obscurityTable = {
			{"Ubiquitous", "Automatic", "Ordinary citizens"},
			{"Legendary", "+30", "The God-Emperor; Space Marines"},
			{"Famous", "+20", "A major Saint; -"},
			{"Well Known", "+10", "A planetary govenor; standard Imperial Guard troops"},
			{"Average", "+0", "-; -"},
			{"Niche", "-10", "-; -"},
			{"Obscure", "-20", "-; a major xeno faction"},
			{"Very Obscure", "-30", "-; -"},
			{"Extremely Obscure", "-40", "-; -"},
			{"Nearly Forgotten", "-50", "-; -"},
			{"Forgotten", "-60", "An ancient Daemon; an extinct xeno species"},
	};
	
	@Override
	public String filename() {
		return "NPCs.html";
	}
	
	@Override
	public String title() {
		return "NPCs";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(this);
		printer.println("NPCs come in two types ");
		printer.printList(false,
				"Unique - characters who are important as individuals. "
				+ "Their character sheet should be created using the PC character creation process, altering things where needed.",
				"Mooks - defined more by their role than as individuals. "
				+ "They can be given individual names and descriptions, but their stats are just a standard NPC character sheet.");
		printer.printParagraph(
				"In addition to the usual stats that PCs have, NPCs have three special stats: "
				+ "Disposition, Personality and Obscurity.");
		
		printer.printSubSubheader("Disposition");
		printer.printParagraph(
				"This represents the NPC's feelings towards the PCs. "
				+ "When an NPC's decision-making would be affected by this, make a Disposition Test to determine the decision. "
				+ "Take into account Degrees of Success or Critical Failure if it makes sense.");
		
		printer.printSubSubheader("Personality");
		printer.println("Each NPC has a Personality table which determines:");
		printer.printList(false,
				"The broad strokes of how the NPC acts.",
				"How they act when their Disposition reaches 0.",
				"Modifiers to social interaction Actions targetting them.",
				"How their Disposition changes on Failure of these Actions (apply double this change on Critical Failure).");
		
		printer.printSubSubheader("Obscurity");
		printer.printParagraph(
				"This applies a bonus/penalty to Recall Lore about the NPC. "
				+ "For Unique characters, this means that specific individual. "
				+ "For Mooks, this means lore about their position/rank, rather than them as an individual. ");
		printer.printTableTop(false, true, "Obscurity", "Modifier", "Example");
		for(int i = 0; i < obscurityTable.length; i ++) {
			printer.printTableRow(obscurityTable[i]);
		}
		printer.printTableTail();


		printer.printHeader_collapsible("People");
		printer.printCollapsibleTop();
		
		printer.printSubSubheader("Disposition");
		printer.println("When the NPC first encounters the PCs:");
		printer.printList(true,
				"Read Person to determine whether they realise who the PCs are.",
				"Set their Disposition according to the table.",
				"If the NPC realises and is hostile to the Inquisition, the PCs gain Attention.");
		printer.printTableTop(false, true, "NPC", "Disposition");
		for(int i = 0; i < startingDispositionTable.length; i ++) {
			printer.printTableRow(startingDispositionTable[i]);
		}
		printer.printTableTail();
		
		printer.printSubSubheader("Personality");
		printer.printTableTop(false, true, "d100", "Personality");
		printer.printTableRow("01-10", Personality.bilious.name);
		printer.printTableRow("11-20", Personality.cardinal.name);
		printer.printTableRow("21-30", Personality.choleric.name);
		printer.printTableRow("31-40", Personality.fixed.name);
		printer.printTableRow("41-50", Personality.melancholic.name);
		printer.printTableRow("51-60", Personality.mutable.name);
		printer.printTableRow("61-70", Personality.phlegmatic.name);
		printer.printTableRow("71-80", Personality.sanguine.name);
		printer.printTableRow("81-90", Personality.supine.name);
		printer.printTableRow("91-00", Personality.vacant.name);
		printer.printTableTail();
		
		printer.printRowTop();
		printer.printCol_personality(6, Personality.bilious);
		printer.printCol_personality(6, Personality.cardinal);
		printer.printCol_personality(6, Personality.choleric);
		printer.printCol_personality(6, Personality.fixed);
		printer.printCol_personality(6, Personality.melancholic);
		printer.printCol_personality(6, Personality.mutable);
		printer.printCol_personality(6, Personality.phlegmatic);
		printer.printCol_personality(6, Personality.sanguine);
		printer.printCol_personality(6, Personality.supine);
		printer.printCol_personality(6, Personality.vacant);
		printer.printRowTail();
		
		printer.printCollapsibleTail();

		printer.printHeader_collapsible("Creatures");
		printer.printCollapsibleTop();
		printer.printParagraph(
				"For non-intelligent creatures, their Disposition and Personality will be determined by their species, as noted on their character sheet.");

		printer.printSubSubheader("Personality");
		printer.printParagraph(
				"Personality tables are different for creatures, as "+Skill.wrangle+" is the only relevant interaction Skill.");
		printer.printRowTop();
		printer.printCol_personality(6, Personality.creature_aggressive);
		printer.printCol_personality(6, Personality.creature_friendly);
		printer.printCol_personality(6, Personality.creature_inquisitive);
		printer.printCol_personality(6, Personality.creature_passive);
		printer.printCol_personality(6, Personality.creature_skittish);
		printer.printCol_personality(6, Personality.creature_unpredictable);
		printer.printRowTail();
		
		printer.printCollapsibleTail();
		
		printer.printHeader("NPC Interactions");
		printer.printSubheader("Attention");
		printer.printParagraph(
				"Sometimes, the PCs might gain Attention from a hostile group. "
				+ "This triggers the hostile group to undertake some kind of action against the PCs. "
				+ "This escalates each time the same group does this, on a scale from 1-10.");
		printer.printList(false,
				"1 - The group is curious about the PCs and tries to gather information on them (scouts, spies, etc.).",
				"10 - The PCs are the group's number one enemy and they dedicate as many resources to destroying the PCs as they can."
		);
		printer.println("The PCs can gain Attention in a few different ways:");
		printer.printList(false,
				"The PCs fail a Subtlety Test after going about their business.",
				"The PCs make a big scene in public.",
				"The PCs interact with a hostile NPC who realises who they are.",
				"The PCs engage in conflict with a hostile group."
		);
		
		printer.printSubheader("Subtlety");
		printer.printParagraph("After the PCs go out and about in public, make a Subtlety Test - the PC's Subtlety Characteristic is determined by Table 8-3 in the Second Edition rulebook. If they fail, the PCs gain Attention from a random hostile group.");
		// TODO - add the subtlety table
		
		printer.printSubheader("Commanding Subordinates");
		printer.printParagraph("A character can Command NPCs:");
		printer.printList(false,
				"To get unreliable subordinates or non-subordinates to follow your orders.",
				"To get subordinates to follow lengthy or complicated orders.",
				"To overcome subordinates being Frightened, Intimidated or Pinned."
		);
		printer.printParagraph("In either case, Command gives a bonus to the target's Disposition, which they then Test. If the Disposition Test is successful, they either follow your orders or overcome the Aspect.");
		
		printer.printSubheader("Reinforcement Characters");
		printer.printParagraph("Once an NPC's Disposition reaches 100, they become available as a reinforcement character. A reinforcement character can be chosen to play instead of a new or benched character. When doing so, determine the reason the NPC is joining the PCs and ............");
		
		printer.printFileTail();
	}
}