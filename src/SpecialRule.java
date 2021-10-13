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
}

class Talent {
	// General //
	public static final SpecialRule intimidating = new SpecialRule("Intimidating",
			"When you Intimidate, the maximum aspect level is double your Strength Bonus.");
	public static final SpecialRule rapidReload = new SpecialRule("Rapid Reload",
			"When you Reload, you get double the steps towards reloading your firearm.");
	public static final SpecialRule sprinter = new SpecialRule("Sprinter",
			"Your maximum bonus Movement is three times your Agility Bonus, rather than two times.");
	public static final SpecialRule teamFighting = new SpecialRule("Team Fighting",
			"Give double the penalty when you Fend Off or Feint.");
	public static final SpecialRule unarmedMaster = new SpecialRule("Unarmed Master",
			"Get a +10 bonus to all unarmed melee attacks.");
	public static final SpecialRule weaponFamiliarity_ranged = new SpecialRule("Weapon Familiarity",
			"You can clear jams and maintain the chosen weapon without the Use Tech skill. The weapon does not become Damaged on critical failure when doing so.");
	public static final SpecialRule weaponFamiliarity_melee = new SpecialRule("Weapon Familiarity",
			"You can maintain the chosen weapon without the Use Tech skill. The weapon does not become Damaged on critical failure when doing so.");
	public static final SpecialRule weaponMaster_ranged = new SpecialRule("Weapon Master",
			"Get a +10 bonus to Weapon Skill when using the chosen melee weapon.");
	public static final SpecialRule weaponMaster_melee = new SpecialRule("Weapon Master",
			"Get a +10 bonus to Ballistic Skill when using the chosen ranged weapon.");
	public static final SpecialRule wrestler = new SpecialRule("Wrestler",
			"Get a +10 bonus to Grapple per free hand.");
	
	// Offence //
	public static final SpecialRule assaultFire = new SpecialRule("Assault Fire",
			"Full Action; Move and Attack Repeatedly (Ranged) during the movement.");
	public static final SpecialRule battleRage = new SpecialRule("Battle Rage",
			"You do not take a penalty to Dodge or Parry from being Frenzied and you get a +20 bonus to Resist being Frenzied.");
	public static final SpecialRule brutalCharge = new SpecialRule("Brutal Charge",
			"Get double bonus damage when you Charge.");
	public static final SpecialRule crushingBlow = new SpecialRule("Crushing Blow",
			"Get double bonus damage when you Attack Heavily (Melee) with a weapon which does Impact damage.");
	public static final SpecialRule followThrough = new SpecialRule("Follow-Through",
			"When you make a melee attack, you can spend Degrees of Success to get a +10 bonus to Attack (Melee).");
	public static final SpecialRule frenzy = new SpecialRule("Frenzy",
			"You can become Frenzied as a Secondary Action (max level equal to Willpower Bonus) and you can choose to not Resist being Frenzied.");
	public static final SpecialRule furiousAssault = new SpecialRule("Furious Assault",
			"Get a +10 bonus to Attack Repeatedly (Melee) when wielding multiple melee weapons.");
	public static final SpecialRule ironFists = new SpecialRule("Iron Fists",
			"Your punches and kicks no longer use the Blunt special rule.");
	public static final SpecialRule meleeShooting = new SpecialRule("Melee Shooting",
			"You do not take a penalty for using ranged weapons of Size 1 and 2 in close combat.");
	public static final SpecialRule recoilCompensation = new SpecialRule("Recoil Compensation",
			"Get a +10 bonus to Attack Repeatedly (Ranged) with weapons which have a Rate of Fire of 3 or more.");
	public static final SpecialRule stampede = new SpecialRule("Stampede",
			"When you Tackle, you can spend Degrees of Success to continue moving, potentially to a new target. You can continue until you run out of movement or Degrees of Success.");
	public static final SpecialRule strongAttacks = new SpecialRule("Strong Attacks",
			"Use double your Strength Bonus for damage when using a melee weapon two-handed.");
	public static final SpecialRule stunningBlow = new SpecialRule("Stunning Blow",
			"Full Action; Attack (Melee) with a weapon which does Impact damage; Target becomes Stunned for each Degree of Success (up to Strength Bonus).");
	public static final SpecialRule sweepingAttack = new SpecialRule("Sweeping Attack",
			"Full Action; Attack (Melee); all adjacent characters take a hit.");
	public static final SpecialRule thunderousCharge = new SpecialRule("Thunderous Charge",
			"When you Stampede, get a +10 bonus to Attack (Melee) per Degree of Success remaining at the end of your movement.");
	
