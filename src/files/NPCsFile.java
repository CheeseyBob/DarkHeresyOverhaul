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
			{"Ubiquitous", "Automatic"},
			{"Legendary", "+30"},
			{"Famous", "+20"},
			{"Well Known", "+10"},
			{"Average", "+0"},
			{"Niche", "-10"},
			{"Obscure", "-20"},
			{"Very Obscure", "-30"},
			{"Extremely Obscure", "-40"},
			{"Nearly Forgotten", "-50"},
			{"Forgotten", "-60"},
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
		printer.printFileTop(title());
		printer.printParagraph("In addition to the usual stats that PCs have, NPCs have three special stats: Disposition, Personality and Obscurity.");
		printer.printSubheader("Disposition");
		printer.printParagraph("This represents the NPC's feelings towards the PCs. When the NPC first encounters the PCs, they Read Person to determine whether they realise who the PCs are. Set their Disposition accordingly. If the NPC is hostile to the Inquisition and realises who the PCs are, the PCs gain Attention from the hostile group they belong to.");
		printer.printTableTop(false, true, "NPC", "Disposition");
		for(int i = 0; i < startingDispositionTable.length; i ++) {
			printer.printTableRow(startingDispositionTable[i]);
		}
		printer.printTableTail();
		printer.println();
		printer.println();
		printer.printSubheader("Personality");
		printer.printParagraph("This is a descriptor with a table which determines the modifier applied and how the NPC's Disposition changes when they are the target of each social Skill, and how the NPC reacts when reaching Disposition 0. Apply the change for success once plus once per Degree of Success. Apply the failure change twice on a critical failure.");
		printer.printRowTop();
		printer.printCol_personality(6, Personality.vacant);
		printer.printCol_personality(6, Personality.aggressive);
		printer.printRowTail();
		printer.printParagraph("[Add more personalities]");
		printer.println();
		printer.println();
		printer.printSubheader("Obscurity");
		printer.printParagraph("This applies a bonus/penalty to Recall Lore about the NPC.");
		printer.printTableTop(false, true, "Obscurity", "Modifier");
		for(int i = 0; i < obscurityTable.length; i ++) {
			printer.printTableRow(obscurityTable[i]);
		}
		printer.printTableTail();
		printer.println();
		printer.println();
		printer.printHeader("NPC Interactions");
		printer.printSubheader("Subtlety and Attention");
		printer.printParagraph("Sometimes, the PCs might gain Attention from a hostile group. Each time this happens, the hostile group will take some action against the PCs, escalating each additional time the same group gains Attention. This can happen for a few reasons:");
		printer.printList(false,
				"The PCs fail a Subtlety Test after going about their business.",
				"The PCs interact with a hostile NPC who realises who they are.",
				"The PCs enter conflict with a hostile group.",
				"The PCs make a big scene in public."
		);
		printer.printParagraph("After the PCs go out and about in public, make a Subtlety Test - the PC's Subtlety Characteristic is determined by Table 8-3 in the Second Edition rulebook. If they fail, the PCs gain Attention from a random hostile group.");
		printer.printSubheader("Commanding Subordinates");
		printer.printParagraph("A character can Command other characters:");
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