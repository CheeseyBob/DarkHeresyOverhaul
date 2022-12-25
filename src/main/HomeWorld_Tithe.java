package main;

class HomeWorld_Tithe extends HomeWorld {

	HomeWorld_Tithe() {
		super("Tithe World", Characteristic.S, Characteristic.Ag, Characteristic.Int);
		ageTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		buildTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		complexionTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		eyesTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		hairTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		quirksTable = new String[] {"xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx"};
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