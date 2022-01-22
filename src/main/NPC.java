package main;
import java.util.LinkedList;

public class NPC {
	String id, name;
	
	int wounds, insanity, corruption;
	int weaponSkill, ballisticSkill, strength, toughness, agility, intelligence, perception, willpower, fellowship;
	
	LinkedList<SpecialRule> specialRuleList = new LinkedList<SpecialRule>();
	LinkedList<Skill> skillList = new LinkedList<Skill>();
	LinkedList<Item> equippedItemList = new LinkedList<Item>();
	LinkedList<Item> inventoryList = new LinkedList<Item>();
	LinkedList<String> aptitudeList = new LinkedList<String>();
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
	
	// Example Character Sheet //
	public static final NPC example = exampleCharacterSheet();
	
	private static NPC exampleCharacterSheet() {
		NPC examplePC = new NPC("Boebus Garvel", "46,41,34,35,35,32,35,29,33");
		examplePC.specialRuleList.add(Talent.hipShooting);
		examplePC.specialRuleList.add(Talent.cluesFromTheCrowds);
		examplePC.specialRuleList.add(Talent.educated.withParameter("Judgement"));
		examplePC.specialRuleList.add(Talent.knowledgable.withParameter("Underworld"));
		examplePC.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		examplePC.skillList.add(Skill.grapple.withBonus(10));
		examplePC.skillList.add(Skill.inquire.withBonus(10));
		examplePC.skillList.add(Skill.inspect.withBonus(10));
		examplePC.skillList.add(Skill.interrogate.withBonus(10));
		examplePC.skillList.add(Skill.knockDown.withBonus(10));
		examplePC.skillList.add(Skill.notice.withBonus(10));
		examplePC.skillList.add(Skill.referenceCommonLore.withBonus(10));
		examplePC.skillList.add(Skill.referenceScholasticLore.withBonus(10));
		examplePC.skillList.add(Skill.run.withBonus(20));
		examplePC.equippedItemList.add(Clothing.arbitesUniform);
		examplePC.equippedItemList.add(Armour.carapaceChestplate);
		examplePC.inventoryList.add(MeleeWeapon.shockMaul);
		examplePC.inventoryList.add(RangedWeapon.shotgun_arbites);
		examplePC.inventoryList.add(Ammo.shotgun_arbites_mag);
		examplePC.inventoryList.add(RangedWeapon.pistol_arbites);
		examplePC.inventoryList.add(Ammo.pistol_arbites_mag.times(2));
		examplePC.inventoryList.add(MiscItem.manacles);
		examplePC.inventoryList.add(MiscItem.microBead);
		examplePC.inventoryList.add(MiscItem.lhoSticks);
		examplePC.inventoryList.add(MiscItem.gelt.times(50));
		examplePC.aptitudeList.add("General");
		examplePC.aptitudeList.add("Offence");
		examplePC.aptitudeList.add("Defence");
		examplePC.aptitudeList.add("Finesse");
		examplePC.aptitudeList.add("Ballistic Skill");
		examplePC.aptitudeList.add("Agility");
		examplePC.aptitudeList.add("Perception");
		examplePC.aptitudeList.add("Fellowship");
		examplePC.notes = 
				"Homeworld: Hive World"+"<br>"
				+ "Background: Adeptus Arbites"+"<br>"
				+ "Role: Desperado"+"<br>"
				+ "1 XP to spend"+"<br>";
		return examplePC;
	}
}