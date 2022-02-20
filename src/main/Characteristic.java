package main;


public enum Characteristic {
	WS, BS, S, T, Ag, Int, Per, WP, Fel;
	
	private static final String[] fullNameList = {"Weapon Skill", "Ballistic Skill", "Strength", "Toughness", "Agility", "Intelligence", "Perception", "Willpower", "Fellowship"};
	
	/**
	 * 
	 * @return The name of the Characteristic. E.g. WS.fullName() is "Weapon Skill"
	 */
	public String fullName() {
		return fullNameList[ordinal()];
	}
	
	public Aptitude aptitude1() {
		return Aptitude.values()[ordinal()];
	}
	
	public Aptitude aptitude2() {
		switch(this) {
		case WS:
			return Aptitude.OFFENCE;
		case BS:
			return Aptitude.FINESSE;
		case S:
			return Aptitude.OFFENCE;
		case T:
			return Aptitude.DEFENCE;
		case Ag:
			return Aptitude.FINESSE;
		case Int:
			return Aptitude.KNOWLEDGE;
		case Per:
			return Aptitude.FIELDCRAFT;
		case WP:
			return Aptitude.PSYKER;
		case Fel:
			return Aptitude.SOCIAL;
		default:
			return null;
		}
	}
}