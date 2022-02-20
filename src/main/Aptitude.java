package main;


public enum Aptitude {
	WEAPON_SKILL, BALLISTIC_SKILL, STRENGTH, TOUGHNESS, AGILITY, INTELLIGENCE, PERCEPTION, WILLPOWER, FELLOWSHIP,
	GENERAL, OFFENCE, FINESSE, DEFENCE, PSYKER, TECH, LEADERSHIP, FIELDCRAFT, SOCIAL, KNOWLEDGE;
	
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