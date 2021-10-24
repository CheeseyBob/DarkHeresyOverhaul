class HomeWorld_Shrine extends HomeWorld {

	HomeWorld_Shrine() {
		super("Shrine World", Characteristic.WP, Characteristic.Fel, Characteristic.Per);
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