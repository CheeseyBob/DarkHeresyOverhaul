package main;

public class Talent extends SpecialRule {
	public static final String UPGRADE_MARK = "†";
	
	String requirement;
	String aptitude;
	int xp;
	
	Talent(String name, String description, String requirement, String aptitude, int xp){
		super(name, description);
		this.requirement = requirement;
		this.aptitude = aptitude;
		this.xp = xp;
	}
	
	@Override
	public Talent withParameter(String parameter) {
		Talent ruleWithParameter = new Talent(name, description, requirement, aptitude, xp);
		ruleWithParameter.parameter = parameter;
		return ruleWithParameter;
	}
	
	// General //
	public static final Talent intimidating = new Talent("Intimidating",
			"When you Intimidate, the maximum aspect level is double your Strength Bonus.",
			"Intimidate (+20)", "Strength", 4);
	public static final Talent rapidReload = new Talent("Rapid Reload",
			"When you Reload, you get double the steps towards reloading your firearm.",
			"-", "Agility", 2);
	public static final Talent sprinter = new Talent("Sprinter",
			"Your maximum bonus Movement is three times your Agility Bonus, rather than two times.",
			"-", "Agility", 2);
	public static final Talent teamFighting = new Talent("Team Fighting",
			"Give double the penalty when you Fend Off or Feint.",
			"-", "Weapon Skill", 2);
	public static final Talent unarmedMaster = new Talent("Unarmed Master",
			"Get a +10 bonus to all unarmed melee attacks.",
			"-", "Weapon Skill", 6);
	public static final Talent weaponFamiliarity_melee = new Talent("Weapon Familiarity",
			"You can maintain this weapon without the Use Tech skill and it does not become Damaged on critical failure when doing so.",
			"-", "Weapon Skill", 2);
	public static final Talent weaponFamiliarity_ranged = new Talent("Weapon Familiarity",
			"You can clear jams and maintain this weapon without the Use Tech skill and it does not become Damaged on critical failure when doing so.",
			"-", "Ballistic Skill", 2);
	public static final Talent weaponMaster_melee = new Talent("Weapon Master",
			"Get a +10 bonus to Weapon Skill when using this weapon. You can maintain this weapon without the Use Tech skill and it does not become Damaged on critical failure when doing so.",
			Talent.weaponFamiliarity_melee+UPGRADE_MARK, "Weapon Skill", 4);
	public static final Talent weaponMaster_ranged = new Talent("Weapon Master",
			"Get a +10 bonus to Ballistic Skill when using the chosen ranged weapon. You can clear jams and maintain this weapon without the Use Tech skill and it does not become Damaged on critical failure when doing so.",
			Talent.weaponFamiliarity_ranged+UPGRADE_MARK, "Ballistic Skill", 4);
	public static final Talent wrestler = new Talent("Wrestler",
			"Get a +10 bonus to Grapple per free hand.",
			"Grapple (+20)", "Strength", 4);
	
