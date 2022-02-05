package main;
class NPCGroup_Outcasts extends NPCGroup {

	NPCGroup_Outcasts() {
		super("Outcasts");
	}

	@Override
	protected void setNPCList() {
		NPC npc;
		
		npc = new NPC("Dreg", "30,30,30,30,35,30,35,30,30");
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.equippedItemList.add(Clothing.ragCastings);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 4/5
		npcList.add(npc);
		
		npc = new NPC("Outcast", "30,30,30,30,35,30,35,30,30");
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.trade_survivalist);
		npc.skillList.add(Skill.run.withBonus(10));
		npc.equippedItemList.add(Clothing.ragCastings);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 8/10
		npcList.add(npc);
		
		npc = new NPC("Sell-Steel", "35,35,30,30,35,30,35,30,30");
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.equippedItemList.add(Armour.gangLeathers);
		npc.equippedItemList.add(Clothing.ragCastings);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(RangedWeapon.pistol);
		npc.inventoryList.add(Ammo.pistol_mag);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 8/10
		npcList.add(npc);
		
		npc = new NPC("Outlaw", "30,30,30,30,35,30,35,30,30");
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.trade_survivalist);
		npc.specialRuleList.add(Talent.trade_swindler);
		npc.skillList.add(Skill.run.withBonus(10));
		npc.skillList.add(Skill.search.withBonus(10));
		npc.skillList.add(Skill.sneak.withBonus(10));
		npc.skillList.add(Skill.unlock.withBonus(0));
		npc.equippedItemList.add(Clothing.streetClothes);
		npc.inventoryList.add(Tool.lockpick);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 18/20
		npcList.add(npc);
		
		npc = new NPC("Shadesman", "40,40,30,30,35,30,35,30,30");
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.skillList.add(Skill.sneak.withBonus(10));
		npc.equippedItemList.add(Armour.gangLeathers);
		npc.equippedItemList.add(Clothing.streetClothes);
		npc.inventoryList.add(MeleeWeapon.longDagger);
		npc.inventoryList.add(RangedWeapon.pistol);
		npc.inventoryList.add(Ammo.pistol_mag);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 18/20
		npcList.add(npc);
		
		npc = new NPC("Renegade", "30,30,30,30,35,35,35,30,35");
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.trade_survivalist);
		npc.specialRuleList.add(Talent.trade_swindler);
		npc.skillList.add(Skill.charm.withBonus(10));
		npc.skillList.add(Skill.deceive.withBonus(10));
		npc.skillList.add(Skill.run.withBonus(10));
		npc.skillList.add(Skill.search.withBonus(10));
		npc.skillList.add(Skill.sneak.withBonus(10));
		npc.skillList.add(Skill.unlock.withBonus(10));
		npc.equippedItemList.add(Clothing.streetClothes);
		npc.inventoryList.add(Tool.lockpick);
		npc.inventoryList.add(RangedWeapon.pistol);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 28/30
		npcList.add(npc);
		
		npc = new NPC("Nighthawk", "40,40,30,30,35,30,35,30,30");
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.skillList.add(Skill.conceal.withBonus(20));
		npc.skillList.add(Skill.sneak.withBonus(20));
		npc.equippedItemList.add(Clothing.streetClothes);
		npc.inventoryList.add(MeleeWeapon.longDagger);
		npc.inventoryList.add(RangedWeapon.pistol);
		npc.inventoryList.add(Ammo.pistol_mag);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 28/30
		npcList.add(npc);
		
		npc = new NPC("Rogue", "30,30,30,30,40,35,35,30,40");
		npc.specialRuleList.add(Talent.accustomedToDarkness);
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.quickEntry);
		npc.specialRuleList.add(Talent.sprinter);
		npc.specialRuleList.add(Talent.trade_survivalist);
		npc.specialRuleList.add(Talent.trade_swindler);
		npc.specialRuleList.add(Talent.tricksOfTheTrade);
		npc.skillList.add(Skill.charm.withBonus(10));
		npc.skillList.add(Skill.deceive.withBonus(10));
		npc.skillList.add(Skill.run.withBonus(10));
		npc.skillList.add(Skill.search.withBonus(10));
		npc.skillList.add(Skill.sneak.withBonus(20));
		npc.skillList.add(Skill.unlock.withBonus(20));
		npc.equippedItemList.add(Clothing.streetClothes);
		npc.inventoryList.add(Tool.multiKey);
		npc.inventoryList.add(Tool.stummer);
		npc.inventoryList.add(RangedWeapon.pistol);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 58/60
		npcList.add(npc);
		
		npc = new NPC("Ganger", "40,40,40,40,35,30,35,30,30");
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.skillList.add(Skill.dodge.withBonus(10));
		npc.skillList.add(Skill.intimidate.withBonus(20));
		npc.skillList.add(Skill.notice.withBonus(10));
		npc.skillList.add(Skill.reflex.withBonus(10));
		npc.skillList.add(Skill.run.withBonus(10));
		npc.skillList.add(Skill.search.withBonus(10));
		npc.skillList.add(Skill.sneak.withBonus(10));
		npc.skillList.add(Skill.unlock.withBonus(0));
		npc.equippedItemList.add(Armour.gangLeathers);
		npc.equippedItemList.add(Clothing.streetClothes);
		npc.inventoryList.add(RangedWeapon.autopistol);
		npc.inventoryList.add(Ammo.autopistol_mag);
		npc.inventoryList.add(MeleeWeapon.club);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 58/60
		npcList.add(npc);
		
		npc = new NPC("Assassin", "40,40,30,30,35,30,35,30,30");
		npc.specialRuleList.add(Talent.accustomedToDarkness);
		npc.specialRuleList.add(Talent.assassinStrike);
		npc.specialRuleList.add(Talent.carefulStrikes);
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.marksman);
		npc.skillList.add(Skill.conceal.withBonus(20));
		npc.skillList.add(Skill.deceive.withBonus(20));
		npc.skillList.add(Skill.disguise.withBonus(20));
		npc.skillList.add(Skill.sneak.withBonus(20));
		npc.equippedItemList.add(Clothing.streetClothes);
		npc.inventoryList.add(RangedWeapon.huntingRifle_scoped);
		npc.inventoryList.add(RangedWeapon.pistol);
		npc.inventoryList.add(Ammo.huntingRifle_mag);
		npc.inventoryList.add(MeleeWeapon.longDagger);
		npc.inventoryList.add(Consumable.vial_lethalPoison_3);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 60/60
		npcList.add(npc);
		
		npc = new NPC("Fixer", "30,30,30,30,40,40,40,30,40");
		npc.specialRuleList.add(Talent.accustomedToDarkness);
		npc.specialRuleList.add(Talent.experienced.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.peer.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.quickEntry);
		npc.specialRuleList.add(Talent.sprinter);
		npc.specialRuleList.add(Talent.trade_survivalist);
		npc.specialRuleList.add(Talent.trade_swindler);
		npc.specialRuleList.add(Talent.tricksOfTheTrade);
		npc.skillList.add(Skill.charm.withBonus(10));
		npc.skillList.add(Skill.deceive.withBonus(10));
		npc.skillList.add(Skill.inquire.withBonus(20));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.run.withBonus(10));
		npc.skillList.add(Skill.search.withBonus(10));
		npc.skillList.add(Skill.sneak.withBonus(20));
		npc.skillList.add(Skill.unlock.withBonus(20));
		npc.equippedItemList.add(Clothing.streetClothes);
		npc.inventoryList.add(Tool.dataSlate);
		npc.inventoryList.add(Tool.multiKey);
		npc.inventoryList.add(RangedWeapon.pistol);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 80/80
		npcList.add(npc);
		
		npc = new NPC("Stubjack", "40,40,40,40,40,30,35,30,30");
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.skillList.add(Skill.conceal.withBonus(10));
		npc.skillList.add(Skill.dodge.withBonus(20));
		npc.skillList.add(Skill.intimidate.withBonus(20));
		npc.skillList.add(Skill.notice.withBonus(20));
		npc.skillList.add(Skill.reflex.withBonus(20));
		npc.skillList.add(Skill.run.withBonus(20));
		npc.skillList.add(Skill.search.withBonus(10));
		npc.skillList.add(Skill.sneak.withBonus(10));
		npc.skillList.add(Skill.unlock.withBonus(0));
		npc.equippedItemList.add(Armour.gangLeathers);
		npc.equippedItemList.add(Clothing.streetClothes);
		npc.inventoryList.add(RangedWeapon.autostubber);
		npc.inventoryList.add(Ammo.autostubber_mag);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 80/80
		npcList.add(npc);
		
		npc = new NPC("Death Adept", "45,45,30,30,40,30,35,30,30");
		npc.specialRuleList.add(Talent.accustomedToDarkness);
		npc.specialRuleList.add(Talent.assassinStrike);
		npc.specialRuleList.add(Talent.carefulStrikes);
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.marksman);
		npc.skillList.add(Skill.conceal.withBonus(20));
		npc.skillList.add(Skill.deceive.withBonus(20));
		npc.skillList.add(Skill.disguise.withBonus(20));
		npc.skillList.add(Skill.sneak.withBonus(20));
		npc.equippedItemList.add(Clothing.bodyglove);
		npc.inventoryList.add(RangedWeapon.huntingRifle_scoped);
		npc.inventoryList.add(Ammo.huntingRifle_mag);
		npc.inventoryList.add(MeleeWeapon.longDagger);
		npc.inventoryList.add(MeleeWeapon.longDagger);
		npc.inventoryList.add(Consumable.vial_lethalPoison_3);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 80/80
		npcList.add(npc);
		
		npc = new NPC("Shark", "30,30,30,30,40,40,40,30,45");
		npc.specialRuleList.add(Talent.accustomedToDarkness);
		npc.specialRuleList.add(Talent.experienced.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.peer.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.quickEntry);
		npc.specialRuleList.add(Talent.sprinter);
		npc.specialRuleList.add(Talent.trade_survivalist);
		npc.specialRuleList.add(Talent.trade_swindler);
		npc.specialRuleList.add(Talent.tricksOfTheTrade);
		npc.skillList.add(Skill.charm.withBonus(10));
		npc.skillList.add(Skill.deceive.withBonus(20));
		npc.skillList.add(Skill.inquire.withBonus(20));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.persuade.withBonus(20));
		npc.skillList.add(Skill.readPerson.withBonus(10));
		npc.skillList.add(Skill.run.withBonus(10));
		npc.skillList.add(Skill.search.withBonus(10));
		npc.skillList.add(Skill.sneak.withBonus(20));
		npc.skillList.add(Skill.unlock.withBonus(20));
		npc.equippedItemList.add(Clothing.streetClothes);
		npc.inventoryList.add(Tool.dataSlate);
		npc.inventoryList.add(Tool.multiKey);
		npc.inventoryList.add(RangedWeapon.pistol);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 100/100
		npcList.add(npc);
		
		npc = new NPC("Gang Boss", "40,40,40,40,40,30,35,30,40");
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.expert.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.peer.withParameter("Underworld"));
		npc.skillList.add(Skill.command.withBonus(20));
		npc.skillList.add(Skill.conceal.withBonus(10));
		npc.skillList.add(Skill.dodge.withBonus(20));
		npc.skillList.add(Skill.intimidate.withBonus(20));
		npc.skillList.add(Skill.notice.withBonus(20));
		npc.skillList.add(Skill.reflex.withBonus(20));
		npc.skillList.add(Skill.run.withBonus(20));
		npc.skillList.add(Skill.search.withBonus(10));
		npc.skillList.add(Skill.sneak.withBonus(10));
		npc.skillList.add(Skill.unlock.withBonus(0));
		npc.equippedItemList.add(Clothing.streetClothes);
		npc.inventoryList.add(RangedWeapon.autostubber);
		npc.inventoryList.add(Ammo.autostubber_mag);
		npc.inventoryList.add(RangedWeapon.pistol);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 98/100
		npcList.add(npc);
		
		npc = new NPC("Assassin at Marque", "45,45,30,30,40,30,35,30,40");
		npc.specialRuleList.add(Talent.accustomedToDarkness);
		npc.specialRuleList.add(Talent.assassinStrike);
		npc.specialRuleList.add(Talent.carefulStrikes);
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.language.withParameter("High Gothic + Low Gothic"));
		npc.specialRuleList.add(Talent.marksman);
		npc.skillList.add(Skill.conceal.withBonus(20));
		npc.skillList.add(Skill.deceive.withBonus(20));
		npc.skillList.add(Skill.disguise.withBonus(30));
		npc.skillList.add(Skill.sneak.withBonus(20));
		npc.skillList.add(Skill.unlock.withBonus(0));
		npc.equippedItemList.add(Clothing.smartClothes);
		npc.inventoryList.add(MeleeWeapon.longDagger);
		npc.inventoryList.add(MeleeWeapon.longDagger);
		npc.inventoryList.add(Consumable.vial_lethalPoison_5);
		npc.inventoryList.add(Tool.multiKey);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 98/100
		npcList.add(npc);
		
		npc = new NPC("Charlatan", "30,30,30,30,40,40,40,30,45");
		npc.specialRuleList.add(Talent.accustomedToDarkness);
		npc.specialRuleList.add(Talent.conversationalist);
		npc.specialRuleList.add(Talent.experienced.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.language.withParameter("High Gothic + Low Gothic"));
		npc.specialRuleList.add(Talent.peer.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.quickEntry);
		npc.specialRuleList.add(Talent.sprinter);
		npc.specialRuleList.add(Talent.trade_survivalist);
		npc.specialRuleList.add(Talent.trade_swindler);
		npc.specialRuleList.add(Talent.tricksOfTheTrade);
		npc.skillList.add(Skill.charm.withBonus(30));
		npc.skillList.add(Skill.deceive.withBonus(30));
		npc.skillList.add(Skill.disguise.withBonus(20));
		npc.skillList.add(Skill.inquire.withBonus(20));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.persuade.withBonus(30));
		npc.skillList.add(Skill.readPerson.withBonus(20));
		npc.skillList.add(Skill.run.withBonus(10));
		npc.skillList.add(Skill.search.withBonus(10));
		npc.skillList.add(Skill.sneak.withBonus(20));
		npc.skillList.add(Skill.unlock.withBonus(20));
		npc.equippedItemList.add(Clothing.streetClothes);
		npc.inventoryList.add(Tool.dataSlate);
		npc.inventoryList.add(Tool.multiKey);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 148/150
		npcList.add(npc);
		
		npc = new NPC("Gang Lord", "40,40,40,40,40,40,40,40,45");
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.expert.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.peer.withParameter("Underworld"));
		npc.skillList.add(Skill.command.withBonus(20));
		npc.skillList.add(Skill.conceal.withBonus(10));
		npc.skillList.add(Skill.dodge.withBonus(20));
		npc.skillList.add(Skill.inquire.withBonus(20));
		npc.skillList.add(Skill.interrogate.withBonus(20));
		npc.skillList.add(Skill.intimidate.withBonus(30));
		npc.skillList.add(Skill.notice.withBonus(20));
		npc.skillList.add(Skill.readPerson.withBonus(20));
		npc.skillList.add(Skill.reflex.withBonus(20));
		npc.skillList.add(Skill.run.withBonus(20));
		npc.skillList.add(Skill.search.withBonus(10));
		npc.skillList.add(Skill.sneak.withBonus(10));
		npc.skillList.add(Skill.unlock.withBonus(0));
		npc.equippedItemList.add(Clothing.streetClothes);
		npc.inventoryList.add(RangedWeapon.autostubber);
		npc.inventoryList.add(Ammo.autostubber_mag);
		npc.inventoryList.add(RangedWeapon.pistol);
		npc.inventoryList.add(MeleeWeapon.knife);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 148/150
		npcList.add(npc);
		
		npc = new NPC("Lord of Assassins", "50,50,30,30,40,30,35,30,40");
		npc.specialRuleList.add(Talent.accustomedToDarkness);
		npc.specialRuleList.add(Talent.assassinStrike);
		npc.specialRuleList.add(Talent.carefulStrikes);
		npc.specialRuleList.add(Talent.deftBladesman);
		npc.specialRuleList.add(Talent.experienced.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.language.withParameter("High Gothic + Low Gothic"));
		npc.specialRuleList.add(Talent.marksman);
		npc.specialRuleList.add(Talent.network);
		npc.specialRuleList.add(Talent.expandedNetwork);
		npc.specialRuleList.add(Talent.peer.withParameter("Underworld"));
		npc.specialRuleList.add(Talent.quickDraw);
		npc.skillList.add(Skill.conceal.withBonus(20));
		npc.skillList.add(Skill.deceive.withBonus(20));
		npc.skillList.add(Skill.disguise.withBonus(30));
		npc.skillList.add(Skill.sneak.withBonus(20));
		npc.skillList.add(Skill.unlock.withBonus(20));
		npc.equippedItemList.add(Clothing.smartClothes);
		npc.equippedItemList.add(Tool.cameleolineCloak);
		npc.inventoryList.add(MeleeWeapon.longDagger);
		npc.inventoryList.add(MeleeWeapon.longDagger);
		npc.inventoryList.add(Consumable.vial_lethalPoison_5);
		npc.inventoryList.add(Tool.dataSlate);
		npc.inventoryList.add(Tool.multiKey);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 150/150
		npcList.add(npc);
		
	}
}