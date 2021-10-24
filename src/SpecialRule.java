class SpecialRule {
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
}

class Bionic {
	// Replacements //
	public static final SpecialRule bionicArm_poorQuality = new SpecialRule("Bionic Arm (Poor Quality)",
			"Functions as a regular arm. You do not become Stunned or Bleeding Out from critical damage to this arm. Take a -10 penalty to Weapon Skill, Ballistic Skill and Agility when using this arm.");
	public static final SpecialRule bionicArm = new SpecialRule("Bionic Arm",
			"Functions as a regular arm. You do not become Stunned or Bleeding Out from critical damage to this arm.");
	public static final SpecialRule bionicArm_goodQuality = new SpecialRule("Bionic Arm (Good Quality)",
			"Functions as a regular arm. You do not become Stunned or Bleeding Out from critical damage to this arm. Get a +10 bonus to Strength when using this arm.");
	public static final SpecialRule bionicArm_bestQuality = new SpecialRule("Bionic Arm (Best Quality)",
			"Functions and appears as a regular arm (Inspect is required to tell the difference). You do not become Stunned or Bleeding Out from critical damage to this arm. Get a +10 bonus to Strength when using this arm.");
	public static final SpecialRule bionicLeg_poorQuality = new SpecialRule("Bionic Leg (Poor Quality)",
			"Functions as a regular leg. You do not become Stunned or Bleeding Out from critical damage to this leg. Take a -10 penalty to any Agility Test involving the use of legs. Fall Prone on critical failures.");
	public static final SpecialRule bionicLeg = new SpecialRule("Bionic Leg",
			"Functions as a regular leg. You do not become Stunned or Bleeding Out from critical damage to this leg.");
	public static final SpecialRule bionicLeg_goodQuality = new SpecialRule("Bionic Leg (Good Quality)",
			"Functions as a regular leg. You do not become Stunned or Bleeding Out from critical damage to this leg. Get a +10 bonus to Agility when using this leg.");
	public static final SpecialRule bionicLeg_bestQuality = new SpecialRule("Bionic Leg (Best QUality)",
			"Functions and appears as a regular leg (Inspect is required to tell the difference). You do not become Stunned or Bleeding Out from critical damage to this leg. Get a +10 bonus to Agility when using this leg.");
	public static final SpecialRule bionicEye_poorQuality = new SpecialRule("Bionic Eye (Poor Quality)",
			"Functions as a regular eye. You take at most a -10 penalty from being Dazzled. Take a -10 penalty to any Test which would typically involve vision.");
	public static final SpecialRule bionicEye_pair_poorQuality = new SpecialRule("Bionic Eye (Poor Quality)",
			"Functions as a regular eye. You are immune to becoming Dazzled. Take a -10 penalty to any Test which would typically involve vision.");
	public static final SpecialRule bionicEye = new SpecialRule("Bionic Eye",
			"Functions as a regular eye. You take at most a -10 penalty from being Dazzled.");
	public static final SpecialRule bionicEye_pair = new SpecialRule("Pair of Bionic Eyes",
			"Functions as a regular pair of eyes. You are immune to becoming Dazzled.");
	public static final SpecialRule bionicEye_goodQuality = new SpecialRule("Bionic Eye (Good Quality)",
			"Functions as a regular eye. You take at most a -10 penalty from being Dazzled. Get a +10 bonus to all Perception Tests involving vision.");
	public static final SpecialRule bionicEye_bestQuality = new SpecialRule("Bionic Eye (Best Quality)",
			"Functions and appears as a regular eye (Inspect is required to tell the difference). You take at most a -10 penalty from being Dazzled. Get a +10 bonus to all Perception Tests involving vision.");
	public static final SpecialRule bionicHearing_poorQuality = new SpecialRule("Bionic Hearing (Poor Quality)",
			"Functions as a regular ear. Take a -10 penalty to any Test which would typically involve hearing.");
	public static final SpecialRule bionicHearing = new SpecialRule("Bionic Hearing",
			"Functions as a regular ear.");
	public static final SpecialRule bionicHearing_goodQuality = new SpecialRule("Bionic Hearing (Good Quality)",
			"Functions as regular ears. Get a +10 bonus to all Perception Tests involving hearing.");
	public static final SpecialRule bionicHearing_bestQuality = new SpecialRule("Bionic Hearing (Best Quality)",
			"Functions and appears as regular ears (Inspect is required to tell the difference). Get a +10 bonus to all Perception Tests involving hearing.");
	public static final SpecialRule bionicLungs_poorQuality = new SpecialRule("Bionic Lungs (Poor Quality)",
			"Functions as a pair of lungs. Get a +20 bonus to Resist harmful gases. Take a -10 penalty to Sneak and to Resist becoming Fatigued.");
	public static final SpecialRule bionicLungs = new SpecialRule("Bionic Lungs",
			"Functions as a pair of lungs. Get a +20 bonus to Resist harmful gases.");
	public static final SpecialRule bionicLungs_goodQuality = new SpecialRule("Bionic Lungs (Good Quality)",
			"Functions as a pair of lungs. Get a +30 bonus to Resist harmful gases.");
	public static final SpecialRule bionicLungs_bestQuality = new SpecialRule("Bionic Lungs (Best quality)",
			"Functions as a pair of lungs. Get a +40 bonus to Resist harmful gases.");
	public static final SpecialRule cerebralImplant_poorQuality = new SpecialRule("Cerebral Implant (Poor Quality)",
			"Restores brain function, but destroys your personality and memories. Permenantly reduces WS, BS and Agility by 1d10. Intelligence and Fellowship are set to 1d10.");
	public static final SpecialRule cerebralImplant = new SpecialRule("Cerebral Implant",
			"Restores brain function. Permenantly reduces WS, BS and Agility by 1d10. Intelligence and Fellowship are set to 1d10+10.");
	public static final SpecialRule cerebralImplant_goodQuality = new SpecialRule("Cerebral Implant (Good Quality)",
			"Restores brain function. Intelligence and Fellowship are set to 2d10+20.");
	public static final SpecialRule cerebralImplant_bestQuality = new SpecialRule("Cerebral Implant (Best Quality)",
			"Restores brain function. Intelligence and Fellowship are set to 2d10+40.");
	public static final SpecialRule vocalImplant_poorQuality = new SpecialRule("Vocal Implant (Poor Quality)",
			"Functions as a voice, which you can amplify greatly. Get a +10 bonus to Intimidate. Take a -10 penalty to Fellowship.");
	public static final SpecialRule vocalImplant = new SpecialRule("Vocal Implant",
			"Functions as a voice, which you can amplify greatly. Get a +10 bonus to Intimidate.");
	public static final SpecialRule bionicEverything = new SpecialRule("Bionic Everything",
			"You are immune to becoming Bleeding Out, Dazzled or Stunned. Get a +20 bonus to Resist harmful gases. Get a +10 bonus to Intimidate.");
	public static final SpecialRule bionicEverything_goodQuality = new SpecialRule("Bionic Everything (Good Quality)",
			"You are immune to becoming Bleeding Out, Dazzled or Stunned. Get a +20 bonus to Resist harmful gases. Get a +10 bonus to Intimidate. Your Strength, Agility and Perception is increased by 10");
	