	// Offence //
	public static final Talent assaultFire = new Talent("Assault Fire",
			"Full Action; Move and Attack Repeatedly (Ranged) during the movement.",
			"-", "Ballistic Skill", 4);
	public static final Talent battleRage = new Talent("Battle Rage",
			"You do not take a penalty to Dodge or Parry from being Frenzied and you get a +20 bonus to Resist being Frenzied.",
			"Frenzy", "Willpower", 4);
	public static final Talent brutalCharge = new Talent("Brutal Charge",
			"Get double bonus damage when you Charge.",
			"-", "Weapon Skill", 4);
	public static final Talent crushingBlow = new Talent("Crushing Blow",
			"Get double bonus damage when you Attack Heavily (Melee) with a weapon which does Impact damage.",
			"Strength 30", "Strength", 4);
	public static final Talent followThrough = new Talent("Follow-Through",
			"When you make a melee attack, you can spend Degrees of Success to get a +10 bonus to Attack (Melee).",
			"Weapon Skill 40", "Weapon Skill", 4);
	public static final Talent frenzy = new Talent("Frenzy",
			"You can become Frenzied as a Secondary Action (max level equal to Willpower Bonus) and you can choose to not Resist being Frenzied.",
			"-", "Strength", 2);
	public static final Talent furiousAssault = new Talent("Furious Assault",
			"Get a +10 bonus to Attack Repeatedly (Melee) when wielding multiple melee weapons.",
			"-", "Weapon Skill", 4);
	public static final Talent ironFists = new Talent("Iron Fists",
			"Your punches and kicks no longer use the Blunt special rule.",
			"Strength 30", "Strength", 4);
	public static final Talent meleeShooting = new Talent("Melee Shooting",
			"You do not take a penalty for using ranged weapons of Size 1 and 2 in close combat.",
			"-", "Ballistic Skill", 4);
	public static final Talent recoilCompensation = new Talent("Recoil Compensation",
			"Get a +10 bonus to Attack Repeatedly (Ranged) when you fire 3 or more shots with a ranged weapon.",
			"-", "Ballistic Skill", 4);
	public static final Talent stampede = new Talent("Stampede",
			"When you Tackle, you can spend Degrees of Success to continue moving, potentially to a new target. You can continue until you run out of movement or Degrees of Success.",
			"Knock Down (+20)", "Strength", 4);
	public static final Talent strongAttacks = new Talent("Strong Attacks",
			"Use double your Strength Bonus for damage when using a melee weapon two-handed.",
			"-", "Strength", 4);
	public static final Talent stunningBlow = new Talent("Stunning Blow",
			"Full Action; Attack (Melee) with a weapon which does Impact damage; Target becomes Stunned for each Degree of Success (up to Strength Bonus).",
			"Strength 30", "Strength", 4);
	public static final Talent sweepingAttack = new Talent("Sweeping Attack",
			"Full Action; Attack (Melee); all adjacent characters take a hit.",
			"-", "Weapon Skill", 4);
	public static final Talent thunderousCharge = new Talent("Thunderous Charge",
			"When you Stampede, get a +10 bonus to Attack (Melee) per Degree of Success remaining at the end of your movement.",
			"Stampede", "Strength", 4);
	
