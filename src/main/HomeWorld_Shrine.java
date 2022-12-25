package main;

class HomeWorld_Shrine extends HomeWorld {

	HomeWorld_Shrine() {
		super("Shrine World", Characteristic.WP, Characteristic.Fel, Characteristic.Per);
		ageTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		buildTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		complexionTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		eyesTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		hairTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		quirksTable = new String[] {"xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx"};
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