package files;

import main.*;

class GroupsAndEventsFile implements PrintableFile {
	
	private static final String[][] newHappeningsTable = {
			{"01-30", "Group", "Group + Event"},
			{"31-60", "Event", "Group + Event"},
			{"61-00", "Group + Event", "Group + Event"},
	};
	
	private static final String[][] newGroupTable = {
			{"01-02", "The Inquisition"},
			{"03-10", "Adeptus Arbites"},
			{"11-12", "Adeptus Astra Telepathica"},
			{"13-14", "Adeptus Astranomica"},
			{"15-20", "Adeptus Mechanicus"},
			{"21-28", "Adeptus Ministorum"},
			{"29-30", "The Redemption"},
			{"31-32", "Administratum"},
			{"33-38", "Hive Nobles"},
			{"39-40", "Merchant Magnates"},
			{"41-43", "Planetary Defence Forces"},
			{"44-50", "Local Enforcers"},
			{"51-52", "Labourers"},
			{"53-54", "Traders"},
			{"55-56", "Entertainers"},
			{"57-68", "Dregs"},
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
			{"51-53", "Heretical ideas being spread"},
			{"54-55", "Heretical texts entering circulation"},
			{"56-58", "Xenotech entering circulation"},
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
		printer.printParagraph("Maintain a list of Happenings with 10 spaces. Between sessions, if there is an empty space on the list, add a new Happening as follows.");
		printer.printList(true, new String[] {
				"Roll a d10 to determine a Happening in the list - the new Happening is connected to this one. If the rolled space was empty, the new Happening is unconnected to current Happenings.",
				"Roll on the New Happenings table, then the indicated Group and/or Event tables to determine the prompt for the new Happening.",
				"Use the prompt to come up with something and enter that into the empty space on the Happening list.",
		});
		printer.printParagraph("The Group can be related to the cause or the effect of the Event. A Happening doesn't have to be a problem for the PCs, or even a problem at all, it could just be a background event. For example, 'Labourers' + 'Duel between nobles' could just be a duelling event at a stadium which the common people are excited to watch.");
		printer.printParagraph("Remove Happenings from the list when they are resolved by the players or if they have become out-dated.");
		printer.printSubSubheader("New Happenings");
		printer.printTableTop("Roll", "Connected", "Unconnected", false, true);
		for(int i = 0; i < newHappeningsTable.length; i ++) {
			printer.printTableRow(newHappeningsTable[i]);
		}
		printer.printTableTail();
		printer.println();
		printer.println();
		printer.printRowTop();
		printer.printColTop(6);
		printer.printTableTop("Roll", "Group", false, true);
		for(int i = 0; i < newGroupTable.length; i ++) {
			printer.printTableRow(newGroupTable[i]);
		}
		printer.printTableTail();
		printer.printColTail();
		printer.println();
		printer.printColTop(6);
		printer.printTableTop("Roll", "Event", false, true);
		for(int i = 0; i < newEventTable.length; i ++) {
			printer.printTableRow(newEventTable[i]);
		}
		printer.printTableTail();
		printer.printColTail();
		printer.printRowTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}