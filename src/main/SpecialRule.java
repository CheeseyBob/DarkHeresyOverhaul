package main;

public class SpecialRule {
	String name;
	String parameter = null;
	String description;
	
	SpecialRule(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String getFullName() {
		if(parameter == null) {
			return name;
		} else {
			return name+" ("+parameter+")";
		}
	}
	
	public SpecialRule withParameter(String parameter) {
		SpecialRule ruleWithParameter = new SpecialRule(name, description);
		ruleWithParameter.parameter = parameter;
		return ruleWithParameter;
	}
	
	@Override
	public String toString() {
		return getFullName();
	}
	
	// Mental Disorders //
	public static final SpecialRule phobia = new SpecialRule("Phobia",
			"You must succeed a Willpower Test to interact with this thing. Forced or gratuitous exposure causes a Fear Test.");
	public static final SpecialRule compulsion = new SpecialRule("Compulsion",
			"You must succeed a Willpower Test to not act upon the compulsion.");
	public static final SpecialRule hallucinations = new SpecialRule("Hallucinations",
			"You see and hear things which are not there.");
	public static final SpecialRule delusion = new SpecialRule("Delusion",
			"You believe something false, despite evidence and your better judgement.");
	public static final SpecialRule horrificNightmares = new SpecialRule("Horrific Nightmares",
			"When you Rest after any stressful situation, you must succeed a Willpower Test or become Fatigued.");
}