	// Finesse //
	public static final SpecialRule agileFighter = new SpecialRule("Agile Fighter",
			"You can Dodge melee attacks.");
	public static final SpecialRule agileStrike = new SpecialRule("Agile Strike",
			"Full Action; Move twice and Attack (Melee) during the movement.");
	public static final SpecialRule assassinStrike = new SpecialRule("Assassin Strike",
			"Full Action; Attack (Melee); damage dice explode on rolls 1 lower per Degree of Success.");
	public static final SpecialRule hipShooting = new SpecialRule("Hip Shooting",
			"Full Action; Move twice and Attack (Ranged) during the movement.");
	public static final SpecialRule carefulStrike = new SpecialRule("Careful Strike",
			"Get an extra +10 bonus when you make a melee attack after you Aim.");
	public static final SpecialRule deftBladesman = new SpecialRule("Deft Bladesman",
			"You can use Agility Bonus instead of Strength Bonus for the damage stat of melee weapons which do Rending damage.");
	public static final SpecialRule dualWielder = new SpecialRule("Dual-Wielder",
			"When you Attack (Melee), you can spend Degrees of Success to inflict hits from additional weapons you are holding (up to one per weapon).");
	public static final SpecialRule effortlessDodge = new SpecialRule("Effortless Dodge",
			"Spend two Degrees of Success on a Dodge to not spend your Reaction.");
	public static final SpecialRule effortlessParry = new SpecialRule("Effortless Parry",
			"Spend two Degrees of Success on a Parry to not spend your Reaction.");
	public static final SpecialRule gunslinger = new SpecialRule("Gunslinger",
			"When you Attack (Ranged), you can spend Degrees of Success to inflict hits from additional weapons you are holding (up to one per weapon).");
	public static final SpecialRule independentTargeting = new SpecialRule("Independent Targeting",
			"When wielding multiple ranged weapons, you can attack a different target with each weapon and can choose which target to assign each hit to.");
	public static final SpecialRule leapUp = new SpecialRule("Leap Up",
			"You can stand up without spending a Secondary Action.");
	public static final SpecialRule marksman = new SpecialRule("Marksman",
			"Get an extra +10 bonus to Attack (Ranged) when you do so Carefully or after you Focus.");
	public static final SpecialRule martialArtist = new SpecialRule("Martial Artist",
			"The Hits stat of your unarmed attacks are doubled.");
	public static final SpecialRule masterGunslinger = new SpecialRule("Master Gunslinger",
			"Get a +10 bonus to all ranged attacks when using multiple weapons.");
	public static final SpecialRule quickDraw = new SpecialRule("Quick Draw",
			"Draw your weapon without spending an Action.");
	public static final SpecialRule riposte = new SpecialRule("Riposte",
			"When you Parry, you can spend Degrees of Success to get a +10 bonus per DoS to Attack (Melee).");
	public static final SpecialRule sniperShot = new SpecialRule("Sniper Shot",
			"Full Action; Attack (Ranged); damage dice explode on rolls 1 lower per Degree of Success.");
	public static final SpecialRule swiftBlade = new SpecialRule("Swift Blade",
			"Double the Hits stat of melee weapons which do Rending damage.");
	public static final SpecialRule twoWeaponMaster = new SpecialRule("Two-Weapon Master",
			"Get a +10 bonus to all melee attacks when using multiple weapons.");
	
