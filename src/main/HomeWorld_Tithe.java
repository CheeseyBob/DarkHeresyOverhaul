package main;

class HomeWorld_Tithe extends HomeWorld {

	HomeWorld_Tithe() {
		super("Tithe World", Characteristic.S, Characteristic.Ag, Characteristic.Int);
		ageTable = new String[] {name, "01-40", "41-80", "81-95", "96-00"};
		buildTable = new String[] {name, "01-10", "11-20", "21-30", "31-40", "41-60", "61-70", "71-80", "81-90", "91-00"};
		complexionTable = new String[] {name, "01-30", "31-65", "66-95", "96-00"};
		eyesTable = new String[] {name, "01-20", "21-40", "41-60", "61-80", "81-85", "86-90", "91-95", "96-00"};
		hairTable = new String[] {name, "01-20", "21-40", "41-60", "61-65", "66-85", "86-90", "91-00"};
		quirksTable = new String[] {"Warts", "Unusual Hair", "Missing Finger", "Unusual Piercing", "Thick Accent", "Aquila Tattoo", "Strange Scar", "Cracked Skin", "Odd Makeup", "Funny Smell"};
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