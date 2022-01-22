package main;

public class Personality {
	String name;
	String dispositionZeroDescription;
	SkillResponse[] socialSkillResponseList;
	
	Personality(String name,
			String dispositionZeroDescription,
			SkillResponse[] socialSkillResponseList) {
		this.name = name;
		this.dispositionZeroDescription = dispositionZeroDescription;
		this.socialSkillResponseList = socialSkillResponseList;
	}
	
	static class SkillResponse {
		Skill skill;
		String modifier, success, failure;
		
		SkillResponse(Skill skill, String modifier, String success, String failure) {
			this.skill = skill;
			this.modifier = modifier;
			this.success = success;
			this.failure = failure;
		}
	}
	
	// Personalities //
	public static final Personality vacant = new Personality("Vacant Personality",
			"Becomes unresponsive at Disposition 0.",
			new SkillResponse[] {
					new SkillResponse(Skill.charm, "+0", "+10", "-0"),
					new SkillResponse(Skill.command, "+0", "+0", "-5"),
					new SkillResponse(Skill.deceive, "+0", "+0", "-10"),
					new SkillResponse(Skill.inspire, "+0", "+0", "-0"),
					new SkillResponse(Skill.inquire, "+0", "+5", "-0"),
					new SkillResponse(Skill.intimidate, "+0", "+10", "-10"),
					new SkillResponse(Skill.persuade, "+0", "+0", "-5"),
					new SkillResponse(Skill.readPerson, "+0", "+0", "-0"),
			});
	public static final Personality aggressive = new Personality("Aggressive Personality",
			"Becomes hostile at Disposition 0.",
			new SkillResponse[] {
					new SkillResponse(Skill.charm, "-10", "+5", "-5"),
					new SkillResponse(Skill.command, "-10", "+5", "-20"),
					new SkillResponse(Skill.deceive, "+10", "+0", "-20"),
					new SkillResponse(Skill.inspire, "+0", "+0", "-5"),
					new SkillResponse(Skill.inquire, "-10", "+5", "-10"),
					new SkillResponse(Skill.intimidate, "-10", "+10", "-20"),
					new SkillResponse(Skill.persuade, "-10", "+0", "-5"),
					new SkillResponse(Skill.readPerson, "+20", "+0", "-5"),
			});
}