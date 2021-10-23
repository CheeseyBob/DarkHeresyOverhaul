package main;
class Skill {
	String name;
	int bonus;
	
	Skill(String name) {
		this.name = name;
	}
	
	Skill(String name, int bonus) {
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
		return getFullName();
	}
	
	// General Skills //
	public static final Skill navigate = new Skill("Navigate");
	public static final Skill notice = new Skill("Notice");
	public static final Skill reflex = new Skill("Reflex");
	public static final Skill run = new Skill("Run");
	
	// Combat Skills //
	public static final Skill dodge = new Skill("Dodge");
	public static final Skill grapple = new Skill("Grapple");
	public static final Skill knockDown = new Skill("Knock Down");
	public static final Skill parry = new Skill("Parry");
	public static final Skill stun = new Skill("Stun");
	
	// Investigation Skills //
	public static final Skill contemplate = new Skill("Contemplate");
	public static final Skill inquire = new Skill("Inquire");
	public static final Skill inspect = new Skill("Inspect");
	public static final Skill interrogate = new Skill("Interrogate");
	public static final Skill referenceCommonLore = new Skill("Ref. Common Lore");
	public static final Skill referenceForbiddenLore = new Skill("Ref. Forbidden Lore");
	public static final Skill referenceScholasticLore = new Skill("Ref. Scholastic Lore");
	public static final Skill search = new Skill("Search");
	
	// Social Skills //
	public static final Skill charm = new Skill("Charm");
	public static final Skill command = new Skill("Command");
	public static final Skill deceive = new Skill("Deceive");
	public static final Skill inspire = new Skill("Inspire");
	public static final Skill intimidate = new Skill("Intimidate");
	public static final Skill persuade = new Skill("Persuade");
	public static final Skill readPerson = new Skill("Read Person");
	
	// Stealth Skills //
	public static final Skill conceal = new Skill("Conceal");
	public static final Skill disguise = new Skill("Disguise");
	public static final Skill hack = new Skill("Hack");
	public static final Skill openLock = new Skill("Open Lock");
	public static final Skill sneak = new Skill("Sneak");
	
	// Specialist Skills //
	public static final Skill administerDrug = new Skill("Administer Drug");
	public static final Skill craft = new Skill("Craft");
	public static final Skill haggle = new Skill("Haggle");
	public static final Skill performSurgery = new Skill("Perform Surgery");
	public static final Skill repair = new Skill("Repair");
	public static final Skill senseImmateruim = new Skill("Sense Immaterium");
	public static final Skill setTrap = new Skill("Set Trap");
	public static final Skill treatWounds = new Skill("Treat Wounds");
	public static final Skill useTech = new Skill("Use Tech");
	public static final Skill wrangle = new Skill("Wrangle");
}