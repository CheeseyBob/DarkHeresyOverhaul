package files;

import main.*;

class BionicsFile implements PrintableFile {
	
	@Override
	public String filename() {
		return "Bionics.html";
	}
	
	@Override
	public String title() {
		return "Bionics";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.println("<p>Mechanically, bionics are Talents, but they cannot be aquired by spending XP. "
				+ "Rather, they are purchased as if they are Items and must be installed by a capable chirurgeon in a proper medical facility (see <a href=\"Items.html\">Items</a> for availability of medical care).</p>");
		printer.println("<p>The difficulty of installing a bionic is the modifier for its availability and -10 per wound. "
				+ "Installing a bionic takes a full day and inflicts 1d10 Rending damage, ignoring Armour and Toughness. "
				+ "On a critical failure, an additional 1d10 Wounds are inflicted as Rending critical damage to the appropriate location.</p>");
		printer.printHeader_collapsible("Replacements");
		printer.printCollapsibleTop();
		printer.printTableTop_bionics();
		printer.printTableRow_bionic(Bionic.bionicArm_poorQuality);
		printer.printTableRow_bionic(Bionic.bionicArm);
		printer.printTableRow_bionic(Bionic.bionicArm_goodQuality);
		printer.printTableRow_bionic(Bionic.bionicArm_bestQuality);
		printer.printTableRow_bionic(Bionic.bionicEye_poorQuality);
		printer.printTableRow_bionic(Bionic.bionicEye);
		printer.printTableRow_bionic(Bionic.bionicEye_goodQuality);
		printer.printTableRow_bionic(Bionic.bionicEye_bestQuality);
		printer.printTableRow_note("*If your eyes are all bionic, then you are immune to becoming Dazzled.");
		printer.printTableRow_bionic(Bionic.bionicHearing_poorQuality);
		printer.printTableRow_bionic(Bionic.bionicHearing);
		printer.printTableRow_bionic(Bionic.bionicHearing_goodQuality);
		printer.printTableRow_bionic(Bionic.bionicHearing_bestQuality);
		printer.printTableRow_bionic(Bionic.bionicLeg_poorQuality);
		printer.printTableRow_bionic(Bionic.bionicLeg);
		printer.printTableRow_bionic(Bionic.bionicLeg_goodQuality);
		printer.printTableRow_bionic(Bionic.bionicLeg_bestQuality);
		printer.printTableRow_bionic(Bionic.bionicLungs_poorQuality);
		printer.printTableRow_bionic(Bionic.bionicLungs);
		printer.printTableRow_bionic(Bionic.bionicLungs_goodQuality);
		printer.printTableRow_bionic(Bionic.bionicLungs_bestQuality);
		printer.printTableRow_bionic(Bionic.cerebralImplant_poorQuality);
		printer.printTableRow_bionic(Bionic.cerebralImplant);
		printer.printTableRow_bionic(Bionic.cerebralImplant_goodQuality);
		printer.printTableRow_bionic(Bionic.cerebralImplant_bestQuality);
		printer.printTableRow_bionic(Bionic.vocalImplant_poorQuality);
		printer.printTableRow_bionic(Bionic.vocalImplant);
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Augmentations");
		printer.printCollapsibleTop();
		printer.printTableTop_bionics();
		printer.printTableRow_bionic(Bionic.augurArray_poorQuality);
		printer.printTableRow_bionic(Bionic.augurArray);
		printer.printTableRow_bionic(Bionic.augurArray_goodQuality);
		printer.printTableRow_bionic(Bionic.augurArray_bestQuality);
		printer.printTableRow_bionic(Bionic.cogitatorImplant);
		printer.printTableRow_bionic(Bionic.cranialArmour);
		printer.printTableRow_bionic(Bionic.interfacePort);
		printer.printTableRow_bionic(Bionic.mindImpulseUnit_poorQuality);
		printer.printTableRow_bionic(Bionic.mindImpulseUnit);
		printer.printTableRow_bionic(Bionic.mindImpulseUnit_goodQuality);
		printer.printTableRow_bionic(Bionic.mindImpulseUnit_bestQuality);
		printer.printTableRow_bionic(Bionic.subskinArmour);
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Mechanicus Implants");
		printer.printCollapsibleTop();
		printer.printTableTop_bionics();
		printer.printTableRow_bionic(Bionic.mechanicusImplants);
		printer.printTableRow_bionic(Bionic.autosanguine);
		printer.printTableRow_bionic(Bionic.ferricLure);
		printer.printTableRow_bionic(Bionic.internalReservoir);
		printer.printTableRow_bionic(Bionic.luminenCapacitor);
		printer.printTableRow_bionic(Bionic.maglevCoils);
		printer.printTableRow_subheader("Mechadendrites");
		printer.printTableRow_bionic(Bionic.mechadendrite_ballistic);
		printer.printTableRow_bionic(Bionic.mechadendrite_manipulator);
		printer.printTableRow_bionic(Bionic.mechadendrite_medicae);
		printer.printTableRow_bionic(Bionic.mechadendrite_optical);
		printer.printTableRow_bionic(Bionic.mechadendrite_utility);
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}