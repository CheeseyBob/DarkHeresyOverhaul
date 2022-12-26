package main;

class HomeWorld_Feral extends HomeWorld {

	HomeWorld_Feral() {
		super("Feral World", Characteristic.S, Characteristic.T, Characteristic.Fel);
		ageTable = new String[] {name, "01-65", "66-95", "96-98", "99-00"};
		buildTable = new String[] {name, "01", "02-03", "04-05", "06-15", "16-35", "36-45", "46-60", "61-80", "81-00"};
		complexionTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		eyesTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		hairTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		quirksTable = new String[] {"Hairy Knuckles", "Warpaint", "Fangs", "Musky Smell", "Hairy", "Cat's Eyes", "Tribal Tattoos", "Scarring", "Piercing", "Ripped Ears"};
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