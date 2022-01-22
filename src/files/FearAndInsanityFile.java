package files;

import main.*;

class FearAndInsanityFile implements PrintableFile {
	
	private static String[][] fearRatingTable = {
			{"1", "+30"},
			{"2", "+20"},
			{"3", "+10"},
			{"4", "+0"},
	};
	private static String[][] fearEffectsTable = {
			{"Over 3 DoS", "You are unaffected."},
			{"3 DoS", "You take a -10 penalty to your next Test as if you were Frightened."},
			{"2 DoS", "You become Frightened."},
			{"1 DoS", "You become Frightened(2) and cannot approach the source of your Fear until this is overcome."},
			{"0 DoS", "You become Frightened(3) and are frozen by terror until this is overcome."},
			{"Failure", "You become Frightened(4) and flee in panic until this is overcome.<br>"
					+ "You also take 1d10-WB Insanity Points."},
			{"Critical Failure", "You become Frightened(5) and are reduced to a babbling mess until this is overcome.<br>"
					+ "You also take Insanity Points equal to 1d10 plus the Fear Rating."},
	};
	
	private static String[][] insanityTrack = {
			{"10", "Trauma Test (+30)"},
			{"20", "Trauma Test (+30)"},
			{"30", "Trauma Test (+30)"},
			{"40", "Trauma Test (+20) and Mental Disorder"},
			{"50", "Trauma Test (+20)"},
			{"60", "Trauma Test (+10) and Mental Disorder"},
			{"70", "Trauma Test (+10)"},
			{"80", "Trauma Test (+0) and Mental Disorder"},
			{"90", "Trauma Test (+0)"},
			{"100", "Terminally Insane - the character becomes unplayable"},
	};
	
	private static String[][] traumaEffectsTable = {
			{"Over 3 DoS", "You are unaffected."},
			{"3 DoS", "You become Jumpy."},
			{"2 DoS", "You become Withdrawn."},
			{"1 DoS", "You become Sleepless."},
			{"0 DoS", "You become Agitated."},
			{"Failure", "You become Dishevelled."},
			{"Critical Failure", "You become Traumatised."},
	};
	
	@Override
	public String filename() {
		return "FearAndInsanity.html";
	}
	
	@Override
	public String title() {
		return "Fear and Insanity";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printHeader_collapsible("Fear");
		printer.printCollapsibleTop();
		printer.printParagraph("When you are affected by Fear, you make a Fear Test (Willpower) in order to determine how you are affected. Apply a modifier to the Fear Test based on the Fear Rating of the thing causing the Fear. Only one level of Frightened needs to be overcome to end the extra effects.");
		printer.printParagraph("[Are the extra effects actually necessary? Could this be simplified to just taking levels of Frightened? This could simplify the whole Fear Rating system!]");
		printer.printParagraph("[Maybe instead of forcing player behaviour, have the player take insanity points if they confront the source of fear anyway.]");
		printer.printTableTop("Fear Rating", "Modifier", false, true);
		for(int i = 0; i < fearRatingTable.length; i ++) {
			printer.printTableRow(fearRatingTable[i]);
		}
		printer.printTableTail();
		printer.printTableTop("Result", "Effect", false, true);
		for(int i = 0; i < fearEffectsTable.length; i ++) {
			printer.printTableRow(fearEffectsTable[i]);
		}
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Insanity");
		printer.printCollapsibleTop();
		printer.printParagraph("Each time a character gains Insanity Points, check whether they have passed thresholds for taking a Trauma Test or suffering a Mental Disorder - resolve this in the aftermath of the encounter.");
		printer.printTableTop("Insanity", "Effect", false, true);
		for(int i = 0; i < insanityTrack.length; i ++) {
			printer.printTableRow(insanityTrack[i]);
		}
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Mental Trauma");
		printer.printCollapsibleTop();
		printer.printParagraph("A Trauma Test is a Willpower Test with the modifier specified on the Insanity Track. How you are affected is specfied in the table below.");
		printer.printTableTop("Result", "Effect", false, true);
		for(int i = 0; i < traumaEffectsTable.length; i ++) {
			printer.printTableRow(traumaEffectsTable[i]);
		}
		printer.printTableTail();
		printer.printSubheader("Trauma Aspects");
		printer.printRowTop();
		printer.printCol_aspect(6, Aspect.jumpy);
		printer.printCol_aspect(6, Aspect.withdrawn);
		printer.printCol_aspect(6, Aspect.sleepless);
		printer.printCol_aspect(6, Aspect.agitated);
		printer.printCol_aspect(6, Aspect.dishevelled);
		printer.printCol_aspect(6, Aspect.traumatised);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Mental Disorers");
		printer.printCollapsibleTop();
		printer.printParagraph("When you take a Mental Disorder, it should (if possible) be linked in some way to the cause. You can either take a new Mental Disorder or increase the severity of an existing one.");
		printer.printTableTop("", true, false);
		printer.printTableRow_specialRule(SpecialRule.phobia.withParameter("The Dead/Insects/etc."));
		printer.printTableRow_specialRule(SpecialRule.compulsion.withParameter("Kleptomania/Self-Mortification/The Flesh Is Weak/etc."));
		printer.printTableRow_specialRule(SpecialRule.hallucinations.withParameter("Dead Comrade/Flashbacks/etc."));
		printer.printTableRow_specialRule(SpecialRule.delusion.withParameter("Invulnerability/Righteousness/etc."));
		printer.printTableRow_specialRule(SpecialRule.horrificNightmares);
		printer.printTableTail();
		printer.printSubheader("Only the Insane Shall Prosper");
		printer.printParagraph("When you take your first/second/third Mental Disorder, you also take the Fearless(1/2/3) Talent.");
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}