	// Augmentations //
	public static final SpecialRule augurArray_poorQuality = new SpecialRule("Augur Array (Poor Quality)",
			"You can percieve something not normally visible to humans (heat, gases, radiation, etc; choose one). Get a +10 bonus to Perception when looking for this thing.");
	public static final SpecialRule augurArray = new SpecialRule("Augur Array",
			"You can adjust your vision to perceive the full range of the electromagnetic spectrum, allowing you to see various things not normally visible (heat, gases, radiation, etc.). Get a +10 bonus to Perception.");
	public static final SpecialRule augurArray_goodQuality = new SpecialRule("Augur Array (GoodQuality)",
			"You can adjust your vision to perceive the full range of the electromagnetic spectrum, allowing you to see various things not normally visible (heat, gases, radiation, etc.). Get a +20 bonus to Perception.");
	public static final SpecialRule augurArray_bestQuality = new SpecialRule("Augur Array (Best Quality)",
			"You can adjust your vision to perceive the full range of the electromagnetic spectrum, allowing you to see various things not normally visible (heat, gases, radiation, etc.). Get a +30 bonus to Perception.");
	public static final SpecialRule cogitatorImplant = new SpecialRule("Cogitator Implant",
			"Get a +10 bonus to Contemplate and Reference Lore.");
	public static final SpecialRule cranialArmour = new SpecialRule("Cranial Armour",
			"You do not become Stunned or Bleeding Out from critical damage to the head.");
	public static final SpecialRule interfacePort = new SpecialRule("Interface Port",
			"You can connect to data-slates, cogitators and other tech devices via a data cable. You get a +10 bonus to relevant Tests when doing so.");
	public static final SpecialRule mindImpulseUnit_poorQuality = new SpecialRule("Mind Impulse Unit (Poor Quality)",
			"Allows you to control certain machines and vehicles via a neural link. Get a +10 bonus to any Test to communicate with or control the thing you are linked to. Establishing a link requires a Willpower Test and you gain 1d10 Insanity on critical failure.");
	public static final SpecialRule mindImpulseUnit = new SpecialRule("Mind Impulse Unit",
			"Allows you to control certain machines and vehicles via a neural link. Get a +10 bonus to any Test to communicate with or control the thing you are linked to.");
	public static final SpecialRule mindImpulseUnit_goodQuality = new SpecialRule("Mind Impulse Unit (Good Quality)",
			"Allows you to control certain machines and vehicles via a neural link. Get a +20 bonus to any Test to communicate with or control the thing you are linked to.");
	public static final SpecialRule mindImpulseUnit_bestQuality = new SpecialRule("Mind Impulse Unit (Best Quality)",
			"Allows you to control certain machines and vehicles via a neural link. Get a +30 bonus to any Test to communicate with or control the thing you are linked to.");
	public static final SpecialRule subskinArmour = new SpecialRule("Subskin Armour",
			"You do not become Stunned or Bleeding Out from critical damage to the body.");
	
