package main;

public class Aspect {
	String name;
	String bonus, penalty, special, overcome;
	
	public Aspect(String name, String bonus, String penalty, String special, String overcome) {
		this.name = name;
		this.bonus = bonus;
		this.penalty = penalty;
		this.special = special;
		this.overcome = overcome;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	// Common Aspects for Characters //
	public static final Aspect bleedingOut = new Aspect("Bleeding Out", 
			"-",
			"Oppose this aspect",
			"The target makes a Toughness Test once per turn. On failure, the target takes 1 Wound. On critical failure the target instead takes 2 Wounds. The target dies if this causes their Wounds to exceed double their Maximum Wounds.",
			"Rest");
	// TODO //
	
	// Mental Trauma //
	// TODO //
	
}