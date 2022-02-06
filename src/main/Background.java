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
					new Path("Scholar",
							new String[] {
									"Intelligence +10",
							},
							new Talent[] {
									Talent.educated.withParameter("Bureaucracy"),
									Talent.expert.withParameter("2 Areas"),
									Talent.knowledgable.withParameter("Administratum"),
									Talent.language.withParameter("High Gothic + Low Gothic"),
									Talent.specialistKnowledge,
									Talent.trade_copyist,
							},
							new Skill[] {
									Skill.contemplate.withBonus(10),
									Skill.inquire.withBonus(10),
									Skill.inspect.withBonus(10),
									Skill.referenceScholasticLore.withBonus(20),
							},
							new Item[] {
									Clothing.administratumRobes,
									Tool.dataTome_lore,
									MiscItem.chrono,
							}
					)
			)
			.withStartingPath(
					new Path("Operator",
							new String[] {
									"Agility +5",
									"Intelligence +10",
									"Perception +5",
							},
							new Talent[] {
									Talent.educated.withParameter("Bureaucracy + 2 Areas"),
									Talent.knowledgable.withParameter("Administratum + Tech"),
									Talent.language.withParameter("High Gothic + Low Gothic"),
									Talent.operate.withParameter("1 Vehicle Type"),
									Talent.trade_copyist,
							},
							new Bionic[] {
									Bionic.interfacePort,
							},
							new Skill[] {
									Skill.inquire.withBonus(10),
									Skill.inspect.withBonus(10),
									Skill.referenceScholasticLore.withBonus(10)
							},
							new Item[] {
									Clothing.administratumRobes,
									MiscItem.chrono,
							}
					)
			)
			.withStartingPath(
					new Path("Chirurgeon",
							new String[] {
									"Intelligence +15",
									"Perception +5",
							},
							new Talent[] {
									Talent.educated.withParameter("Bureaucracy"),
									Talent.knowledgable.withParameter("Administratum"),
									Talent.language.withParameter("High Gothic + Low Gothic"),
									Talent.trade_copyist
							},
							new Skill[] {
									Skill.administerDrug.withBonus(10),
									Skill.inquire.withBonus(10),
									Skill.inspect.withBonus(20),
									Skill.performSurgery.withBonus(10),
									Skill.referenceScholasticLore.withBonus(0),
									Skill.treatWounds.withBonus(20),
							},
							new Item[] {
									Clothing.chirurgeonRobes,
									Tool.surgicalTools,
									Consumable.qualityMedkit,
									Consumable.injector_deTox,
									MiscItem.chrono,
							}
					)
			),
			new Background("Adeptus Arbites", "Offence or Defence")
			.withStartingPath(
					new Path("Arbitrator",
							new String[] {
									"Weapon Skill +10",
									"Ballistic Skill +10",
									"Strenth + 10",
									"Toughness +10",
									"Agility +5",
									"Intelligence +5",
									"Perception +5"
							},
							new Talent[] {
									Talent.educated.withParameter("Judgement"),
									Talent.knowledgable.withParameter("Underworld"),
									Talent.language.withParameter("Low Gothic"),
							},
							new Skill[] {
									Skill.grapple.withBonus(10),
									Skill.inquire.withBonus(10),
									Skill.inspect.withBonus(10),
									Skill.interrogate.withBonus(10),
									Skill.knockDown.withBonus(10),
									Skill.notice.withBonus(10),
									Skill.referenceCommonLore.withBonus(10),
									Skill.referenceScholasticLore.withBonus(10),
									Skill.run.withBonus(10)
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
									MiscItem.lhoSticks
							}
					)
			),
			new Background("Adeptus Astra Telepathica", "Defense or Psyker")
			.withStartingPath(
					new Path("Savant Militant",
							new String[] {
									"Ballistic Skill +5",
									"Willpower +15",
							},
							new Talent[] {
									Talent.knowledgable.withParameter("Adeptus Astra Telepathica"),
									Talent.language.withParameter("Low Gothic"),
									Talent.mentalResilience,
									Talent.psyker.withParameter("Sanctioned"),
									Talent.psyRating2,
									Talent.strongConnection,
							},
							new Skill[] {
									Skill.dodge.withBonus(10),
									Skill.notice.withBonus(10),
									Skill.parry.withBonus(10),
									Skill.run.withBonus(10),
									Skill.senseImmateruim.withBonus(10),
							},
							new Item[] {
									Armour.flakJacket,
									Clothing.astraTelepathicaRobes,
									MeleeWeapon.staff_astraTelepathica,
									Tool.psyFocus,
									MeleeWeapon.knife_psykanaMercyBlade,
									RangedWeapon.laspistol,
							},
							"12 XP of Psychic Powers"
					)
			)
			.withStartingPath(
					new Path("Scholar Materium",
							new String[] {
									"Intelligence +15",
									"Perception +5",
									"Willpower +15",
							},
							new Talent[] {
									Talent.knowledgable.withParameter("Adeptus Astra Telepathica"),
									Talent.language.withParameter("Low Gothic"),
									Talent.unveiledSecrets.withParameter("Psykers"),
									Talent.unveiledSecrets.withParameter("The Warp"),
									Talent.psyker.withParameter("Sanctioned"),
									Talent.psyRating2,
							},
							new Skill[] {
									Skill.referenceLore.withBonus(10),
									Skill.senseImmateruim.withBonus(10),
							},
							new Item[] {
									Clothing.astraTelepathicaRobes,
									MeleeWeapon.staff_astraTelepathica,
									Tool.psyFocus,
									MeleeWeapon.knife_psykanaMercyBlade,
							},
							"6 XP of Psychic Powers"
					)
			),
			new Background("Adeptus Mechanicus", "Knowledge or Tech")
			.withStartingPath(
					new Path("Tech-Priest",
							new String[] {
									"Toughness +5",
									"Intelligence +10",
									"Perception +5",
							},
							new Talent[] {
									Talent.experienced.withParameter("Tech"),
									Talent.language.withParameter("Binary + Low Gothic"),
									Talent.operate.withParameter("1 Vehicle Type"),
									Talent.trade.withParameter("Armourer/Mason/Shipwright/Technomat/Wright"),
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
									Skill.craft.withBonus(20),
									Skill.hack.withBonus(20),
									Skill.inspect.withBonus(20),
									Skill.referenceCommonLore.withBonus(10),
									Skill.repair.withBonus(20),
									Skill.useTech.withBonus(20),
							},
							new Item[] {
									Clothing.mechanicusRobes,
									MeleeWeapon.staff_mechanicus,
									Tool.auspex,
									Tool.combiTool,
									MiscItem.glowGlobe,
									Tool.lascutter,
							}
					)
			)
			.withStartingPath(
					new Path("Tech-Chirurgeon",
							new String[] {
									"Intelligence +10",
									"Perception +5",
							},
							new Talent[] {
									Talent.experienced.withParameter("Tech"),
									Talent.language.withParameter("Binary + Low Gothic"),
									Talent.operate.withParameter("1 Vehicle Type"),
									Talent.trade.withParameter("Chymist/Morticator/Technomat"),
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
									Skill.administerDrug.withBonus(10),
									Skill.craft.withBonus(10),
									Skill.hack.withBonus(10),
									Skill.inspect.withBonus(10),
									Skill.performSurgery.withBonus(20),
									Skill.repair.withBonus(10),
									Skill.treatWounds.withBonus(20),
									Skill.useTech.withBonus(20),
							},
							new Item[] {
									Clothing.mechanicusRobes,
									MeleeWeapon.staff_mechanicus,
									Consumable.qualityMedkit,
									Tool.surgicalTools,
									MiscItem.glowGlobe,
							}
					)
			)
			.withStartingPath(
					new Path("Tech-Militant",
							new String[] {
									"Ballistic Skill +15",
									"Intelligence +5",
							},
							new Talent[] {
									Talent.gunslinger,
									Talent.knowledgable.withParameter("Tech"),
									Talent.language.withParameter("Binary + Low Gothic"),
									Talent.luminenShock,
									Talent.masterGunslinger,
									Talent.operate.withParameter("1 Vehicle Type"),
									Talent.trade.withParameter("Armourer"),
							},
							new Bionic[] {
									Bionic.interfacePort,
									Bionic.internalReservoir,
									Bionic.luminenCapacitor,
									Bionic.mechanicusImplants,
									Bionic.mechadendrite_ballistic,
									Bionic.mindImpulseUnit,
									Bionic.vocalImplant,
							},
							new Skill[] {
									Skill.craft.withBonus(10),
									Skill.hack.withBonus(0),
									Skill.repair.withBonus(10),
									Skill.useTech.withBonus(20),
							},
							new Item[] {
									Clothing.mechanicusRobes,
									Armour.meshVest,
									MeleeWeapon.staff_mechanicus,
									RangedWeapon.laspistol,
									Ammo.laspistol_powerPack.times(2),
									Tool.auspex,
									MiscItem.lampPack,
							}
					)
			),
			new Background("Adeptus Ministorum", "Leadership or Social")
			.withStartingPath(
					new Path("Cleric",
							new String[] {
									"Weapon Skill +5",
									"Ballistic Skill +5",
									"Strength +5",
									"Toughness +5",
									"Agility +5",
									"Intelligence +5",
									"Perception +5",
									"Willpower +5",
									"Fellowship +10",
							},
							new Talent[] {
									Talent.experienced.withParameter("Imperial Creed"),
									Talent.knowledgable.withParameter("Adeptus Ministorum"),
									Talent.language.withParameter("High Gothic + Low Gothic"),
									Talent.publicSpeaker,
									Talent.trade_copyist,
									Talent.trade_loremancer,
							},
							new Skill[] {
									Skill.craft.withBonus(10),
									Skill.command.withBonus(10),
									Skill.inquire.withBonus(10),
									Skill.inspire.withBonus(10),
									Skill.persuade.withBonus(10),
									Skill.referenceCommonLore.withBonus(10),
									Skill.treatWounds.withBonus(0),
							},
							new Item[] {
									Clothing.ministorumRobes,
									Armour.chainCoat,
									MeleeWeapon.warHammer_ecclesiarchy,
									MeleeWeapon.shortsword_ecclesiarchy,
									Tool.tome_imperialCreed,
									new Item("Aquilla Necklace", 0),
							}
					)
			),
			new Background("Imperial Guard", "Fieldcraft or Leadership")
			.withStartingPath(
					new Path("Veteran",
							new String[] {
									"Weapon Skill +10",
									"Ballistic Skill +15",
									"Strength +10",
									"Toughness +10",
							},
							new Talent[] {
									Talent.language.withParameter("Low Gothic"),
									Talent.nervesOfSteel,
									Talent.rapidReload,
									Talent.recoilCompensation,
									Talent.weaponFamiliarity_ranged.withParameter("Lasgun"),
									Talent.weaponMaster_ranged.withParameter("Lasgun"),
							},
							new Skill[] {
									Skill.command.withBonus(10),
									Skill.navigate.withBonus(10),
									Skill.notice.withBonus(10),
									Skill.reflex.withBonus(10),
									Skill.parry.withBonus(10),
							},
							new Item[] {
									Clothing.militaryUniform,
									Armour.flakArmour,
									RangedWeapon.lasgun_bayonet,
									Ammo.lasgun_powerPack,
									ThrownWeapon.fragHandGrenade,
									MeleeWeapon.knife,
									MiscItem.lhoSticks,
							}
					)
			),
			new Background("Outcast", "Fieldcraft or Social")
			.withStartingPath(
					new Path("Rogue",
							new String[] {
									"Agility +10",
									"Intelligence +5",
									"Perception +5",
									"Fellowship +10",
							},
							new Talent[] {
									Talent.accustomedToDarkness,
									Talent.knowledgable.withParameter("Underworld"),
									Talent.language.withParameter("Low Gothic"),
									Talent.quickEntry,
									Talent.sprinter,
									Talent.trade_survivalist,
									Talent.trade_swindler,
									Talent.tricksOfTheTrade,
							},
							new Skill[] {
									Skill.charm.withBonus(10),
									Skill.deceive.withBonus(10),
									Skill.run.withBonus(10),
									Skill.search.withBonus(10),
									Skill.sneak.withBonus(20),
									Skill.unlock.withBonus(20),
							},
							new Item[] {
									Clothing.streetClothes,
									Tool.multiKey,
									Tool.stummer,
									RangedWeapon.pistol,
									MeleeWeapon.knife,
							}
					)
			)
			.withStartingPath(
					new Path("Ganger",
							new String[] {
									"Weapon Skill +10",
									"Ballistic Skill +10",
									"Strength +10",
									"Toughness +10",
									"Agility +5",
									"Perception +5",
							},
							new Talent[] {
									Talent.knowledgable.withParameter("Underworld"),
									Talent.language.withParameter("Low Gothic"),
							},
							new Skill[] {
									Skill.dodge.withBonus(10),
									Skill.intimidate.withBonus(20),
									Skill.notice.withBonus(10),
									Skill.reflex.withBonus(10),
									Skill.run.withBonus(10),
									Skill.search.withBonus(10),
									Skill.sneak.withBonus(10),
									Skill.unlock.withBonus(0),
							},
							new Item[] {
									Armour.gangLeathers,
									Clothing.streetClothes,
									RangedWeapon.autopistol,
									Ammo.autopistol_mag,
									MeleeWeapon.club,
									MeleeWeapon.knife,
							}
					)
			)
			.withStartingPath(
					new Path("Assassin",
							new String[] {
									"Weapon Skill +10",
									"Ballistic Skill +10",
									"Agility +5",
									"Perception +5",
							},
							new Talent[] {
									Talent.accustomedToDarkness,
									Talent.assassinStrike,
									Talent.carefulStrikes,
									Talent.knowledgable.withParameter("Underworld"),
									Talent.language.withParameter("Low Gothic"),
									Talent.marksman,
							},
							new Skill[] {
									Skill.conceal.withBonus(20),
									Skill.deceive.withBonus(20),
									Skill.disguise.withBonus(20),
									Skill.sneak.withBonus(20),
							},
							new Item[] {
									Clothing.streetClothes,
									RangedWeapon.huntingRifle_scoped,
									RangedWeapon.pistol,
									Ammo.huntingRifle_mag,
									MeleeWeapon.longDagger,
									Consumable.vial_lethalPoison_3,
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