	// Finesse //
	public static final Talent agileFighter = new Talent("Agile Fighter",
			"You can Dodge melee attacks.",
			"-", "Agility", 4);
	public static final Talent agileStrike = new Talent("Agile Strike",
			"Full Action; Move twice and Attack (Melee) during the movement.",
			"-", "Agility", 4);
	public static final Talent assassinStrike = new Talent("Assassin Strike",
			"Full Action; Attack (Melee); damage dice explode on rolls 1 lower per Degree of Success.",
			"Weapon Skill 40", "Weapon Skill", 8);
	public static final Talent hipShooting = new Talent("Hip Shooting",
			"Full Action; Move twice and Attack (Ranged) during the movement.",
			"-", "Ballistic Skill", 4);
	public static final Talent carefulStrikes = new Talent("Careful Strikes",
			"Get an extra +10 bonus when you make a melee attack after you Aim.",
			"-", "Weapon Skill", 4);
	public static final Talent deftBladesman = new Talent("Deft Bladesman",
			"You can use Agility Bonus instead of Strength Bonus for the damage stat of melee weapons which do Rending damage.",
			"-", "Agility", 4);
	public static final Talent dualWielder = new Talent("Dual-Wielder",
			"When you Attack (Melee), you can spend Degrees of Success to inflict hits from additional weapons you are holding (up to one per weapon).",
			"-", "Weapon Skill", 4);
	public static final Talent effortlessDodge = new Talent("Effortless Dodge",
			"Spend two Degrees of Success on a Dodge to not spend your Reaction.",
			"Dodge (+20)", "Agility", 6);
	public static final Talent effortlessParry = new Talent("Effortless Parry",
			"Spend two Degrees of Success on a Parry to not spend your Reaction.",
			"Parry (+20)", "Weapon Skill", 6);
	public static final Talent gunslinger = new Talent("Gunslinger",
			"When you Attack (Ranged), you can spend Degrees of Success to inflict hits from additional weapons you are holding (up to one per weapon).",
			"-", "Ballistic Skill", 4);
	public static final Talent independentTargeting = new Talent("Independent Targeting",
			"When wielding multiple ranged weapons, you can attack a different target with each weapon and can choose which target to assign each hit to.",
			"Gunslinger", "Ballistic Skill", 6);
	public static final Talent leapUp = new Talent("Leap Up",
			"You can stand up without spending a Secondary Action.",
			"-", "Agility", 2);
	public static final Talent marksman = new Talent("Marksman",
			"Get an extra +10 bonus to Attack (Ranged) when you do so Carefully or after you Focus.",
			"-", "Ballistic Skill", 4);
	public static final Talent martialArtist = new Talent("Martial Artist",
			"The Hits stat of your unarmed attacks are doubled.",
			"-", "Weapon Skill", 4);
	public static final Talent masterGunslinger = new Talent("Master Gunslinger",
			"Get a +10 bonus to all ranged attacks when using multiple weapons.",
			"Gunslinger", "Ballistic Skill", 4);
	public static final Talent quickDraw = new Talent("Quick Draw",
			"Draw your weapon without spending an Action.",
			"-", "Agility", 2);
	public static final Talent riposte = new Talent("Riposte",
			"When you Parry, you can spend Degrees of Success to get a +10 bonus per DoS to Attack (Melee).",
			"Parry (+20)", "Weapon Skill", 4);
	public static final Talent sniperShot = new Talent("Sniper Shot",
			"Full Action; Attack (Ranged); damage dice explode on rolls 1 lower per Degree of Success.",
			"Ballistic Skill 40", "Ballistic Skill", 8);
	public static final Talent swiftBlade = new Talent("Swift Blade",
			"Double the Hits stat of melee weapons which do Rending damage.",
			"-", "Weapon Skill", 4);
	public static final Talent twoWeaponMaster = new Talent("Two-Weapon Master",
			"Get a +10 bonus to all melee attacks when using multiple weapons.",
			"Dual-Wieler", "Weapon Skill", 4);
	
	// Defence //
	public static final Talent adamantiumWill = new Talent("Adamantium Will",
			"Get a +30 bonus to Resist being Frightened, Intimidated and Pinned.",
			"Nerves of Steel"+UPGRADE_MARK, "Willpower", 4);
	public static final Talent constantVigilance = new Talent("Constant Vigilance",
			"You can use Reflex to act before another character even when you are not waiting.",
			"-", "Perception", 8);
	public static final Talent dieHard = new Talent("Die Hard",
			"You get a +20 bonus to the Bleeding Out Toughness Test.",
			"-", "Toughness", 2);
	public static final Talent dirtyFighting = new Talent("Dirty Fighting",
			"When you Stun, the maximum aspect level is double your Weapon Skill Bonus.",
			"Stun (+20)", "Weapon Skill", 4);
	public static final Talent disarm = new Talent("Disarm",
			"Main Action; Weapon Skill Test; Target drops wielded item.",
			"-", "Weapon Skill", 4);
	public static final Talent hardTarget = new Talent("Hard Target",
			"When you are Running, you give a -20 penalty to all ranged attacks against you.",
			"Agility 40", "Agility", 4);
	public static final Talent ignorePain = new Talent("Ignore Pain",
			"You can use Willpower instead of Toughness to Resist being or becoming Stunned.",
			"-", "Willpower", 4);
	public static final Talent mentalFortress = new Talent("Mental Fortress",
			"Get +30 to Resist psychic powers which affect your mind.",
			"Mental Resilience"+UPGRADE_MARK, "Willpower", 4);
	public static final Talent mentalResilience = new Talent("Mental Resilience",
			"Get +20 to Resist psychic powers which affect your mind.",
			"-", "Willpower", 4);
	public static final Talent nervesOfSteel = new Talent("Nerves of Steel",
			"Get a +20 bonus to Resist being Frightened, Intimidated and Pinned.",
			"-", "Willpower", 4);
	public static final Talent numbToPain = new Talent("Numb to Pain",
			"Get a +20 bonus to Resist being or becoming Stunned.",
			"-", "Toughness", 4);
	public static final Talent resistance = new Talent("Resistance",
			"Get a +20 bonus to Resist this.",
			"-", "Toughness", 2);
	public static final Talent soundMind = new Talent("Sound Mind",
			"Get a +20 bonus to Resist taking Insanity Points and Mental Trauma.",
			"-", "Willpower", 4);
	
