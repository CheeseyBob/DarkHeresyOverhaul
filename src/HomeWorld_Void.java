class HomeWorld_Void extends HomeWorld {

	HomeWorld_Void() {
		super("Void Born");
	}

	@Override
	protected void setSpecialRuleList() {
		specialRuleList.add(Talent.accustomedToDarkness);
		specialRuleList.add(Talent.accustomedToZeroGravity);
		specialRuleList.add(Talent.knowledgable.withParameter("Tech"));
		specialRuleList.add(Talent.naturalExpertise.withParameter("Astromancy"));
		specialRuleList.add(Talent.resistance.withParameter("Vacuum"));
		specialRuleList.add(Talent.strongMind);
		SpecialRule touchedByTheWarp = new SpecialRule("Touched By The Warp",
				"You can Sense Immaterium even if you are not a psyker.");
		specialRuleList.add(touchedByTheWarp);
		specialRuleList.add(Talent.trade_voidfarer);
	}
}