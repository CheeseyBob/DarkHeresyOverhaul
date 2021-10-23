package main;

import java.util.LinkedList;

public class Role {
	public String id, name;
	public LinkedList<String> aptitudeList = new LinkedList<String>();
	
	Role(String name, String[] aptitudeList) {
		this.id = DHOPrinter.idFrom(name);
		this.name = name;
		for(String aptitude : aptitudeList) {
			this.aptitudeList.add(aptitude);
		}
	}
	
	public static final Role[] list = {
			new Role("Assassin", 
					new String[] {"General", "Agility", "Ballistic Skill or Weapon Skill", "Fieldcraft", "Finesse", "Perception"}),
			new Role("Desperado", 
					new String[] {"General", "Agility", "Ballistic Skill", "Defence", "Fellowship", "Finesse"}),
			new Role("Healer", 
					new String[] {"General", "Fieldcraft", "Intelligence", "Knowledge", "Strength", "Toughness"}),
			new Role("Herald", 
					new String[] {"General", "Fellowship", "Offence", "Social", "Toughness", "Willpower"}),
			new Role("Mystic", 
					new String[] {"General", "Psyker", "Intelligence", "Knowledge", "Perception", "Willpower"}),
			new Role("Sage", 
					new String[] {"General", "Intelligence", "Knowledge", "Perception", "Tech", "Willpower"}),
			new Role("Seeker", 
					new String[] {"General", "Fellowship", "Intelligence", "Perception", "Social", "Tech"}),
			new Role("Warrior", 
					new String[] {"General", "Ballistic Skill", "Defence", "Offence", "Strength", "Weapon Skill"}),
	};
}