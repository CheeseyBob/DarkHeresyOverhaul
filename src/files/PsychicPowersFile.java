package files;

import main.*;

class PsychicPowersFile implements PrintableFile {
	
	@Override
	public String filename() {
		return "PsychicPowers.html";
	}
	
	@Override
	public String title() {
		return "Psychic Powers";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printParagraph("Before you Focus Power, you can choose to use each point of your Psy Rating to either:");
		printer.printList(false, new String[] {
				"Increase potency: Add a d10 to the Potency roll. At least one Psy Rating must be used to increase potency.",
				"Increase stability: Get a +10 bonus to Focus Power and reroll a d10 in the Potency roll, taking the higher result.",
		});
		printer.printParagraph("Other things to note:");
		printer.printList(false, new String[] {
				"\"bonus/penalty\" affects Focus Power when using the power.",
				"\"Sustained\" means that a successful Focus Power allows the power to be sustained for multiple turns. Make a Potency roll each subsequent turn to determine the continued effects of the power.",
				"Potency is abbreviated to P in the power descriptions.",
				"When a power says you can spend Potency for additional benefits, you may do this multiple times, as long as this doesn't reduce the Potency below zero.",
				"The XP cost for Psychic Powers isn't affected by Aptitudes.",
				"The Potency roll is made even if Focus Power failed, in order to determine whether Psychic Phenomena occur.",
				"If a 1 is rolled on any dice (after rerolls), then a Psychic Phenomena has occured (determined by rolling on the Psychic Phenomena table).",
		});
		printer.printHeader_collapsible("Biomancy");
		printer.printCollapsibleTop();
		printer.printTableTop_psychicPowers();
		// TODO //
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Divination");
		printer.printCollapsibleTop();
		printer.printTableTop_psychicPowers();
		// TODO //
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Pyromancy");
		printer.printCollapsibleTop();
		printer.printTableTop_psychicPowers();
		// TODO //
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Telekinesis");
		printer.printCollapsibleTop();
		printer.printTableTop_psychicPowers();
		printer.printTableRow_psychicPower(PsychicPower.telekineticControl);
		printer.printTableRow_psychicPower(PsychicPower.telekineticPunch);
		printer.printTableRow_psychicPower(PsychicPower.telekineticShove);
		printer.printTableRow_psychicPower(PsychicPower.boltOfForce);
		printer.printTableRow_psychicPower(PsychicPower.deflect);
		printer.printTableRow_psychicPower(PsychicPower.psyBlade);
		printer.printTableRow_psychicPower(PsychicPower.restrain);
		printer.printTableRow_psychicPower(PsychicPower.telekineDash);
		printer.printTableRow_psychicPower(PsychicPower.crush);
		printer.printTableRow_psychicPower(PsychicPower.hurl);
		printer.printTableRow_psychicPower(PsychicPower.psyBullets);
		printer.printTableRow_psychicPower(PsychicPower.telekineShield);
		printer.printTableRow_psychicPower(PsychicPower.thunderclap);
		printer.printTableRow_psychicPower(PsychicPower.waveOfForce);
		printer.printTableRow_psychicPower(PsychicPower.wallOfForce);
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Telepathy");
		printer.printCollapsibleTop();
		printer.printTableTop_psychicPowers();
		// TODO //
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Wytchcraft");
		printer.printCollapsibleTop();
		printer.printTableTop_psychicPowers();
		printer.printTableRow_psychicPower(PsychicPower.corruptingWhispers);
		printer.printTableRow_psychicPower(PsychicPower.counter);
		printer.printTableRow_psychicPower(PsychicPower.wytchEar);
		printer.printTableRow_psychicPower(PsychicPower.fickle);
		printer.printTableRow_psychicPower(PsychicPower.dreadVisage);
		printer.printTableRow_psychicPower(PsychicPower.weakenVeil);
		printer.printTableRow_psychicPower(PsychicPower.warpRift);
		printer.printTableRow_psychicPower(PsychicPower.blink);
		printer.printTableRow_psychicPower(PsychicPower.fourtyWinks);
		printer.printTableRow_psychicPower(PsychicPower.gateOfInfinity);
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}









