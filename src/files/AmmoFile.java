package files;

import main.*;

class AmmoFile implements PrintableFile {
	
	@Override
	public String filename() {
		return "Ammo.html";
	}
	
	@Override
	public String title() {
		return "Ammo";
	}
	
	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printHeader_collapsible("Solid Projectile");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Ammo.autopistol_mag);
		printer.printCol_item(6, Ammo.autostubber_mag);
		printer.printCol_item(6, Ammo.combatShotgun_mag);
		printer.printCol_item(6, Ammo.heavyStubber_beltBox);
		printer.printCol_item(6, Ammo.heavyStubber_mag);
		printer.printCol_item(6, Ammo.pistol_arbites_mag);
		printer.printCol_item(6, Ammo.pistol_mag);
		printer.printCol_item(6, Ammo.pumpActionShotgun_mag);
		printer.printCol_item(6, Ammo.shotgun_arbites_mag);
		printer.printCol_item(6, Ammo.stubber_mag);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Las");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Ammo.lascannon_powerPack);
		printer.printCol_item(6, Ammo.lasgun_powerPack);
		printer.printCol_item(6, Ammo.laspistol_powerPack);
		printer.printCol_item(6, Ammo.longLas_powerPack);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Flame & Plasma");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Ammo.flamer_canister);
		printer.printCol_item(6, Ammo.handFlamer_canister);
		printer.printCol_item(6, Ammo.plasmaGun_canister);
		printer.printCol_item(6, Ammo.plasmaGun_tank);
		printer.printCol_item(6, Ammo.plasmaPistol_canister);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Bolt");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, Ammo.boltPistol_mag);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}