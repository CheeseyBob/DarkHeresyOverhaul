package main;

class HomeWorld_Forge extends HomeWorld {

	HomeWorld_Forge() {
		super("Forge World", Characteristic.T, Characteristic.Int, Characteristic.Ag);
		ageTable = new String[] {name, "01-45", "46-85", "86-95", "96-00"};
		buildTable = new String[] {name, "01-05", "06-20", "21-25", "26-40", "41-60", "61-75", "76-80", "81-95", "96-00"};
		complexionTable = new String[] {name, "01-25", "26-55", "56-80", "81-00"};
		eyesTable = new String[] {name, "01-20", "21-40", "41-60", "61-80", "81-85", "86-90", "91-95", "96-00"};
		hairTable = new String[] {name, "01-15", "16-30", "31-45", "46-55", "56-70", "71-80", "81-00"};
		quirksTable = new String[] {"Grimy Skin", "Patchy Hair", "Missing Finger", "Skull-Rivets", "Hacking Cough", "Tattoos", "Burn Scars", "Yellow Nails", "Pollution Scars", "Chemical Smell"};
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