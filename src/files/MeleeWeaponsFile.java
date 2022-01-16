package files;

import main.*;

class MeleeWeaponsFile implements PrintableFile {
	
	@Override
	public String filename() {
		return "MeleeWeapons.html";
	}
	
	@Override
	public String title() {
		return "Melee Weapons";
	}
	
	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printSubSubheader("Bonus");
		printer.printParagraph("This is the bonus you get to Weapon Skill when you Attack with the weapon.");
		printer.printSubSubheader("Hits");
		printer.printParagraph("This is the maximum number of hits you can inflict when you Attack Repeatedly with the weapon.");
		printer.printSubSubheader("Damage");
		printer.printParagraph("All Melee Weapons add the wielder's Strength Bonus to the damage.");
		printer.printHeader_collapsible("Unarmed / Improvised");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, MeleeWeapon.unarmed_punch);
		printer.printCol_item(6, MeleeWeapon.unarmed_kick);
		printer.printCol_item(6, MeleeWeapon.improvisedWeapon_small);
		printer.printCol_item(6, MeleeWeapon.improvisedWeapon_smallish);
		printer.printCol_item(6, MeleeWeapon.improvisedWeapon_standard);
		printer.printCol_item(6, MeleeWeapon.improvisedWeapon_largeish);
		printer.printCol_item(6, MeleeWeapon.improvisedWeapon_large);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Impact");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, MeleeWeapon.club);
		printer.printCol_item(6, MeleeWeapon.hammer);
		printer.printCol_item(6, MeleeWeapon.shockMaul);
		printer.printCol_item(6, MeleeWeapon.shockMaul_mastercrafted);
		printer.printCol_item(6, MeleeWeapon.staff);
		printer.printCol_item(6, MeleeWeapon.warHammer);
		printer.printCol_item(6, MeleeWeapon.warHammer_great);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Rending");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, MeleeWeapon.chainsword);
		printer.printCol_item(6, MeleeWeapon.chainsword_mastercrafted);
		printer.printCol_item(6, MeleeWeapon.knife);
		printer.printCol_item(6, MeleeWeapon.longDagger);
		printer.printCol_item(6, MeleeWeapon.longsword);
		printer.printCol_item(6, MeleeWeapon.longsword_mono);
		printer.printCol_item(6, MeleeWeapon.shortsword);
		printer.printCol_item(6, MeleeWeapon.shortsword_mono);
		printer.printCol_item(6, MeleeWeapon.spear);
		printer.printCol_item(6, MeleeWeapon.spear_savage);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}