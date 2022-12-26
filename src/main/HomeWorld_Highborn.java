package main;

class HomeWorld_Highborn extends HomeWorld {

	HomeWorld_Highborn() {
		super("Highborn", Characteristic.Int, Characteristic.Fel, Characteristic.T);
		ageTable = new String[] {name, "01-30", "31-70", "71-90", "91-00"};
		buildTable = new String[] {name, "01-05", "06-25", "26-35", "36-40", "41-60", "61-80", "81-85", "86-95", "96-00"};
		complexionTable = new String[] {name, "01-25", "26-55", "56-80", "81-00"};
		eyesTable = new String[] {name, "01-20", "21-40", "41-60", "61-80", "81-85", "86-90", "91-95", "96-00"};
		hairTable = new String[] {name, "01-20", "21-40", "41-60", "61-65", "66-85", "86-90", "91-00"};
		quirksTable = new String[] {"Greasy", "Aquiline Nose", "No Fingernails", "Gem-Studs", "Gold Tooth", "House Tattoo", "Duelling Scar", "Dyed Eyes", "Shrill Voice", "Scented Skin"};
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