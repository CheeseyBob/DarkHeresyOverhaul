import java.util.LinkedList;

abstract class HomeWorld {
	String id, name;
	Characteristic bonusCharacteristic1, bonusCharacteristic2, penaltyCharacteristic;
	LinkedList<SpecialRule> specialRuleList = new LinkedList<SpecialRule>();
	
	HomeWorld(String name, Characteristic bonus1, Characteristic bonus2, Characteristic penalty) {
		this.id = DarkHeresyOverhaul.idFrom(name);
		this.name = name;
		this.bonusCharacteristic1 = bonus1;
		this.bonusCharacteristic2 = bonus2;
		this.penaltyCharacteristic = penalty;
		setSpecialRuleList();
	}
	
	public String getAptitudes() {
		return bonusCharacteristic1.fullName()+" or "+bonusCharacteristic2.fullName();
	}
	
	protected abstract void setSpecialRuleList();
	
	public static final HomeWorld[] list = {
			new HomeWorld_Feral(),
			new HomeWorld_Forge(),
			new HomeWorld_Highborn(),
			new HomeWorld_Hive(),
			new HomeWorld_Shrine(),
			new HomeWorld_Tithe(),
			new HomeWorld_Void(),
			new HomeWorld_War()
	};
}