package main;

class HomeWorld_Void extends HomeWorld {

	HomeWorld_Void() {
		super("Void Born", Characteristic.Int, Characteristic.WP, Characteristic.S);
		ageTable = new String[] {name, "01-40", "41-70", "71-90", "91-00"};
		buildTable = new String[] {name, "01-20", "21-40", "41-60", "61-70", "71-75", "76-85", "86-90", "91-95", "96-00"};
		complexionTable = new String[] {name, "01-05", "06-10", "11-15", "16-00"};
		eyesTable = new String[] {name, "01-05", "06-10", "11-15", "16-20", "21-40", "41-60", "61-80", "81-00"};
		hairTable = new String[] {name, "01-05", "06-10", "11-30", "31-40", "41-60", "61-90", "91-00"};
		quirksTable = new String[] {"Smooth Skin", "Flowing Hair", "Tiny Ears", "Hairless", "Breathy Voice", "Patterned Skin", "Large Eyes", "Long Fingers", "Large Head", "Stooped Stance"};
	}

	@Override
	protected void setSpecialRuleList() {
		specialRuleList.add(Talent.accustomedToDarkness);
		specialRuleList.add(Talent.accustomedToZeroGravity);
		specialRuleList.add(Talent.knowledgable.withParameter("Tech"));
		specialRuleList.add(Talent.mentalResilience);
		specialRuleList.add(Talent.naturalExpertise.withParameter("Astromancy"));
		specialRuleList.add(Talent.resistance.withParameter("Vacuum"));
		SpecialRule touchedByTheWarp = new SpecialRule("Touched By The Warp",
				"You can Sense Immaterium even if you are not a psyker.");
		specialRuleList.add(touchedByTheWarp);
		specialRuleList.add(Talent.trade_voidfarer);
	}
}