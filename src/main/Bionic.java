package main;

public class Bionic extends SpecialRule {
	String availability;
	
	Bionic(String name, String description, String availability){
		super(name, description);
		this.availability = availability;
	}
	
	@Override
	public Bionic withParameter(String parameter) {
		Bionic ruleWithParameter = new Bionic(name, description, availability);
		ruleWithParameter.setParameter(parameter);
		return ruleWithParameter;
	}
	
	// Replacements //
	public static final Bionic bionicArm_poorQuality = new Bionic("Bionic Arm (Poor Quality)",
			"Functions as a regular arm. You do not become Stunned or Bleeding Out from critical damage to this arm. Take a -10 penalty to Weapon Skill, Ballistic Skill and Agility when using this arm.",
			"Average");
	public static final Bionic bionicArm = new Bionic("Bionic Arm",
			"Functions as a regular arm. You do not become Stunned or Bleeding Out from critical damage to this arm.",
			"Scarce");
	public static final Bionic bionicArm_goodQuality = new Bionic("Bionic Arm (Good Quality)",
			"Functions as a regular arm. You do not become Stunned or Bleeding Out from critical damage to this arm. Get a +10 bonus to Strength when using this arm.",
			"Rare");
	public static final Bionic bionicArm_bestQuality = new Bionic("Bionic Arm (Best Quality)",
			"Functions and appears as a regular arm (Inspect is required to tell the difference). You do not become Stunned or Bleeding Out from critical damage to this arm. Get a +10 bonus to Strength when using this arm.",
			"Very Rare");
	public static final Bionic bionicLeg_poorQuality = new Bionic("Bionic Leg (Poor Quality)",
			"Functions as a regular leg. You do not become Stunned or Bleeding Out from critical damage to this leg. Take a -10 penalty to any Agility Test involving the use of legs. Fall Prone on critical failures.",
			"Average");
	public static final Bionic bionicLeg = new Bionic("Bionic Leg",
			"Functions as a regular leg. You do not become Stunned or Bleeding Out from critical damage to this leg.",
			"Scarce");
	public static final Bionic bionicLeg_goodQuality = new Bionic("Bionic Leg (Good Quality)",
			"Functions as a regular leg. You do not become Stunned or Bleeding Out from critical damage to this leg. Get a +10 bonus to Agility when using this leg.",
			"Rare");
	public static final Bionic bionicLeg_bestQuality = new Bionic("Bionic Leg (Best QUality)",
			"Functions and appears as a regular leg (Inspect is required to tell the difference). You do not become Stunned or Bleeding Out from critical damage to this leg. Get a +10 bonus to Agility when using this leg.",
			"Very Rare");
	public static final Bionic bionicEye_poorQuality = new Bionic("Bionic Eye (Poor Quality)",
			"Functions as a regular eye. You take at most a -10 penalty from being Dazzled. Take a -10 penalty to any Test which would typically involve vision.",
			"Average");
	public static final Bionic bionicEye_pair_poorQuality = new Bionic("Bionic Eye (Poor Quality)",
			"Functions as a regular eye. You are immune to becoming Dazzled. Take a -10 penalty to any Test which would typically involve vision.",
			"-");
	public static final Bionic bionicEye = new Bionic("Bionic Eye",
			"Functions as a regular eye. You take at most a -10 penalty from being Dazzled.",
			"Scarce");
	public static final Bionic bionicEye_pair = new Bionic("Pair of Bionic Eyes",
			"Functions as a regular pair of eyes. You are immune to becoming Dazzled.",
			"-");
	public static final Bionic bionicEye_goodQuality = new Bionic("Bionic Eye (Good Quality)",
			"Functions as a regular eye. You take at most a -10 penalty from being Dazzled. Get a +10 bonus to all Perception Tests involving vision.",
			"Rare");
	public static final Bionic bionicEye_bestQuality = new Bionic("Bionic Eye (Best Quality)",
			"Functions and appears as a regular eye (Inspect is required to tell the difference). You take at most a -10 penalty from being Dazzled. Get a +10 bonus to all Perception Tests involving vision.",
			"Very Rare");
	public static final Bionic bionicHearing_poorQuality = new Bionic("Bionic Hearing (Poor Quality)",
			"Functions as a regular ear. Take a -10 penalty to any Test which would typically involve hearing.",
			"Average");
	public static final Bionic bionicHearing = new Bionic("Bionic Hearing",
			"Functions as a regular ear.",
			"Scarce");
	public static final Bionic bionicHearing_goodQuality = new Bionic("Bionic Hearing (Good Quality)",
			"Functions as regular ears. Get a +10 bonus to all Perception Tests involving hearing.",
			"Rare");
	public static final Bionic bionicHearing_bestQuality = new Bionic("Bionic Hearing (Best Quality)",
			"Functions and appears as regular ears (Inspect is required to tell the difference). Get a +10 bonus to all Perception Tests involving hearing.",
			"Very Rare");
	public static final Bionic bionicLungs_poorQuality = new Bionic("Bionic Lungs (Poor Quality)",
			"Functions as a pair of lungs. Get a +20 bonus to Resist harmful gases. Take a -10 penalty to Sneak and to Resist becoming Fatigued.",
			"Average");
	public static final Bionic bionicLungs = new Bionic("Bionic Lungs",
			"Functions as a pair of lungs. Get a +20 bonus to Resist harmful gases.",
			"Scarce");
	public static final Bionic bionicLungs_goodQuality = new Bionic("Bionic Lungs (Good Quality)",
			"Functions as a pair of lungs. Get a +30 bonus to Resist harmful gases.",
			"Rare");
	public static final Bionic bionicLungs_bestQuality = new Bionic("Bionic Lungs (Best quality)",
			"Functions as a pair of lungs. Get a +40 bonus to Resist harmful gases.",
			"Very Rare");
	public static final Bionic cerebralImplant_poorQuality = new Bionic("Cerebral Implant (Poor Quality)",
			"Restores brain function, but destroys your personality and memories. Permenantly reduces WS, BS and Agility by 1d10. Intelligence and Fellowship are set to 1d10.",
			"Rare");
	public static final Bionic cerebralImplant = new Bionic("Cerebral Implant",
			"Restores brain function. Permenantly reduces WS, BS and Agility by 1d10. Intelligence and Fellowship are set to 1d10+10.",
			"Very Rare");
	public static final Bionic cerebralImplant_goodQuality = new Bionic("Cerebral Implant (Good Quality)",
			"Restores brain function. Intelligence and Fellowship are set to 2d10+20.",
			"Extremely Rare");
	public static final Bionic cerebralImplant_bestQuality = new Bionic("Cerebral Implant (Best Quality)",
			"Restores brain function. Intelligence and Fellowship are set to 2d10+40.",
			"Near Unique");
	public static final Bionic vocalImplant_poorQuality = new Bionic("Vocal Implant (Poor Quality)",
			"Functions as a voice, which you can amplify greatly. Get a +10 bonus to Intimidate. Take a -10 penalty to Fellowship.",
			"Average");
	public static final Bionic vocalImplant = new Bionic("Vocal Implant",
			"Functions as a voice, which you can amplify greatly. Get a +10 bonus to Intimidate.",
			"Scarce");
	public static final Bionic bionicEverything = new Bionic("Bionic Everything",
			"You are immune to becoming Bleeding Out, Dazzled or Stunned. Get a +20 bonus to Resist harmful gases. Get a +10 bonus to Intimidate.",
			"-");
	public static final Bionic bionicEverything_goodQuality = new Bionic("Bionic Everything (Good Quality)",
			"You are immune to becoming Bleeding Out, Dazzled or Stunned. Get a +20 bonus to Resist harmful gases. Get a +10 bonus to Intimidate. Your Strength, Agility and Perception is increased by 10",
			"-");
	
