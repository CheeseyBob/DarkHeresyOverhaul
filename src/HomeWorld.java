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
}