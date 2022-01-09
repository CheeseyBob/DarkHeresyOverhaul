package main;

public abstract class Weapon extends Item {
	String damage;

	Weapon(String name, int size, String damage, Availability availability) {
		super(name, size, availability);
		this.damage = damage;
	}
	
	// Special Rules //
	public static SpecialRule ablative = new SpecialRule("Ablative",
			"Hits from this weapon damage cover, armour and other items.");
	public static SpecialRule tearing = new SpecialRule("Tearing",
			"Roll twice for damage and use the highest.");
	
}