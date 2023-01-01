package files;

import main.*;

class ProceduresOfPlayFile implements PrintableFile {
	
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
		printer.printParagraph(
				"Resolve any Short Actions the characters wish to take as they decide to take them. "
				+ "When the characters have decided what Long Actions they are taking, run the following procedure.");
		
		printer.printSubSubheader("1 - Determine if/when encounters happen");
		printer.printList(false,
				"<b>Travelling:</b> "
				+ "Roll one d10 for the Location Encounter and one for the regular Encounter. "
				+ "The encounter with the highest roll occurs first; "
				+ "doubles means they happen together. "
				+ "Treat each Navigation Hazard as an Encounter, using the Aspect Level to determine when it occurs.",
				"<b>Not Travelling:</b> "
				+ "Roll a d10. On a roll of 10, there is an Encounter. "
				+ "There are no Location Encounters.");
		printer.printSubSubheader("2 - Roll up the encounters");
		printer.printParagraph(
				"Before rolling the Location Encounter, roll a d10 to see if is new or previously visited: "
				+ "If the list of locations for that Area is smaller than the rolled number, it's new; "
				+ "otherwise it's the location at the rolled number in the list.");
		printer.printSubSubheader("3 - Resolve the encounters");
		printer.printParagraph(
				"Either in Combat-Time (if appropriate), with Short Actions, or simply discribing it and moving on. "
				+ "If the characters abort their Long Action for a different one, resolve this in the next hour.");
		printer.printSubSubheader("4 - Advance time");
		printer.printParagraph("Even if the characters abort their Long Action.");
		printer.printSubSubheader("5 - Resolve the Actions");
		
		printer.printSubheader_collapsible("Procedure for Encounters");
		printer.printCollapsibleTop();
		printer.printList(false,
				"Determine encounter distance using the table.",
				"If relevant, determine whether the party and/or encountered party is surprised.",
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
		
		printer.printSubheader_collapsible("Travel");
		printer.printCollapsibleTop();
		printer.printParagraph(
				"Travelling to an adjacent area or between layers takes an hour. "
				+ "Arriving in an area equates to arriving at the Main Location for that area. "
				+ "Once in an area, travelling to a specific location takes an hour. "
				+ "So travelling to a location in an adjacent area takes 2 hours, for example.");
		printer.printSubSubheader("Navigation Challenges");
		printer.printParagraph(
				"If there is a Navigation Challenge, the characters must Navigate to Overcome this if they are trying to Travel. "
				+ "Success and each Degree of Success overcomes one level of the Navigation Challenge. "
				+ "If all levels of the Navigation Challenge are Overcome, then the Navigate Action includes Travel. "
				+ "Otherwise, the characters do not Travel - an hour passes and they can Navigate again, keeping their progress from before. "
				+ "On a Critical Failure, the characters become lost.");
		printer.printList(false,
				"Navigation Challenge (1) - following directions to a new location.",
				"Navigation Challenge (2) - overcome being lost.",
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
		
		printer.printSubSubheader("Getting Lost");
		printer.printParagraph("Being lost means the characters Travel according to the table below, instead of where they intended. "
				+ "They then face a Navigation Challenge (2) in which Failure results in Travel using the table below. "
				+ "If the characters encounter a known Location while lost, they are no longer lost "
				+ "(this doesn't apply to Main Locations - knowing which Area they are in doesn't mean they aren't lost).");
		printer.printTableTop(false, true, "Roll", "Effect");
		printer.printTableRow("01-10", "Travel up a layer");
		printer.printTableRow("11-20", "Travel 2 areas left of the intended area");
		printer.printTableRow("21-45", "Travel 1 area left of the intended area");
		printer.printTableRow("46-55", "Travel in circles (don't change area)");
		printer.printTableRow("56-80", "Travel 1 area right of the intended area");
		printer.printTableRow("81-90", "Travel 2 areas right of the intended area");
		printer.printTableRow("91-00", "Travel down a layer");
		printer.printTableRow_note("Treat invalid results as going in circles.");
		printer.printTableTail();
		printer.printCollapsibleTail();

		printer.printFileTail();
	}
}