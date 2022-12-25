package main;

class HomeWorld_Forge extends HomeWorld {

	HomeWorld_Forge() {
		super("Forge World", Characteristic.T, Characteristic.Int, Characteristic.Ag);
		ageTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		buildTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		complexionTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		eyesTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		hairTable = new String[] {name, "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx", "xx-xx"};
		quirksTable = new String[] {"xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx", "xxxxxxxx"};
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