	// Defence //
	public static final SpecialRule adamantiumWill = new SpecialRule("Adamantium Will",
			"Get a +30 bonus to Resist being Frightened, Intimidated and Pinned.");
	public static final SpecialRule constantVigilance = new SpecialRule("Constant Vigilance",
			"You can use Reflex to act before another character even when you are not waiting.");
	public static final SpecialRule denyTheWitch = new SpecialRule("Deny the Witch",
			"Get +20 to Resist psychic powers which affect your mind.");
	public static final SpecialRule dieHard = new SpecialRule("Die Hard",
			"You get a +20 bonus to the Bleeding Out Toughness Test.");
	public static final SpecialRule dirtyFighting = new SpecialRule("Dirty Fighting",
			"When you Stun, the maximum aspect level is double your Weapon Skill Bonus.");
	public static final SpecialRule disarm = new SpecialRule("Disarm",
			"Main Action; Weapon Skill Test; Target drops one wielded item plus one per DoS.");
	public static final SpecialRule hardTarget = new SpecialRule("Hard Target",
			"When you are Running, you give a -20 penalty to all ranged attacks against you.");
	public static final SpecialRule ignorePain = new SpecialRule("Ignore Pain",
			"You can use Willpower instead of Toughness to Resist being or becoming Stunned.");
	public static final SpecialRule mentalFortress = new SpecialRule("Mental Fortress",
			"Get +30 to Resist psychic powers which affect your mind.");
	public static final SpecialRule nervesOfSteel = new SpecialRule("Nerves of Steel",
			"Get a +20 bonus to Resist being Frightened, Intimidated and Pinned.");
	public static final SpecialRule numbToPain = new SpecialRule("Numb to Pain",
			"Get a +20 bonus to Resist being or becoming Stunned.");
	public static final SpecialRule resistance = new SpecialRule("Resistance",
			"Get a +20 bonus to Resist this.");
	
	// Psyker //
	public static final SpecialRule sanctionedPsyker = new SpecialRule("Sanctioned Psyker",
			"You can take Psy Rating Talents and Psychic Powers. You aquire the Skill Sense Immaterium(+0) when you take this Talent.");
	public static final SpecialRule unsanctionedPsyker = new SpecialRule("Unsanctioned Psyker",
			"You can take Psy Rating Talents and Psychic Powers. You aquire the Skill Sense Immaterium(+0) and get 1d10+5 Corruption and Insanity Points when you take this Talent.");
	public static final SpecialRule psyRating1 = new SpecialRule("Psy Rating 1",
			"You can Focus Power with a Psy Rating of 1.");
	public static final SpecialRule psyRating2 = new SpecialRule("Psy Rating 2",
			"You can Focus Power with a Psy Rating of 2.");
	public static final SpecialRule psyRating3 = new SpecialRule("Psy Rating 3",
			"You can Focus Power with a Psy Rating of 3.");
	public static final SpecialRule psyRating4 = new SpecialRule("Psy Rating 4",
			"You can Focus Power with a Psy Rating of 4.");
	public static final SpecialRule psyRating5 = new SpecialRule("Psy Rating 5",
			"You can Focus Power with a Psy Rating of 5.");
	public static final SpecialRule drawDeeper = new SpecialRule("Draw Deeper",
			"When you Focus Power, you can add a number of d10 up to your Willpower Bonus to the Potency roll. For each die you add, you give a +10 bonus to Psychic Phenomena.");
	public static final SpecialRule masteredPsychicPower = new SpecialRule("Mastered",
			"Get a +20 bonus to Focus Power for the chosen Psychic Power.");
	public static final SpecialRule powerJuggler = new SpecialRule("Power Juggler",
			"You can keep multiple Psychic Powers sustained simultaneously, splitting your Psy Rating between them how you wish.");
	public static final SpecialRule subtlePsyker = new SpecialRule("Subtle Psyker",
			"When you Focus Power, other characters cannot tell you are doing anything unless they successfully Inspect you.");
	public static final SpecialRule strongConnection = new SpecialRule("Strong Connection",
			"When you Focus Power, you add your Willpower Bonus to the Potency roll.");
	public static final SpecialRule strongMind = new SpecialRule("Strong Mind",
			"Get a +20 bonus to Resist (Mentally) against Psychic Powers.");
	public static final SpecialRule theConstantThreat = new SpecialRule("The Constant Threat",
			"When a character within 10m triggers Psychic Phenomena, you can use Reflex to take your turn before the phenomena is resolved.");
	
