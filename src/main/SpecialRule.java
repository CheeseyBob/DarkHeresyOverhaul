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
}