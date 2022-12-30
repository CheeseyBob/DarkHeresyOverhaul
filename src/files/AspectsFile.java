package files;

import main.*;

class AspectsFile implements PrintableFile {
	
	@Override
	public String filename() {
		return "Aspects.html";
	}
	
	@Override
	public String title() {
		return "Aspects";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printParagraph("Aspects confer bonuses/penalties to types of actions. "
				+ "They can also have special effects. "
				+ "Characters can place Aspects on things by taking Create Advantage actions and can remove Aspects by taking Overcome actions.");
		printer.printParagraph("By default, the bonus/penalty applied by an Aspect is ±10. "
				+ "An Aspect can be upgraded to a higher bonus/penalty, in increments of ±10. "
				+ "When a duplcate of an Aspect is to be created, the existing Aspect is instead upgraded. "
				+ "When an upgraded Aspect is overcome, it is downgraded by one increment instead of being removed. "
				+ "For example, if a character who is Stunned becomes Stunned again, they end up with a single Stunned(2) Aspect. "
				+ "If they successfully Resist Stun, they end up merely Stunned and must Resist Stun again to remove the Aspect.");
		printer.printParagraph("By default, Create Advantage Actions cannot increase the Aspect's level (AL) past the Characteristic Bonus of the Characteristic used for the Test. "
				+ "In addition to this, Aspects cannot be upgraded past level 10.");
		printer.println("Rule of thumb:");
		printer.printList(false,
				"Bonuses/penalties apply only to the target. Any benefits other characters get against the target should be come from penalites to the target opposing that action (and vice versa). The exception to this is when the Aspect is providing a static difficulty to something, for example a Concealed character or a Locked container simply makes it harder to Notice or Open rather than actively opposing.",
				"Bonuses/penalties apply to Tests but don't affect the Characteristic Bonus.",
				"The target of an aspect should get an opportunity to oppose the creation of the Aspect, either directly (if the Aspect was created automatically) or implicitly (by opposing the Action made to create it)."
		);
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Common Aspects for Characters");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_aspect(6, Aspect.bleedingOut);
		printer.printCol_aspect(6, Aspect.burning);
		printer.printCol_aspect(6, Aspect.concealed);
		printer.printCol_aspect(6, Aspect.dazzled);
		printer.printCol_aspect(6, Aspect.disguised);
		printer.printCol_aspect(6, Aspect.encumbered);
		printer.printCol_aspect(6, Aspect.fatigued);
		printer.printCol_aspect(6, Aspect.frenzied);
		printer.printCol_aspect(6, Aspect.frightened);
		printer.printCol_aspect(6, Aspect.grappled);
		printer.printCol_aspect(6, Aspect.inspired);
		printer.printCol_aspect(6, Aspect.intimidated);
		printer.printCol_aspect(6, Aspect.pinned);
		printer.printCol_aspect(6, Aspect.prone);
		printer.printCol_aspect(6, Aspect.running);
		printer.printCol_aspect(6, Aspect.stunned);
		printer.printCol_aspect(6, Aspect.treated);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Common Aspects for Items");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_aspect(6, Aspect.concealed);
		printer.printCol_aspect(6, Aspect.damaged);
		printer.printCol_aspect(6, Aspect.encrypted);
		printer.printCol_aspect(6, Aspect.jammed);
		printer.printCol_aspect(6, Aspect.locked);
		printer.printCol_aspect(6, Aspect.maintained);
		printer.printCol_aspect(6, Aspect.outOfPower);
		printer.printCol_aspect(6, Aspect.planted);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Drug/Poison Aspects");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_aspect(6, Aspect.drugged_deTox);
		printer.printCol_aspect(6, Aspect.drugged_frenzon);
		printer.printCol_aspect(6, Aspect.drugged_obscura);
		printer.printCol_aspect(6, Aspect.drugged_slaught);
		printer.printCol_aspect(6, Aspect.drugged_spook);
		printer.printCol_aspect(6, Aspect.drugged_stimm);
		printer.printCol_aspect(6, Aspect.poisoned_fatigue);
		printer.printCol_aspect(6, Aspect.poisoned_fatigue_lingering);
		printer.printCol_aspect(6, Aspect.poisoned_lethal);
		printer.printCol_aspect(6, Aspect.poisoned_lethal_lingering);
		printer.printCol_aspect(6, Aspect.poisoned_neurotoxin);
		printer.printCol_aspect(6, Aspect.poisoned_neurotoxin_lingering);
		printer.printCol_aspect(6, Aspect.poisoned_convulsions);
		printer.printCol_aspect(6, Aspect.poisoned_pain);
		printer.printCol_aspect(6, Aspect.poisoned_paralysing);
		printer.printCol_aspect(6, Aspect.poisoned_paralysing_lingering);
		printer.printCol_aspect(6, Aspect.poisoned_radiation);
		printer.printCol_aspect(6, Aspect.diseased);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Environmental Aspects");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_aspect(6, Aspect.darkness);
		printer.printCol_aspect(6, Aspect.difficultTerrain);
		printer.printCol_aspect(6, Aspect.fire);
		printer.printCol_aspect(6, Aspect.gas_x);
		printer.printCol_aspect(6, Aspect.smoke);
		printer.printCol_aspect(6, Aspect.warpRift);
		printer.printCol_aspect(6, Aspect.warpStorm);
		printer.printCol_aspect(6, Aspect.weakenedVeil);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}