	// Psyker //
	public static final Talent psyker = new Talent("Psyker",
			"You can take Psy Rating Talents and Psychic Powers.",
			"Willpower 30", "Willpower", 4);
	public static final Talent psyRating1 = new Talent("Psy Rating 1",
			"You can Focus Power with a Psy Rating of 1.",
			"Psyker", "Willpower", 4);
	public static final Talent psyRating2 = new Talent("Psy Rating 2",
			"You can Focus Power with a Psy Rating of 2.",
			"Psy Rating 1", "Willpower", 8);
	public static final Talent psyRating3 = new Talent("Psy Rating 3",
			"You can Focus Power with a Psy Rating of 3.",
			"Psy Rating 2", "Willpower", 12);
	public static final Talent psyRating4 = new Talent("Psy Rating 4",
			"You can Focus Power with a Psy Rating of 4.",
			"Psy Rating 3", "Willpower", 16);
	public static final Talent psyRating5 = new Talent("Psy Rating 5",
			"You can Focus Power with a Psy Rating of 5.",
			"Psy Rating 4", "Willpower", 20);
	public static final Talent drawDeeper = new Talent("Draw Deeper",
			"When you Focus Power, you can add a number of d10 up to your Willpower Bonus to the Potency roll. For each die you add, you give a +10 bonus to Psychic Phenomena.",
			"Psy Rating 2", "Willpower", 8);
	public static final Talent masteredPsychicPower = new Talent("Mastered",
			"Get a +20 bonus to Focus Power for the chosen Psychic Power.",
			"A Psychic Power", "-", 0);
	public static final Talent powerJuggler = new Talent("Power Juggler",
			"You can keep multiple Psychic Powers sustained simultaneously, splitting your Psy Rating between them how you wish.",
			"Psy Rating 2", "Willpower", 8);
	public static final Talent subtlePsyker = new Talent("Subtle Psyker",
			"When you Focus Power, other characters cannot tell you are doing anything unless they successfully Inspect you.",
			"Willpower 40", "Willpower", 4);
	public static final Talent strongConnection = new Talent("Strong Connection",
			"When you Focus Power, you add your Willpower Bonus to the Potency roll.",
			"Psy Rating 1", "Willpower", 4);
	public static final Talent theConstantThreat = new Talent("The Constant Threat",
			"When a character within 10m triggers Psychic Phenomena, you can use Reflex to take your turn before the phenomena is resolved.",
			"Adeptus Astra Telepathica Background", "Perception", 4);
	
