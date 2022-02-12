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
			return Aptitude.Offence;
		case BS:
			return Aptitude.Finesse;
		case S:
			return Aptitude.Offence;
		case T:
			return Aptitude.Defence;
		case Ag:
			return Aptitude.Finesse;
		case Int:
			return Aptitude.Knowledge;
		case Per:
			return Aptitude.Fieldcraft;
		case WP:
			return Aptitude.Psyker;
		case Fel:
			return Aptitude.Social;
		default:
			return null;
		}
	}
}