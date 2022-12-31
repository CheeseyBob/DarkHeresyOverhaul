package main;

public class Aspect {
	public String name;
	public String bonus, penalty, special, overcome;
	
	public Aspect(String name, String bonus, String penalty, String special, String overcome) {
		this.name = name;
		this.bonus = bonus;
		this.penalty = penalty;
		this.special = special;
		this.overcome = overcome;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	// Common Aspects for Characters //
	public static final Aspect bleedingOut = new Aspect("Bleeding Out", 
			"-",
			"Oppose this aspect",
			"The target makes a Toughness Test once per turn. On failure, the target takes 1 Wound. On critical failure the target instead takes 2 Wounds. The target dies if this causes their Wounds to exceed double their Maximum Wounds.",
			"Rest");
	public static final Aspect burning = new Aspect("Burning", 
			"-",
			"-",
			"Prevents effects of Darkness up to ALx1m away. The target takes 1d10+AL Energy damage once per turn. If the target dies, they create an area of Fire.",
			"Agility Test");
	public static final Aspect charmed = new Aspect("Charmed", 
			"Disposition Tests",
			"-",
			"When downgrading after an hour, permenantly increase the target's Disposition by 1.",
			"Once per hour, or the charmer acts hostile.");
	public static final Aspect concealed = new Aspect("Concealed", 
			"-",
			"Notice or Search vs target",
			"The target can only be detected with a successful Notice or Search.",
			"Target leaves their place of concealment");
	public static final Aspect dazzled = new Aspect("Dazzled", 
			"-",
			"Anything requiring sight:<br>Weapon Skill, Ballistic Skill, Agility and Perception Tests.",
			"-",
			"Resist (Physically), once per turn");
	public static final Aspect  disguised= new Aspect("Disguised", 
			"Deceive (when the deception involves the disguise)",
			"Read Person or Inspect vs target",
			"Characters think the target is who they are disguised as unless they successfully Read Person or Inspect.",
			"Target removes the disguise");
	public static final Aspect encumbered = new Aspect("Encumbered", 
			"-",
			"Anything made harder by restricted movement:<br>Weapon Skill, Ballistic Skill and Agility Tests.",
			"-",
			"Removing the encumbering item.");
	public static final Aspect fatigued = new Aspect("Fatigued", 
			"-",
			"Anything requiring physical exhertion:<br>Weapon Skill, Strength and Agility Tests.",
			"-",
			"Consuming Food (Long Action Toughness Test)");
	public static final Aspect frenzied = new Aspect("Frenzied", 
			"Anything that benefits from furiosity:<br>Weapon Skill and Strength Tests",
			"Anything requiring clear thought, patience or precision:<br>Ballistic Skill, Intelligence, Perception and Fellowship Tests",
			"Prevents target becoming Intimidated Frightened, Pinned or Stunned.",
			"Resist (Mentally), once per turn");
	public static final Aspect frightened = new Aspect("Frightened", 
			"-",
			"Anything requiring composure:<br>Weapon Skill, Ballistic Skill, Strength, Intelligence, Perception, Willpower and Fellowship Tests.",
			"-",
			"Resist (Mentally), once per turn");
	public static final Aspect grappled = new Aspect("Grappled", 
			"-",
			"Anything made harder while grappled:<br>Weapon Skill, Ballistic Skill and Agility Tests",
			"Allows the grappler to use Strength to Attack (Melee), Stun or disarm, and to oppose physical actions target takes.",
			"Grapple (Break) or the grappler lets go.");
	public static final Aspect inspired = new Aspect("Inspired", 
			"Anything improved with confidence:<br>Willpower and Fellowship Tests",
			"-",
			"-",
			"Becoming Intimidated, Frightened or Pinned; automatically, once per hour.");
	public static final Aspect intimidated = new Aspect("Intimidated", 
			"-",
			"Any hostile action against the intimidator.",
			"-",
			"Resist (Mentally), once per turn");
	public static final Aspect pinned = new Aspect("Pinned", 
			"-",
			"-",
			"The target cannot stay in or move into the open in the line of fire of the suppressor.",
			"Resist (Mentally), once per turn");
	public static final Aspect prone = new Aspect("Prone", 
			"Anything improved by having a low profile:<br>Use Cover; Conceal (Self); etc.",
			"Anything requiring freedom of movement:<br>Weapon Skill and Agility Tests",
			"This aspect cannot be upgraded beyond level 1, but provides a +20 bonus / -20 penalty. Also gives a -20 penalty to Agility for Movement.",
			"Stand Up (Secondary Action)");
	public static final Aspect running = new Aspect("Running", 
			"Dodge",
			"-",
			"The target's Movement is increased by 1m per level.",
			"The target takes an Action other than Run.");
	public static final Aspect stunned = new Aspect("Stunned", 
			"-",
			"Anything requiring focus:<br>Weapon Skill, Ballistic Skill, Agility, Intelligence Perception, Willpower and Fellowship Tests.",
			"-",
			"Resist (Physically), once per turn");
	public static final Aspect treated = new Aspect("Treated", 
			"Rest",
			"-",
			"Prevents the effects of Bleeding Out",
			"Rest; taking Wounds");
	
	// Common Aspects for Items //
	public static final Aspect damaged = new Aspect("Damaged", 
			"-",
			"-",
			"Prevents the item being used. The item is destroyed when the aspect level exceeds the Size of the item.",
			"Repair");
	public static final Aspect encrypted = new Aspect("Encrypted",
			"-",
			"Hack",
			"Prevents the item being used.",
			"Hack");
	public static final Aspect jammed = new Aspect("Jammed", 
			"-",
			"-",
			"Prevents the item being used.",
			"Use Tech");
	public static final Aspect locked = new Aspect("Locked", 
			"-",
			"Unlock",
			"Prevents the item being opened.",
			"Unlock");
	public static final Aspect maintained = new Aspect("Maintained", 
			"-",
			"-",
			"Prevents the item becoming Jammed or Out Of Power.",
			"The item becomes Damaged, Jammed or Out Of Power.");
	public static final Aspect outOfPower = new Aspect("Out Of Power", 
			"-",
			"-",
			"Prevents the item being used.",
			"Being charged with Power equal to the item's Size");
	public static final Aspect planted = new Aspect("Planted", 
			"-",
			"Use Tech (Defuse Explosives)",
			"Allows the explosives to be detonated after a set amount of time, or as a Reaction by using a Remote Detonator.",
			"Use Tech (Defuse Explosives)");
	
	// Drug/Poison Aspects //
	public static final Aspect drugged_deTox = new Aspect("Drugged (De-Tox)", 
			"-",
			"-",
			"When this aspect is automatically overcome, all drug/poison aspects on the target are overcome and the target becomes Stunned and Fatigued.",
			"Automatically, once per turn");
	public static final Aspect drugged_frenzon = new Aspect("Drugged (Frenzon)", 
			"-",
			"-",
			"The target becomes Frenzied along with this aspect and cannot overcome Frenzied until this aspect is overcome.",
			"Resist (Physically), once per turn");
	public static final Aspect drugged_obscura = new Aspect("Drugged (Obscura)", 
			"-",
			"Anything which relies upon vision:<br> Weapon Skill, Ballistic Skill, Agility and Perception Tests.",
			"-",
			"Resist (Physically), once per hour");
	public static final Aspect drugged_slaught = new Aspect("Drugged (Slaught)", 
			"Agility and Perception",
			"-",
			"On critical failure to Resist, the target takes 1 Agility damage and 1 Perception damage.",
			"Resist (Physically), once per turn");
	public static final Aspect drugged_spook = new Aspect("Drugged (Spook)", 
			"-",
			"-",
			"While the target has this aspect, they have the Psy Rating 1 Talent and 1 psychic power with no requirements. They take 1 Insanity Point each time they use this power. If the target is a psyker, they instead increase their Psy Rating by 1 and must use all their Psy Rating to increase potency when they Focus Power.",
			"Resist (Physically), once per hour");
	public static final Aspect drugged_stimm = new Aspect("Drugged (Stimm)", 
			"-",
			"-",
			"Prevents penalties from Bleeding Out, Fatigue and Stunned.",
			"Resist (Physically), once per turn");
	public static final Aspect poisoned_fatigue = new Aspect("Poisoned (Fatigue)", 
			"-",
			"-",
			"If the target fails to Resist, they become Fatigued (maximum level is this aspect level).",
			"Resist (Physically), once per turn");
	public static final Aspect poisoned_fatigue_lingering = new Aspect("Poisoned (Lingering Fatigue)", 
			"-",
			"-",
			"If the target fails to Resist, they become Fatigued (maximum level is this aspect level).",
			"Resist (Physically), once per hour");
	public static final Aspect poisoned_lethal = new Aspect("Poisoned (Lethal)", 
			"-",
			"-",
			"If the target fails to Resist, they take Strength and Toughness Damage equal to the aspect level.",
			"Resist (Physically), once per turn");
	public static final Aspect poisoned_lethal_lingering = new Aspect("Poisoned (Lingering Lethal)", 
			"-",
			"-",
			"If the target fails to Resist, they take Strength and Toughness Damage equal to the aspect level.",
			"Resist (Physically), once per hour");
	public static final Aspect poisoned_neurotoxin = new Aspect("Poisoned (Neurotoxin)", 
			"-",
			"-",
			"If the target fails to Resist, they take Intelligence, Perception and Willpower Damage equal to the aspect level.",
			"Resist (Physically), once per turn");
	public static final Aspect poisoned_neurotoxin_lingering = new Aspect("Poisoned (Lingering Neurotoxin)", 
			"-",
			"-",
			"If the target fails to Resist, they take Intelligence, Perception and Willpower Damage equal to the aspect level.",
			"Resist (Physically), once per hour");
	public static final Aspect poisoned_convulsions = new Aspect("Poisoned (Convulsions)", 
			"-",
			"-",
			"If the target fails to Resist, they become Knocked Down.",
			"Resist (Physically), once per turn");
	public static final Aspect poisoned_pain = new Aspect("Poisoned (Pain)", 
			"-",
			"-",
			"If the target fails to Resist, they become Stunned (maximum level is this aspect level).",
			"Resist (Physically), once per turn");
	public static final Aspect poisoned_paralysing = new Aspect("Poisoned (Paralysis)", 
			"-",
			"-",
			"If the target fails to Resist, they take Weapon Skill, Ballistic Skill and Agility Damage equal to the aspect level.",
			"Resist (Physically), once per turn");
	public static final Aspect poisoned_paralysing_lingering = new Aspect("Poisoned (Lingering Paralysis)", 
			"-",
			"-",
			"If the target fails to Resist, they take Weapon Skill, Ballistic Skill and Agility Damage equal to the aspect level.",
			"Resist (Physically), once per hour");
	public static final Aspect poisoned_radiation = new Aspect("Poisoned (Radiation)", 
			"-",
			"-",
			"If the target fails to Resist, they take Characteristic Damage equal to the aspect level on all Characteristics.",
			"Resist (Physically), once per hour");
	public static final Aspect inebriated = new Aspect("Inebriated", 
			"-",
			"Anything requiring focus:<br>Weapon Skill, Ballistic Skill, Agility, Intelligence, Perception, Willpower and Fellowship Tests.",
			"-",
			"Resist (Physically), once per hour");
	
	// Disease Aspects //
	public static final Aspect diseased = new Aspect("Diseased (X)", 
			"-",
			"-",
			"If the target fails to Resist, they take X Characteristic Damage equal to the aspect level and the aspect is upgraded one level.",
			"Resist (Physically), once per Rest");
	
	// Environmental Aspects //
	public static final Aspect darkness = new Aspect("Darkness", 
			"-",
			"Anything that relies on vision:<br>Weapon Skill, Ballistic Skill, Agility and Perception Tests",
			"-",
			"-");
	public static final Aspect difficultTerrain = new Aspect("Difficult Terrain", 
			"-",
			"Agility (including movement)",
			"-",
			"-");
	public static final Aspect fire = new Aspect("Fire", 
			"Ignite",
			"-",
			"Prevents effects of Darkness up to ALx1m away. This aspect will Ignite exposed characters once per turn (Test 10xAL; target becomes Burning). Once per turn, this aspect will consume flammable material and upgrade itself.",
			"Extinguish Fire (Agility); no flammable material");
	public static final Aspect gas_x = new Aspect("Gas (X)", 
			"-",
			"Resist effects of this aspect",
			"Characters in this area Resist (Physically) once per turn, becoming X if they fail.",
			"Dissipate (Test 10/50/90 in enclosed/open/windy area), once per round");
	public static final Aspect smoke = new Aspect("Smoke", 
			"-",
			"Anything that relies on vision:<br>Weapon Skill, Ballistic Skill, Agility and Perception Tests",
			"Characters cannot see through the area beyond PBx1m",
			"Dissipate (Test 10/50/90 in enclosed/open/windy area), once per round");
	public static final Aspect warpRift = new Aspect("Warp Rift", 
			"-",
			"-",
			"Characters within line of sight take AL Insanity Points. Characters in this area take 1d10+AL Corruption Points. Critical Failure to Dissipate spawns a daemon.",
			"Dissipate (Test 20), once per round");
	public static final Aspect warpStorm = new Aspect("Warp Storm", 
			"-",
			"-",
			"Psychic Powers automatically invoke Perils of the Warp.",
			"Dissipate (Test 20), once per round");
	public static final Aspect weakenedVeil = new Aspect("Weakened Veil", 
			"Focus Power and Psychic Phenomena",
			"-",
			"",
			"Dissipate (Test 20), once per round");
	
	// Mental Trauma Aspects //
	public static final Aspect jumpy = new Aspect("Jumpy", 
			"Perception Tests",
			"Willpower Tests",
			"-",
			"Willpower Test (once per day)");
	public static final Aspect withdrawn = new Aspect("Withdrawn", 
			"-",
			"Fellowship Tests",
			"-",
			"Willpower Test (once per day)");
	public static final Aspect sleepless = new Aspect("Sleepless", 
			"-",
			"-",
			"Target becomes Fatigued after they Rest",
			"Willpower Test (once per day)");
	public static final Aspect agitated = new Aspect("Agitated", 
			"-",
			"-",
			"Target must succeed a Willpower Test before any Action or take a -10 penalty.",
			"Willpower Test (once per day)");
	public static final Aspect dishevelled = new Aspect("Dishevelled", 
			"-",
			"All Tests",
			"-",
			"Willpower Test (once per day)");
	public static final Aspect traumatised = new Aspect("Traumatised", 
			"-",
			"All Tests",
			"Target must succeed a Willpower Test in order to take any Action besides Move.",
			"Willpower Test (once per day)");
	
}