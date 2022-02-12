package main;


public enum Aptitude {
	WS, BS, S, T, Ag, Int, Per, WP, Fel,
	General, Offence, Finesse, Defence, Psyker, Tech, Leadership, Fieldcraft, Social, Knowledge;
	
	private static final String[] fullNameList = {
			"Weapon Skill",
			"Ballistic Skill",
			"Strength",
			"Toughness",
			"Agility",
			"Intelligence",
			"Perception",
			"Willpower",
			"Fellowship",
			"General",
			"Offence",
			"Finesse",
			"Defence",
			"Psyker",
			"Tech",
			"Leadership",
			"Fieldcraft",
			"Social",
			"Knowledge",
	};
	
	public String fullName() {
		return fullNameList[ordinal()];
	}
}