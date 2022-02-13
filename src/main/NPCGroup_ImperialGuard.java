package main;
class NPCGroup_ImperialGuard extends NPCGroup {

	NPCGroup_ImperialGuard() {
		super("Imperial Guard");
	}

	@Override
	protected void setNPCList() {
		NPC npc;
		
		npc = new NPC("Conscript", "35,35,30,30,30,30,30,30,30");
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.equippedItemList.add(Clothing.militaryUniform);
		npc.equippedItemList.add(Armour.flakArmour);
		npc.inventoryList.add(RangedWeapon.lasgun_bayonet);
		npc.inventoryList.add(Ammo.lasgun_powerPack.times(2));
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Guard", "35,40,30,30,30,30,30,30,30");
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.equippedItemList.add(Clothing.militaryUniform);
		npc.equippedItemList.add(Armour.flakArmour);
		npc.inventoryList.add(RangedWeapon.lasgun_bayonet);
		npc.inventoryList.add(Ammo.lasgun_powerPack.times(2));
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Specialist (Armsman)", "35,45,30,30,30,30,30,30,30");
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.weaponFamiliarity_ranged.withParameter("Heavy Stubber"));
		npc.equippedItemList.add(Clothing.militaryUniform);
		npc.equippedItemList.add(Armour.flakArmour);
		npc.equippedItemList.add(RangedWeapon.heavyStubber);
		npc.inventoryList.add(RangedWeapon.laspistol);
		npc.inventoryList.add(Ammo.laspistol_powerPack.times(2));
		npc.inventoryList.add(ThrownWeapon.fragHandGrenade);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Specialist (Comms)", "35,40,40,30,30,30,30,30,30");
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.equippedItemList.add(Clothing.militaryUniform);
		npc.equippedItemList.add(MiscItem.voxCaster);
		npc.equippedItemList.add(Armour.flakArmour);
		npc.skillList.add(Skill.useTech.withBonus(0));
		npc.inventoryList.add(RangedWeapon.laspistol);
		npc.inventoryList.add(Ammo.lasgun_powerPack);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Specialist (Demolitions)", "35,40,30,30,30,30,30,30,30");
		npc.specialRuleList.add(Talent.demolitionsExpert);
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.equippedItemList.add(Clothing.militaryUniform);
		npc.equippedItemList.add(Armour.flakArmour);
		npc.skillList.add(Skill.useTech.withBonus(10));
		npc.inventoryList.add(MiscItem.explosiveCharge);
		npc.inventoryList.add(MiscItem.remoteDetonator);
		npc.inventoryList.add(RangedWeapon.laspistol);
		npc.inventoryList.add(Ammo.laspistol_powerPack);
		npc.inventoryList.add(ThrownWeapon.krakHandGrenade);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Specialist (Driver)", "35,40,30,30,30,40,30,30,30");
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Tech"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.operate_int.withParameter("Wheeled/Tracked/Walker/Flier"));
		npc.equippedItemList.add(Clothing.militaryUniform);
		npc.equippedItemList.add(Armour.flakArmour);
		npc.inventoryList.add(RangedWeapon.laspistol);
		npc.inventoryList.add(Ammo.laspistol_powerPack);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Specialist (Medic)", "35,40,30,30,30,30,30,30,30");
		npc.specialRuleList.add(Talent.firstAider);
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.skillList.add(Skill.administerDrug.withBonus(10));
		npc.skillList.add(Skill.treatWounds.withBonus(0));
		npc.equippedItemList.add(Clothing.militaryUniform);
		npc.equippedItemList.add(Armour.flakArmour);
		npc.inventoryList.add(Consumable.medkit);
		npc.inventoryList.add(Consumable.injector_stimm.times(3));
		npc.inventoryList.add(RangedWeapon.laspistol);
		npc.inventoryList.add(Ammo.laspistol_powerPack);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Sergeant", "35,45,30,30,30,30,30,30,30");
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.weaponFamiliarity_ranged.withParameter("Lasgun"));
		npc.skillList.add(Skill.command.withBonus(10));
		npc.skillList.add(Skill.navigate.withBonus(10));
		npc.skillList.add(Skill.notice.withBonus(10));
		npc.equippedItemList.add(Clothing.militaryUniform);
		npc.equippedItemList.add(Armour.flakArmour);
		npc.inventoryList.add(RangedWeapon.lasgun_bayonet);
		npc.inventoryList.add(Ammo.lasgun_powerPack.times(3));
		npc.inventoryList.add(ThrownWeapon.fragHandGrenade);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.handVox);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Veteran", "40,45,40,40,30,30,30,30,30"); // 6+14+6+6=32 XP
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Imperial Guard"));// 2 XP
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.nervesOfSteel);// 4 XP
		npc.specialRuleList.add(Talent.rapidReload);// 2 XP
		npc.specialRuleList.add(Talent.recoilCompensation);// 4 XP
		npc.specialRuleList.add(Talent.weaponMaster_ranged.withParameter("Lasgun"));// 6 XP
		npc.skillList.add(Skill.command.withBonus(10));// 2 XP
		npc.skillList.add(Skill.navigate.withBonus(10));// 2 XP
		npc.skillList.add(Skill.notice.withBonus(10));// 2 XP
		npc.skillList.add(Skill.reflex.withBonus(10));// 2 XP
		npc.skillList.add(Skill.parry.withBonus(10));// 2 XP
		npc.equippedItemList.add(Clothing.militaryUniform);
		npc.equippedItemList.add(Armour.flakArmour);
		npc.inventoryList.add(RangedWeapon.lasgun_bayonet);
		npc.inventoryList.add(Ammo.lasgun_powerPack.times(3));
		npc.inventoryList.add(ThrownWeapon.fragHandGrenade.times(2));
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 32+2+4+2+4+6+2+2+2+2+2=60/60
		npcList.add(npc);
		
		npc = new NPC("Assault Veteran", "40,45,40,40,35,30,30,30,30");
		npc.specialRuleList.add(Talent.assaultFire);
		npc.specialRuleList.add(Talent.hipShooting);
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Imperial Guard"));// 2 XP
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.nervesOfSteel);
		npc.specialRuleList.add(Talent.rapidReload);
		npc.specialRuleList.add(Talent.recoilCompensation);
		npc.specialRuleList.add(Talent.weaponMaster_ranged.withParameter("Lasgun"));
		npc.skillList.add(Skill.command.withBonus(10));
		npc.skillList.add(Skill.navigate.withBonus(10));
		npc.skillList.add(Skill.notice.withBonus(10));
		npc.skillList.add(Skill.reflex.withBonus(10));
		npc.skillList.add(Skill.run.withBonus(20));
		npc.skillList.add(Skill.parry.withBonus(20));
		npc.equippedItemList.add(Clothing.militaryUniform);
		npc.equippedItemList.add(Armour.flakArmour);
		npc.inventoryList.add(MeleeWeapon.chainsword);
		npc.inventoryList.add(RangedWeapon.lasgun_bayonet);
		npc.inventoryList.add(Ammo.lasgun_powerPack.times(3));
		npc.inventoryList.add(ThrownWeapon.fragHandGrenade.times(2));
		npc.inventoryList.add(ThrownWeapon.krakHandGrenade);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Lieutenant", "40,45,40,40,30,30,30,30,35");
		npc.specialRuleList.add(Talent.commanding);// 4 XP
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Imperial Guard"));// 2 XP
		npc.specialRuleList.add(Talent.language.withParameter("Imperial Codes + Low Gothic"));// 4 XP
		npc.specialRuleList.add(Talent.nervesOfSteel);// 4 XP
		npc.specialRuleList.add(Talent.rapidReload);// 2 XP
		npc.specialRuleList.add(Talent.weaponMaster_ranged.withParameter("Laspistol"));// 6 XP
		npc.skillList.add(Skill.command.withBonus(20));// 6 XP
		npc.skillList.add(Skill.navigate.withBonus(20));// 6 XP
		npc.skillList.add(Skill.notice.withBonus(20));// 6 XP
		npc.skillList.add(Skill.reflex.withBonus(10));// 2 XP
		npc.skillList.add(Skill.parry.withBonus(10));// 2 XP
		npc.equippedItemList.add(Clothing.militaryUniform);
		npc.equippedItemList.add(Armour.flakArmour);
		npc.inventoryList.add(MeleeWeapon.longsword);
		npc.inventoryList.add(RangedWeapon.laspistol);
		npc.inventoryList.add(Ammo.laspistol_powerPack.times(2));
		npc.inventoryList.add(MiscItem.handVox);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: ??/80
		npcList.add(npc);
		
		npc = new NPC("Scout", "40,45,40,40,35,30,30,30,30");
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Imperial Guard"));// 2 XP
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.nervesOfSteel);
		npc.specialRuleList.add(Talent.rapidReload);
		npc.specialRuleList.add(Talent.recoilCompensation);
		npc.specialRuleList.add(Talent.sprinter);
		npc.specialRuleList.add(Talent.weaponMaster_ranged.withParameter("Lasgun"));
		npc.skillList.add(Skill.command.withBonus(10));
		npc.skillList.add(Skill.dodge.withBonus(10));
		npc.skillList.add(Skill.navigate.withBonus(10));
		npc.skillList.add(Skill.notice.withBonus(20));
		npc.skillList.add(Skill.reflex.withBonus(10));
		npc.skillList.add(Skill.parry.withBonus(10));
		npc.skillList.add(Skill.run.withBonus(20));
		npc.skillList.add(Skill.sneak.withBonus(10));
		npc.equippedItemList.add(Clothing.militaryUniform);
		npc.equippedItemList.add(Armour.flakArmour);
		npc.inventoryList.add(RangedWeapon.lasgun_bayonet);
		npc.inventoryList.add(Ammo.lasgun_powerPack.times(3));
		npc.inventoryList.add(Tool.grapnel);
		npc.inventoryList.add(Tool.magnoculars);
		npc.inventoryList.add(MiscItem.handVox);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Shock Trooper", "45,45,40,40,40,30,35,30,30");
		npc.specialRuleList.add(Talent.assaultFire);
		npc.specialRuleList.add(Talent.hipShooting);
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Imperial Guard"));// 2 XP
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.nervesOfSteel);
		npc.specialRuleList.add(Talent.rapidReload);
		npc.specialRuleList.add(Talent.recoilCompensation);
		npc.specialRuleList.add(Talent.weaponMaster_ranged.withParameter("Lasgun"));
		npc.skillList.add(Skill.command.withBonus(10));
		npc.skillList.add(Skill.dodge.withBonus(10));
		npc.skillList.add(Skill.navigate.withBonus(10));
		npc.skillList.add(Skill.notice.withBonus(10));
		npc.skillList.add(Skill.reflex.withBonus(20));
		npc.skillList.add(Skill.run.withBonus(20));
		npc.skillList.add(Skill.parry.withBonus(20));
		npc.equippedItemList.add(Clothing.militaryUniform);
		npc.equippedItemList.add(Armour.flakArmour);
		npc.equippedItemList.add(Tool.gasMask);
		npc.equippedItemList.add(Tool.photoVisor);
		npc.inventoryList.add(MeleeWeapon.chainsword);
		npc.inventoryList.add(RangedWeapon.lasgun_bayonet);
		npc.inventoryList.add(Ammo.lasgun_powerPack.times(3));
		npc.inventoryList.add(ThrownWeapon.fragHandGrenade.times(2));
		npc.inventoryList.add(ThrownWeapon.krakHandGrenade.times(2));
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Captain", "40,45,40,40,30,30,30,30,40");
		npc.specialRuleList.add(Talent.commanding);
		npc.specialRuleList.add(Talent.experienced.withParameter("Imperial Guard + War"));
		npc.specialRuleList.add(Talent.language.withParameter("Imperial Codes + Low Gothic"));
		npc.specialRuleList.add(Talent.meleeShooting);
		npc.specialRuleList.add(Talent.nervesOfSteel);
		npc.specialRuleList.add(Talent.publicSpeaker);
		npc.specialRuleList.add(Talent.rapidReload);
		npc.specialRuleList.add(Talent.weaponMaster_ranged.withParameter("Laspistol"));
		npc.skillList.add(Skill.command.withBonus(20));
		npc.skillList.add(Skill.navigate.withBonus(20));
		npc.skillList.add(Skill.notice.withBonus(20));
		npc.skillList.add(Skill.reflex.withBonus(10));
		npc.skillList.add(Skill.parry.withBonus(10));
		npc.equippedItemList.add(Clothing.militaryUniform);
		npc.equippedItemList.add(Armour.flakArmour);
		npc.inventoryList.add(MeleeWeapon.longsword);
		npc.inventoryList.add(RangedWeapon.laspistol);
		npc.inventoryList.add(Ammo.laspistol_powerPack.times(2));
		npc.inventoryList.add(MiscItem.handVox);
		npc.inventoryList.add(Tool.magnoculars);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Marksman", "40,50,40,40,35,30,35,30,30");
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Imperial Guard"));// 2 XP
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.marksman);
		npc.specialRuleList.add(Talent.nervesOfSteel);
		npc.specialRuleList.add(Talent.rapidReload);
		npc.specialRuleList.add(Talent.recoilCompensation);
		npc.specialRuleList.add(Talent.sprinter);
		npc.specialRuleList.add(Talent.weaponMaster_ranged.withParameter("Lasgun"));
		npc.skillList.add(Skill.command.withBonus(10));
		npc.skillList.add(Skill.dodge.withBonus(10));
		npc.skillList.add(Skill.navigate.withBonus(10));
		npc.skillList.add(Skill.notice.withBonus(20));
		npc.skillList.add(Skill.reflex.withBonus(10));
		npc.skillList.add(Skill.parry.withBonus(10));
		npc.skillList.add(Skill.run.withBonus(20));
		npc.skillList.add(Skill.sneak.withBonus(10));
		npc.equippedItemList.add(Clothing.militaryUniform);
		npc.equippedItemList.add(Armour.flakArmour);
		npc.inventoryList.add(RangedWeapon.longLas);
		npc.inventoryList.add(Ammo.longLas_powerPack.times(3));
		npc.inventoryList.add(Tool.grapnel);
		npc.inventoryList.add(Tool.magnoculars);
		npc.inventoryList.add(MiscItem.handVox);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Storm Trooper", "45,45,40,40,40,30,40,35,30");
		npc.specialRuleList.add(Talent.adamantiumWill);
		npc.specialRuleList.add(Talent.assaultFire);
		npc.specialRuleList.add(Talent.constantVigilance);
		npc.specialRuleList.add(Talent.hipShooting);
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Imperial Guard"));// 2 XP
		npc.specialRuleList.add(Talent.language.withParameter("Imperial Codes + Low Gothic"));
		npc.specialRuleList.add(Talent.nervesOfSteel);
		npc.specialRuleList.add(Talent.rapidReload);
		npc.specialRuleList.add(Talent.recoilCompensation);
		npc.specialRuleList.add(Talent.weaponMaster_ranged.withParameter("Lasgun"));
		npc.skillList.add(Skill.command.withBonus(10));
		npc.skillList.add(Skill.dodge.withBonus(30));
		npc.skillList.add(Skill.navigate.withBonus(10));
		npc.skillList.add(Skill.notice.withBonus(20));
		npc.skillList.add(Skill.reflex.withBonus(30));
		npc.skillList.add(Skill.run.withBonus(20));
		npc.skillList.add(Skill.parry.withBonus(30));
		npc.equippedItemList.add(Clothing.militaryUniform);
		npc.equippedItemList.add(Armour.flakArmour);
		npc.equippedItemList.add(Tool.gasMask);
		npc.equippedItemList.add(MiscItem.infraRedGoggles);
		npc.inventoryList.add(MeleeWeapon.chainsword);
		npc.inventoryList.add(RangedWeapon.lasgun_bayonet);
		npc.inventoryList.add(Ammo.lasgun_powerPack.times(2));
		npc.inventoryList.add(ThrownWeapon.fragHandGrenade.times(2));
		npc.inventoryList.add(ThrownWeapon.gasHandGrenade_painPoison.times(2));
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Commander", "40,45,40,40,30,35,35,35,40");
		npc.specialRuleList.add(Talent.commanding);
		npc.specialRuleList.add(Talent.experienced.withParameter("Imperial Guard + War"));
		npc.specialRuleList.add(Talent.expert.withParameter("Tactica Imperialis"));
		npc.specialRuleList.add(Talent.haloOfCommand);
		npc.specialRuleList.add(Talent.intoTheJawsOfHell);
		npc.specialRuleList.add(Talent.ironDiscipline);
		npc.specialRuleList.add(Talent.language.withParameter("Imperial Codes + Low Gothic"));
		npc.specialRuleList.add(Talent.meleeShooting);
		npc.specialRuleList.add(Talent.nervesOfSteel);
		npc.specialRuleList.add(Talent.publicSpeaker);
		npc.specialRuleList.add(Talent.rapidReload);
		npc.specialRuleList.add(Talent.weaponMaster_ranged.withParameter("Laspistol"));
		npc.skillList.add(Skill.command.withBonus(30));
		npc.skillList.add(Skill.inspire.withBonus(10));
		npc.skillList.add(Skill.intimidate.withBonus(10));
		npc.skillList.add(Skill.navigate.withBonus(20));
		npc.skillList.add(Skill.notice.withBonus(20));
		npc.skillList.add(Skill.referenceLore.withBonus(20));// 6 XP
		npc.skillList.add(Skill.reflex.withBonus(10));
		npc.skillList.add(Skill.parry.withBonus(10));
		npc.equippedItemList.add(Clothing.militaryUniform);
		npc.equippedItemList.add(Armour.flakArmour);
		npc.inventoryList.add(MeleeWeapon.longsword_mono);
		npc.inventoryList.add(RangedWeapon.laspistol);
		npc.inventoryList.add(Ammo.laspistol_powerPack.times(2));
		npc.inventoryList.add(MiscItem.handVox);
		npc.inventoryList.add(Tool.magnoculars);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Sniper", "40,55,40,40,35,30,35,30,30");
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Imperial Guard"));// 2 XP
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.marksman);
		npc.specialRuleList.add(Talent.nervesOfSteel);
		npc.specialRuleList.add(Talent.rapidReload);
		npc.specialRuleList.add(Talent.recoilCompensation);
		npc.specialRuleList.add(Talent.sniperShot);
		npc.specialRuleList.add(Talent.sprinter);
		npc.specialRuleList.add(Talent.weaponMaster_ranged.withParameter("Long Las"));
		npc.skillList.add(Skill.command.withBonus(10));
		npc.skillList.add(Skill.conceal.withBonus(20));
		npc.skillList.add(Skill.dodge.withBonus(10));
		npc.skillList.add(Skill.navigate.withBonus(10));
		npc.skillList.add(Skill.notice.withBonus(20));
		npc.skillList.add(Skill.reflex.withBonus(10));
		npc.skillList.add(Skill.parry.withBonus(10));
		npc.skillList.add(Skill.run.withBonus(20));
		npc.skillList.add(Skill.sneak.withBonus(10));
		npc.equippedItemList.add(Clothing.militaryUniform);
		npc.equippedItemList.add(Armour.flakArmour);
		npc.inventoryList.add(RangedWeapon.longLas_scoped);
		npc.inventoryList.add(Ammo.longLas_powerPack.times(3));
		npc.inventoryList.add(Tool.grapnel);
		npc.inventoryList.add(Tool.magnoculars);
		npc.inventoryList.add(MiscItem.handVox);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.lhoSticks);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
	}
}