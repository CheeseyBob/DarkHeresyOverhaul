package files;

import main.*;

class GroupsAndEventsFile implements PrintableFile {
	
	private static final String[][] newHappeningsTable = {
			{"01-30", "Group"},
			{"31-60", "Event"},
			{"61-00", "Group + Event"},
	};
	
	private static final String[][] newGroupTable = {
			{"01-02", "The Inquisition"},
			{"03-10", "Adeptus Arbites"},
			{"11-12", "Adeptus Astra Telepathica"},
			{"13-14", "Adeptus Astranomica"},
			{"15-20", "Adeptus Mechanicus"},
			{"21-28", "Adeptus Ministorum"},
			{"29-30", "The Redemption"},
			{"31-32", "Adeptus Administratum"},
			{"33-38", "Hive Nobles"},
			{"39-40", "Merchant Magnates"},
			{"41-43", "Planetary Defence Forces"},
			{"44-50", "Local Enforcers"},
			{"51-52", "Labourers"},
			{"53-54", "Traders"},
			{"55-56", "Entertainers"},
			{"57-58", "Dregs"},
			{"59-60", "Vermin"},
			{"61-64", "Gangers"},
			{"65-66", "Bounty Hunters and Assassins"},
			{"67-68", "Criminal Cartels"},
			{"69-70", "Recidivists"},
			{"71-75", "Mutants"},
			{"76-78", "Hereteks"},
			{"79-80", "Unsanctioned Psykers"},
			{"81-84", "Heretical Cults"},
			{"85-87", "Xeno Cults"},
			{"88-90", "Daemon Cults"},
			{"91-93", "Seditionists"},
			{"94-96", "Witches"},
			{"97-99", "Xenos"},
			{"00", "Daemons"},
	};
	
	private static final String[][] newEventTable = {
			{"01-09", "A day of religious importance taking place"},
			{"10", "A long religious festival taking place"},
			{"11-15", "Tithe of resources being collected"},
			{"16-19", "Tithe of troops being collected"},
			{"20", "Tithe of psykers being collected"},
			{"21-25", "Sporting event"},
			{"26-28", "Duel between nobles"},
			{"29-30", "Noble's trial by combat"},
			{"31-35", "Artifact being stolen from a noble"},
			{"36-40", "Relic being stolen from the Ministorum"},
			{"41-43", "Psychic phenomena"},
			{"44-46", "Archeotech being uncovered"},
			{"47-48", "Xeno artifact being uncovered"},
			{"49-50", "Daemonic artifact being uncovered"},
			{"51-52", "Heretical ideas being spread"},
			{"53-54", "Heretical texts entering circulation"},
			{"55-56", "Heretical technology entering circulation"},
			{"57-58", "Xenotech entering circulation"},
			{"59-60", "Warp-tainted items entering circulation"},
			{"61-64", "Power outage"},
			{"65-68", "Industrial accident"},
			{"69-70", "Hive-quake"},
			{"71-72", "Flood"},
			{"73-74", "Fire"},
			{"75-76", "Toxic-gas leak"},
			{"77-79", "Xeno getting loose"},
			{"80", "Xeno disease outbreak"},
			{"81-86", "Quiet takeover"},
			{"87-94", "Murders"},
			{"95-00", "Open violence"},
	};
	
	@Override
	public String filename() {
		return "GroupsAndEvents.html";
	}
	
