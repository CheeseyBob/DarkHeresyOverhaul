package main;
import java.util.LinkedList;

public class NPC {
	String id, name;
	int size = 7;
	int wounds, insanity, corruption;
	int weaponSkill, ballisticSkill, strength, toughness, agility, intelligence, perception, willpower, fellowship;
	
	LinkedList<SpecialRule> specialRuleList = new LinkedList<SpecialRule>();
	LinkedList<Skill> skillList = new LinkedList<Skill>();
	LinkedList<Item> equippedItemList = new LinkedList<Item>();
	LinkedList<Item> inventoryList = new LinkedList<Item>();
	LinkedList<Aptitude> aptitudeList = new LinkedList<Aptitude>();
	String notes = "";
	
	NPC(String name, String stats) {
		this.id = DHOPrinter.idFrom(name);
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
		wounds = 7;
		insanity = 0;
		corruption = 0;
	}
	
	public int getInventoryCapacity() {
		return size*2;
	}
	
	public int getInventoryMaxSize() {
		return strength+1;
	}
	
	public void setSize(int size) {
		this.size = size;
		this.wounds = size;
	}
	
	public NPC withAptitude(Aptitude aptitude) {
		this.aptitudeList.add(aptitude);
		return this;
	}
	
	public NPC withCorruption(int corruption) {
		this.corruption = corruption;
		return this;
	}
	
	public NPC withInsanity(int insanity) {
		this.insanity = insanity;
		return this;
	}
	
	public NPC withItemEquipped(Item item) {
		equippedItemList.add(item);
		return this;
	}
	
	public NPC withItemInInventory(Item item) {
		inventoryList.add(item);
		return this;
	}
	
	public NPC withNotes(String notes) {
		this.notes = notes;
		return this;
	}
	
	public NPC withSkill(Skill skill) {
		skillList.add(skill);
		return this;
	}
	
	public NPC withSpecialRule(SpecialRule specialRule) {
		specialRuleList.add(specialRule);
		specialRule.onAdd(this);
		return this;
	}
	
	public NPC withWounds(int wounds) {
		this.wounds = wounds;
		return this;
	}
	
	// Example Character Sheet //
	public static final NPC example = new NPC("Example Character", "40,42,40,32,34,32,40,33,24")
			.withAptitude(Aptitude.GENERAL)
			.withAptitude(Aptitude.BALLISTIC_SKILL)
			.withAptitude(Aptitude.DEFENCE)
			.withAptitude(Aptitude.FIELDCRAFT)
			.withAptitude(Aptitude.OFFENCE)
			.withAptitude(Aptitude.STRENGTH)
			.withAptitude(Aptitude.WEAPON_SKILL)
			.withAptitude(Aptitude.WILLPOWER)
			.withSpecialRule(Talent.accustomedToDarkness)
			.withSpecialRule(Talent.experienced.withParameter("Underworld"))
			.withSpecialRule(Talent.language.withParameter("Low Gothic"))
			.withSpecialRule(Talent.peer.withParameter("Underworld"))
			.withSpecialRule(Talent.recoilCompensation)
			.withSkill(Skill.dodge.withBonus(10))
			.withSkill(Skill.intimidate.withBonus(20))
			.withSkill(Skill.notice.withBonus(10))
			.withSkill(Skill.reflex.withBonus(10))
			.withSkill(Skill.run.withBonus(10))
			.withSkill(Skill.sneak.withBonus(10))
			.withItemEquipped(Armour.gangLeathers)
			.withItemEquipped(Clothing.streetClothes)
			.withItemInInventory(RangedWeapon.autopistol)
			.withItemInInventory(Ammo.autopistol_mag)
			.withItemInInventory(Ammo.autopistol_mag)
			.withItemInInventory(MeleeWeapon.chainsword)
			.withItemInInventory(MeleeWeapon.knife)
			.withItemInInventory(MiscItem.glowGlobe)
			.withNotes("Homeworld: Void Born"+"<br>"
				+ "Background: Outcast (Ganger)"+"<br>"
				+ "Role: Warrior"+"<br>"
				+ "Advances: WS +5, BS +10, S +10, T +10, Ag +5, Per +5"+"<br>"
				+ "XP: 5 total,  3 to spend"+"<br>");
}