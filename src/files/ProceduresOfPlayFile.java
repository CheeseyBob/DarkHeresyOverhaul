package files;

import main.*;

class ProceduresOfPlayFile implements PrintableFile {
	
	private static final String[][] gettingLostTable = {
			{"01-10", "Travel up a layer"},
			{"11-20", "Travel 2 areas left of the intended area"},
			{"21-45", "Travel 1 area left of the intended area"},
			{"46-55", "Travel in circles (don't change area)"},
			{"56-80", "Travel 1 area right of the intended area"},
			{"81-90", "Travel 2 areas right of the intended area"},
			{"91-00", "Travel down a layer"},
	};
	
	@Override
	public String filename() {
		return "ProceduresOfPlay.html";
	}
	
	@Override
	public String title() {
		return "Procedures of Play";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printParagraph(
				"Time is divided into hour-long segments. "
				+ "Each hour, determine what the PCs will be doing for that hour and whether it involves travelling. "
				+ "If so, follow the Procedure for Travel; otherwise follow the Procedure for Non-Travel. "
				+ "When necessary, play can slow down to Combat Time for as long as is required to resolve the situation, "
				+ "but this will always be an ignorable amount of time with regards to the passage of hours.");
		
		printer.printSubheader_collapsible("Procedure for Travel");
		printer.printCollapsibleTop();
		printer.printParagraph(
				"Travelling to an adjacent area or between layers takes an hour. "
				+ "Arriving in an area equates to arriving at the Main Location for that area. "
				+ "Once in an area, travelling to a specific location takes an hour. "
				+ "So travelling to a location in an adjacent area takes 2 hours, for example.");
		printer.printSubSubheader("1 - Is there a Navigation Challenge or Navigation Hazard?");
		printer.println("If so, resolve the characters' Navigate Action(s). "
				+ "Note progress against any Navigation Challenge and whether the characters have become lost.");
		printer.printSubSubheader("2 - When/where do the encounters happen?");
		printer.println("There is one Location Encounter and one regular Encounter. "
				+ "Roll a d10 for each - the encounter with the lowest roll occurs first; doubles means they happen together.");
		printer.printSubSubheader("3 - Is the Location Encounter a repeat?");
		printer.println("Roll a d10. If this position in the list of encountered locations for this area is empty, roll a new Encountered Location and add it to the list. "
				+ "Otherwise, the location in the rolled position is encountered.");
		printer.printSubSubheader("3 - Roll up the encounters");
		printer.println("Use the tables for the area the characters are currently in.");
		printer.printSubSubheader("4 - Resolve the encounters");
		printer.printSubSubheader("5 - Advance time");
		printer.println("Whether the characters continue travelling or abandon the travel to do something else after the encounter, time advances by an hour.");
		printer.printSubSubheader("6 - Resolve the Travel");
		printer.println("If the characters are lost, use the table to determine where they end up.");
		printer.println("Otherwise, if the characters don't still have a Navigation Challenge to overcome, they Travel successfully: "
				+ "If their destination is in the same area, then they arrive. "
				+ "Otherwise, they move into the adjacent area in their intended direction.");
		printer.printCollapsibleTail();
		
		printer.printSubheader_collapsible("Procedure for Non-Travel");
		printer.printCollapsibleTop();
		printer.printSubSubheader("1 - Does an encounter happen?");
		printer.println("Roll a d10. On a roll of 1, there is an Encounter.");
		printer.printSubSubheader("2 - Roll up the encounter");
		printer.printSubSubheader("3 - Resolve the encounter");
		printer.printSubSubheader("4 - Resolve the non-travel Action");
		printer.println("If the characters decide to abandon the Action they were performing after the encounter, skip advancing time and don't roll another encounter for this hour.");
		printer.printSubSubheader("5 - Advance time");
		printer.printCollapsibleTail();
		
		printer.printSubheader_collapsible("Procedure for Encounters");
		printer.printCollapsibleTop();
		printer.printList(false,
				"Determine encounter distance using the table.",
				"Determine NPC disposition (if relevant).",
				"Determine whether the party and/or encountered party is surprised (if relevant).",
				"Run the encounter."
		);		
		printer.printSubSubheader("Encounter Distance");
		printer.printTableTop(false, true, "Area", "Distance");
		printer.printTableRow("Upper Hive", "6d10m");
		printer.printTableRow("Middle Hive", "5d10m");
		printer.printTableRow("Underhive", "4d10m");
		printer.printTableRow("Collapsed (1-5)", "3d10m");
		printer.printTableRow("Collapsed (6-10)", "2d10m");
		printer.printTableTail();
		printer.printCollapsibleTail();
		
		printer.printSubheader_collapsible("Navigation Challenges and Navigation Hazards");
		printer.printCollapsibleTop();
		printer.printParagraph(
				"In addition to affecting Travel, the Navigation Challenges from disrepair and any Navigation Hazards will have a presence in encounters.");
		printer.printSubSubheader("Navigation Challenges");
		// TODO ...
		printer.printParagraph(
				"If there is a Navigation Challenge, the characters must Navigate to Overcome this if they are trying to Travel. "
				+ "Success and each Degree of Success overcomes one level of the Navigation Challenge. "
				+ "If all levels of the Navigation Challenge are Overcome, then the Navigate Action includes Travel."
				+ "Otherwise, the characters do not Travel - an hour passes and they can Navigate again, keeping their progress from before. "
				+ "On a Critical Failure, the characters become lost.");
		printer.printList(false,
				"Navigation Challenge (1) - following directions to a new location.",
				"Navigation Challenge (2) - retracing steps when lost.",
				"Navigation Challenge (3) - following unclear directions.",
				"Navigation Challenge (N) - disrepair in the area, e.g. Collapsed(N), Flooded(N), Dark(N).");
		
		printer.printSubSubheader("Navigation Hazards");
		printer.printParagraph(
				"For each Navigation Hazard, the characters Navigate to avoid it, assuming they are capable of doing so. "
				+ "Radiation, for example, would automatically affect characters who cannot detect it. "
				+ "In addition to affecting Travel, a Navigation Hazard will also be present in encounters.");
		printer.printList(false,
				"Sewage (N) - become "+Aspect.diseased+" (N), where X is a Characteristic chosen by rolling a d10 (reroll twice on a 10).",
				"Toxic Gas/Liquid (Fatigue) (N) - become "+Aspect.poisoned_fatigue+" (N).",
				"Toxic Gas/Liquid (Lingering Fatigue) (N) - become "+Aspect.poisoned_fatigue_lingering+" (N).",
				"Toxic Gas/Liquid (Lethal) (N) - become "+Aspect.poisoned_lethal+" (N).",
				"Toxic Gas/Liquid (Lingering Lethal) (N) - become "+Aspect.poisoned_lethal_lingering+" (N).",
				"Toxic Gas/Liquid (Neurotoxin) (N) - become "+Aspect.poisoned_neurotoxin+" (N).",
				"Toxic Gas/Liquid (Lingering Neurotoxin) (N) - become "+Aspect.poisoned_neurotoxin_lingering+" (N).",
				"Toxic Gas/Liquid (Convulsions) (N) - become "+Aspect.poisoned_convulsions+" (N).",
				"Toxic Gas/Liquid (Pain) (N) - become "+Aspect.poisoned_pain+" (N).",
				"Toxic Gas/Liquid (Paralysis) (N) - become "+Aspect.poisoned_paralysing+" (N).",
				"Toxic Gas/Liquid (Lingering Paralysis) (N) - become "+Aspect.poisoned_paralysing_lingering+" (N).",
				"Radiation (N) - become "+Aspect.poisoned_radiation+" (N).");
		// TODO ...
		printer.printCollapsibleTail();
		
		printer.printSubheader_collapsible("Getting Lost");
		printer.printCollapsibleTop();
		printer.printTableTop(false, true, "Roll", "Effect");
		for(int i = 0; i < gettingLostTable.length; i ++) {
			printer.printTableRow(gettingLostTable[i]);
		}
		printer.printTableRow_note("Treat invalid results as going in circles.");
		printer.printTableTail();
		printer.printCollapsibleTail();

		printer.printFileTail();
	}
}