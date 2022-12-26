package main;

class HomeWorld_War extends HomeWorld {

	HomeWorld_War() {
		super("War World", Characteristic.Ag, Characteristic.Per, Characteristic.Fel);
		ageTable = new String[] {name, "01-65", "66-95", "96-98", "99-00"};
		buildTable = new String[] {name, "01-05", "06-20", "21-25", "26-40", "41-60", "61-75", "76-80", "81-95", "96-00"};
		complexionTable = new String[] {name, "01-30", "31-65", "66-95", "96-00"};
		eyesTable = new String[] {name, "01-20", "21-40", "41-60", "61-80", "81-85", "86-90", "91-95", "96-00"};
		hairTable = new String[] {name, "01-20", "21-40", "41-60", "61-65", "66-85", "86-90", "91-00"};
		quirksTable = new String[] {"Patchy Hair", "Missing Finger", "Missing Ear", "Piercings", "Burn Scar", "Tattoos", "Bullet Scar", "Nervous Tic", "Heavy Scarring", "Slight Limp"};
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