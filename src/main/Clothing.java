package main;

class Clothing extends Item {

	Clothing(String name, int size) {
		super(name, size);
	}
	
	public static final Item ragCastings = new Item("Rag Castings", 3);
	public static final Item coveralls = new Item("Coveralls", 3);
	public static final Item uniform = new Item("Uniform", 3);
	public static final Item arbitesUniform = new Item("Arbites Uniform", 3);
	public static final Item enforcerUniform = new Item("Enforcer Uniform", 3);
	public static final Item militaryUniform = new Item("Military Uniform", 3);
	public static final Item bodyglove = new Item("Bodyglove", 3);
	public static final Item imperialRobes = new Item("Imperial Robes", 3);
	public static final Item administratumRobes = new Item("Administratum Robes", 3);
	public static final Item chirurgeonRobes = new Item("Chirurgeon Robes", 3);
	public static final Item mechanicusRobes = new Item("Mechanicus Robes", 3);
	public static final Item ministorumRobes = new Item("Ministorum Robes", 3);
	public static final Item streetClothes = new Item("Street Clothes", 3);
	public static final Item billowRobe = new Item("Billow Robe", 3);
}