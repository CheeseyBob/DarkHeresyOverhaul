package main;
class NPCGroup_AdeptusArbites extends NPCGroup {

	NPCGroup_AdeptusArbites() {
		super("Adeptus Arbites");
	}

	@Override
	protected void setNPCList() {
		NPC npc;
		
		npc = new NPC("Trooper", "35,35,30,30,30,30,30,30,30");
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.equippedItemList.add(Clothing.enforcerUniform);
		npc.equippedItemList.add(Armour.flakJacket);
		npc.inventoryList.add(MeleeWeapon.club);
		npc.inventoryList.add(RangedWeapon.pistol);
		npc.inventoryList.add(Ammo.pistol_mag);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Enforcer", "35,35,35,35,30,30,30,30,30");
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.equippedItemList.add(Clothing.enforcerUniform);
		npc.equippedItemList.add(Armour.flakCoat);
		npc.inventoryList.add(MeleeWeapon.club);
		npc.inventoryList.add(RangedWeapon.pistol);
		npc.inventoryList.add(Ammo.pistol_mag);
		npc.inventoryList.add(MiscItem.manacles);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Regulator", "35,35,35,35,30,30,30,30,30");
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.skillList.add(Skill.grapple.withBonus(10));
		npc.skillList.add(Skill.knockDown.withBonus(10));
		npc.skillList.add(Skill.notice.withBonus(10));
		npc.skillList.add(Skill.run.withBonus(10));
		npc.equippedItemList.add(Clothing.enforcerUniform);
		npc.equippedItemList.add(Armour.flakCoat);
		npc.inventoryList.add(MeleeWeapon.club);
		npc.inventoryList.add(RangedWeapon.pumpActionShotgun);
		npc.inventoryList.add(Ammo.pumpActionShotgun_mag);
		npc.inventoryList.add(RangedWeapon.pistol);
		npc.inventoryList.add(Ammo.pistol_mag);
		npc.inventoryList.add(MiscItem.handVox);
		npc.inventoryList.add(MiscItem.manacles);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Investigator", "35,35,35,35,35,30,35,30,30");
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.skillList.add(Skill.grapple.withBonus(10));
		npc.skillList.add(Skill.inquire.withBonus(10));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.interrogate.withBonus(10));
		npc.skillList.add(Skill.knockDown.withBonus(10));
		npc.skillList.add(Skill.notice.withBonus(10));
		npc.skillList.add(Skill.run.withBonus(10));
		npc.equippedItemList.add(Clothing.enforcerUniform);
		npc.equippedItemList.add(Armour.flakCoat);
		npc.inventoryList.add(MeleeWeapon.club);
		npc.inventoryList.add(RangedWeapon.pistol);
		npc.inventoryList.add(Ammo.pistol_mag);
		npc.inventoryList.add(MiscItem.handVox);
		npc.inventoryList.add(MiscItem.manacles);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Arbitrator", "40,40,40,40,35,35,35,30,30");
		npc.specialRuleList.add(Talent.educated.withParameter("Judgement"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.skillList.add(Skill.grapple.withBonus(10));
		npc.skillList.add(Skill.inquire.withBonus(10));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.interrogate.withBonus(10));
		npc.skillList.add(Skill.knockDown.withBonus(10));
		npc.skillList.add(Skill.notice.withBonus(10));
		npc.skillList.add(Skill.referenceCommonLore.withBonus(10));
		npc.skillList.add(Skill.referenceScholasticLore.withBonus(10));
		npc.skillList.add(Skill.run.withBonus(10));
		npc.equippedItemList.add(Clothing.arbitesUniform);
		npc.equippedItemList.add(Armour.carapaceChestplate);
		npc.inventoryList.add(MeleeWeapon.shockMaul);
		npc.inventoryList.add(RangedWeapon.shotgun_arbites);
		npc.inventoryList.add(Ammo.shotgun_arbites_mag);
		npc.inventoryList.add(RangedWeapon.pistol_arbites);
		npc.inventoryList.add(Ammo.pistol_mag);
		npc.inventoryList.add(MiscItem.manacles);
		npc.inventoryList.add(MiscItem.microBead);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Proctor", "40,40,40,40,35,35,35,30,30");
		npc.specialRuleList.add(Talent.dominatingBellow);
		npc.specialRuleList.add(Talent.intimidating);
		npc.specialRuleList.add(Talent.educated.withParameter("Judgement"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.skillList.add(Skill.command.withBonus(20));
		npc.skillList.add(Skill.grapple.withBonus(10));
		npc.skillList.add(Skill.inquire.withBonus(10));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.interrogate.withBonus(10));
		npc.skillList.add(Skill.intimidate.withBonus(20));
		npc.skillList.add(Skill.knockDown.withBonus(10));
		npc.skillList.add(Skill.notice.withBonus(10));
		npc.skillList.add(Skill.referenceCommonLore.withBonus(10));
		npc.skillList.add(Skill.referenceScholasticLore.withBonus(10));
		npc.skillList.add(Skill.run.withBonus(10));
		npc.equippedItemList.add(Clothing.arbitesUniform);
		npc.equippedItemList.add(Armour.carapaceArmour);
		npc.inventoryList.add(MeleeWeapon.shockMaul);
		npc.inventoryList.add(RangedWeapon.shotgun_arbites);
		npc.inventoryList.add(Ammo.shotgun_arbites_mag);
		npc.inventoryList.add(RangedWeapon.pistol_arbites);
		npc.inventoryList.add(Ammo.pistol_mag);
		npc.inventoryList.add(MiscItem.manacles);
		npc.inventoryList.add(MiscItem.microBead);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Intelligencer", "40,40,40,40,35,40,40,30,35");
		npc.specialRuleList.add(Talent.coordinatedInterrogation);
		npc.specialRuleList.add(Talent.educated.withParameter("Judgement"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.skillList.add(Skill.contemplate.withBonus(10));
		npc.skillList.add(Skill.inquire.withBonus(20));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.interrogate.withBonus(20));
		npc.skillList.add(Skill.notice.withBonus(10));
		npc.skillList.add(Skill.readPerson.withBonus(10));
		npc.skillList.add(Skill.referenceCommonLore.withBonus(10));
		npc.skillList.add(Skill.referenceScholasticLore.withBonus(20));
		npc.skillList.add(Skill.run.withBonus(10));
		npc.skillList.add(Skill.search.withBonus(10));
		npc.equippedItemList.add(Clothing.arbitesUniform);
		npc.equippedItemList.add(Armour.carapaceChestplate);
		npc.inventoryList.add(MeleeWeapon.shockMaul);
		npc.inventoryList.add(RangedWeapon.shotgun_arbites);
		npc.inventoryList.add(Ammo.shotgun_arbites_mag);
		npc.inventoryList.add(RangedWeapon.pistol_arbites);
		npc.inventoryList.add(Ammo.pistol_mag);
		npc.inventoryList.add(MiscItem.manacles);
		npc.inventoryList.add(MiscItem.microBead);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Marshall", "40,40,40,40,35,35,35,35,35");
		npc.specialRuleList.add(Talent.dominatingBellow);
		npc.specialRuleList.add(Talent.intimidating);
		npc.specialRuleList.add(Talent.nervesOfSteel);
		npc.specialRuleList.add(Talent.publicSpeaker);
		npc.specialRuleList.add(Talent.educated.withParameter("Judgement + Tactica Imperialis"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.skillList.add(Skill.command.withBonus(30));
		npc.skillList.add(Skill.grapple.withBonus(10));
		npc.skillList.add(Skill.inquire.withBonus(10));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.interrogate.withBonus(10));
		npc.skillList.add(Skill.intimidate.withBonus(20));
		npc.skillList.add(Skill.knockDown.withBonus(10));
		npc.skillList.add(Skill.notice.withBonus(10));
		npc.skillList.add(Skill.referenceCommonLore.withBonus(10));
		npc.skillList.add(Skill.referenceScholasticLore.withBonus(10));
		npc.skillList.add(Skill.run.withBonus(10));
		npc.equippedItemList.add(Clothing.arbitesUniform);
		npc.equippedItemList.add(Armour.heavyCarapace);
		npc.inventoryList.add(MeleeWeapon.shockMaul_mastercrafted);
		npc.inventoryList.add(RangedWeapon.boltPistol);
		npc.inventoryList.add(Ammo.boltPistol_mag.times(2));
		npc.inventoryList.add(MiscItem.microBead);
		npc.inventoryList.add(MiscItem.lhoSticks_quality);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Magistrate", "40,40,40,40,35,45,40,35,35");
		npc.specialRuleList.add(Talent.coordinatedInterrogation);
		npc.specialRuleList.add(Talent.specialist.withParameter("Judgement"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.skillList.add(Skill.contemplate.withBonus(10));
		npc.skillList.add(Skill.inquire.withBonus(20));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.interrogate.withBonus(20));
		npc.skillList.add(Skill.notice.withBonus(10));
		npc.skillList.add(Skill.readPerson.withBonus(10));
		npc.skillList.add(Skill.referenceCommonLore.withBonus(10));
		npc.skillList.add(Skill.referenceScholasticLore.withBonus(20));
		npc.skillList.add(Skill.run.withBonus(10));
		npc.skillList.add(Skill.search.withBonus(10));
		npc.equippedItemList.add(Clothing.imperialRobes);
		npc.equippedItemList.add(MeleeWeapon.staff);
		npc.inventoryList.add(Tool.dataTome_judgement);
		npc.inventoryList.add(Tool.writingKit);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Lord Marshall", "45,45,45,50,35,35,35,35,35");
		npc.specialRuleList.add(Talent.dominatingBellow);
		npc.specialRuleList.add(Talent.intimidating);
		npc.specialRuleList.add(Talent.nervesOfSteel);
		npc.specialRuleList.add(Talent.publicSpeaker);
		npc.specialRuleList.add(Talent.educated.withParameter("Judgement + Tactica Imperialis"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.skillList.add(Skill.command.withBonus(30));
		npc.skillList.add(Skill.grapple.withBonus(10));
		npc.skillList.add(Skill.inquire.withBonus(10));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.interrogate.withBonus(10));
		npc.skillList.add(Skill.intimidate.withBonus(20));
		npc.skillList.add(Skill.knockDown.withBonus(10));
		npc.skillList.add(Skill.notice.withBonus(10));
		npc.skillList.add(Skill.referenceCommonLore.withBonus(10));
		npc.skillList.add(Skill.referenceScholasticLore.withBonus(10));
		npc.skillList.add(Skill.run.withBonus(10));
		npc.equippedItemList.add(Clothing.arbitesUniform);
		npc.equippedItemList.add(Armour.heavyCarapace);
		npc.inventoryList.add(MeleeWeapon.shockMaul_mastercrafted);
		npc.inventoryList.add(RangedWeapon.boltPistol);
		npc.inventoryList.add(Ammo.boltPistol_mag.times(2));
		npc.inventoryList.add(MiscItem.microBead);
		npc.inventoryList.add(MiscItem.lhoSticks_quality);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Justicar", "40,40,40,40,35,45,40,35,35");
		npc.specialRuleList.add(Talent.coordinatedInterrogation);
		npc.specialRuleList.add(Talent.specialist.withParameter("Judgement"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.expert);
		npc.skillList.add(Skill.contemplate.withBonus(30));
		npc.skillList.add(Skill.inquire.withBonus(30));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.interrogate.withBonus(30));
		npc.skillList.add(Skill.notice.withBonus(10));
		npc.skillList.add(Skill.readPerson.withBonus(20));
		npc.skillList.add(Skill.referenceCommonLore.withBonus(10));
		npc.skillList.add(Skill.referenceScholasticLore.withBonus(30));
		npc.skillList.add(Skill.run.withBonus(10));
		npc.skillList.add(Skill.search.withBonus(10));
		npc.equippedItemList.add(Clothing.imperialRobes);
		npc.equippedItemList.add(MeleeWeapon.staff);
		npc.inventoryList.add(Tool.dataTome_judgement);
		npc.inventoryList.add(Tool.writingKit);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
	}
}