package main;

class ThrownWeapon extends Item {

	ThrownWeapon(String name, int size) {
		super(name, size);
	}
	
	public static final Item fragHandGrenade = new Item("Frag Hand-Grenade", 1);
	public static final Item oversizedFragHandGrenade = new Item("Oversized Frag Hand-Grenade", 2);
	public static final Item krakHandGrenade = new Item("Krak Hand-Grenade", 1);
	public static final Item gasHandGrenade_painPoison = new Item("Gas Hand-Grenade (Pain Poison)", 1);
	
}