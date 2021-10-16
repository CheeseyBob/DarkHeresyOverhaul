class HomeWorld_Tithe extends HomeWorld {

	HomeWorld_Tithe() {
		super("Tithe World");
	}

	@Override
	protected void setSpecialRuleList() {
		specialRuleList.add(Talent.operate_int.withParameter("Wheeled/Tracked/Walker"));
		specialRuleList.add(Talent.resistance.withParameter("Cold/Heat/Poison"));
		specialRuleList.add(Talent.naturalExpertise.withParameter("Beasts"));
		specialRuleList.add(Talent.trade_agriWorker);
		specialRuleList.add(Talent.trade_cook);
		specialRuleList.add(Talent.trade_miner);
		specialRuleList.add(Talent.trade_prospector);
	}
}