	// Tech //
	public static final SpecialRule demolitionsExpert = new SpecialRule("Demolitions Expert",
			"Get a +20 bonus to Use Tech when planting and defusing explosives.");
	public static final SpecialRule operate = new SpecialRule("Operate",
			"You can operate this vehicle type.");
	public static final SpecialRule operate_ag = new SpecialRule("Operate",
			"You can operate this vehicle type using Agility.");
	public static final SpecialRule operate_int = new SpecialRule("Operate",
			"You can operate this vehicle type using Intelligence.");
	public static final SpecialRule technicalKnock = new SpecialRule("Technical Knock",
			"Secondary Action; Overcome Jammed on a firearm you are holding.");
	public static final SpecialRule weaponTech = new SpecialRule("Weapon-Tech",
			"Get a +20 bonus to Use Tech when you maintain weapons. The weapon does not become Damaged on critical failure when doing so.");
	public static final SpecialRule bloodFiltration = new SpecialRule("Blood Filtration",
			"You get a +20 bonus to Resist chemicals affecting you. You can choose to instead apply a -20 penalty.");
	public static final SpecialRule ferricSummons = new SpecialRule("Ferric Summons",
			"Main Action; Willpower Test; You can use Ferric Lure to pull an item from someone's hands (they oppose with Strength); apply range modifiers.");
	public static final SpecialRule luminenBlast = new SpecialRule("Luminen Blast",
			"Main Action; Attack (Ranged) using following stats.\n" + 
			"Range: 10m;\n" + 
			"RoF: 1;\n" + 
			"Damage: 1d10+2 Energy;\n" + 
			"Shocking: Each Wound inflicted makes the target become Stunned;\n" + 
			"Consumes 1 Power.");
	public static final SpecialRule luminenShock = new SpecialRule("Luminen Shock",
			"Main Action; Attack (Melee) using the following stats.\n" + 
			"Bonus: +10;\n" + 
			"Hits: 1;\n" + 
			"Damage: 1d10+2 Energy;\n" + 
			"Shocking: Each Wound inflicted makes the target become Stunned;\n" + 
			"Consumes 1 Power.");
	public static final SpecialRule maglevTranscendence = new SpecialRule("Maglev Transcendence",
			"When using your Maglev Coils, you suffer no fall damage and can raise or lower your hover height by 1m each turn, with no maximum height.");
	public static final SpecialRule prosanguine = new SpecialRule("Prosanguine",
			"Long Action; Luminen Capacitor; recover 1 wound for each Power generated; become Fatigued on failure.");
	
	// Leadership //
	public static final SpecialRule commanding = new SpecialRule("Commanding",
			"When you Command, the maximum bonus to the target's Disposition is doubled, to FBx20.");
	public static final SpecialRule dominatingBellow = new SpecialRule("Dominating Bellow",
			"When you Intimidate a group, instead of splitting Degrees of Success amongst the targets, all targets up to FBx10m away are affected as if they were the only target.");
	public static final SpecialRule expandedNetword = new SpecialRule("Expanded Network",
			"You can maintain an additional number of contacts equal to your Fellowship Bonus. You can take this Talent multiple times.");
	public static final SpecialRule haloOfCommand = new SpecialRule("Halo of Command",
			"You can affect those up to FBx100m away when you Command or Inspire.");
	public static final SpecialRule inspiring = new SpecialRule("Inspiring",
			"When you Inspire, the maximum aspect level is doubled, to FBx2.");
	public static final SpecialRule intoTheJawsOfHell = new SpecialRule("Into the Jaws of Hell",
			"Allies within FBx10m who can see you get a +20 bonus to Resist being or becoming Frightened, Intimidated or Pinned.");
	public static final SpecialRule ironDiscipline = new SpecialRule("Iron Discipline",
			"Get a +20 bonus to Command to overcome the target being Frightened, Intimidated or Pinned.");
	public static final SpecialRule leadByExample = new SpecialRule("Lead By Example",
			"When you overcome Pinning or Fear, allies within FBx10m become Inspired.");
	public static final SpecialRule networking = new SpecialRule("Networking",
			"Long Action; Fellowship Test; gain a trusted contact in this area; gain Attention on critical failure; you can maintain a number of contacts up to your Fellowship Bonus.");
	public static final SpecialRule publicSpeaker = new SpecialRule("Public Speaker",
			"When making a Fellowship Test targeting a group, instead of splitting Degrees of Success amongst the targets, all targets up to FBx10m away are affected as if they were the only target.");
	
