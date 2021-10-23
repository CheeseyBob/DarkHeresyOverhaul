package main;

class HomeWorld_Hive extends HomeWorld {

	HomeWorld_Hive() {
		super("Hive World", Characteristic.Per, Characteristic.Fel, Characteristic.T);
	}

	@Override
	protected void setSpecialRuleList() {
		specialRuleList.add(Talent.accustomedToDarkness);
		SpecialRule cavesOfMetal = new SpecialRule("Caves of Metal",
				"Get +20 to Navigate when in a hive, underground caves or the like.");
		specialRuleList.add(cavesOfMetal);
		specialRuleList.add(Talent.cluesFromTheCrowds);
		specialRuleList.add(Talent.faceInACrowd);
		specialRuleList.add(Talent.knowledgable.withParameter("Tech"));
		specialRuleList.add(Talent.network);
		specialRuleList.add(Talent.trade_cook);
	}
}