package main;

class RangedWeapon extends Item {

	RangedWeapon(String name, int size) {
		super(name, size);
	}
	
	public static final Item laspistol = new Item("Laspistol", 1);
	public static final Item pistol = new Item("Pistol", 1);
	public static final Item pistol_arbites = new Item("Arbites Pistol", 1);
	public static final Item stubber = new Item("Stubber", 3);
	public static final Item autopistol = new Item("Autopistol", 1);
	public static final Item lasgun = new Item("Lasgun", 3);
	public static final Item lasgun_bayonet = new Item("Lasgun with Bayonet", 3);
	public static final Item pumpActionShotgun = new Item("Pump-Action Shotgun", 3);
	public static final Item arbitesShotgun = new Item("Arbites Shotgun", 3);
	public static final Item autostubber = new Item("Autostubber", 4);
	public static final Item combatShotgun = new Item("Combat Shotgun", 3);
	public static final Item flamer = new Item("Flamer", 3);
	public static final Item handFlamer = new Item("Hand Flamer", 2);
	public static final Item huntingRifle = new Item("Hunting Rifle", 4);
	public static final Item huntingRifle_scoped = new Item("Scoped Hunting Rifle", 4);
	public static final Item huntingRifle_mag = new Item("Hunting Rifle Mag", 1);
	public static final Item heavyStubber = new Item("Heavy Stubber", 5);
	public static final Item heavyStubber_beltFed = new Item("Belt-Fed Heavy Stubber", 5);
	public static final Item longLas = new Item("Long Las", 4);
	public static final Item longLas_scoped = new Item("Scoped Long Las", 4);
	public static final Item lascannon = new Item("Lascannon", 5);
	public static final Item plasmaGun = new Item("Plasma Gun", 4);
	public static final Item plasmaGun_feedLine = new Item("Plasma Gun with Feed Line", 4);
	public static final Item plasmaPistol = new Item("Plasma Pistol", 2);
	
	public static final Item boltPistol = new Item("Bolt Pistol", 2);
}