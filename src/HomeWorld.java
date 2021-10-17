import java.util.LinkedList;

abstract class HomeWorld {
	String id, name;
	LinkedList<SpecialRule> specialRuleList = new LinkedList<SpecialRule>();
	
	HomeWorld(String name) {
		this.id = DarkHeresyOverhaul.idFrom(name);
		this.name = name;
		setSpecialRuleList();
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