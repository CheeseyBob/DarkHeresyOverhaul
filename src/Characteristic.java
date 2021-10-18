enum Characteristic {
	WS, BS, S, T, Ag, Int, Per, WP, Fel;
	
	private static final String[] fullNameList = {"Weapon Skill", "Ballistic Skill", "Strength", "Toughness", "Agility", "Intelligence", "Perception", "Willpower", "Fellowship"};
	
	public String fullName() {
		return fullNameList[ordinal()];
	}
}