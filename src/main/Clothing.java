package main;

public class Clothing extends Item {

	Clothing(String name, int size, Availability availability) {
		super(name, size, availability);
	}
	
	public Clothing withSpecialRule(SpecialRule specialRule) {
		return (Clothing)super.withSpecialRule(specialRule);
	}
	
	public static final Clothing ragCastings = new Clothing("Rag Castings",
			3, Availability.UBIQUITOUS);
	public static final Clothing coveralls = new Clothing("Coveralls",
			3, Availability.ABUNDANT);
	public static final Clothing uniform = new Clothing("Uniform",
			3, Availability.PLENTIFUL);
	public static final Clothing arbitesUniform = new Clothing("Arbites Uniform",
			3, Availability.PLENTIFUL);
	public static final Clothing enforcerUniform = new Clothing("Enforcer Uniform",
			3, Availability.PLENTIFUL);
	public static final Clothing militaryUniform = new Clothing("Military Uniform",
			3, Availability.PLENTIFUL);
	public static final Clothing bodyglove = new Clothing("Bodyglove",
			3, Availability.PLENTIFUL);
	public static final Clothing imperialRobes = new Clothing("Imperial Robes",
			3, Availability.PLENTIFUL);
	public static final Clothing administratumRobes = new Clothing("Administratum Robes",
			3, Availability.PLENTIFUL);
	public static final Clothing chirurgeonRobes = new Clothing("Chirurgeon Robes",
			3, Availability.PLENTIFUL);
	public static final Clothing mechanicusRobes = new Clothing("Mechanicus Robes",
			3, Availability.PLENTIFUL);
	public static final Clothing ministorumRobes = new Clothing("Ministorum Robes",
			3, Availability.PLENTIFUL);
	public static final Clothing streetClothes = new Clothing("Street Clothes",
			3, Availability.PLENTIFUL);
	public static final Clothing smartClothes = new Clothing("Smart Clothes",
			3, Availability.PLENTIFUL);
	public static final Clothing billowRobe = new Clothing("Billow Robe",
			3, Availability.VERY_RARE);
}