	// Mechanicus //
	public static final SpecialRule mechanicusImplants = new SpecialRule("Mechanicus Implants",
			"You can install mechadendrites (a number up to your Toughness Bonus), in addition to various other implants.");
	public static final SpecialRule autosanguine = new SpecialRule("Autosanguine",
			"When you Rest, you automatically pass the Toughness Test with the maximum possible Degrees of Success.");
	public static final SpecialRule ferricLure = new SpecialRule("Ferric Lure",
			"Secondary Action; Call an unsecured metal object of size 2 or less within 20m to your hand. Consumes 1 Power.");
	public static final SpecialRule internalReservoir = new SpecialRule("Internal Reservoir",
			"You can store up to 50 Power, which can be discharged in place of the Luminen Capacitor Toughness Test and can be charged using a power outlet or the Luminen Capacitor.");
	public static final SpecialRule luminenCapacitor = new SpecialRule("Luminen Capacitor",
			"Long Action; Toughness Test; charge an item by 1 Power plus 1 per DoS; become Fatigued on critical failure.");
	public static final SpecialRule maglevCoils = new SpecialRule("Maglev Coils",
			"You can hover up to 1m off the ground, consuming 1 Power/turn, and can move and act normally while doing so. This reduces fall damage and allows you to move in zero-gravity.");
	public static final SpecialRule mechadendrite = new SpecialRule("Mechadendrite",
			"You have the chosen mechadendrite.");
	public static final SpecialRule mechadendrite_ballistic = new SpecialRule("Mechadendrite (Ballistic)",
			"Counts as an extra arm with a Laspistol which draws power from your Internal Reservoir.");
	public static final SpecialRule mechadendrite_manipulator = new SpecialRule("Mechadendrite (Manipulator)",
			"Counts as an extra arm with a +20 bonus to Strength, but is incapable of fine manipulation (typing, etc.).");
	public static final SpecialRule mechadendrite_medicae = new SpecialRule("Mechadendrite (Medicae)",
			"Counts as a Tool (+20 bonus) used to treat wounds, perform surgery and administer drugs. Includes a set of 5 injectors.");
	public static final SpecialRule mechadendrite_optical = new SpecialRule("Mechadendrite (Optical)",
			"Counts as an optical Tool (+20 bonus) used to examine objects down to a microscopic level or telescopically from a distance. It can extend up to 3m and functions as an extra eye.");
	public static final SpecialRule mechadendrite_utility = new SpecialRule("Mechadendrite (Utility)",
			"Counts as a Tool (+20 bonus) used to repair and maintain tech. It can contain 5 doses of Sacred Machine Oil.");
	
}