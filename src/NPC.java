import java.util.LinkedList;

class NPC {
	String id, name;
	
	int wounds, insanity, corruption;
	int weaponSkill, ballisticSkill, strength, toughness, agility, intelligence, perception, willpower, fellowship;
	
	LinkedList<SpecialRule> specialRuleList = new LinkedList<SpecialRule>();
	LinkedList<Skill> skillList = new LinkedList<Skill>();
	LinkedList<Item> equippedItemList = new LinkedList<Item>();
	LinkedList<Item> inventoryList = new LinkedList<Item>();
	
	NPC(String name, String stats) {
		this.id = DarkHeresyOverhaul.stringToID(name);
		this.name = name;
		assignStats(stats);
	}
	
	private void assignStats(String stats) {
		String[] statList = stats.split(",");
		weaponSkill = Integer.parseInt(statList[0]);
		ballisticSkill = Integer.parseInt(statList[1]);
		strength = Integer.parseInt(statList[2]);
		toughness = Integer.parseInt(statList[3]);
		agility = Integer.parseInt(statList[4]);
		intelligence = Integer.parseInt(statList[5]);
		perception = Integer.parseInt(statList[6]);
		willpower = Integer.parseInt(statList[7]);
		fellowship = Integer.parseInt(statList[8]);
		wounds = 5 + 2*(toughness/10);
		insanity = 0;
		corruption = 0;
	}
}