	// Tech //
	public static final Talent demolitionsExpert = new Talent("Demolitions Expert",
			"Get a +20 bonus to Use Tech when planting and defusing explosives.",
			"Use Tech (+0)", "Intelligence", 4);
	public static final Talent operate = new Talent("Operate",
			"You can operate this vehicle type.",
			"-", "-", 2);
	public static final Talent operate_ag = new Talent("Operate",
			"You can operate this vehicle type using Agility.",
			"-", "Agility", 2);
	public static final Talent operate_int = new Talent("Operate",
			"You can operate this vehicle type using Intelligence.",
			"-", "Intelligence", 2);
	public static final Talent technicalKnock = new Talent("Technical Knock",
			"Secondary Action; Overcome Jammed on a firearm you are holding.",
			"Use Tech (+0)", "Intelligence", 4);
	public static final Talent weaponTech = new Talent("Weapon-Tech",
			"Get a +20 bonus to Use Tech when you maintain weapons. The weapon does not become Damaged on critical failure when doing so.",
			"Use Tech (+0)", "Intelligence", 4);
	// Tech - Adeptus Mechanicus //
	public static final Talent bloodFiltration = new Talent("Blood Filtration",
			"You get a +20 bonus to Resist chemicals affecting you. You can choose to instead apply a -20 penalty.",
			"Autosanguine Bionic", "Toughness", 4);
	public static final Talent ferricSummons = new Talent("Ferric Summons",
			"Main Action; Willpower Test; You can use Ferric Lure to pull an item from someone's hands (they oppose with Strength); apply range modifiers.",
			"Ferric Lure Bionic", "Willpower", 4);
	public static final Talent luminenBlast = new Talent("Luminen Blast",
			"Main Action; Attack (Ranged) using following stats.<br>" + 
			"Range: 10m;<br>" + 
			"RoF: 1;<br>" + 
			"Damage: 1d10+2 Energy;<br>" + 
			"Shocking: Each Wound inflicted makes the target become Stunned;<br>" + 
			"Consumes 1 Power.",
			"Luminen Shock", "Ballistic Skill", 8);
	public static final Talent luminenShock = new Talent("Luminen Shock",
			"Main Action; Attack (Melee) using the following stats.<br>" + 
			"Bonus: +10;<br>" + 
			"Hits: 1;<br>" + 
			"Damage: 1d10+2 Energy;<br>" + 
			"Shocking: Each Wound inflicted makes the target become Stunned;<br>" + 
			"Consumes 1 Power.",
			"Internal Reservoir Bionic", "Weapon Skill", 6);
	public static final Talent maglevTranscendence = new Talent("Maglev Transcendence",
			"When using your Maglev Coils, you suffer no fall damage and can raise or lower your hover height by 1m each turn, with no maximum height.",
			"Maglev Coils Bionic", "Intelligence", 6);
	public static final Talent prosanguine = new Talent("Prosanguine",
			"Long Action Toughness Test; recover Wounds; become Fatigued on failure.",
			"Autosanguine Bionic", "Toughness", 8);
	
	// Leadership //
	public static final Talent commanding = new Talent("Commanding",
			"When you Command, the maximum bonus to the target's Disposition is doubled, to FBx20.",
			"Command (+20)", "Fellowship", 4);
	public static final Talent dominatingBellow = new Talent("Dominating Bellow",
			"When you Intimidate a group, instead of splitting Degrees of Success amongst the targets, all targets up to FBx10m away are affected as if they were the only target.",
			"Intimidate (+20)", "Strength", 4);
	public static final Talent expandedNetwork = new Talent("Expanded Network",
			"You can maintain an additional number of contacts equal to your Fellowship Bonus. You can take this Talent multiple times.",
			"Networking", "Fellowship", 4);
	public static final Talent haloOfCommand = new Talent("Halo of Command",
			"You can affect those up to FBx100m away when you Command or Inspire.",
			"Public Speaker + Fellowship 40", "Fellowship", 8);
	public static final Talent inspiring = new Talent("Inspiring",
			"When you Inspire, the maximum aspect level is doubled, to FBx2.",
			"Inspire (+20)", "Fellowship", 4);
	public static final Talent intoTheJawsOfHell = new Talent("Into the Jaws of Hell",
			"Allies within FBx10m who can see you get a +20 bonus to Resist being or becoming Frightened, Intimidated or Pinned.",
			"Fellowship 40", "Fellowship", 4);
	public static final Talent ironDiscipline = new Talent("Iron Discipline",
			"Get a +20 bonus to Command to overcome the target being Frightened, Intimidated or Pinned.",
			"Command (+20)", "Fellowship", 4);
	public static final Talent leadByExample = new Talent("Lead By Example",
			"When you overcome Pinning or Fear, allies within FBx10m become Inspired.",
			"-", "Fellowship", 4);
	public static final Talent network = new Talent("Network",
			"Long Action; Fellowship Test; gain a trusted contact in this area; gain Attention on critical failure; you can maintain a number of contacts up to your Fellowship Bonus.",
			"-", "Fellowship", 4);
	public static final Talent publicSpeaker = new Talent("Public Speaker",
			"When making a Fellowship Test targeting a group, instead of splitting Degrees of Success amongst the targets, all targets up to FBx10m away are affected as if they were the only target.",
			"Fellowship 30", "Fellowship", 4);
	
