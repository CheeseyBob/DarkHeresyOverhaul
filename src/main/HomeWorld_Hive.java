package main;

class HomeWorld_Hive extends HomeWorld {

	HomeWorld_Hive() {
		super("Hive World", Characteristic.Per, Characteristic.Fel, Characteristic.T);
		ageTable = new String[] {name, "01-30", "31-85", "86-95", "96-00"};
		buildTable = new String[] {name, "01-20", "21-40", "41-45", "46-60", "61-70", "71-75", "76-85", "86-95", "96-00"};
		complexionTable = new String[] {name, "01-25", "26-55", "56-80", "81-00"};
		eyesTable = new String[] {name, "01-20", "21-40", "41-60", "61-80", "81-85", "86-90", "91-95", "96-00"};
		hairTable = new String[] {name, "01-15", "16-30", "31-45", "46-55", "56-70", "71-80", "81-00"};
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