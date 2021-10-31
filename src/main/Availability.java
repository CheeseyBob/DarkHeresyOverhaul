package main;

enum Availability {
	UBIQUITOUS, ABUNDANT, PLENTIFUL, COMMON, AVERAGE, SCARCE,
	RARE, VERY_RARE, EXTREMELY_RARE, NEAR_UNIQUE, UNIQUE;
	
	private static final String[] NAME_LIST = {
			"Ubiquitous", "Abundant", "Plentiful", "Common", "Average", "Scarce",
			"Rare", "Very Rare", "Extremely Rare", "Near Unique", "Unique"
	};
	private static final String[] MODIFIER_LIST = {
			"Automatic", "+30", "+20", "+10", "+0", "-10",
			"-20", "-30", "-40", "-50", "-60"
	};
	
	public String getModifier() {
		return MODIFIER_LIST[ordinal()];
	}
	
	@Override
	public String toString() {
		return NAME_LIST[ordinal()];
	}
}