	// Fieldcraft //
	public static final Talent accustomedToDarkness = new Talent("Accustomed to Darkness",
			"You reduce penalties from Darkness by 30.",
			"-", "Perception", 2);
	public static final Talent accustomedToZeroGravity = new Talent("Accustomed to Zero Gravity",
			"You reduce penalties from Zero Gravity by 30.",
			"-", "Agility", 2);
	public static final Talent catfall = new Talent("Catfall",
			"Reduce all fall damage by your Agility Bonus.",
			"Agility 30", "Agility", 2);
	public static final Talent firstAider = new Talent("First Aider",
			"Get a +20 bonus to Treat Wounds when performing first aid.",
			"Treat Wounds (+0)", "Intelligence", 4);
	public static final Talent rideBeast = new Talent("Ride Beast",
			"You can ride riding animals using Agility.",
			"-", "Agility", 2);
	public static final Talent tracker = new Talent("Tracker",
			"Get a +20 bonus to Search when following tracks.",
			"-", "Perception", 2);
	public static final Talent tricksOfTheTrade = new Talent("Tricks of the Trade",
			"When you Unlock, you double the aspect level that you overcome.",
			"Unlock (+20)", "Intelligence", 4);
	public static final Talent quickEntry = new Talent("Quick Entry",
			"You can Unlock in combat as a Full Action.",
			"Unlock (+20)", "Intelligence", 4);
	public static final Talent spotWeakness = new Talent("Spot Weakness",
			"Main Action Perception Test; Create an Aspect which gives a bonus.",
			"Notice (+20)", "Perception", 8);
	
	// Social //
	public static final Talent charming = new Talent("Charming",
			"When you Charm, you double the increase to the target's Disposition.",
			"Charm (+20)", "Fellowship", 4);
	public static final Talent cluesFromTheCrowds = new Talent("Clues from the Crowds",
			"Get a +20 bonus to Inquire when gathering information from a crowd of people.",
			"-", "Perception", 4);
	public static final Talent conversationalist = new Talent("Conversationalist",
			"Get a +10 bonus to all Fellowship Tests when interacting with a single individual.",
			"-", "Fellowship", 8);
	public static final Talent coordinatedInterrogation = new Talent("Coordinated Interrogation",
			"Get a +20 assistance bonus to Interrogate instead of +10 when the other character also has this Talent.",
			"-", "Willpower", 2);
	public static final Talent coverUp = new Talent("Cover-Up",
			"Long Action; Fellowship; divert gained Attention away from your group; gain Attention on critical failure.",
			"-", "Fellowship", 4);
	public static final Talent delicateInterrogation = new Talent("Delicate Interrogation",
			"You can Interrogate instead of Inquire when obtaining information from a target through conversation (though you get no bonuses from interrogation tools).",
			"Interrogate (+20)", "Willpower", 6);
	public static final Talent entrapment = new Talent("Entrapment",
			"You can Read Person (Gain Insight) using Fellowship instead of Perception.",
			"-", "Fellowship", 4);
	public static final Talent faceInACrowd = new Talent("Face in a Crowd",
			"You can use Fellowship instead of Agility when you Sneak in a populated area.",
			"-", "Fellowship", 2);
	public static final Talent logicalCommunicator = new Talent("Logical Communicator",
			"You can Persuade using Intelligence instead of Fellowship.",
			"Intelligence 30", "Intelligence", 4);
	public static final Talent persuasive = new Talent("Persuasive",
			"When you Persuade, the maximum bonus to the target's Disposition is doubled, to FBx20.",
			"Persuade (+20)", "Fellowship", 4);
	public static final Talent peer = new Talent("Peer",
			"Get +20 to all Disposition tests when interacting with members of the chosen group.",
			"-", "Fellowship", 2);
	
