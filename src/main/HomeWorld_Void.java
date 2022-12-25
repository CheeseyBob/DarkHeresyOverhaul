package main;

class HomeWorld_Void extends HomeWorld {

	HomeWorld_Void() {
		super("Void Born", Characteristic.Int, Characteristic.WP, Characteristic.S);
		ageTable = new String[] {name, "01-40", "41-70", "71-90", "91-00"};
		buildTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		complexionTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		eyesTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		hairTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		quirksTable = new String[] {"Bald", "Long Fingers", "Tiny Ears", "Wide Set Eyes", "Large Head", "Curved Spine", "Hairless", "Elegant Hands", "Flowing Hair", "Stooped Stance"};
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