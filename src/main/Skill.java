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
			Aptitude.Int, Aptitude.Fieldcraft, true, "Long");
	public static final Skill notice = new Skill("Notice",
			Aptitude.Per, Aptitude.General, true, "Passive");
	public static final Skill reflex = new Skill("Reflex",
			Aptitude.Per, Aptitude.General, true, "Reaction");
	public static final Skill run = new Skill("Run",
			Aptitude.Ag, Aptitude.General, true, "Action");
	
	// Combat Skills //
	public static final Skill dodge = new Skill("Dodge",
			Aptitude.Ag, Aptitude.Finesse, true, "Reaction");
	public static final Skill grapple = new Skill("Grapple",
			Aptitude.S, Aptitude.Offence, true, "Action");
	public static final Skill knockDown = new Skill("Knock Down",
			Aptitude.S, Aptitude.Offence, true, "Action");
	public static final Skill parry = new Skill("Parry",
			Aptitude.WS, Aptitude.Defence, true, "Reaction");
	public static final Skill stun = new Skill("Stun",
			Aptitude.WS, Aptitude.Offence, true, "Action");
	
	// Investigation Skills //
	public static final Skill contemplate = new Skill("Contemplate",
			Aptitude.Int, Aptitude.Knowledge, true, "Long");
	public static final Skill inquire = new Skill("Inquire",
			Aptitude.Fel, Aptitude.Social, true, "Long");
	public static final Skill inspect = new Skill("Inspect",
			Aptitude.Per, Aptitude.General, true, "Short");
	public static final Skill interrogate = new Skill("Interrogate",
			Aptitude.WP, Aptitude.Social, true, "Long");
	public static final Skill referenceLore = new Skill("Reference Lore",
			Aptitude.Int, Aptitude.Knowledge, true, "Varies");
	// TODO - combine the three lore skills into one.
	public static final Skill referenceCommonLore = new Skill("Ref. Common Lore",
			Aptitude.Int, Aptitude.General, true, "Varies");
	public static final Skill referenceForbiddenLore = new Skill("Ref. Forbidden Lore",
			Aptitude.Int, Aptitude.Knowledge, false, "Varies");
	public static final Skill referenceScholasticLore = new Skill("Ref. Scholastic Lore",
			Aptitude.Int, Aptitude.Knowledge, false, "Varies");
	public static final Skill search = new Skill("Search",
			Aptitude.Per, Aptitude.General, true, "Short");
	
	// Social Skills //
	public static final Skill charm = new Skill("Charm",
			Aptitude.Fel, Aptitude.Social, true, "Short");
	public static final Skill command = new Skill("Command",
			Aptitude.Fel, Aptitude.Leadership, true, "Action");
	public static final Skill deceive = new Skill("Deceive",
			Aptitude.Fel, Aptitude.Social, true, "Passive");
	public static final Skill inspire = new Skill("Inspire",
			Aptitude.Fel, Aptitude.Leadership, true, "Action");
	public static final Skill intimidate = new Skill("Intimidate",
			Aptitude.S, Aptitude.Social, true, "Action");
	public static final Skill persuade = new Skill("Persuade",
			Aptitude.Fel, Aptitude.Social, true, "Short");
	public static final Skill readPerson = new Skill("Read Person",
			Aptitude.Per, Aptitude.Social, true, "Passive");
	
	// Stealth Skills //
	public static final Skill conceal = new Skill("Conceal",
			Aptitude.Ag, Aptitude.Fieldcraft, true, "Action");
	public static final Skill disguise = new Skill("Disguise",
			Aptitude.Int, Aptitude.Social, true, "Short");
	public static final Skill hack = new Skill("Hack",
			Aptitude.Int, Aptitude.Tech, false, "Short");
	public static final Skill unlock = new Skill("Unlock",
			Aptitude.Int, Aptitude.Fieldcraft, false, "Short");
	public static final Skill sneak = new Skill("Sneak",
			Aptitude.Ag, Aptitude.Finesse, true, "Varies");
	
	// Specialist Skills //
	public static final Skill administerDrug = new Skill("Administer Drug",
			Aptitude.Int, Aptitude.Fieldcraft, true, "Action");
	public static final Skill craft = new Skill("Craft",
			Aptitude.Int, Aptitude.Tech, true, "Long");
	public static final Skill haggle = new Skill("Haggle",
			Aptitude.Fel, Aptitude.Social, true, "Short");
	public static final Skill performSurgery = new Skill("Perform Surgery",
			Aptitude.Int, Aptitude.Knowledge, false, "Long");
	public static final Skill repair = new Skill("Repair",
			Aptitude.Int, Aptitude.Tech, true, "Long");
	public static final Skill senseImmateruim = new Skill("Sense Immaterium",
			Aptitude.WP, Aptitude.Psyker, false, "Passive");
	public static final Skill setTrap = new Skill("Set Trap",
			Aptitude.Int, Aptitude.Fieldcraft, true, "Short");
	public static final Skill treatWounds = new Skill("Treat Wounds",
			Aptitude.Int, Aptitude.Fieldcraft, false, "Long");
	public static final Skill useTech = new Skill("Use Tech",
			Aptitude.Int, Aptitude.Tech, false, "Action");
	public static final Skill wrangle = new Skill("Wrangle",
			Aptitude.Fel, Aptitude.Fieldcraft, false, "Short");
}