	// Augmentations //
	public static final Bionic augurArray_poorQuality = new Bionic("Augur Array (Poor Quality)",
			"You can percieve something not normally visible to humans (heat, gases, radiation, etc; choose one). Get a +10 bonus to Perception when looking for this thing.",
			"Scarce");
	public static final Bionic augurArray = new Bionic("Augur Array",
			"You can adjust your vision to perceive the full range of the electromagnetic spectrum, allowing you to see various things not normally visible (heat, gases, radiation, etc.). Get a +10 bonus to Perception.",
			"Rare");
	public static final Bionic augurArray_goodQuality = new Bionic("Augur Array (GoodQuality)",
			"You can adjust your vision to perceive the full range of the electromagnetic spectrum, allowing you to see various things not normally visible (heat, gases, radiation, etc.). Get a +20 bonus to Perception.",
			"Very Rare");
	public static final Bionic augurArray_bestQuality = new Bionic("Augur Array (Best Quality)",
			"You can adjust your vision to perceive the full range of the electromagnetic spectrum, allowing you to see various things not normally visible (heat, gases, radiation, etc.). Get a +30 bonus to Perception.",
			"Extremely Rare");
	public static final Bionic cogitatorImplant = new Bionic("Cogitator Implant",
			"Get a +10 bonus to Contemplate and Reference Lore.",
			"Very Rare");
	public static final Bionic cranialArmour = new Bionic("Cranial Armour",
			"You do not become Stunned or Bleeding Out from critical damage to the head.",
			"Scarce");
	public static final Bionic interfacePort = new Bionic("Interface Port",
			"You can connect to data-slates, cogitators and other tech devices via a data cable. You get a +10 bonus to relevant Tests when doing so.",
			"Scarce");
	public static final Bionic mindImpulseUnit_poorQuality = new Bionic("Mind Impulse Unit (Poor Quality)",
			"Allows you to control certain machines and vehicles via a neural link. Get a +10 bonus to any Test to communicate with or control the thing you are linked to. Establishing a link requires a Willpower Test and you gain 1d10 Insanity on critical failure.",
			"Scarce");
	public static final Bionic mindImpulseUnit = new Bionic("Mind Impulse Unit",
			"Allows you to control certain machines and vehicles via a neural link. Get a +10 bonus to any Test to communicate with or control the thing you are linked to.",
			"Rare");
	public static final Bionic mindImpulseUnit_goodQuality = new Bionic("Mind Impulse Unit (Good Quality)",
			"Allows you to control certain machines and vehicles via a neural link. Get a +20 bonus to any Test to communicate with or control the thing you are linked to.",
			"Very Rare");
	public static final Bionic mindImpulseUnit_bestQuality = new Bionic("Mind Impulse Unit (Best Quality)",
			"Allows you to control certain machines and vehicles via a neural link. Get a +30 bonus to any Test to communicate with or control the thing you are linked to.",
			"Extremely Rare");
	public static final Bionic subskinArmour = new Bionic("Subskin Armour",
			"You do not become Stunned or Bleeding Out from critical damage to the body.",
			"Scarce");
	
