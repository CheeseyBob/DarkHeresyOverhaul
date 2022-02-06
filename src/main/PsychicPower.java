package main;

public class PsychicPower extends SpecialRule {
	String requirement;
	int xp;
	
	PsychicPower(String name, String description, String requirement, int xp){
		super(name, description);
		this.requirement = requirement;
		this.xp = xp;
	}
	
	@Override
	public PsychicPower withParameter(String parameter) {
		PsychicPower ruleWithParameter = new PsychicPower(name, description, requirement, xp);
		ruleWithParameter.parameter = parameter;
		return ruleWithParameter;
	}
	
	// Biomancy //
	// TODO //
	
	// Divination //
	// TODO //
	
	// Pyromancy //
	// TODO //
	
	// Telekinesis //
	public static final PsychicPower telekineticControl = new PsychicPower("Telekinetic Control",
			"Main Action; Sustained; +20 bonus. Target a Small (Size 1) object within P+10m. You can crudely manipulate it and move it up to P meters. You can spend 5 Potency to increase the Size by 1.",
			"-", 1);
	public static final PsychicPower telekineticPunch = new PsychicPower("Telekinetic Punch",
			"Main Action; +20 bonus. Target within P+10m becomes Stunned. You can spend 10 Potency to increase the aspect level by 1.",
			"-", 1);
	public static final PsychicPower telekineticShove = new PsychicPower("Telekinetic Shove",
			"Main Action; +20 bonus. Target within P+10m becomes Prone. You can spend 10 Potency to give a -10 penalty to oppose this. You can spend 1 Potency to push the target 1m if they fail to oppose.",
			"-", 1);
	public static final PsychicPower boltOfForce = new PsychicPower("Bolt of Force",
			"Main Action; +0 bonus. Target within 10m takes a hit dealing P Impact damage. You can spend 1 Potency to increase the range by 5m.",
			"Telekinetic Punch", 2);
	public static final PsychicPower deflect = new PsychicPower("Deflect",
			"Reaction; +0 bonus. Reduce the damage of one hit you take by P.",
			"-", 2);
	public static final PsychicPower psyBlade = new PsychicPower("Psy-Blade",
			"Main Action; Sustained; +0 bonus. Target within WB meters takes a hit dealing P Rending damage. You can spend 10 Potency to give a -10 penalty to Dodge.",
			"Telekinetic Punch", 2);
	public static final PsychicPower restrain = new PsychicPower("Restrain",
			"Main Action; Sustained; +0 bonus. Target within WB meters becomes Grappled by an intangible force with P+20 Strength. You can spend 1 Potency to increase the range by WB meters. While the power is sustained, in addition to repeating the effect, you can take Actions and Reactions for the force.",
			"Telekinetic Control", 2);
	public static final PsychicPower telekineDash = new PsychicPower("Telekine Dash",
			"Full Action; Sustained; +0 bonus. Set your bonus movement value to WB meters, then Move twice. You can spend 10 Potency to increase your bonus movement by WB meters.",
			"-", 2);
	public static final PsychicPower crush = new PsychicPower("Crush",
			"Main Action; -10 penalty. While Restrain is sustained, instead of repeating the effect of Restrain, you can use this power on the target (Restrain stays sustained). Target takes P Impact damage, ignoring Armour.",
			"Restrain", 4);
	public static final PsychicPower hurl = new PsychicPower("Hurl",
			"Full Action; +0 bonus. Target within 10m takes a hit from a Small (Size 1) Thrown Weapon you are holding, with a +P bonus to damage. You can spend 1 Potency to increase the range by 5m. You can spend 5 Potency to instead use a dropped item within 5m, or to increase the Size by 1.",
			"Bolt of Force", 4);
	public static final PsychicPower psyBullets = new PsychicPower("Psy-Bullets",
			"Main Action; +0 bonus. Target within Px10m takes a hit for each Potency die, dealing Impact damage equal to that die plus your Willpower Bonus.",
			"Bolt of Force", 4);
	public static final PsychicPower telekineShield = new PsychicPower("Telekine Shield",
			"Main Action; Sustained; -10 penalty. Create a barrier around yourself which counts as Full Cover with P Armour Points.",
			"Deflect", 4);
	public static final PsychicPower thunderclap = new PsychicPower("Thunderclap",
			"Main Action; -10 penalty. Pick a location up to P+10m away. All characters within WB meters of this location become Stunned. You can spend 10 Potency to increase the area by WB meters, or give a -10 penalty to oppose this.",
			"Telekinetic Punch", 4);
	public static final PsychicPower waveOfForce = new PsychicPower("Wave of Force",
			"Main Action; +0 bonus. All characters within 5m in a 30 degree arc become Prone and are pushed P meters if they fail to oppose. You can spend 1 Potency to increase the range by 1m, or spend 10 Potency to give a -10 Penalty to oppose this.",
			"Telekinetic Shove", 4);
	public static final PsychicPower wallOfForce = new PsychicPower("Wall of Force",
			"Main Action; Sustained; -10 penalty. Create a barrier P meters wide. Any character attempting to pass through must succeed a Strength Test. You can spend 10 Potency to give a -10 penalty to these Tests.",
			"Restrain", 4);
	
	// Telepathy //
	// TODO //
	
	// Wytchcraft //
	public static final PsychicPower corruptingWhispers = new PsychicPower("Corrupting Whispers",
			"	xxxxx inflict Corruption Points (target can resist with WP) xxxxx",
			"", -1);
	public static final PsychicPower counter = new PsychicPower("Counter",
			"	xxxxx Oppose Focus Power xxxxx",
			"", -1);
	public static final PsychicPower wytchEar = new PsychicPower("Wytch Ear",
			"	xxxxx Touch an object and then hear from it xxxxx",
			"", -1);
	public static final PsychicPower fickle = new PsychicPower("Fickle",
			"	xxxxx Manipulate luck by giving rerolls xxxxx",
			"", -1);
	public static final PsychicPower dreadVisage = new PsychicPower("Dread Visage",
			"	xxxxx That one that gives you a Fear Rating xxxxx",
			"", -1);
	public static final PsychicPower weakenVeil = new PsychicPower("Weaken Veil",
			"",
			"", -1);
	public static final PsychicPower warpRift = new PsychicPower("Warp Rift",
			"",
			"", -1);
	public static final PsychicPower blink = new PsychicPower("Blink",
			"	xxxxx disappear while the power is sustained. psychic phenomena cause you to drift in a random direction.(?) xxxxx",
			"", -1);
	public static final PsychicPower fourtyWinks = new PsychicPower("Fourty Winks",
			"	xxxxx disappear, then reappear in the same spot hours later. the character experiences 1d10 turns in this time. xxxxx",
			"", -1);
	public static final PsychicPower gateOfInfinity = new PsychicPower("Gate of Infinity",
			"	xxxxx [2e, p209] xxxxx",
			"", -1);
	
}