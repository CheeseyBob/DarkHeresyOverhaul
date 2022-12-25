package main;

class HomeWorld_Highborn extends HomeWorld {

	HomeWorld_Highborn() {
		super("Highborn", Characteristic.Int, Characteristic.Fel, Characteristic.T);
		ageTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		buildTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		complexionTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		eyesTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		hairTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		quirksTable = new String[] {"xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx"};
	}

	@Override
	protected void setSpecialRuleList() {
		specialRuleList.add(Talent.educated.withParameter("2 Areas"));
		SpecialRule slushFund = new SpecialRule("Slush Fund",
				"You have a contact from whom you can attempt to Requisition funds.");
		specialRuleList.add(slushFund);
		SpecialRule specialAquisitions = new SpecialRule("Special Aquisitions",
				"You have a contact from whom you can attempt to Requisition any item with an Availability up to Extremely Rare, though it may take them some time to get things to you.");
		specialRuleList.add(specialAquisitions);
		specialRuleList.add(Talent.naturalExpertise.withParameter("Heraldry"));
		specialRuleList.add(Talent.trade_cook);
		specialRuleList.add(Talent.trade_merchant);
		specialRuleList.add(Talent.trade_performer);
		specialRuleList.add(Talent.trade_valet);
	}
}