	@Override
	public String title() {
		return "Groups and Events";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		
		printer.printRowTop();
		printer.printColTop(6);
		printer.printTableTop(false, true, "Roll", "Group");
		for(int i = 0; i < newGroupTable.length; i ++) {
			printer.printTableRow(newGroupTable[i]);
		}
		printer.printTableTail();
		printer.printColTail();
		
		printer.printColTop(6);
		printer.printTableTop(false, true, "Roll", "Event");
		for(int i = 0; i < newEventTable.length; i ++) {
			printer.printTableRow(newEventTable[i]);
		}
		printer.printTableTail();
		printer.printColTail();
		printer.printRowTail();
		
		
		printer.printHeader("Happenings");
		printer.printParagraph("Maintain a list of Happenings with 10 spaces. "
				+ "Before the start of the campaign and between sessions, add a few new Happenings: "
				+ "Roll Ld10 to determine a spot on the list "
				+ "- if the spot is empty, generate a new Happening and put in the first empty spot in the list; "
				+ "if the spot has a Happening, generate a Development and add it to that Happening.");
		printer.printParagraph("Remove Happenings from the list when they are resolved by the players or if they have become out-dated.");
		
		printer.printSubheader("New Happenings");
		printer.printParagraph("Roll on the tables to determine a Group and an Event. "
				+ "Use these as prompts to come up with something that links the Group to the cause or effect of the Event in some way. "
				+ "Also come up with any NPCs, locations or other details that would be needed for the PCs to investigate this.");
		printer.printParagraph("Typically, a Happening would be something the PCs would want to investigate, though this needn't be the case "
				+ "- it could just be a background event which provides some colour while the PCs investigate other things. "
				+ "For example, 'Mutants' + 'Power Outage' could be that a tribe of mutants from the underhive has breached the power infrastructure of some area of the hive, "
				+ "while 'Labourers' + 'Duel between nobles' could just be a duelling event at a stadium which the common people are excited to watch.");
		
		printer.printSubheader("Developments");
		printer.printParagraph("Roll on the table below, then on the Groups and/or Events tables as indicated. "
				+ "Then use these as prompts to build upon the existing Happening in some way.");
		printer.printTableTop(false, true, "Roll", "Development");
		for(int i = 0; i < newHappeningsTable.length; i ++) {
			printer.printTableRow(newHappeningsTable[i]);
		}
		printer.printTableTail();
		
		
		printer.printHeader("Attention");
		
		printer.printSubheader("Gaining Attention");
		printer.printParagraph("Sometimes, the PCs might gain Attention from a hostile group. "
				+ "Which group this is may be obvious due to what the PCs did to gain Attention. "
				+ "If not, determine the group randomly - from the hostile groups involved in current Happenings, if possible.");
		printer.println("The PCs can gain Attention in a few different ways:");
		printer.printList(false,
				"The PCs fail a Subtlety Test after going about their business.",
				"The PCs make a big scene in public.",
				"The PCs interact with a hostile NPC who realises who they are.",
				"The PCs engage in conflict with a hostile group."
		);
		printer.printParagraph("When the PCs gain Attention, make a note to resolve it after the session.");
		
		printer.printSubheader("Subtlety");
		printer.printParagraph("After the PCs get involved in an Encounter, Test Subtlety for the PCs. "
				+ "On a Failure, the PCs gain Attention from a hostile group. "
				+ "Determine the PC's Subtlety Characteristic using the table below. ");
		printer.printTableTop(false, true, "Subtlety", "Example Behaviour");
		printer.printTableRow("01-10", "Loudly announce their every move in the name of the Inquisition");
		printer.printTableRow("11-20", "Use their reputation and openly wear symbols of the Inquisition");
		printer.printTableRow("21-30", "Openly attack suspects to subdue them for interrogation");
		printer.printTableRow("31-40", "Respond to violence in kind with impressive weaponry");
		printer.printTableRow("41-50", "Neither conceal their business, nor draw extra attention");
		printer.printTableRow("51-60", "Trail and observe targets and inquire amongst their aquaintances");
		printer.printTableRow("61-70", "Take measures to keep their presence unknown and avoid violent engagements");
		printer.printTableRow("71-80", "Conceal their presence or identity until it is time to strike");
		printer.printTableRow("81-90", "Operate under detailed false identities to bring down their enemies from within");
		printer.printTableRow("91-00", "Hidden or disguised so perfectly that none suspect their true nature");
		printer.printTableTail();
		
		printer.printSubheader("Resolving Gained Attention");
		printer.printParagraph("Attention triggers the hostile group to undertake some kind of action against the PCs. "
				+ "This escalates each time the same group does this, on a scale from 1-10.");
		printer.printList(false,
				"1 - The group is curious about the PCs and tries to gather information on them (scouts, spies, etc.).",
				"...",
				"10 - The PCs are the group's number one enemy and they dedicate as many resources to destroying the PCs as they can."
		);
		
		
		printer.printFileTail();
	}
}