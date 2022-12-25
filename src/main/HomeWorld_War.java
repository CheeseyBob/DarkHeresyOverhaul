package main;

class HomeWorld_War extends HomeWorld {

	HomeWorld_War() {
		super("War World", Characteristic.Ag, Characteristic.Per, Characteristic.Fel);
		ageTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		buildTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		complexionTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		eyesTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		hairTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		quirksTable = new String[] {"xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx"};
	}

	@Override
	protected void setSpecialRuleList() {
		specialRuleList.add(Talent.firstAider);
		specialRuleList.add(Talent.hardTarget);
		specialRuleList.add(Talent.knowledgable.withParameter("War"));
		specialRuleList.add(Talent.nervesOfSteel);
		specialRuleList.add(Talent.sprinter);
		specialRuleList.add(Talent.trade_survivalist);
	}
}