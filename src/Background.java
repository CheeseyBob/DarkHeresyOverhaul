import java.util.LinkedList;

class Background {
	String id, name;
	String aptitude;
	LinkedList<BackgroundPath> backgroundPathList = new LinkedList<BackgroundPath>();
	
	Background(String name, String aptitude) {
		this.id = DarkHeresyOverhaul.idFrom(name);
		this.name = name;
		this.aptitude = aptitude;
	}
	
	public Background withStartingPaths(BackgroundPath path) {
		backgroundPathList.add(path);
		return this;
	}
	
	public Background withStartingPaths(BackgroundPath path1, BackgroundPath path2) {
		backgroundPathList.add(path1);
		backgroundPathList.add(path2);
		return this;
	}
	
	public Background withStartingPaths(BackgroundPath path1, BackgroundPath path2, BackgroundPath path3) {
		backgroundPathList.add(path1);
		backgroundPathList.add(path2);
		backgroundPathList.add(path3);
		return this;
	}
	
	public static final Background[] list = {
			new Background("Adeptus Administratum", "Knowledge or Social")
			.withStartingPaths(
					new BackgroundPath("Scholar",
							new String[] {
									"Intelligence +10"
							},
							new Skill[] {
									Skill.contemplate.withBonus(10),
									Skill.inquire.withBonus(10),
									Skill.inspect.withBonus(10),
									Skill.referenceScholasticLore.withBonus(20)
							},
							new SpecialRule[] {
									Talent.educated.withParameter("Bureaucracy"),
									Talent.expert.withParameter("2 Areas"),
									Talent.knowledgable.withParameter("Administratum"),
									Talent.language.withParameter("High Gothic + Low Gothic"),
									Talent.specialistKnowledge,
									Talent.trade_copyist
							},
							new Item[] {
									Clothing.administratumRobes,
									Tool.dataTome_lore,
									MiscItem.chrono
							}
					),
					new BackgroundPath("Operator",
							new String[] {
									"Agility +5",
									"Intelligence +10",
									"Perception +5"
							},
							new Skill[] {
									Skill.inquire.withBonus(10),
									Skill.inspect.withBonus(10),
									Skill.referenceScholasticLore.withBonus(10)
							},
							new SpecialRule[] {
									Talent.educated.withParameter("Bureaucracy + 2 Areas"),
									Talent.knowledgable.withParameter("Administratum + Tech"),
									Talent.language.withParameter("High Gothic + Low Gothic"),
									Talent.operate.withParameter("1 Vehicle Type"),
									Talent.trade_copyist,
									Bionic.interfacePort
							},
							new Item[] {
									Clothing.administratumRobes,
									MiscItem.chrono
							}
					),
					new BackgroundPath("Chirurgeon",
							new String[] {
									"Intelligence +15",
									"Perception +5"
							},
							new Skill[] {
									Skill.administerDrug.withBonus(10),
									Skill.inquire.withBonus(10),
									Skill.inspect.withBonus(20),
									Skill.performSurgery.withBonus(10),
									Skill.referenceScholasticLore.withBonus(0),
									Skill.treatWounds.withBonus(20)
							},
							new SpecialRule[] {
									Talent.educated.withParameter("Bureaucracy"),
									Talent.knowledgable.withParameter("Administratum"),
									Talent.language.withParameter("High Gothic + Low Gothic"),
									Talent.trade_copyist
							},
							new Item[] {
									Clothing.chirurgeonRobes,
									Tool.surgicalTools,
									Consumable.qualityMedkit,
									Consumable.injector_deTox,
									MiscItem.chrono
							}
							)
					),
			new Background("Adeptus Arbites", "Offence or Defence")
			.withStartingPaths(
					new BackgroundPath("Arbitrator",
							new String[] {
									"Weapon Skill +10",
									"Ballistic Skill +10",
									"Strenth + 10",
									"Toughness +10",
									"Agility +5",
									"Intelligence +5",
									"Perception +5"
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
							new SpecialRule[] {
									Talent.educated.withParameter("Judgement"),
									Talent.knowledgable.withParameter("Underworld"),
									Talent.language.withParameter("Low Gothic")
							},
							new Item[] {
									Clothing.arbitesUniform,
									Armour.carapaceChestplate,
									MeleeWeapon.shockMaul,
									RangedWeapon.arbitesShotgun,
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
			.withStartingPaths(
					new BackgroundPath("xxxxxxxxxx",
							new String[] {
									
							},
							new Skill[] {
									
							},
							new SpecialRule[] {
									
							},
							new Item[] {
									
							}
					)
					),
			new Background("Adeptus Mechanicus", "Knowledge or Tech")
			.withStartingPaths(
					new BackgroundPath("Tech-Priest",
							new String[] {
									"Toughness +5",
									"Intelligence +10",
									"Perception +5",
							},
							new Skill[] {
									Skill.craft.withBonus(20),
									Skill.hack.withBonus(20),
									Skill.inspect.withBonus(20),
									Skill.referenceCommonLore.withBonus(10),
									Skill.repair.withBonus(20),
									Skill.useTech.withBonus(20),
							},
							new SpecialRule[] {
									Talent.experienced.withParameter("Tech"),
									Talent.language.withParameter("Binary + Low Gothic"),
									Talent.operate.withParameter("1 Vehicle Type"),
									Talent.trade.withParameter("Armourer/Mason/Shipwright/Technomat/Wright"),
									Bionic.ferricLure,
									Bionic.interfacePort,
									Bionic.luminenCapacitor,
									Bionic.mechanicusImplants,
									Bionic.mechadendrite.withParameter("Manipulator/Optical/Utility"),
									Bionic.mindImpulseUnit,
									Bionic.vocalImplant,
							},
							new Item[] {
									Clothing.mechanicusRobes,
									MeleeWeapon.staff_mechanicus,
									Tool.auspex,
									Tool.combiTool,
									MiscItem.glowGlobe,
									Tool.lascutter,
							}
					),
					new BackgroundPath("Tech-Chirurgeon",
							new String[] {
									"Intelligence +10",
									"Perception +5",
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
							new SpecialRule[] {
									Talent.experienced.withParameter("Tech"),
									Talent.language.withParameter("Binary + Low Gothic"),
									Talent.operate.withParameter("1 Vehicle Type"),
									Talent.trade.withParameter("Chymist/Morticator/Technomat"),
									Bionic.augurArray,
									Bionic.interfacePort,
									Bionic.luminenCapacitor,
									Bionic.mechanicusImplants,
									Bionic.mechadendrite_medicae,
									Bionic.vocalImplant,
							},
							new Item[] {
									Clothing.mechanicusRobes,
									MeleeWeapon.staff_mechanicus,
									Consumable.qualityMedkit,
									Tool.surgicalTools,
									MiscItem.glowGlobe,
							}
							),
					new BackgroundPath("Tech-Militant",
							new String[] {
									"Ballistic Skill +15",
									"Intelligence +5",
							},
							new Skill[] {
									Skill.craft.withBonus(10),
									Skill.hack.withBonus(0),
									Skill.repair.withBonus(10),
									Skill.useTech.withBonus(20),
							},
							new SpecialRule[] {
									Talent.gunslinger,
									Talent.knowledgable.withParameter("Tech"),
									Talent.language.withParameter("Binary + Low Gothic"),
									Talent.luminenShock,
									Talent.masterGunslinger,
									Talent.operate.withParameter("1 Vehicle Type"),
									Talent.trade.withParameter("Armourer"),
									Bionic.interfacePort,
									Bionic.internalReservoir,
									Bionic.luminenCapacitor,
									Bionic.mechanicusImplants,
									Bionic.mechadendrite_ballistic,
									Bionic.mindImpulseUnit,
									Bionic.vocalImplant,
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
			.withStartingPaths(
					new BackgroundPath("Cleric",
							new String[] {
									
							},
							new Skill[] {
									
							},
							new SpecialRule[] {
									
							},
							new Item[] {
									
							}
							)
					),
			new Background("Imperial Guard", "Fieldcraft or Leadership")
			.withStartingPaths(
					new BackgroundPath("Veteran",
							new String[] {
									
							},
							new Skill[] {
									
							},
							new SpecialRule[] {
									
							},
							new Item[] {
									
							}
							)
					),
			new Background("Outcast", "Fieldcraft or Social")
			.withStartingPaths(
					new BackgroundPath("xxxxxxxxxx",
							new String[] {
									
							},
							new Skill[] {
									
							},
							new SpecialRule[] {
									
							},
							new Item[] {
									
							}
							)
					)
	};
	
	static class BackgroundPath {
		String name;
		String[] characteristicsIncreaseList;
		Skill[] skillList;
		SpecialRule[] specialRuleList;
		Item[] itemList;
		
		BackgroundPath(String name, String[] characteristicsIncreaseList, Skill[] skillList, SpecialRule[] specialRuleList, Item[] equipmentList) {
			this.name = name;
			this.characteristicsIncreaseList = characteristicsIncreaseList;
			this.skillList = skillList;
			this.specialRuleList = specialRuleList;
			this.itemList = equipmentList;
		}
	}
}