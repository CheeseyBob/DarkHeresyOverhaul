package main;

import java.util.LinkedList;

public class Background {
	public String id, name;
	public String aptitude;
	public LinkedList<Path> backgroundPathList = new LinkedList<Path>();
	
	Background(String name, String aptitude) {
		this.id = DHOPrinter.idFrom(name);
		this.name = name;
		this.aptitude = aptitude;
	}
	
	public Background withStartingPath(Path path) {
		backgroundPathList.add(path);
		return this;
	}
	
	public static final Background[] list = {
			new Background("Adeptus Administratum", "Knowledge or Social")
			.withStartingPath(
					new Path("Scholar", // XP: 50/50
							new String[] {
									"Intelligence +10", // 6 XP
							},
							new Talent[] {
									Talent.educated.withParameter("Bureaucracy"), // 2 XP
									Talent.specialist.withParameter("3 Areas"), // 18 XP
									Talent.knowledgable.withParameter("Administratum"), // 2 XP
									Talent.language.withParameter("High Gothic + Low Gothic"), // 4 XP
									Talent.peer.withParameter("Administratum"), // 2 XP
									Talent.trade_copyist, // 2 XP
							},
							new Skill[] {
									Skill.contemplate.withBonus(10), // 2 XP
									Skill.inquire.withBonus(10), // 2 XP
									Skill.inspect.withBonus(10), // 2 XP
									Skill.persuade.withBonus(10), // 2 XP
									Skill.referenceLore.withBonus(20), // 6 XP
							},
							new Item[] {
									Clothing.administratumRobes,
									Tool.dataTome_lore,
									MiscItem.chrono,
									MiscItem.gelt.times("2d10+20"),
							}
					)
			)
			.withStartingPath(
					new Path("Operator", // XP: 50/50
							new String[] {
									"Strength +5", // 2 XP
									"Agility +5", // 2 XP
									"Intelligence +10", // 6 XP
									"Perception +5", // 2 XP
							},
							new Talent[] {
									Talent.educated.withParameter("Bureaucracy + 2 Areas"), // 6 XP
									Talent.knowledgable.withParameter("Administratum + Tech"), // 4 XP
									Talent.language.withParameter("High Gothic + Low Gothic"), // 4 XP
									Talent.operate.withParameter("2 Vehicle Types"), // 4 XP
									Talent.peer.withParameter("Administratum"), // 2 XP
									Talent.trade_copyist, // 2 XP
							},
							new Bionic[] {
									Bionic.interfacePort,
							},
							new Skill[] {
									Skill.inquire.withBonus(10), // 2 XP
									Skill.inspect.withBonus(20), // 6 XP
									Skill.referenceLore.withBonus(10), // 2 XP
									Skill.useTech.withBonus(10), // 6 XP
							},
							new Item[] {
									Clothing.administratumRobes,
									MiscItem.chrono,
									MiscItem.gelt.times("2d10+20"),
							}
					)
			)
			.withStartingPath(
					new Path("Chirurgeon", // XP: 50/50
							new String[] {
									"Intelligence +10", // 6 XP
									"Perception +5", // 2 XP
							},
							new Talent[] {
									Talent.educated.withParameter("Bureaucracy + 1 Area"), // 4 XP
									Talent.knowledgable.withParameter("Administratum"), // 2 XP
									Talent.language.withParameter("High Gothic + Low Gothic"), // 4 XP
									Talent.peer.withParameter("Administratum"), // 2 XP
									Talent.trade_copyist // 2 XP
							},
							new Skill[] {
									Skill.administerDrug.withBonus(10), // 2 XP
									Skill.inquire.withBonus(10), // 2 XP
									Skill.inspect.withBonus(20), // 6 XP
									Skill.performSurgery.withBonus(10), // 6 XP
									Skill.referenceLore.withBonus(10), // 2 XP
									Skill.treatWounds.withBonus(20), // 10 XP
							},
							new Item[] {
									Clothing.chirurgeonRobes,
									Tool.surgicalTools,
									Consumable.qualityMedkit,
									Consumable.injector_deTox,
									MiscItem.chrono,
									MiscItem.gelt.times("2d10+20"),
							}
					)
			),
			new Background("Adeptus Arbites", "Offence or Defence")
			.withStartingPath(
					new Path("Arbitrator", // XP: 50/50
							new String[] {
									"Weapon Skill +5", // 2 XP
									"Ballistic Skill +5", // 2 XP
									"Strenth + 10", // 6 XP
									"Toughness +10", // 6 XP
									"Agility +5", // 2 XP
									"Intelligence +5", // 2 XP
									"Perception +5" // 2 XP
							},
							new Talent[] {
									Talent.educated.withParameter("Judgement"), // 2 XP
									Talent.knowledgable.withParameter("Adeptus Arbites + Underworld"), // 4 XP
									Talent.language.withParameter("Low Gothic"), // 2 XP
									Talent.peer.withParameter("Adeptus Arbites"), // 2 XP
							},
							new Skill[] {
									Skill.grapple.withBonus(10), // 2 XP
									Skill.inquire.withBonus(10), // 2 XP
									Skill.inspect.withBonus(10), // 2 XP
									Skill.interrogate.withBonus(10), // 2 XP
									Skill.intimidate.withBonus(10), // 2 XP
									Skill.knockDown.withBonus(10), // 2 XP
									Skill.referenceLore.withBonus(10), // 2 XP
									Skill.run.withBonus(10), // 2 XP
									Skill.search.withBonus(10), // 2 XP
							},
							new Item[] {
									Clothing.arbitesUniform,
									Armour.carapaceChestplate,
									MeleeWeapon.shockMaul,
									RangedWeapon.shotgun_arbites,
									Ammo.shotgun_arbites_mag,
									RangedWeapon.pistol_arbites,
									Ammo.pistol_arbites_mag,
									MiscItem.manacles,
									MiscItem.handVox,
									MiscItem.lhoSticks,
									MiscItem.gelt.times("2d10+10"),
							}
					)
			),
			new Background("Adeptus Astra Telepathica", "Defense or Psyker")
			.withStartingPath(
					new Path("Savant Militant", // XP: 50/50
							new String[] {
									"Willpower +15", // 14 XP
							},
							new Talent[] {
									Talent.knowledgable.withParameter("Adeptus Astra Telepathica"), // 2 XP
									Talent.language.withParameter("Low Gothic"), // 2 XP
									Talent.peer.withParameter("Adeptus Astra Telepathica"), // 2 XP
									Talent.theConstantThreat, // 4 XP
									Talent.psyker.withParameter("Sanctioned"), // 4 XP
									Talent.psyRating2, // 8 XP
							},
							new Skill[] {
									Skill.senseImmateruim.withBonus(10), // 2 XP
							},
							new Item[] {
									Armour.flakJacket,
									Clothing.astraTelepathicaRobes,
									MeleeWeapon.staff_astraTelepathica,
									Tool.psyFocus,
									MeleeWeapon.knife_psykanaMercyBlade,
									RangedWeapon.laspistol,
									MiscItem.gelt.times("2d10+20"),
							},
							"12 XP of Psychic Powers"
					)
			)
			.withStartingPath(
					new Path("Scholar Materium", // XP: 50/50
							new String[] {
									"Intelligence +10", // 6 XP
									"Perception +5", // 2 XP
									"Willpower +10", // 6 XP
							},
							new Talent[] {
									Talent.knowledgable.withParameter("Adeptus Astra Telepathica"), // 2 XP
									Talent.language.withParameter("Low Gothic"), // 2 XP
									Talent.peer.withParameter("Adeptus Astra Telepathica"), // 2 XP
									Talent.unveiledSecrets.withParameter("Psykers"), // 4 XP
									Talent.unveiledSecrets.withParameter("The Warp"), // 4 XP
									Talent.psyker.withParameter("Sanctioned"), // 4 XP
									Talent.psyRating2, // 8 XP
							},
							new Skill[] {
									Skill.referenceLore.withBonus(10), // 2 XP
									Skill.senseImmateruim.withBonus(10), // 2 XP
							},
							new Item[] {
									Clothing.astraTelepathicaRobes,
									MeleeWeapon.staff_astraTelepathica,
									Tool.psyFocus,
									MeleeWeapon.knife_psykanaMercyBlade,
									MiscItem.gelt.times("2d10+20"),
							},
							"6 XP of Psychic Powers"
					)
			),
			new Background("Adeptus Mechanicus", "Knowledge or Tech")
			.withStartingPath(
					new Path("Tech-Priest", // XP: 50/50
							new String[] {
									"Toughness +5", // 2 XP
									"Intelligence +10", // 6 XP
									"Perception +5", // 2 XP
							},
							new Talent[] {
									Talent.experienced.withParameter("Tech"), // 6 XP
									Talent.language.withParameter("Binary Cant + Low Gothic"), // 4 XP
									Talent.peer.withParameter("Adeptus Mechanicus"), // 2 XP
									Talent.operate.withParameter("1 Vehicle Type"), // 2 XP
									Talent.trade.withParameter("Armourer/Mason/Shipwright/Technomat/Wright"), // 2 XP
							},
							new Bionic[] {
									Bionic.ferricLure,
									Bionic.interfacePort,
									Bionic.luminenCapacitor,
									Bionic.mechanicusImplants,
									Bionic.mechadendrite.withParameter("Manipulator/Optical/Utility"),
									Bionic.mindImpulseUnit,
									Bionic.vocalImplant,
							},
							new Skill[] {
									Skill.craft.withBonus(10), // 2 XP
									Skill.hack.withBonus(10), // 6 XP
									Skill.inspect.withBonus(10), // 2 XP
									Skill.referenceLore.withBonus(10), // 2 XP
									Skill.repair.withBonus(10), // 2 XP
									Skill.useTech.withBonus(20), // 10 XP
							},
							new Item[] {
									Clothing.mechanicusRobes,
									MeleeWeapon.staff_mechanicus,
									Tool.auspex,
									Tool.combiTool,
									MiscItem.glowGlobe,
									Tool.lascutter,
									MiscItem.gelt.times("2d10+30"),
							}
					)
			)
			.withStartingPath(
					new Path("Tech-Chirurgeon", // XP: 50/50
							new String[] {
									"Intelligence +10", // 6 XP
							},
							new Talent[] {
									Talent.experienced.withParameter("Tech"), // 6 XP
									Talent.language.withParameter("Binary + Low Gothic"), // 2 XP
									Talent.peer.withParameter("Adeptus Mechanicus"), // 2 XP
							},
							new Bionic[] {
									Bionic.augurArray,
									Bionic.interfacePort,
									Bionic.luminenCapacitor,
									Bionic.mechanicusImplants,
									Bionic.mechadendrite_medicae,
									Bionic.vocalImplant,
							},
							new Skill[] {
									Skill.administerDrug.withBonus(10), // 2 XP
									Skill.craft.withBonus(10), // 2 XP
									Skill.hack.withBonus(0), // 4 XP
									Skill.inspect.withBonus(10), // 2 XP
									Skill.performSurgery.withBonus(10), // 6 XP
									Skill.repair.withBonus(10), // 2 XP
									Skill.treatWounds.withBonus(20), // 10 XP
									Skill.useTech.withBonus(10), // 6 XP
							},
							new Item[] {
									Clothing.mechanicusRobes,
									MeleeWeapon.staff_mechanicus,
									Consumable.qualityMedkit,
									Tool.surgicalTools,
									MiscItem.glowGlobe,
									MiscItem.gelt.times("2d10+30"),
							}
					)
			),
			new Background("Adeptus Ministorum", "Leadership or Social")
			.withStartingPath(
					new Path("Cleric", // XP: 50/50
							new String[] {
									"Weapon Skill +5", // 2 XP
									"Ballistic Skill +5", // 2 XP
									"Intelligence +5", // 2 XP
									"Perception +5", // 2 XP
									"Willpower +5", // 2 XP
									"Fellowship +10", // 6 XP
							},
							new Talent[] {
									Talent.experienced.withParameter("Imperial Creed"), // 6 XP
									Talent.knowledgable.withParameter("Adeptus Ministorum"), // 2 XP
									Talent.language.withParameter("High Gothic + Low Gothic"), // 4 XP
									Talent.peer.withParameter("Adeptus Ministorum"), // 2 XP
									Talent.publicSpeaker, // 4 XP
									Talent.trade_copyist, // 2 XP
									Talent.trade_loremancer, // 2 XP
							},
							new Skill[] {
									Skill.command.withBonus(10), // 2 XP
									Skill.inquire.withBonus(10), // 2 XP
									Skill.inspire.withBonus(10), // 2 XP
									Skill.referenceLore.withBonus(10), // 2 XP
									Skill.treatWounds.withBonus(0), // 4 XP
							},
							new Item[] {
									Clothing.ministorumRobes,
									Armour.chainCoat,
									MeleeWeapon.warHammer_ecclesiarchy,
									MeleeWeapon.shortsword_ecclesiarchy,
									Tool.tome_imperialCreed,
									new Item("Aquilla Necklace", 0),
									MiscItem.gelt.times("2d10+40"),
							}
					)
			),
			new Background("Imperial Guard", "Fieldcraft or Leadership")
			.withStartingPath(
					new Path("Veteran", // XP: 50/50
							new String[] {
									"Weapon Skill +10", // 6 XP
									"Ballistic Skill +10", // 6 XP
									"Strength +10", // 6 XP
									"Toughness +10", // 6 XP
									"Agility +5", // 2 XP
							},
							new Talent[] {
									Talent.language.withParameter("Low Gothic"), // 2 XP
									Talent.nervesOfSteel, // 4 XP
									Talent.peer.withParameter("Imperial Guard"), // 2 XP
									Talent.rapidReload, // 2 XP
									Talent.weaponFamiliarity_ranged.withParameter("Lasgun"), // 2 XP
							},
							new Skill[] {
									Skill.command.withBonus(10), // 2 XP
									Skill.dodge.withBonus(10), // 2 XP
									Skill.navigate.withBonus(10), // 2 XP
									Skill.parry.withBonus(10), // 2 XP
									Skill.reflex.withBonus(10), // 2 XP
									Skill.run.withBonus(10), // 2 XP
							},
							new Item[] {
									Clothing.militaryUniform,
									Armour.flakArmour,
									RangedWeapon.lasgun_bayonet,
									Ammo.lasgun_powerPack,
									ThrownWeapon.fragHandGrenade,
									MeleeWeapon.knife,
									MiscItem.lhoSticks,
									MiscItem.gelt.times("2d10+10"),
							}
					)
			),
			new Background("Outcast", "Fieldcraft or Social")
			.withStartingPath(
					new Path("Rogue", // XP: 50/50
							new String[] {
									"Agility +10", // 6 XP
									"Intelligence +5", // 2 XP
									"Perception +10", // 6 XP
									"Fellowship +10", // 6 XP
							},
							new Talent[] {
									Talent.experienced.withParameter("Underworld"), // 6 XP
									Talent.language.withParameter("Low Gothic"), // 2 XP
									Talent.peer.withParameter("Underworld"), // 2 XP
									Talent.trade_survivalist, // 2 XP
									Talent.trade_swindler, // 2 XP
							},
							new Skill[] {
									Skill.charm.withBonus(10), // 2 XP
									Skill.deceive.withBonus(10), // 2 XP
									Skill.notice.withBonus(10), // 2 XP
									Skill.run.withBonus(10), // 2 XP
									Skill.sneak.withBonus(10), // 2 XP
									Skill.unlock.withBonus(10), // 6 XP
							},
							new Item[] {
									Clothing.streetClothes,
									Tool.multiKey,
									Tool.stummer,
									RangedWeapon.pistol,
									MeleeWeapon.knife,
									MiscItem.gelt.times("3d10"),
							}
					)
			)
			.withStartingPath(
					new Path("Ganger", // XP: 50/50
							new String[] {
									"Weapon Skill +5", // 2 XP
									"Ballistic Skill +10", // 6 XP
									"Strength +10", // 6 XP
									"Toughness +10", // 6 XP
									"Agility +5", // 2 XP
									"Perception +5", // 2 XP
							},
							new Talent[] {
									Talent.experienced.withParameter("Underworld"), // 6 XP
									Talent.language.withParameter("Low Gothic"), // 2 XP
									Talent.peer.withParameter("Underworld"), // 2 XP
							},
							new Skill[] {
									Skill.dodge.withBonus(10), // 2 XP
									Skill.intimidate.withBonus(20), // 6 XP
									Skill.notice.withBonus(10), // 2 XP
									Skill.reflex.withBonus(10), // 2 XP
									Skill.run.withBonus(10), // 2 XP
									Skill.sneak.withBonus(10), // 2 XP
							},
							new Item[] {
									Armour.gangLeathers,
									Clothing.streetClothes,
									RangedWeapon.autopistol,
									Ammo.autopistol_mag,
									MeleeWeapon.club,
									MeleeWeapon.knife,
									MiscItem.gelt.times("3d10"),
							}
					)
			)
			.withStartingPath(
					new Path("Assassin", // XP: 50/50
							new String[] {
									"Weapon Skill +10", // 6 XP
									"Ballistic Skill +10", // 6 XP
									"Perception +5", // 2 XP
							},
							new Talent[] {
									Talent.accustomedToDarkness, // 2 XP
									Talent.assassinStrike, // 8 XP
									Talent.knowledgable.withParameter("Underworld"), // 2 XP
									Talent.language.withParameter("Low Gothic"), // 2 XP
									Talent.peer.withParameter("Underworld"), // 2 XP
									Talent.sniperShot, // 8 XP
							},
							new Skill[] {
									Skill.conceal.withBonus(10), // 2 XP
									Skill.deceive.withBonus(10), // 2 XP
									Skill.disguise.withBonus(10), // 2 XP
									Skill.sneak.withBonus(10), // 2 XP
									Skill.unlock.withBonus(0), // 4 XP
							},
							new Item[] {
									Clothing.streetClothes,
									RangedWeapon.huntingRifle_scoped,
									RangedWeapon.pistol,
									Ammo.huntingRifle_mag,
									MeleeWeapon.longDagger,
									Consumable.vial_lethalPoison_3,
									MiscItem.gelt.times("3d10"),
							}
					)
			)
	};
	public static final String[][] roleRollList = {
			{"01-02", "03", "04-28", "29-48", "49", "50-79", "80-99", "00"},
			{"01-15", "16-30", "31", "32-39", "40", "41-45", "46-75", "76-00"},
			{"01-02", "03", "04-08", "09", "10-89", "90-94", "95-99", "00"},
			{"01-05", "06-10", "11-35", "36-39", "40", "41-65", "66-90", "91-00"},
			{"01-05", "06-10", "11-30", "31-65", "66", "67-70", "71-85", "86-00"},
			{"01-10", "11-20", "21-25", "26-32", "33", "34", "35", "36-00"},
			{"01-30", "31-60", "61", "62-63", "64", "65", "66-95", "96-00"},
	};
	
	public static class Path {
		public String name;
		public String[] characteristicList;
		public Skill[] skillList;
		public Talent[] talentList;
		public Bionic[] bionicList;
		public Item[] itemList;
		public String psychicPowerXP;
		
		Path(String name, String[] characteristicsIncreaseList, Talent[] talentList, Bionic[] bionicList, Skill[] skillList, Item[] equipmentList) {
			this.name = name;
			this.characteristicList = characteristicsIncreaseList;
			this.skillList = skillList;
			this.talentList = talentList;
			this.bionicList = bionicList;
			this.itemList = equipmentList;
		}
		
		Path(String name, String[] characteristicsIncreaseList, Talent[] talentList, Skill[] skillList, Item[] equipmentList) {
			this(name, characteristicsIncreaseList, talentList, new Bionic[0], skillList, equipmentList);
		}
		
		Path(String name, String[] characteristicsIncreaseList, Talent[] talentList, Skill[] skillList, Item[] equipmentList, String psychicPowerXP) {
			this(name, characteristicsIncreaseList, talentList, new Bionic[0], skillList, equipmentList);
			this.psychicPowerXP = psychicPowerXP;
		}
	}
}