	// Knowledge //
	public static final Talent creativeProblemSolving = new Talent("Creative Problem Solving",
			"You can "+Skill.referenceLore+" (Assist) even after you failed to Identify the item or character in question.",
			"Intelligence 40", "Intelligence", 8);
	public static final Talent language = new Talent("Language",
			"You know this language.",
			"-", "Intelligence", 2);
	public static final Talent knowledgable = new Talent("Knowledgable",
			"Get a +20 bonus to "+Skill.referenceLore+" for this area.",
			"-", "General", 2);
	public static final Talent experienced = new Talent("Experienced",
			"Get a +30 bonus to "+Skill.referenceLore+" for this area. When you "+Skill.referenceLore+" (Identify), you get double the number of points of info.",
			Talent.knowledgable+UPGRADE_MARK, "General", 4);
	public static final Talent educated = new Talent("Educated",
			"You can "+Skill.referenceLore+" for this area.",
			"-", "Intelligence", 2);
	public static final Talent specialist = new Talent("Specialist",
			"Get a +10 bonus to "+Skill.referenceLore+" for this area. When you "+Skill.referenceLore+" (Identify), you get double the number of points of info.",
			Talent.educated+UPGRADE_MARK, "Intelligence", 4);
	public static final Talent expert = new Talent("Expert",
			"Get a +20 bonus to "+Skill.referenceLore+" for this area. When you "+Skill.referenceLore+" (Identify), you get double the number of points of info and, if you are successful, you can spend a Fate Point to reroll and add the Degrees of Success together (you still succeed if the reroll fails and may do this multiple times).",
			Talent.specialist+UPGRADE_MARK, "Intelligence", 6);
	public static final Talent naturalExpertise = new Talent("Natural Expertise",
			"You treat this area as a common lore area.",
			"Character Creation Only", "Intelligence", 4);
	public static final Talent unveiledSecrets = new Talent("Unveiled Secrets",
			"You can "+Skill.referenceLore+" for this area.",
			"Forbidden Lore (+0)", "Intelligence", 4);
	public static final Talent darkSecrets = new Talent("Dark Secrets",
			"Get a +10 bonus to "+Skill.referenceLore+" for this area. When you "+Skill.referenceLore+" (Identify), you get double the number of points of info.",
			Talent.unveiledSecrets+UPGRADE_MARK, "Intelligence", 6);
	public static final Talent deepestSecrets = new Talent("Deepest Secrets",
			"Get a +20 bonus to "+Skill.referenceLore+" for this area. When you "+Skill.referenceLore+" (Identify), you get double the number of points of info and, if you are successful, you can spend a Fate Point to reroll and add the Degrees of Success together (you still succeed if the reroll fails and may do this multiple times).",
			Talent.darkSecrets+UPGRADE_MARK, "Intelligence", 8);
	
