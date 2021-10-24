class HomeWorld_Forge extends HomeWorld {

	HomeWorld_Forge() {
		super("Forge World", Characteristic.T, Characteristic.Int, Characteristic.Ag);
	}

	@Override
	protected void setSpecialRuleList() {
		specialRuleList.add(Talent.knowledgable.withParameter("Tech"));
		specialRuleList.add(Bionic.bionicArm);
		specialRuleList.add(Bionic.bionicEye);
		specialRuleList.add(Bionic.bionicLeg);
		specialRuleList.add(Bionic.bionicLungs);
		specialRuleList.add(Bionic.interfacePort);
		specialRuleList.add(Bionic.vocalImplant);
	}
}