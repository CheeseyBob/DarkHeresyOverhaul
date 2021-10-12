class SpecialRule {
	String name;
	String parameter = null;
	String description;
	
	SpecialRule(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	SpecialRule(String name, String parameter, String description) {
		this.name = name;
		this.parameter = parameter;
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
		return new SpecialRule(name, parameter, description);
	}
	
	public static final SpecialRule language = new SpecialRule("Language", "You know this language.");
}