	// Fieldcraft //
	public static final SpecialRule accustomedToDarkness = new SpecialRule("Accustomed to Darkness",
			"You reduce penalties from Darkness by 30.");
	public static final SpecialRule accustomedToZeroGravity = new SpecialRule("Accustomed to Zero Gravity",
			"You reduce penalties from Zero Gravity by 30.");
	public static final SpecialRule catfall = new SpecialRule("Catfall",
			"Reduce all fall damage by your Agility Bonus.");
	public static final SpecialRule firstAider = new SpecialRule("First Aider",
			"Get a +20 bonus to Treat Wounds when performing first aid.");
	public static final SpecialRule rideBeast = new SpecialRule("Ride Beast",
			"You can ride riding animals using Agility.");
	public static final SpecialRule tracker = new SpecialRule("Tracker",
			"Get a +20 bonus to Search when following tracks.");
	public static final SpecialRule quickEntry = new SpecialRule("Quick Entry",
			"You can Open Lock in combat as a Full Action.");
	public static final SpecialRule spotWeakness = new SpecialRule("Spot Weakness",
			"Main Action Perception Test; Create an Aspect which gives a bonus.");
	
	// Social //
	public static final SpecialRule charming = new SpecialRule("Charming",
			"When you Charm, you double the increase to the target's Disposition.");
	public static final SpecialRule cluesFromTheCrowds = new SpecialRule("Clues from the Crowds",
			"Get a +20 bonus to Inquire when gathering information from a crowd of people.");
	public static final SpecialRule conversationalist = new SpecialRule("Conversationalist",
			"Get a +10 bonus to all Fellowship Tests when interacting with a single individual.");
	public static final SpecialRule coordinatedInterrogation = new SpecialRule("Coordinated Interrogation",
			"Get a +20 assistance bonus to Interrogate instead of +10 when the other character also has this Talent.");
	public static final SpecialRule coverUp = new SpecialRule("Cover-Up",
			"Long Action; Fellowship; divert gained Attention away from your group; gain Attention on critical failure.");
	public static final SpecialRule delicateInterrogation = new SpecialRule("Delicate Interrogation",
			"You can Interrogate instead of Inquire when obtaining information from a target through conversation (though you get no bonuses from interrogation tools).");
	public static final SpecialRule entrapment = new SpecialRule("Entrapment",
			"You can Read Person (Gain Insight) using Fellowship instead of Perception.");
	public static final SpecialRule faceInACrowd = new SpecialRule("Face in a Crowd",
			"You can use Fellowship instead of Agility when you Sneak in a populated area.");
	public static final SpecialRule logicalCommunicator = new SpecialRule("Logical Communicator",
			"You can Persuade using Intelligence instead of Fellowship.");
	public static final SpecialRule persuasive = new SpecialRule("Persuasive",
			"When you Persuade, the maximum bonus to the target's Disposition is doubled, to FBx20.");
	public static final SpecialRule peer = new SpecialRule("Peer",
			"Get +20 to all Disposition tests when interacting with members of the chosen group.");
	
	// Knowledge //
	public static final SpecialRule creativeProblemSolving = new SpecialRule("Creative Problem Solving",
			"ou can Reference Lore (Assist) even after you failed to Identify the item or character in question.");
	public static final SpecialRule deepestSecrets = new SpecialRule("Deepest Secrets",
			"If you successfully Reference Forbidden Lore, you can spend a Fate Point to reroll and add the Degrees of Success (you still succeed if the reroll fails). You may do this multiple times.");
	public static final SpecialRule specialistKnowledge = new SpecialRule("Specialist Knowledge",
			"If you successfully Reference Scholastic Lore, you can spend a Fate Point to reroll and add the Degrees of Success (you still succeed if the reroll fails). You may do this multiple times.");
	public static final SpecialRule language = new SpecialRule("Language",
			"You know this language.");
	public static final SpecialRule knowledgable = new SpecialRule("Knowledgable",
			"Get a +20 bonus to Reference Common Lore for this area.");
	public static final SpecialRule experienced = new SpecialRule("Experienced",
			"Get a +20 bonus to Reference Common Lore for this area and there is no maximum number of points of info revealed when you Reference Common Lore (Identify) and the maximum aspect level is doubled when you Reference Common Lore (Assist).");
	public static final SpecialRule educated = new SpecialRule("Educated",
			"You can Reference Scholastic Lore for this area.");
	public static final SpecialRule expert = new SpecialRule("Expert",
			"For this area, there is no maximum number of points of info revealed when you Reference Scholastic Lore (Identify) and the maximum aspect level is doubled when you Reference Scholastic Lore (Assist).");
	public static final SpecialRule naturalExpertise = new SpecialRule("Natural Expertise",
			"For this area, you can Reference Common Lore instead of Reference Scholastic Lore.");
	public static final SpecialRule unveiledSecrets = new SpecialRule("Unveiled Secrets",
			"You can Reference Forbidden Lore for this area.");
	public static final SpecialRule darkSecrets = new SpecialRule("Dark Secrets",
			"For this area, there is no maximum number of points of info revealed when you Reference Forbidden Lore (Identify) and the maximum aspect level is doubled when you Reference Forbidden Lore (Assist).");
	
