package main;

class HomeWorld_Shrine extends HomeWorld {

	HomeWorld_Shrine() {
		super("Shrine World", Characteristic.WP, Characteristic.Fel, Characteristic.Per);
		ageTable = new String[] {name, "01-40", "41-80", "81-95", "96-00"};
		buildTable = new String[] {name, "01-05", "06-20", "21-25", "26-40", "41-60", "61-75", "76-80", "81-95", "96-00"};
		complexionTable = new String[] {name, "01-30", "31-65", "66-95", "96-00"};
		eyesTable = new String[] {name, "01-20", "21-40", "41-60", "61-80", "81-85", "86-90", "91-95", "96-00"};
		hairTable = new String[] {name, "01-20", "21-40", "41-60", "61-65", "66-85", "86-90", "91-00"};
		quirksTable = new String[] {"Warts", "Bald", "Clipped Ear", "Aquila Piercing", "Hoarse Voice", "Tattooed Scripture", "Devotional Scar", "Quivering Fingers", "Pox Scars", "Sinister Boil"};
	}

	@Override
	protected void setSpecialRuleList() {
		specialRuleList.add(Talent.knowledgable.withParameter("Calixis Sector"));
		specialRuleList.add(Talent.knowledgable.withParameter("Imperial Creed"));
		specialRuleList.add(Talent.publicSpeaker);
		specialRuleList.add(Talent.trade_cook);
		specialRuleList.add(Talent.trade_scrimshaw);
		specialRuleList.add(Talent.trade_sculptor);
	}
}