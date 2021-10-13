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
	
	// Offence //
	
	// Finesse //
	
	// Defence //
	public static final SpecialRule nervesOfSteel = new SpecialRule("Nerves of Steel",
			"Get a +20 bonus to Resist being Frightened, Intimidated and Pinned.");
	
	// Psyker //
	
	// Tech //
	public static final SpecialRule operate = new SpecialRule("Operate",
			"You can operate this vehicle type.");
	public static final SpecialRule operate_ag = new SpecialRule("Operate",
			"You can operate this vehicle type using Agility.");
	public static final SpecialRule operate_int = new SpecialRule("Operate",
			"You can operate this vehicle type using Intelligence.");
	
	// Leadership //
	public static final SpecialRule dominatingBellow = new SpecialRule("Dominating Bellow",
			"When you Intimidate a group, instead of splitting Degrees of Success amongst the targets, all targets up to FBx10m away are affected as if they were the only target.");
	public static final SpecialRule publicSpeaker = new SpecialRule("Public Speaker",
			"When making a Fellowship Test targeting a group, instead of splitting Degrees of Success amongst the targets, all targets up to FBx10m away are affected as if they were the only target.");
	
	// Fieldcraft //
	
	// Social //
	public static final SpecialRule coordinatedInterrogation = new SpecialRule("Coordinated Interrogation",
			"Get a +20 assistance bonus to Interrogate instead of +10 when the other character also has this Talent.");
	
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
			"For this area, there is no maximum number of points of info revealed when you Reference Common Lore (Identify) and the maximum aspect level is doubled when you Reference Common Lore (Assist).");
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
	
}