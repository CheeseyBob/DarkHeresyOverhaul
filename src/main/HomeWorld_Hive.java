package main;

class HomeWorld_Hive extends HomeWorld {

	HomeWorld_Hive() {
		super("Hive World", Characteristic.Per, Characteristic.Fel, Characteristic.T);
		ageTable = new String[] {name, "01-30", "31-85", "86-95", "96-00"};
		buildTable = new String[] {name, "01-20", "21-40", "41-45", "46-60", "61-70", "71-73", "74-88", "89-98", "99-00"};
		complexionTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		eyesTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		hairTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		quirksTable = new String[] {"Grimy Skin", "Outrageous Hair", "Missing Teeth", "Piercings", "Hacking Cough", "Tattoos", "Bullet Scar", "Nervous Tic", "Pollution Scars", "Chemical Smell"};
	}

	@Override
	protected void setSpecialRuleList() {
		specialRuleList.add(Talent.accustomedToDarkness);
		SpecialRule cavesOfMetal = new SpecialRule("Caves of Metal",
				"Get +20 to Navigate when in a hive, underground caves or the like.");
		specialRuleList.add(cavesOfMetal);
		specialRuleList.add(Talent.cluesFromTheCrowds);
		specialRuleList.add(Talent.faceInACrowd);
		specialRuleList.add(Talent.knowledgable.withParameter("Tech"));
		specialRuleList.add(Talent.network);
		specialRuleList.add(Talent.trade_cook);
	}
}