	// Trades //
	public static final Talent trade = new Talent("Trade",
			"You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "-", 2);
	public static final Talent trade_agriWorker = new Talent("Trade (Agri Worker)",
			"Grow, care for, and harvest crops and animals. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Strength", 2);
	public static final Talent trade_apothecary = new Talent("Trade (Apothecary)",
			"Blend and prepare herbal remedies. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Fieldcraft", 2);
	public static final Talent trade_archeologist = new Talent("Trade (Archaeologist)",
			"Locate, examine and analyse ancient ruins and artefacts. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Knowldege", 2);
	public static final Talent trade_armourer = new Talent("Trade (Armourer)",
			"Design, upgrade and forge weaponry. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Tech", 2);
	public static final Talent trade_astrographer = new Talent("Trade (Astrographer)",
			"Create two- and three-dimensional maps of stellar locations and Warp routes. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Intelligence", 2);
	public static final Talent trade_cartographer = new Talent("Trade (Cartographer)",
			"Take measurements and turn them into maps. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Intelligence", 2);
	public static final Talent trade_chymist = new Talent("Trade (Chymist)",
			"Create poisons, drugs and other compounds. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Intelligence", 2);
	public static final Talent trade_cryptographer = new Talent("Trade (Cryptographer)",
			"Create or decode ciphers, codes and other puzzles. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Intelligence", 2);
	public static final Talent trade_cook = new Talent("Trade (Cook)",
			"Cook meals and inspect food. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Perception", 2);
	public static final Talent trade_copyist = new Talent("Trade (Copyist)",
			"Copy text, illuminate manuscripts and forge written material. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Perception", 2);
	public static final Talent trade_linguist = new Talent("Trade (Linguist)",
			"Create and decipher spoken and written languages. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Intelligence", 2);
	public static final Talent trade_loremancer = new Talent("Trade (Loremancer)",
			"Recount legendary events as entertainment or education. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Social", 2);
	public static final Talent trade_mason = new Talent("Trade (Mason)",
			"Assess and construct buildings. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Perception", 2);
	public static final Talent trade_merchant = new Talent("Trade (Merchant)",
			"Find, bargain and sell trade goods. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Social", 2);
	public static final Talent trade_miner = new Talent("Trade (Miner)",
			"Extract minerals, maintain mines and identify mining hazards. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Strength", 2);
	public static final Talent trade_morticator = new Talent("Trade (Morticator)",
			"Prepare, preserve and render down corpse remains into ingredients. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Knowledge", 2);
	public static final Talent trade_performer = new Talent("Trade (Performer)",
			"Perform for an audience. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Social", 2);
	public static final Talent trade_prospector = new Talent("Trade (Prospector)",
			"Find and identify valuable minerals. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Perception", 2);
	public static final Talent trade_scrimshaw = new Talent("Trade (Scrimshaw)",
			"Inscribe patterns, text and art onto things. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Perception", 2);
	public static final Talent trade_sculptor = new Talent("Trade (Sculptor)",
			"Create inspiring works of art in stone, metal and other materials. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Perception", 2);
	public static final Talent trade_shipwright = new Talent("Trade (Shipwright)",
			"Design, upgrade and manufacture void-capable vessels. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Tech", 2);
	public static final Talent trade_soothsayer = new Talent("Trade (Soothsayer)",
			"Give the appearance of telling the future. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Social", 2);
	public static final Talent trade_survivalist = new Talent("Trade (Survivalist)",
			"Scavenge and create primitive items from scavenged materials. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Fieldcraft", 2);
	public static final Talent trade_swindler = new Talent("Trade (Swindler)",
			"Aquire wealth through trickery and deception. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Social", 2);
	public static final Talent trade_technomat = new Talent("Trade (Technomat)",
			"Repair, maintain and manufacture technological devices. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Tech", 2);
	public static final Talent trade_valet = new Talent("Trade (Valet)",
			"Refine the appearance, give droll asides and tend to the needs of superiors in a gentlemanly fashion. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Social", 2);
	public static final Talent trade_voidfarer = new Talent("Trade (Voidfarer)",
			"The day-to-day operation, logistics and defence of starships. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Tech", 2);
	public static final Talent trade_wright = new Talent("Trade (Wright)",
			"Design, upgrade and manufacture vehicles. You can Craft and Repair and get a +20 bonus to other Tests when relevant.",
			"Character Creation Only", "Tech", 2);
}