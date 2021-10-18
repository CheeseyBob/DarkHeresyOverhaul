class HomeWorld_Highborn extends HomeWorld {

	HomeWorld_Highborn() {
		super("Highborn", Characteristic.Int, Characteristic.Fel, Characteristic.T);
	}

	@Override
	protected void setSpecialRuleList() {
		specialRuleList.add(Talent.educated.withParameter("2 Areas"));
		SpecialRule slushFund = new SpecialRule("Slush Fund",
				"On most populated worlds, you have a contact from whom you can Requisition funds.");
		specialRuleList.add(slushFund);
		SpecialRule specialAquisitions = new SpecialRule("Special Aquisitions",
				"On most populated worlds, you have a contact from whom you can Requisition any item with an Availability up to Extremely Rare, though it may take them some time to get things to you.");
		specialRuleList.add(specialAquisitions);
		specialRuleList.add(Talent.naturalExpertise.withParameter("Heraldry"));
		specialRuleList.add(Talent.trade_cook);
		specialRuleList.add(Talent.trade_merchant);
		specialRuleList.add(Talent.trade_performer);
		specialRuleList.add(Talent.trade_valet);
	}
}