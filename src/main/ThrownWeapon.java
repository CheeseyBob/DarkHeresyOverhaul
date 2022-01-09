package main;

public class ThrownWeapon extends Weapon {

	ThrownWeapon(String name, int size, String damage, Availability availability) {
		super(name, size, damage, availability);
	}
	
	public ThrownWeapon withSpecialRule(SpecialRule specialRule) {
		return (ThrownWeapon)super.withSpecialRule(specialRule);
	}
	
	// Special Rules //
	public static SpecialRule blast = new SpecialRule("Blast",
			"All characters within N meters of the target are also hit. Dodge is ineffective.");
	public static SpecialRule frag = new SpecialRule("Frag",
			"Each hit counts as N+1 hits.");
	
	// Items //
	public static final ThrownWeapon fragHandGrenade = new ThrownWeapon("Frag Hand-Grenade",
			1, "1d10+2 Explosive", Availability.PLENTIFUL)
			.withSpecialRule(blast.withParameter("3"))
			.withSpecialRule(frag.withParameter("1"));
	public static final ThrownWeapon oversizedFragHandGrenade = new ThrownWeapon("Oversized Frag Hand-Grenade",
			2, "1d10+2 Explosive", Availability.COMMON)
			.withSpecialRule(blast.withParameter("3"))
			.withSpecialRule(frag.withParameter("2"));
	public static final ThrownWeapon krakHandGrenade = new ThrownWeapon("Krak Hand-Grenade",
			1, "2d10+5 Explosive", Availability.COMMON)
			.withSpecialRule(ablative);
	public static final ThrownWeapon gasHandGrenade_painPoison = new ThrownWeapon("Gas Hand-Grenade (Pain Poison)",
			1, "*", Availability.COMMON);
	
}