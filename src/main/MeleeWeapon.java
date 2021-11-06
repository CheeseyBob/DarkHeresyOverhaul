package main;

class MeleeWeapon extends Item {

	MeleeWeapon(String name, int size) {
		super(name, size);
	}
	
	public static final Item unarmed_punch = new Item("Punch", 0);
	public static final Item unarmed_kick = new Item("Kick", 0);
	public static final Item improvisedWeapon_small = new Item("Small Improvised Weapon", 1);
	public static final Item improvisedWeapon_smallish = new Item("Smallish Improvised Weapon", 2);
	public static final Item improvisedWeapon_standard = new Item("Standard Improvised Weapon", 3);
	public static final Item improvisedWeapon_largeish = new Item("Largeish Improvised Weapon", 4);
	public static final Item improvisedWeapon_large = new Item("Large Improvised Weapon", 5);
	public static final Item club = new Item("Club", 3);
	public static final Item knife = new Item("Knife", 1);
	public static final Item hammer = new Item("Hammer", 1);
	public static final Item spear = new Item("Spear", 3);
	public static final Item spear_savage = new Item("Savage Spear", 3);
	public static final Item staff = new Item("Staff", 3);
	public static final Item staff_astraTelepathica = new Item("Astra Telepathica Staff", 3);
	public static final Item staff_mechanicus = new Item("Mechanicus Staff", 3);
	public static final Item longDagger = new Item("Long Dagger", 1);
	public static final Item warHammer = new Item("War Hammer", 3);
	public static final Item warHammer_ecclesiarchy = new Item("Hammer of Doctrine", 3);
	public static final Item greatWarHammer = new Item("Great War Hammer", 4);
	public static final Item shortsword = new Item("Shortsword", 2);
	public static final Item shortsword_ecclesiarchy = new Item("Blade of Piety", 2);
	public static final Item chainsword = new Item("Chainsword", 3);
	public static final Item chainsword_mono = new Item("Mono-Chainsword", 3);
	public static final Item chainsword_mastercrafted = new Item("Mastercrafted Chainsword", 3);
	public static final Item longsword = new Item("Longsword", 3);
	public static final Item longsword_mono = new Item("Mono-Longsword", 3);
	public static final Item shockMaul = new Item("Shock Maul", 3);
	public static final Item shockMaul_mastercrafted = new Item("Mastercrafted Shock Maul", 3);
}