package main;

public class Ammo extends Item {
	int capacity;
	
	Ammo(String name, int size, int capacity, Availability availability) {
		super(name, size, availability);
		this.capacity = capacity;
	}
	
	public Ammo withSpecialRule(SpecialRule specialRule) {
		return (Ammo)super.withSpecialRule(specialRule);
	}
	
	// Special Rules //
	public static SpecialRule externalAmmo = new SpecialRule("External Ammo",
			"This is designed to be used with a belt-fed weapon.");
	public static SpecialRule externalAmmoTank = new SpecialRule("External Ammo Tank",
			"This is designed to be used with a weapon with a feed line.");
	public static SpecialRule rechargeable = new SpecialRule("Rechargeable",
			"This item can be recharged from a power supply.");
	
	// Solid Projectile //
	public static final Ammo shotgun_arbites_mag = new Ammo(
			"Arbites Shotgun Mag", 1, 12, Availability.PLENTIFUL);
	public static final Ammo autopistol_mag = new Ammo(
			"Autopistol Mag", 1, 18, Availability.ABUNDANT);
	public static final Ammo autostubber_mag = new Ammo(
			"Autostubber Mag", 1, 36, Availability.PLENTIFUL);
	public static final Ammo combatShotgun_mag = new Ammo(
			"Combat Shotgun Mag", 1, 18, Availability.PLENTIFUL);
	public static final Ammo heavyStubber_mag = new Ammo(
			"Heavy Stubber Mag", 2, 60, Availability.COMMON);
	public static final Ammo heavyStubber_beltBox = new Ammo(
			"Heavy Stubber Belt Box", 3, 200, Availability.AVERAGE)
			.withSpecialRule(externalAmmo);
	public static final Ammo pistol_mag = new Ammo(
			"Pistol Mag", 1, 9, Availability.ABUNDANT);
	public static final Ammo pistol_arbites_mag = new Ammo(
			"Arbites Pistol Mag", 1, 9, null);
	public static final Ammo pumpActionShotgun_mag = new Ammo(
			"Pump-Action Shotgun Mag", 1, 12, Availability.ABUNDANT);
	public static final Ammo stubber_mag = new Ammo(
			"Stubber Mag", 1, 9, Availability.ABUNDANT);
	
	// Las //
	public static final Ammo lascannon_powerPack = new Ammo(
			"Lascannon Power Pack", 2, 40, Availability.VERY_RARE)
			.withSpecialRule(rechargeable);
	public static final Ammo lasgun_powerPack = new Ammo(
			"Lasgun Power Pack", 1, 18, Availability.PLENTIFUL)
			.withSpecialRule(rechargeable);
	public static final Ammo laspistol_powerPack = new Ammo(
			"Laspistol Power Pack", 1, 12, Availability.PLENTIFUL)
			.withSpecialRule(rechargeable);
	public static final Ammo longLas_powerPack = new Ammo(
			"Long Las Power Pack", 1, 20, Availability.SCARCE)
			.withSpecialRule(rechargeable);
	
	// Flame & Plasma //
	public static final Ammo flamer_canister = new Ammo(
			"Flamer Canister", 1, 12, Availability.COMMON);
	public static final Ammo handFlamer_canister = new Ammo(
			"Hand Flamer Canister", 1, 6, Availability.COMMON);
	public static final Ammo plasmaGun_canister = new Ammo(
			"Plasma Gun Canister", 2, 18, Availability.SCARCE);
	public static final Ammo plasmaGun_tank = new Ammo(
			"Plasma Gun Tank", 4, 60, Availability.RARE)
			.withSpecialRule(externalAmmoTank);
	public static final Ammo plasmaPistol_canister = new Ammo(
			"Plasma Pistol Canister", 1, 6, Availability.SCARCE);
	
	// Bolt //
	public static final Ammo boltPistol_mag = new Ammo(
			"Bolt Pistol Mag", 1, -1, null);
}