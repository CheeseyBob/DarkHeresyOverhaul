package main;

class NPCGroup_AdeptusMechanicus extends NPCGroup {

	NPCGroup_AdeptusMechanicus() {
		super("Adeptus Mechanicus");
	}

	@Override
	protected void setNPCList() {
		NPC npc;
		
		npc = new NPC("Technographer", "30,30,30,30,30,30,30,30,30");
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Tech"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.trade.withParameter("Armourer/Mason/Shipwright/Technomat/Wright"));
		npc.specialRuleList.add(Bionic.mechanicusImplants);
		npc.equippedItemList.add(Clothing.mechanicusRobes);
		npc.inventoryList.add(Tool.auspex);
		npc.inventoryList.add(Tool.combiTool);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Mech-Wright", "30,30,30,30,30,30,30,30,30");
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Tech"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.trade.withParameter("Armourer/Mason/Shipwright/Technomat/Wright"));
		npc.specialRuleList.add(Bionic.mechanicusImplants);
		npc.skillList.add(Skill.useTech.withBonus(0));
		npc.equippedItemList.add(Clothing.mechanicusRobes);
		npc.inventoryList.add(Tool.auspex);
		npc.inventoryList.add(Tool.combiTool);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Electro-Priest", "30,30,30,30,30,35,30,30,30");
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Tech"));
		npc.specialRuleList.add(Talent.language.withParameter("Binary + Low Gothic"));
		npc.specialRuleList.add(Talent.trade.withParameter("Armourer/Mason/Shipwright/Technomat/Wright"));
		npc.specialRuleList.add(Bionic.interfacePort);
		npc.specialRuleList.add(Bionic.luminenCapacitor);
		npc.specialRuleList.add(Bionic.mechanicusImplants);
		npc.skillList.add(Skill.hack.withBonus(0));
		npc.skillList.add(Skill.useTech.withBonus(0));
		npc.equippedItemList.add(Clothing.mechanicusRobes);
		npc.inventoryList.add(Tool.auspex);
		npc.inventoryList.add(Tool.combiTool);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Engine-Seer", "30,30,30,30,30,35,30,30,30");
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Tech"));
		npc.specialRuleList.add(Talent.language.withParameter("Binary + Low Gothic"));
		npc.specialRuleList.add(Talent.operate_int.withParameter("1 Vehicle Type"));
		npc.specialRuleList.add(Talent.trade.withParameter("Armourer/Mason/Shipwright/Technomat/Wright"));
		npc.specialRuleList.add(Bionic.augurArray);
		npc.specialRuleList.add(Bionic.interfacePort);
		npc.specialRuleList.add(Bionic.luminenCapacitor);
		npc.specialRuleList.add(Bionic.mechanicusImplants);
		npc.specialRuleList.add(Bionic.mindImpulseUnit);
		npc.skillList.add(Skill.craft.withBonus(10));
		npc.skillList.add(Skill.hack.withBonus(0));
		npc.skillList.add(Skill.repair.withBonus(10));
		npc.skillList.add(Skill.useTech.withBonus(20));
		npc.equippedItemList.add(Clothing.mechanicusRobes);
		npc.inventoryList.add(Tool.combiTool);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Tech-Priest (Chirurgeon)", "30,30,30,30,30,40,35,30,30");
		npc.specialRuleList.add(Talent.experienced.withParameter("Tech"));
		npc.specialRuleList.add(Talent.language.withParameter("Binary + Low Gothic"));
		npc.specialRuleList.add(Talent.operate_int.withParameter("1 Vehicle Type"));
		npc.specialRuleList.add(Talent.trade.withParameter("Armourer/Mason/Shipwright/Technomat/Wright"));
		npc.specialRuleList.add(Bionic.augurArray);
		npc.specialRuleList.add(Bionic.interfacePort);
		npc.specialRuleList.add(Bionic.internalReservoir);
		npc.specialRuleList.add(Bionic.luminenCapacitor);
		npc.specialRuleList.add(Bionic.mechanicusImplants);
		npc.specialRuleList.add(Bionic.mechadendrite_medicae);
		npc.specialRuleList.add(Bionic.mechadendrite_optical);
		npc.specialRuleList.add(Bionic.vocalImplant);
		npc.skillList.add(Skill.administerDrug.withBonus(10));
		npc.skillList.add(Skill.craft.withBonus(10));
		npc.skillList.add(Skill.hack.withBonus(0));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.performSurgery.withBonus(20));
		npc.skillList.add(Skill.repair.withBonus(10));
		npc.skillList.add(Skill.treatWounds.withBonus(20));
		npc.skillList.add(Skill.useTech.withBonus(20));
		npc.equippedItemList.add(Clothing.mechanicusRobes);
		npc.equippedItemList.add(MeleeWeapon.staff);
		npc.inventoryList.add(Consumable.qualityMedkit);
		npc.inventoryList.add(Tool.surgicalTools);
		npc.inventoryList.add(MiscItem.glowGlobe);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Tech-Priest (Militant)", "30,45,30,30,30,35,30,30,30");
		npc.specialRuleList.add(Talent.gunslinger);
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Tech"));
		npc.specialRuleList.add(Talent.language.withParameter("Binary + Low Gothic"));
		npc.specialRuleList.add(Talent.luminenShock);
		npc.specialRuleList.add(Talent.masterGunslinger);
		npc.specialRuleList.add(Talent.operate_int.withParameter("1 Vehicle Type"));
		npc.specialRuleList.add(Talent.trade.withParameter("Armourer"));
		npc.specialRuleList.add(Bionic.augurArray);
		npc.specialRuleList.add(Bionic.interfacePort);
		npc.specialRuleList.add(Bionic.internalReservoir);
		npc.specialRuleList.add(Bionic.luminenCapacitor);
		npc.specialRuleList.add(Bionic.mechanicusImplants);
		npc.specialRuleList.add(Bionic.mechadendrite_ballistic);
		npc.specialRuleList.add(Bionic.mechadendrite_ballistic);
		npc.specialRuleList.add(Bionic.mindImpulseUnit);
		npc.specialRuleList.add(Bionic.vocalImplant);
		npc.skillList.add(Skill.craft.withBonus(10));
		npc.skillList.add(Skill.hack.withBonus(0));
		npc.skillList.add(Skill.repair.withBonus(10));
		npc.skillList.add(Skill.useTech.withBonus(20));
		npc.equippedItemList.add(Clothing.mechanicusRobes);
		npc.equippedItemList.add(MeleeWeapon.staff);
		npc.inventoryList.add(RangedWeapon.laspistol);
		npc.inventoryList.add(Ammo.laspistol_powerPack.times(2));
		npc.inventoryList.add(Tool.auspex);
		npc.inventoryList.add(MiscItem.glowGlobe);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Tech-Priest", "30,30,30,35,30,40,35,30,30");
		npc.specialRuleList.add(Talent.experienced.withParameter("Tech"));
		npc.specialRuleList.add(Talent.language.withParameter("Binary + Low Gothic"));
		npc.specialRuleList.add(Talent.operate_int.withParameter("1 Vehicle Type"));
		npc.specialRuleList.add(Talent.trade.withParameter("Armourer/Mason/Shipwright/Technomat/Wright"));
		npc.specialRuleList.add(Bionic.augurArray);
		npc.specialRuleList.add(Bionic.ferricLure);
		npc.specialRuleList.add(Bionic.interfacePort);
		npc.specialRuleList.add(Bionic.internalReservoir);
		npc.specialRuleList.add(Bionic.luminenCapacitor);
		npc.specialRuleList.add(Bionic.mechanicusImplants);
		npc.specialRuleList.add(Bionic.mechadendrite_manipulator);
		npc.specialRuleList.add(Bionic.mechadendrite_utility);
		npc.specialRuleList.add(Bionic.mindImpulseUnit);
		npc.specialRuleList.add(Bionic.vocalImplant);
		npc.skillList.add(Skill.craft.withBonus(20));
		npc.skillList.add(Skill.hack.withBonus(20));
		npc.skillList.add(Skill.inspect.withBonus(20));
		npc.skillList.add(Skill.referenceLore.withBonus(10));
		npc.skillList.add(Skill.repair.withBonus(20));
		npc.skillList.add(Skill.useTech.withBonus(20));
		npc.equippedItemList.add(Clothing.mechanicusRobes);
		npc.equippedItemList.add(MeleeWeapon.staff);
		npc.inventoryList.add(Tool.combiTool);
		npc.inventoryList.add(MiscItem.glowGlobe);
		npc.inventoryList.add(Tool.lascutter);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Technomancer", "30,30,30,40,30,45,35,30,30");
		npc.specialRuleList.add(Talent.experienced.withParameter("Tech"));
		npc.specialRuleList.add(Talent.language.withParameter("Binary + Low Gothic"));
		npc.specialRuleList.add(Talent.operate_int.withParameter("1 Vehicle Type"));
		npc.specialRuleList.add(Talent.trade.withParameter("Armourer/Mason/Shipwright/Technomat/Wright"));
		npc.specialRuleList.add(Bionic.augurArray);
		npc.specialRuleList.add(Bionic.bionicEye_pair);
		npc.specialRuleList.add(Bionic.ferricLure);
		npc.specialRuleList.add(Bionic.interfacePort);
		npc.specialRuleList.add(Bionic.internalReservoir);
		npc.specialRuleList.add(Bionic.luminenCapacitor);
		npc.specialRuleList.add(Bionic.mechanicusImplants);
		npc.specialRuleList.add(Bionic.mechadendrite_manipulator);
		npc.specialRuleList.add(Bionic.mechadendrite_optical);
		npc.specialRuleList.add(Bionic.mechadendrite_utility);
		npc.specialRuleList.add(Bionic.mindImpulseUnit);
		npc.specialRuleList.add(Bionic.vocalImplant);
		npc.skillList.add(Skill.craft.withBonus(20));
		npc.skillList.add(Skill.hack.withBonus(20));
		npc.skillList.add(Skill.inspect.withBonus(20));
		npc.skillList.add(Skill.interrogate.withBonus(10));
		npc.skillList.add(Skill.referenceLore.withBonus(20));
		npc.skillList.add(Skill.repair.withBonus(20));
		npc.skillList.add(Skill.useTech.withBonus(20));
		npc.equippedItemList.add(Clothing.mechanicusRobes);
		npc.equippedItemList.add(MeleeWeapon.staff);
		npc.inventoryList.add(Tool.combiTool);
		npc.inventoryList.add(Tool.dataSlate);
		npc.inventoryList.add(MiscItem.glowGlobe);
		npc.inventoryList.add(Tool.lascutter);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Mech-Deacon", "35,35,30,35,30,40,35,30,30");
		npc.specialRuleList.add(Talent.experienced.withParameter("Tech"));
		npc.specialRuleList.add(Talent.language.withParameter("Binary + Low Gothic"));
		npc.specialRuleList.add(Talent.operate_int.withParameter("1 Vehicle Type"));
		npc.specialRuleList.add(Talent.trade.withParameter("Armourer/Mason/Shipwright/Technomat/Wright"));
		npc.specialRuleList.add(Bionic.augurArray);
		npc.specialRuleList.add(Bionic.bionicEye_pair);
		npc.specialRuleList.add(Bionic.ferricLure);
		npc.specialRuleList.add(Bionic.interfacePort);
		npc.specialRuleList.add(Bionic.internalReservoir);
		npc.specialRuleList.add(Bionic.luminenCapacitor);
		npc.specialRuleList.add(Bionic.mechanicusImplants);
		npc.specialRuleList.add(Bionic.mechadendrite_ballistic);
		npc.specialRuleList.add(Bionic.mechadendrite_manipulator);
		npc.specialRuleList.add(Bionic.mechadendrite_utility);
		npc.specialRuleList.add(Bionic.mindImpulseUnit);
		npc.specialRuleList.add(Bionic.vocalImplant);
		npc.skillList.add(Skill.craft.withBonus(20));
		npc.skillList.add(Skill.hack.withBonus(20));
		npc.skillList.add(Skill.inquire.withBonus(10));
		npc.skillList.add(Skill.inspect.withBonus(20));
		npc.skillList.add(Skill.interrogate.withBonus(10));
		npc.skillList.add(Skill.navigate.withBonus(10));
		npc.skillList.add(Skill.referenceLore.withBonus(20));
		npc.skillList.add(Skill.repair.withBonus(30));
		npc.skillList.add(Skill.search.withBonus(10));
		npc.skillList.add(Skill.useTech.withBonus(30));
		npc.equippedItemList.add(Clothing.mechanicusRobes);
		npc.equippedItemList.add(Armour.meshVest);
		npc.equippedItemList.add(MeleeWeapon.staff);
		npc.inventoryList.add(RangedWeapon.plasmaPistol);
		npc.inventoryList.add(Ammo.plasmaPistol_canister);
		npc.inventoryList.add(Tool.combiTool);
		npc.inventoryList.add(MiscItem.glowGlobe);
		npc.inventoryList.add(Tool.lascutter);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Cyber-Seer", "30,30,30,40,30,45,35,30,30");
		npc.insanity = 2;
		npc.specialRuleList.add(Talent.experienced.withParameter("Tech"));
		npc.specialRuleList.add(Talent.language.withParameter("Binary + Low Gothic"));
		npc.specialRuleList.add(Talent.operate_int.withParameter("1 Vehicle Type"));
		npc.specialRuleList.add(Talent.trade.withParameter("Armourer/Mason/Shipwright/Technomat/Wright"));
		npc.specialRuleList.add(Talent.unveiledSecrets.withParameter("Archeotech"));
		npc.specialRuleList.add(Bionic.augurArray);
		npc.specialRuleList.add(Bionic.bionicEye_pair);
		npc.specialRuleList.add(Bionic.bionicHearing);
		npc.specialRuleList.add(Bionic.bionicLungs);
		npc.specialRuleList.add(Bionic.cogitatorImplant);
		npc.specialRuleList.add(Bionic.ferricLure);
		npc.specialRuleList.add(Bionic.interfacePort);
		npc.specialRuleList.add(Bionic.internalReservoir);
		npc.specialRuleList.add(Bionic.luminenCapacitor);
		npc.specialRuleList.add(Bionic.mechanicusImplants);
		npc.specialRuleList.add(Bionic.mechadendrite_manipulator);
		npc.specialRuleList.add(Bionic.mechadendrite_optical);
		npc.specialRuleList.add(Bionic.mechadendrite_utility);
		npc.specialRuleList.add(Bionic.mindImpulseUnit_goodQuality);
		npc.specialRuleList.add(Bionic.vocalImplant);
		npc.skillList.add(Skill.craft.withBonus(20));
		npc.skillList.add(Skill.hack.withBonus(20));
		npc.skillList.add(Skill.inquire.withBonus(20));
		npc.skillList.add(Skill.inspect.withBonus(20));
		npc.skillList.add(Skill.interrogate.withBonus(20));
		npc.skillList.add(Skill.referenceLore.withBonus(30));
		npc.skillList.add(Skill.repair.withBonus(20));
		npc.skillList.add(Skill.useTech.withBonus(20));
		npc.equippedItemList.add(Clothing.mechanicusRobes);
		npc.equippedItemList.add(MeleeWeapon.staff);
		npc.inventoryList.add(Tool.combiTool);
		npc.inventoryList.add(Tool.dataSlate);
		npc.inventoryList.add(MiscItem.glowGlobe);
		npc.inventoryList.add(Tool.lascutter);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Omniprophet", "40,40,30,40,30,40,35,30,30");
		npc.specialRuleList.add(Talent.experienced.withParameter("Tech"));
		npc.specialRuleList.add(Talent.language.withParameter("Binary + Low Gothic"));
		npc.specialRuleList.add(Talent.operate_int.withParameter("1 Vehicle Type"));
		npc.specialRuleList.add(Talent.trade.withParameter("Armourer/Mason/Shipwright/Technomat/Wright"));
		npc.specialRuleList.add(Bionic.augurArray);
		npc.specialRuleList.add(Bionic.bionicEverything);
		npc.specialRuleList.add(Bionic.ferricLure);
		npc.specialRuleList.add(Bionic.interfacePort);
		npc.specialRuleList.add(Bionic.internalReservoir);
		npc.specialRuleList.add(Bionic.luminenCapacitor);
		npc.specialRuleList.add(Bionic.maglevCoils);
		npc.specialRuleList.add(Bionic.mechanicusImplants);
		npc.specialRuleList.add(Bionic.mechadendrite_ballistic);
		npc.specialRuleList.add(Bionic.mechadendrite_manipulator);
		npc.specialRuleList.add(Bionic.mechadendrite_optical);
		npc.specialRuleList.add(Bionic.mechadendrite_utility);
		npc.specialRuleList.add(Bionic.mindImpulseUnit);
		npc.skillList.add(Skill.craft.withBonus(20));
		npc.skillList.add(Skill.hack.withBonus(20));
		npc.skillList.add(Skill.inquire.withBonus(10));
		npc.skillList.add(Skill.inspect.withBonus(20));
		npc.skillList.add(Skill.interrogate.withBonus(10));
		npc.skillList.add(Skill.navigate.withBonus(20));
		npc.skillList.add(Skill.referenceLore.withBonus(10));
		npc.skillList.add(Skill.repair.withBonus(30));
		npc.skillList.add(Skill.search.withBonus(20));
		npc.skillList.add(Skill.useTech.withBonus(30));
		npc.equippedItemList.add(Clothing.mechanicusRobes);
		npc.equippedItemList.add(Armour.meshArmour);
		npc.equippedItemList.add(MeleeWeapon.staff);
		npc.inventoryList.add(MeleeWeapon.chainsword_mastercrafted);
		npc.inventoryList.add(RangedWeapon.plasmaPistol);
		npc.inventoryList.add(Ammo.plasmaPistol_canister);
		npc.inventoryList.add(Tool.combiTool);
		npc.inventoryList.add(MiscItem.lampPack);
		npc.inventoryList.add(Tool.lascutter);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Magos", "30,30,40,40,40,50,65,30,30");
		npc.insanity = 20;
		npc.specialRuleList.add(Talent.deepestSecrets.withParameter("Archeotech + The Warp"));
		npc.specialRuleList.add(Talent.educated.withParameter("Astronomy + Chymistry + Cryptology + Numerology"));
		npc.specialRuleList.add(Talent.experienced.withParameter("Tech"));
		npc.specialRuleList.add(Talent.language.withParameter("Binary + Low Gothic"));
		npc.specialRuleList.add(Talent.operate_int.withParameter("1 Vehicle Type"));
		npc.specialRuleList.add(Talent.trade.withParameter("Armourer/Mason/Shipwright/Technomat/Wright"));
		npc.specialRuleList.add(Bionic.augurArray_goodQuality);
		npc.specialRuleList.add(Bionic.bionicEverything_goodQuality);
		npc.specialRuleList.add(Bionic.cogitatorImplant);
		npc.specialRuleList.add(Bionic.ferricLure);
		npc.specialRuleList.add(Bionic.interfacePort);
		npc.specialRuleList.add(Bionic.internalReservoir);
		npc.specialRuleList.add(Bionic.luminenCapacitor);
		npc.specialRuleList.add(Bionic.mechanicusImplants);
		npc.specialRuleList.add(Bionic.mechadendrite_manipulator);
		npc.specialRuleList.add(Bionic.mechadendrite_manipulator);
		npc.specialRuleList.add(Bionic.mechadendrite_optical);
		npc.specialRuleList.add(Bionic.mechadendrite_utility);
		npc.specialRuleList.add(Bionic.mindImpulseUnit_goodQuality);
		npc.skillList.add(Skill.craft.withBonus(20));
		npc.skillList.add(Skill.hack.withBonus(20));
		npc.skillList.add(Skill.inquire.withBonus(20));
		npc.skillList.add(Skill.inspect.withBonus(20));
		npc.skillList.add(Skill.interrogate.withBonus(20));
		npc.skillList.add(Skill.referenceLore.withBonus(30));
		npc.skillList.add(Skill.repair.withBonus(20));
		npc.skillList.add(Skill.useTech.withBonus(20));
		npc.equippedItemList.add(Clothing.mechanicusRobes);
		npc.equippedItemList.add(MeleeWeapon.staff);
		npc.inventoryList.add(Tool.combiTool);
		npc.inventoryList.add(Tool.dataSlate);
		npc.inventoryList.add(MiscItem.glowGlobe);
		npc.inventoryList.add(Tool.lascutter);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Magos Errant", "45,45,50,45,45,40,70,40,30");
		npc.specialRuleList.add(Talent.experienced.withParameter("Tech"));
		npc.specialRuleList.add(Talent.ferricSummons);
		npc.specialRuleList.add(Talent.language.withParameter("Binary + Low Gothic"));
		npc.specialRuleList.add(Talent.maglevTranscendence);
		npc.specialRuleList.add(Talent.operate_int.withParameter("1 Vehicle Type"));
		npc.specialRuleList.add(Talent.trade.withParameter("Armourer/Mason/Shipwright/Technomat/Wright"));
		npc.specialRuleList.add(Bionic.augurArray);
		npc.specialRuleList.add(Bionic.bionicEverything_goodQuality);
		npc.specialRuleList.add(Bionic.ferricLure);
		npc.specialRuleList.add(Bionic.interfacePort);
		npc.specialRuleList.add(Bionic.internalReservoir);
		npc.specialRuleList.add(Bionic.luminenCapacitor);
		npc.specialRuleList.add(Bionic.maglevCoils);
		npc.specialRuleList.add(Bionic.mechanicusImplants);
		npc.specialRuleList.add(Bionic.mechadendrite_ballistic);
		npc.specialRuleList.add(Bionic.mechadendrite_manipulator);
		npc.specialRuleList.add(Bionic.mechadendrite_optical);
		npc.specialRuleList.add(Bionic.mechadendrite_utility);
		npc.specialRuleList.add(Bionic.mindImpulseUnit_goodQuality);
		npc.skillList.add(Skill.craft.withBonus(20));
		npc.skillList.add(Skill.hack.withBonus(20));
		npc.skillList.add(Skill.inquire.withBonus(10));
		npc.skillList.add(Skill.inspect.withBonus(20));
		npc.skillList.add(Skill.interrogate.withBonus(10));
		npc.skillList.add(Skill.navigate.withBonus(20));
		npc.skillList.add(Skill.referenceLore.withBonus(10));
		npc.skillList.add(Skill.repair.withBonus(30));
		npc.skillList.add(Skill.search.withBonus(20));
		npc.skillList.add(Skill.useTech.withBonus(30));
		npc.equippedItemList.add(Clothing.mechanicusRobes);
		npc.equippedItemList.add(Armour.meshArmour_coweled);
		npc.equippedItemList.add(MeleeWeapon.staff);
		npc.inventoryList.add(MeleeWeapon.chainsword_mastercrafted);
		npc.inventoryList.add(RangedWeapon.plasmaPistol);
		npc.inventoryList.add(Ammo.plasmaPistol_canister);
		npc.inventoryList.add(Tool.combiTool);
		npc.inventoryList.add(MiscItem.lampPack);
		npc.inventoryList.add(Tool.lascutter);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
	}
}