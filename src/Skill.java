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

	public static final Skill grapple = new Skill("Grapple");
	public static final Skill knockDown = new Skill("Knock Down");
	public static final Skill notice = new Skill("Notice");
	public static final Skill run = new Skill("Run");
}