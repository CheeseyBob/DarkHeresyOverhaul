package main;

class HomeWorld_Feral extends HomeWorld {

	HomeWorld_Feral() {
		super("Feral World", Characteristic.S, Characteristic.T, Characteristic.Fel);
		ageTable = new String[] {name, "01-65", "66-95", "96-98", "99-00"};
		buildTable = new String[] {name, "01-05", "06-15", "16-20", "21-35", "36-45", "46-55", "56-65", "66-80", "81-00"};
		complexionTable = new String[] {name, "01-30", "31-65", "66-95", "96-00"};
		eyesTable = new String[] {name, "01-15", "16-30", "31-45", "46-60", "61-75", "76-90", "91-95", "96-00"};
		hairTable = new String[] {name, "01-20", "21-40", "41-60", "61-65", "66-85", "86-90", "91-00"};
		quirksTable = new String[] {"Dyed Skin", "Hairy", "Ripped Ears", "Piercings", "Fangs", "Tribal Tattoos", "Scarring", "Cat's Eyes", "Warpaint", "Musky Smell"};
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