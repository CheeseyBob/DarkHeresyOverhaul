class HomeWorld_Feral extends HomeWorld {

	HomeWorld_Feral() {
		super("Feral World");
	}

	@Override
	protected void setSpecialRuleList() {
		SpecialRule abhuman = new SpecialRule("Abhuman",
				"You belong to one of the standard, stable morphological types of mutant tolerated by the authorities (roll on the Mutations table).");
		specialRuleList.add(abhuman);
		specialRuleList.add(Talent.naturalExpertise.withParameter("Beasts"));
		specialRuleList.add(Talent.resistance.withParameter("Cold/Heat/Poison"));
		specialRuleList.add(Talent.tracker);
		specialRuleList.add(Talent.trade_apothecary);
		specialRuleList.add(Talent.trade_soothsayer);
		specialRuleList.add(Talent.trade_survivalist);
	}
}