	// Trades //
	public static final SpecialRule trade = new SpecialRule("Trade",
			"You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_agriWorker = new SpecialRule("Trade (Agri Worker)",
			"Grow, care for, and harvest crops and animals. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_apothecary = new SpecialRule("Trade (Apothecary)",
			"Blend and prepare herbal remedies. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_archeologist = new SpecialRule("Trade (Archaeologist)",
			"Locate, examine and analyse ancient ruins and artefacts. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_armourer = new SpecialRule("Trade (Armourer)",
			"Design, upgrade and forge weaponry. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_astrographer = new SpecialRule("Trade (Astrographer)",
			"Create two- and three-dimensional maps of stellar locations and Warp routes. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_cartographer = new SpecialRule("Trade (Cartographer)",
			"Take measurements and turn them into maps. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_chymist = new SpecialRule("Trade (Chymist)",
			"Create poisons, drugs and other compounds. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_cryptographer = new SpecialRule("Trade (Cryptographer)",
			"Create or decode ciphers, codes and other puzzles. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_cook = new SpecialRule("Trade (Cook)",
			"Cook meals and inspect food. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_copyist = new SpecialRule("Trade (Copyist)",
			"Copy text, illuminate manuscripts and forge written material. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_linguist = new SpecialRule("Trade (Linguist)",
			"Create and decipher spoken and written languages. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_loremancer = new SpecialRule("Trade (Loremancer)",
			"Recount legendary events as entertainment or education. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_mason = new SpecialRule("Trade (Mason)",
			"Assess and construct buildings. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_merchant = new SpecialRule("Trade (Merchant)",
			"Find, bargain and sell trade goods. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_miner = new SpecialRule("Trade (Miner)",
			"Extract minerals, maintain mines and identify mining hazards. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_morticator = new SpecialRule("Trade (Morticator)",
			"Prepare, preserve and render down corpse remains into ingredients. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_performer = new SpecialRule("Trade (Performer)",
			"Perform for an audience. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_prospector = new SpecialRule("Trade (Prospector)",
			"Find and identify valuable minerals. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_scrimshaw = new SpecialRule("Trade (Scrimshaw)",
			"Inscribe patterns, text and art onto things. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_sculptor = new SpecialRule("Trade (Sculptor)",
			"Create inspiring works of art in stone, metal and other materials. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_shipwright = new SpecialRule("Trade (Shipwright)",
			"Design, upgrade and manufacture void-capable vessels. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_soothsayer = new SpecialRule("Trade (Soothsayer)",
			"Give the appearance of telling the future. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_survivalist = new SpecialRule("Trade (Survivalist)",
			"Scavenge and create primitive items from scavenged materials. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_swindler = new SpecialRule("Trade (Swindler)",
			"Aquire wealth through trickery and deception. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_technomat = new SpecialRule("Trade (Technomat)",
			"Repair, maintain and manufacture technological devices. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_valet = new SpecialRule("Trade (Valet)",
			"Refine the appearance, give droll asides and tend to the needs of superiors in a gentlemanly fashion. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_voidfarer = new SpecialRule("Trade (Voidfarer)",
			"The day-to-day operation, logistics and defence of starships. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
	public static final SpecialRule trade_wright = new SpecialRule("Trade (Wright)",
			"Design, upgrade and manufacture vehicles. You can Craft and Repair and get a +20 bonus to other Tests when relevant.");
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