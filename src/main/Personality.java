package main;

public class Personality {
	String name, description;
	String dispositionZeroDescription;
	SkillResponse[] socialSkillResponseList;
	
	Personality(String name,
			String description,
			String dispositionZeroDescription,
			SkillResponse... socialSkillResponseList) {
		this.name = name;
		this.description = description;
		this.dispositionZeroDescription = dispositionZeroDescription;
		this.socialSkillResponseList = socialSkillResponseList;
	}
	
	static class SkillResponse {
		Skill skill;
		String modifier, failure;
		
		SkillResponse(Skill skill, String modifier, String failure) {
			this.skill = skill;
			this.modifier = modifier;
			this.failure = failure;
		}
	}
	
	// Personalities //
	public static final Personality bilious = new Personality("Bilious",
			"Suspicious and angry, yet very watchful and aware.",
			"Becomes hostile.",
			new SkillResponse(Skill.charm, "-10", "-5"),
			new SkillResponse(Skill.command, "-10", "-20"),
			new SkillResponse(Skill.deceive, "-10", "-20"),
			new SkillResponse(Skill.inspire, "+0", "-5"),
			new SkillResponse(Skill.inquire, "-10", "-10"),
			new SkillResponse(Skill.intimidate, "+0", "-20"),
			new SkillResponse(Skill.persuade, "-10", "-5"),
			new SkillResponse(Skill.readPerson, "+10", "-5")
	);
	public static final Personality choleric = new Personality("Choleric",
			"Active, takes charge, yet easy to anger.",
			"Becomes hostile.",
			new SkillResponse(Skill.charm, "+0", "-5"),
			new SkillResponse(Skill.command, "-10", "-20"),
			new SkillResponse(Skill.deceive, "+0", "-20"),
			new SkillResponse(Skill.inspire, "+0", "-5"),
			new SkillResponse(Skill.inquire, "+0", "-5"),
			new SkillResponse(Skill.intimidate, "-10", "-20"),
			new SkillResponse(Skill.persuade, "+0", "-5"),
			new SkillResponse(Skill.readPerson, "+10", "-5")
	);
	public static final Personality cardinal = new Personality("Cardinal",
			"Seeks balance in all things, yet often cannot choose a path forward.",
			"Becomes unresponsive.",
			new SkillResponse(Skill.charm, "+10", "-5"),
			new SkillResponse(Skill.command, "+10", "-5"),
			new SkillResponse(Skill.deceive, "+10", "-10"),
			new SkillResponse(Skill.inspire, "+0", "-5"),
			new SkillResponse(Skill.inquire, "+10", "-5"),
			new SkillResponse(Skill.intimidate, "+0", "-10"),
			new SkillResponse(Skill.persuade, "+10", "-5"),
			new SkillResponse(Skill.readPerson, "+0", "-5")
	);
	public static final Personality fixed = new Personality("Fixed",
			"Solid, unyielding and definitive in all things.",
			"Bluntly refuses conversation.",
			new SkillResponse(Skill.charm, "+0", "-5"),
			new SkillResponse(Skill.command, "-10", "-10"),
			new SkillResponse(Skill.deceive, "-10", "-10"),
			new SkillResponse(Skill.inspire, "-10", "-5"),
			new SkillResponse(Skill.inquire, "+0", "-5"),
			new SkillResponse(Skill.intimidate, "-10", "-10"),
			new SkillResponse(Skill.persuade, "-10", "-5"),
			new SkillResponse(Skill.readPerson, "+20", "-5")
	);
	public static final Personality melancholic = new Personality("Melancholic",
			"Thoughtful, introspective and prone to depression.",
			"Mumbles unintelligibly.",
			new SkillResponse(Skill.charm, "+10", "-5"),
			new SkillResponse(Skill.command, "+10", "-10"),
			new SkillResponse(Skill.deceive, "-10", "-10"),
			new SkillResponse(Skill.inspire, "-10", "-5"),
			new SkillResponse(Skill.inquire, "+10", "-5"),
			new SkillResponse(Skill.intimidate, "+10", "-10"),
			new SkillResponse(Skill.persuade, "+0", "-5"),
			new SkillResponse(Skill.readPerson, "+0", "-5")
	);
	public static final Personality mutable = new Personality("Mutable",
			"Unpredictable, undisciplined and rebellious.",
			"Becomes hostile.",
			new SkillResponse(Skill.charm, "+10", "-10"),
			new SkillResponse(Skill.command, "-10", "-20"),
			new SkillResponse(Skill.deceive, "+0", "-10"),
			new SkillResponse(Skill.inspire, "+0", "-5"),
			new SkillResponse(Skill.inquire, "+10", "-5"),
			new SkillResponse(Skill.intimidate, "+0", "-10"),
			new SkillResponse(Skill.persuade, "+0", "-5"),
			new SkillResponse(Skill.readPerson, "+0", "-5")
	);
	public static final Personality phlegmatic = new Personality("Phlegmatic",
			"Practical, careful, yet very reserved.",
			"Flees or becomes unresponsive.",
			new SkillResponse(Skill.charm, "+0", "-5"),
			new SkillResponse(Skill.command, "+0", "-20"),
			new SkillResponse(Skill.deceive, "+0", "-10"),
			new SkillResponse(Skill.inspire, "+0", "-5"),
			new SkillResponse(Skill.inquire, "-10", "-5"),
			new SkillResponse(Skill.intimidate, "+0", "-10"),
			new SkillResponse(Skill.persuade, "+0", "-5"),
			new SkillResponse(Skill.readPerson, "+0", "-5")
	);
	public static final Personality sanguine = new Personality("Sanguine",
			"Confident, optimistic, yet prone to dreams and whimsy.",
			"Bluntly refuses conversation.",
			new SkillResponse(Skill.charm, "+10", "-5"),
			new SkillResponse(Skill.command, "+10", "-10"),
			new SkillResponse(Skill.deceive, "+10", "-10"),
			new SkillResponse(Skill.inspire, "+10", "-5"),
			new SkillResponse(Skill.inquire, "+0", "-5"),
			new SkillResponse(Skill.intimidate, "+0", "-10"),
			new SkillResponse(Skill.persuade, "+10", "-5"),
			new SkillResponse(Skill.readPerson, "+10", "-5")
	);
	public static final Personality supine = new Personality("Supine",
			"Loyal, devout yet easily led.",
			"Flees or mumbles unintelligibly.",
			new SkillResponse(Skill.charm, "+10", "-5"),
			new SkillResponse(Skill.command, "+10", "-5"),
			new SkillResponse(Skill.deceive, "+10", "-5"),
			new SkillResponse(Skill.inspire, "+10", "-5"),
			new SkillResponse(Skill.inquire, "+10", "-5"),
			new SkillResponse(Skill.intimidate, "+10", "-5"),
			new SkillResponse(Skill.persuade, "+10", "-5"),
			new SkillResponse(Skill.readPerson, "+10", "-5")
	);
	public static final Personality vacant = new Personality("Vacant",
			"Hardly a personality at all.",
			"Becomes unresponsive.",
			new SkillResponse(Skill.charm, "+0", "-0"),
			new SkillResponse(Skill.command, "+0", "-5"),
			new SkillResponse(Skill.deceive, "+0", "-5"),
			new SkillResponse(Skill.inspire, "+0", "-0"),
			new SkillResponse(Skill.inquire, "+0", "-0"),
			new SkillResponse(Skill.intimidate, "+0", "-10"),
			new SkillResponse(Skill.persuade, "+0", "-5"),
			new SkillResponse(Skill.readPerson, "+0", "-0")
	);
}