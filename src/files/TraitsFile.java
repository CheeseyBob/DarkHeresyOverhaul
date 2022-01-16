package files;

import main.*;

class TraitsFile implements PrintableFile {
	
	@Override
	public String filename() {
		return "Traits.html";
	}
	
	@Override
	public String title() {
		return "Traits";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printHeader_collapsible("Basic Physiology");
		printer.printCollapsibleTop();
		printer.printTableTop("", true, true);
		printer.printTableRow_trait(Trait.arms.withParameter("N"));
		printer.printTableRow_note("Characters without this Trait are assumed to have 2 arms.");
		printer.printTableRow_trait(Trait.beastial);
		printer.printTableRow_trait(Trait.crawler);
		printer.printTableRow_trait(Trait.darkSight);
		printer.printTableRow_trait(Trait.fast);
		printer.printTableRow_trait(Trait.flight);
		printer.printTableRow_trait(Trait.hover);
		printer.printTableRow_trait(Trait.legs);
		printer.printTableRow_note("Characters without this Trait are assumed to have 2 legs.");
		printer.printTableRow_trait(Trait.machine);
		printer.printTableRow_trait(Trait.size);
		printer.printTableRow_note("Characters without this Trait are assumed to be Size 7 (human size).");
		printer.printTableRow_trait(Trait.slow);
		printer.printTableRow_trait(Trait.sonarSense);
		printer.printTableRow_trait(Trait.unnaturalSenses);
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Physiology / Critical Damage");
		printer.printCollapsibleTop();
		printer.printTableTop("", true, true);
		printer.printTableRow_trait(Trait.lostHand);
		printer.printTableRow_trait(Trait.lostArm);
		printer.printTableRow_trait(Trait.lostFoot);
		printer.printTableRow_trait(Trait.lostLeg);
		printer.printTableRow_trait(Trait.lostEye);
		printer.printTableRow_trait(Trait.blind);
		printer.printTableRow_trait(Trait.deaf);
		printer.printTableRow_trait(Trait.mute);
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Daemons");
		printer.printCollapsibleTop();
		printer.printTableTop("", true, true);
		printer.printTableRow_trait(Trait.daemonic);
		printer.printTableRow_note("Daemonic characters should also have either the Dark-Sight or Unnatural Senses Trait.");
		printer.printTableRow_trait(Trait.daemonicPresence);
		printer.printTableRow_note("Only Daemonic characters should have the Daemonic Presence Trait.");
		printer.printTableRow_trait(Trait.incoprorial);
		printer.printTableRow_trait(Trait.phase);
		printer.printTableRow_trait(Trait.stuffOfNightmares);
		printer.printTableRow_trait(Trait.warpInstability);
		printer.printTableRow_trait(Trait.warpWeapons);
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Other");
		printer.printCollapsibleTop();
		printer.printTableTop("", true, true);
		printer.printTableRow_trait(Trait.amorphous);
		printer.printTableRow_note("Amorphous characters should also have the Crawler Trait.");
		printer.printTableRow_trait(Trait.armoured);
		printer.printTableRow_trait(Trait.burrower);
		printer.printTableRow_trait(Trait.fearRating);
		printer.printTableRow_note("Fear Ratings can be 1, 2, 3 or 4.");
		printer.printTableRow_trait(Trait.fearless);
		printer.printTableRow_trait(Trait.programmedBehaviour);
		printer.printTableRow_trait(Trait.regeneration);
		printer.printTableRow_trait(Trait.sturdy);
		printer.printTableRow_trait(Trait.toxic);
		printer.printTableRow_trait(Trait.undying);
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}