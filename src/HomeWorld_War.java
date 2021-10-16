class HomeWorld_War extends HomeWorld {

	HomeWorld_War() {
		super("War World");
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