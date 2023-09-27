package files;

import main.*;

class RangedWeaponsFile implements PrintableFile {
	
	private static String[] getRangeTableRow(int row) {
		String[] rangeList = {
				"CQC", "2m", "5m", "10m", "20m", "40m", "80m", "160m", "320m", "640m", "1280m"
		};
		String[] bonusList = {
				"-20", "+30", "+20", "+10", "+0", "-10", "-20", "-30", "-40", "-50", "-60"
		};
		return new String[] {rangeList[row], bonusList[row]};
	}
	
	@Override
	public String filename() {
		return "RangedWeapons.html";
	}
	
	@Override
	public String title() {
		return "Ranged Weapons";
	}
	
	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printSubSubheader("Range");
		printer.printParagraph(
				"The maximum effective range of the weapon. "
				+ "Apply a bonus/penalty for the distance to the target based on the table below. "
				+ "If an adjacent target is helpless or unaware, use the 2m bonus instead of the CQC penalty (this stacks with the usual +30 bonus against helpless targets).");
		printer.printTableTop(false, false, "Range", "Bonus");
		for(int i = 0; i < 11; i ++) {
			printer.printTableRow(getRangeTableRow(i));
		}
		printer.printTableTail();
		printer.printSubSubheader("Rate of Fire (RoF)");
		printer.printParagraph(
				"Number of shots fired by the weapon when you Attack Repeatedly. "
				+ "If you Attack, one shot is fired.");
		printer.printSubSubheader("Capacity");
		printer.printParagraph("How much ammo the weapon can hold.");
		printer.printSubSubheader("Reload");
		printer.printParagraph("How many Secondary Actions it takes to reload the weapon.");
		printer.printSubSubheader("Damage");
		printer.printParagraph(
				"The damage the target takes from each hit. "
				+ "The Type determines what effects there are if Critical Damage is inflicted, and can affect the effectiveness of Armour.");
		printer.printHeader_collapsible("Energy");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, RangedWeapon.laspistol);
		printer.printCol_item(6, RangedWeapon.lasgun);
		printer.printCol_item(6, RangedWeapon.lasgun_bayonet);
		printer.printCol_item(6, RangedWeapon.flamer);
		printer.printCol_item(6, RangedWeapon.handFlamer);
		printer.printCol_item(6, RangedWeapon.longLas);
		printer.printCol_item(6, RangedWeapon.longLas_scoped);
		printer.printCol_item(6, RangedWeapon.lascannon);
		printer.printCol_item(6, RangedWeapon.plasmaGun);
		printer.printCol_item(6, RangedWeapon.plasmaGun_feedLine);
		printer.printCol_item(6, RangedWeapon.plasmaPistol);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Explosive");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, RangedWeapon.boltPistol);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Impact");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, RangedWeapon.pistol);
		printer.printCol_item(6, RangedWeapon.pistol_arbites);
		printer.printCol_item(6, RangedWeapon.stubber);
		printer.printCol_item(6, RangedWeapon.autopistol);
		printer.printCol_item(6, RangedWeapon.pumpActionShotgun);
		printer.printCol_item(6, RangedWeapon.shotgun_arbites);
		printer.printCol_item(6, RangedWeapon.autostubber);
		printer.printCol_item(6, RangedWeapon.combatShotgun);
		printer.printCol_item(6, RangedWeapon.huntingRifle);
		printer.printCol_item(6, RangedWeapon.huntingRifle_scoped);
		printer.printCol_item(6, RangedWeapon.heavyStubber);
		printer.printCol_item(6, RangedWeapon.heavyStubber_beltFed);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}