	// Mechanicus //
	public static final Bionic mechanicusImplants = new Bionic("Mechanicus Implants",
			"You can install mechadendrites (a number up to your Toughness Bonus), in addition to various other implants.",
			"-");
	public static final Bionic autosanguine = new Bionic("Autosanguine",
			"When you Rest, you automatically pass the Toughness Test with the maximum possible Degrees of Success.",
			"Rare");
	public static final Bionic ferricLure = new Bionic("Ferric Lure",
			"Secondary Action; Call an unsecured metal object of size 2 or less within 20m to your hand. Consumes 1 Power.",
			"Rare");
	public static final Bionic internalReservoir = new Bionic("Internal Reservoir",
			"You can store up to 50 Power, which can be discharged in place of the Luminen Capacitor Toughness Test and can be charged using a power outlet or the Luminen Capacitor.",
			"Rare");
	public static final Bionic luminenCapacitor = new Bionic("Luminen Capacitor",
			"Long Action; Toughness Test; charge an item by 1 Power plus 1 per DoS; become Fatigued on critical failure.",
			"Rare");
	public static final Bionic maglevCoils = new Bionic("Maglev Coils",
			"You can hover up to 1m off the ground, consuming 1 Power/turn, and can move and act normally while doing so. This reduces fall damage and allows you to move in zero-gravity.",
			"Very Rare");
	public static final Bionic mechadendrite = new Bionic("Mechadendrite",
			"You have the chosen mechadendrite.",
			"Very Rare");
	public static final Bionic mechadendrite_ballistic = new Bionic("Mechadendrite (Ballistic)",
			"Counts as an extra arm with a Laspistol which draws power from your Internal Reservoir.",
			"Very Rare");
	public static final Bionic mechadendrite_manipulator = new Bionic("Mechadendrite (Manipulator)",
			"Counts as an extra arm with a +20 bonus to Strength, but is incapable of fine manipulation (typing, etc.).",
			"Very Rare");
	public static final Bionic mechadendrite_medicae = new Bionic("Mechadendrite (Medicae)",
			"Counts as a Tool (+20 bonus) used to treat wounds, perform surgery and administer drugs. Includes a set of 5 injectors.",
			"Very Rare");
	public static final Bionic mechadendrite_optical = new Bionic("Mechadendrite (Optical)",
			"Counts as an optical Tool (+20 bonus) used to examine objects down to a microscopic level or telescopically from a distance. It can extend up to 3m and functions as an extra eye.",
			"Very Rare");
	public static final Bionic mechadendrite_utility = new Bionic("Mechadendrite (Utility)",
			"Counts as a Tool (+20 bonus) used to repair and maintain tech. It can contain 5 doses of Sacred Machine Oil.",
			"Very Rare");
	
}