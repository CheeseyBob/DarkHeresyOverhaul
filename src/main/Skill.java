package main;


public class Skill {
	public String name;
	public Integer bonus = null;
	public Aptitude aptitude1, aptitude2;
	public boolean isBasic;
	public String usage;
	
	Skill(String name, Aptitude aptitude1, Aptitude aptitude2, boolean isBasic, String usage) {
		this.name = name;
		this.aptitude1 = aptitude1;
		this.aptitude2 = aptitude2;
		this.isBasic = isBasic;
		this.usage = usage;
	}
	
	private Skill(String name, int bonus) {
		this.name = name;
		this.bonus = bonus;
	}
	
	public String getFullName() {
		return name+" (+"+bonus+")";
	}
	
	public Skill withBonus(int bonus) {
		return new Skill(name, bonus);
	}
	
	@Override
	public String toString() {
		if(bonus == null) {
			return name;
		} else {
			return getFullName();
		}
	}
	
	// General Skills //
	public static final Skill navigate = new Skill("Navigate",
			Aptitude.INTELLIGENCE, Aptitude.FIELDCRAFT, true, "Long");
	public static final Skill notice = new Skill("Notice",
			Aptitude.PERCEPTION, Aptitude.GENERAL, true, "Passive");
	public static final Skill reflex = new Skill("Reflex",
			Aptitude.PERCEPTION, Aptitude.GENERAL, true, "Reaction");
	public static final Skill run = new Skill("Run",
			Aptitude.AGILITY, Aptitude.GENERAL, true, "Action");
	
	// Combat Skills //
	public static final Skill dodge = new Skill("Dodge",
			Aptitude.AGILITY, Aptitude.FINESSE, true, "Reaction");
	public static final Skill grapple = new Skill("Grapple",
			Aptitude.STRENGTH, Aptitude.OFFENCE, true, "Action");
	public static final Skill knockDown = new Skill("Knock Down",
			Aptitude.STRENGTH, Aptitude.OFFENCE, true, "Action");
	public static final Skill parry = new Skill("Parry",
			Aptitude.WEAPON_SKILL, Aptitude.DEFENCE, true, "Reaction");
	public static final Skill stun = new Skill("Stun",
			Aptitude.WEAPON_SKILL, Aptitude.OFFENCE, true, "Action");
	
	// Investigation Skills //
	public static final Skill contemplate = new Skill("Contemplate",
			Aptitude.INTELLIGENCE, Aptitude.KNOWLEDGE, true, "Long");
	public static final Skill inquire = new Skill("Inquire",
			Aptitude.FELLOWSHIP, Aptitude.SOCIAL, true, "Long");
	public static final Skill inspect = new Skill("Inspect",
			Aptitude.PERCEPTION, Aptitude.GENERAL, true, "Short");
	public static final Skill interrogate = new Skill("Interrogate",
			Aptitude.WILLPOWER, Aptitude.SOCIAL, true, "Long");
	public static final Skill referenceLore = new Skill("Reference Lore",
			Aptitude.INTELLIGENCE, Aptitude.KNOWLEDGE, true, "Varies");
	@Deprecated
	public static final Skill referenceCommonLore = new Skill("Ref. Common Lore",
			Aptitude.INTELLIGENCE, Aptitude.GENERAL, true, "Varies");
	@Deprecated
	public static final Skill referenceForbiddenLore = new Skill("Ref. Forbidden Lore",
			Aptitude.INTELLIGENCE, Aptitude.KNOWLEDGE, false, "Varies");
	@Deprecated
	public static final Skill referenceScholasticLore = new Skill("Ref. Scholastic Lore",
			Aptitude.INTELLIGENCE, Aptitude.KNOWLEDGE, false, "Varies");
	public static final Skill search = new Skill("Search",
			Aptitude.PERCEPTION, Aptitude.GENERAL, true, "Short");
	
	// Social Skills //
	public static final Skill charm = new Skill("Charm",
			Aptitude.FELLOWSHIP, Aptitude.SOCIAL, true, "Short");
	public static final Skill command = new Skill("Command",
			Aptitude.FELLOWSHIP, Aptitude.LEADERSHIP, true, "Action");
	public static final Skill deceive = new Skill("Deceive",
			Aptitude.FELLOWSHIP, Aptitude.SOCIAL, true, "Passive");
	public static final Skill inspire = new Skill("Inspire",
			Aptitude.FELLOWSHIP, Aptitude.LEADERSHIP, true, "Action");
	public static final Skill intimidate = new Skill("Intimidate",
			Aptitude.STRENGTH, Aptitude.SOCIAL, true, "Action");
	public static final Skill persuade = new Skill("Persuade",
			Aptitude.FELLOWSHIP, Aptitude.SOCIAL, true, "Short");
	public static final Skill readPerson = new Skill("Read Person",
			Aptitude.PERCEPTION, Aptitude.SOCIAL, true, "Passive");
	
	// Stealth Skills //
	public static final Skill conceal = new Skill("Conceal",
			Aptitude.AGILITY, Aptitude.FIELDCRAFT, true, "Action");
	public static final Skill disguise = new Skill("Disguise",
			Aptitude.INTELLIGENCE, Aptitude.SOCIAL, true, "Short");
	public static final Skill hack = new Skill("Hack",
			Aptitude.INTELLIGENCE, Aptitude.TECH, false, "Short");
	public static final Skill unlock = new Skill("Unlock",
			Aptitude.INTELLIGENCE, Aptitude.FIELDCRAFT, false, "Short");
	public static final Skill sneak = new Skill("Sneak",
			Aptitude.AGILITY, Aptitude.FINESSE, true, "Varies");
	
	// Specialist Skills //
	public static final Skill administerDrug = new Skill("Administer Drug",
			Aptitude.INTELLIGENCE, Aptitude.FIELDCRAFT, true, "Action");
	public static final Skill craft = new Skill("Craft",
			Aptitude.INTELLIGENCE, Aptitude.TECH, true, "Long");
	public static final Skill haggle = new Skill("Haggle",
			Aptitude.FELLOWSHIP, Aptitude.SOCIAL, true, "Short");
	public static final Skill performSurgery = new Skill("Perform Surgery",
			Aptitude.INTELLIGENCE, Aptitude.KNOWLEDGE, false, "Long");
	public static final Skill repair = new Skill("Repair",
			Aptitude.INTELLIGENCE, Aptitude.TECH, true, "Long");
	public static final Skill senseImmateruim = new Skill("Sense Immaterium",
			Aptitude.WILLPOWER, Aptitude.PSYKER, false, "Passive");
	public static final Skill setTrap = new Skill("Set Trap",
			Aptitude.INTELLIGENCE, Aptitude.FIELDCRAFT, true, "Short");
	public static final Skill treatWounds = new Skill("Treat Wounds",
			Aptitude.INTELLIGENCE, Aptitude.FIELDCRAFT, false, "Long");
	public static final Skill useTech = new Skill("Use Tech",
			Aptitude.INTELLIGENCE, Aptitude.TECH, false, "Action");
	public static final Skill wrangle = new Skill("Wrangle",
			Aptitude.FELLOWSHIP, Aptitude.FIELDCRAFT, false, "Short");
}