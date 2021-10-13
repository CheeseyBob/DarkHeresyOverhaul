class SpecialRule {
	String name;
	String parameter = null;
	String description;
	
	SpecialRule(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	SpecialRule(String name, String parameter, String description) {
		this.name = name;
		this.parameter = parameter;
		this.description = description;
	}
	
	public String getFullName() {
		if(parameter == null) {
			return name;
		} else {
			return name+" ("+parameter+")";
		}
	}
	
	public SpecialRule withParameter(String parameter) {
		return new SpecialRule(name, parameter, description);
	}
}

class Talent {
	// General //
	public static final SpecialRule intimidating = new SpecialRule("Intimidating",
			"When you Intimidate, the maximum aspect level is double your Strength Bonus.");
	
	// Offence //
	
	// Finesse //
	
	// Defence //
	public static final SpecialRule nervesOfSteel = new SpecialRule("Nerves of Steel",
			"Get a +20 bonus to Resist being Frightened, Intimidated and Pinned.");
	
	// Psyker //
	
	// Tech //
	
	// Leadership //
	public static final SpecialRule dominatingBellow = new SpecialRule("Dominating Bellow",
			"When you Intimidate a group, instead of splitting Degrees of Success amongst the targets, all targets up to FBx10m away are affected as if they were the only target.");
	public static final SpecialRule publicSpeaker = new SpecialRule("Public Speaker",
			"When making a Fellowship Test targeting a group, instead of splitting Degrees of Success amongst the targets, all targets up to FBx10m away are affected as if they were the only target.");
	
	// Fieldcraft //
	
	// Social //
	public static final SpecialRule coordinatedInterrogation = new SpecialRule("Coordinated Interrogation",
			"Get a +20 assistance bonus to Interrogate instead of +10 when the other character also has this Talent.");
	
	// Knowledge //
	public static final SpecialRule specialistKnowledge = new SpecialRule("Specialist Knowledge",
			"If you successfully Reference Scholastic Lore, you can spend a Fate Point to reroll and add the Degrees of Success (you still succeed if the reroll fails). You may do this multiple times.");
	public static final SpecialRule language = new SpecialRule("Language",
			"You know this language.");
	public static final SpecialRule knowledgable = new SpecialRule("Knowledgable",
			"Get a +20 bonus to Reference Common Lore for this area.");
	public static final SpecialRule educated = new SpecialRule("Educated",
			"You can Reference Scholastic Lore for this area.");
	public static final SpecialRule expert = new SpecialRule("Expert",
			"For this area, there is no maximum number of points of info revealed when you Reference Scholastic Lore (Identify) and the maximum aspect level is doubled when you Reference Scholastic Lore (Assist).");
	
	// Trades //
}