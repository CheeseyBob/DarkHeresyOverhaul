class NPCGroup_AdeptusAdministratum extends NPCGroup {

	NPCGroup_AdeptusAdministratum() {
		super("Adeptus Administratum");
	}

	@Override
	protected void setNPCList() {
		NPC npc;
		
		npc = new NPC("Archivist", "30,30,30,30,30,30,30,30,30");
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Administratum"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.equippedItemList.add(Clothing.administratumRobes);
		npc.inventoryList.add(MiscItem.chrono);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Scrivener", "30,30,30,30,30,30,30,30,30");
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Administratum"));
		npc.specialRuleList.add(Talent.language.withParameter("High Gothic + Low Gothic"));
		npc.specialRuleList.add(Talent.trade_copyist);
		npc.equippedItemList.add(Clothing.administratumRobes);
		npc.inventoryList.add(Tool.writingKit);
		npc.inventoryList.add(MiscItem.chrono);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Scribe", "30,30,30,30,30,30,30,30,30");
		npc.specialRuleList.add(Talent.educated.withParameter("Bureaucracy"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Administratum"));
		npc.specialRuleList.add(Talent.language.withParameter("High Gothic + Low Gothic"));
		npc.specialRuleList.add(Talent.trade_copyist);
		npc.skillList.add(Skill.inquire.withBonus(10));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.referenceScholasticLore.withBonus(0));
		npc.equippedItemList.add(Clothing.administratumRobes);
		npc.inventoryList.add(Tool.autoquill);
		npc.inventoryList.add(MiscItem.chrono);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Auditor", "30,30,30,30,30,35,30,30,30");
		npc.specialRuleList.add(Talent.educated.withParameter("Bureaucracy + 2 Areas"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Administratum"));
		npc.specialRuleList.add(Talent.language.withParameter("High Gothic + Low Gothic"));
		npc.specialRuleList.add(Talent.trade_copyist);
		npc.skillList.add(Skill.inquire.withBonus(10));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.referenceScholasticLore.withBonus(10));
		npc.equippedItemList.add(Clothing.administratumRobes);
		npc.inventoryList.add(Tool.autoquill);
		npc.inventoryList.add(MiscItem.chrono);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Medicator", "30,30,30,30,30,35,30,30,30");
		npc.specialRuleList.add(Talent.educated.withParameter("Bureaucracy"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Administratum"));
		npc.specialRuleList.add(Talent.language.withParameter("High Gothic + Low Gothic"));
		npc.specialRuleList.add(Talent.trade_copyist);
		npc.skillList.add(Skill.administerDrug.withBonus(10));
		npc.skillList.add(Skill.inquire.withBonus(10));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.referenceScholasticLore.withBonus(0));
		npc.skillList.add(Skill.treatWounds.withBonus(10));
		npc.equippedItemList.add(Clothing.chirurgeonRobes);
		npc.inventoryList.add(Consumable.medkit);
		npc.inventoryList.add(MiscItem.chrono);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Scholar", "30,30,30,30,30,40,30,30,30");
		npc.specialRuleList.add(Talent.educated.withParameter("Bureaucracy"));
		npc.specialRuleList.add(Talent.expert.withParameter("2 Areas"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Administratum"));
		npc.specialRuleList.add(Talent.language.withParameter("High Gothic + Low Gothic"));
		npc.specialRuleList.add(Talent.specialistKnowledge);
		npc.specialRuleList.add(Talent.trade_copyist);
		npc.skillList.add(Skill.contemplate.withBonus(10));
		npc.skillList.add(Skill.inquire.withBonus(10));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.referenceScholasticLore.withBonus(20));
		npc.equippedItemList.add(Clothing.administratumRobes);
		npc.inventoryList.add(Tool.dataTome_lore);
		npc.inventoryList.add(MiscItem.chrono);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Operator", "30,30,30,30,35,40,35,30,30");
		npc.specialRuleList.add(Talent.educated.withParameter("Bureaucracy + 2 Areas"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Administratum + Tech"));
		npc.specialRuleList.add(Talent.language.withParameter("High Gothic + Low Gothic"));
		npc.specialRuleList.add(Talent.operate.withParameter("1 Vehicle Type"));
		npc.specialRuleList.add(Talent.trade_copyist);
		npc.specialRuleList.add(Bionic.interfacePort);
		npc.skillList.add(Skill.inquire.withBonus(10));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.referenceScholasticLore.withBonus(10));
		npc.equippedItemList.add(Clothing.administratumRobes);
		npc.inventoryList.add(MiscItem.chrono);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Chirurgeon", "30,30,30,30,30,45,35,30,30");
		npc.specialRuleList.add(Talent.educated.withParameter("Bureaucracy"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Administratum"));
		npc.specialRuleList.add(Talent.language.withParameter("High Gothic + Low Gothic"));
		npc.specialRuleList.add(Talent.trade_copyist);
		npc.skillList.add(Skill.administerDrug.withBonus(10));
		npc.skillList.add(Skill.inquire.withBonus(10));
		npc.skillList.add(Skill.inspect.withBonus(20));
		npc.skillList.add(Skill.performSurgery.withBonus(10));
		npc.skillList.add(Skill.referenceScholasticLore.withBonus(0));
		npc.skillList.add(Skill.treatWounds.withBonus(20));
		npc.equippedItemList.add(Clothing.chirurgeonRobes);
		npc.inventoryList.add(Tool.surgicalTools);
		npc.inventoryList.add(Consumable.qualityMedkit);
		npc.inventoryList.add(Consumable.injector_deTox);
		npc.inventoryList.add(MiscItem.chrono);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Lexographer", "30,30,30,30,30,45,30,30,30");
		npc.specialRuleList.add(Talent.educated.withParameter("Bureaucracy"));
		npc.specialRuleList.add(Talent.expert.withParameter("3 Areas"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Administratum"));
		npc.specialRuleList.add(Talent.language.withParameter("High Gothic + Low Gothic"));
		npc.specialRuleList.add(Talent.specialistKnowledge);
		npc.specialRuleList.add(Talent.trade_copyist);
		npc.skillList.add(Skill.contemplate.withBonus(20));
		npc.skillList.add(Skill.inquire.withBonus(10));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.referenceScholasticLore.withBonus(30));
		npc.equippedItemList.add(Clothing.administratumRobes);
		npc.inventoryList.add(Tool.dataTome_lore);
		npc.inventoryList.add(MiscItem.chrono);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Comptroller", "30,30,30,30,35,45,35,30,30");
		npc.specialRuleList.add(Talent.educated.withParameter("Bureaucracy + 2 Areas"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Administratum + Calixis Sector + Tech"));
		npc.specialRuleList.add(Talent.language.withParameter("High Gothic + Low Gothic"));
		npc.specialRuleList.add(Talent.operate.withParameter("1 Vehicle Type"));
		npc.specialRuleList.add(Talent.trade_copyist);
		npc.specialRuleList.add(Bionic.cogitatorImplant);
		npc.specialRuleList.add(Bionic.interfacePort);
		npc.specialRuleList.add(Bionic.mindImpulseUnit);
		npc.skillList.add(Skill.inquire.withBonus(20));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.referenceCommonLore.withBonus(20));
		npc.skillList.add(Skill.referenceScholasticLore.withBonus(20));
		npc.skillList.add(Skill.useTech.withBonus(20));
		npc.equippedItemList.add(Clothing.administratumRobes);
		npc.inventoryList.add(MiscItem.chrono);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Master Chirurgeon", "30,30,30,30,30,45,35,30,30");
		npc.specialRuleList.add(Talent.educated.withParameter("Bureaucracy"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Administratum"));
		npc.specialRuleList.add(Talent.language.withParameter("High Gothic + Low Gothic"));
		npc.specialRuleList.add(Talent.trade_copyist);
		npc.skillList.add(Skill.administerDrug.withBonus(20));
		npc.skillList.add(Skill.inquire.withBonus(10));
		npc.skillList.add(Skill.inspect.withBonus(20));
		npc.skillList.add(Skill.performSurgery.withBonus(30));
		npc.skillList.add(Skill.referenceScholasticLore.withBonus(0));
		npc.skillList.add(Skill.treatWounds.withBonus(30));
		npc.equippedItemList.add(Clothing.chirurgeonRobes);
		npc.inventoryList.add(Tool.surgicalTools);
		npc.inventoryList.add(Consumable.qualityMedkit);
		npc.inventoryList.add(Consumable.injector_deTox);
		npc.inventoryList.add(MiscItem.chrono);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Loremaster", "30,30,30,30,30,45,30,35,30");
		npc.insanity = 4;
		npc.specialRuleList.add(Talent.educated.withParameter("Bureaucracy"));
		npc.specialRuleList.add(Talent.expert.withParameter("3 Areas"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Administratum"));
		npc.specialRuleList.add(Talent.language.withParameter("High Gothic + Low Gothic"));
		npc.specialRuleList.add(Talent.specialistKnowledge);
		npc.specialRuleList.add(Talent.trade_copyist);
		npc.specialRuleList.add(Talent.unveiledSecrets.withParameter("2 Areas"));
		npc.skillList.add(Skill.contemplate.withBonus(30));
		npc.skillList.add(Skill.inquire.withBonus(10));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.referenceForbiddenLore.withBonus(10));
		npc.skillList.add(Skill.referenceScholasticLore.withBonus(30));
		npc.equippedItemList.add(Clothing.administratumRobes);
		npc.inventoryList.add(Tool.dataTome_lore);
		npc.inventoryList.add(MiscItem.chrono);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Logister", "30,30,30,30,35,50,35,30,30");
		npc.specialRuleList.add(Talent.educated.withParameter("Bureaucracy + 4 Areas"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Administratum + Calixis Sector + Tech"));
		npc.specialRuleList.add(Talent.language.withParameter("High Gothic + Low Gothic"));
		npc.specialRuleList.add(Talent.operate.withParameter("1 Vehicle Type"));
		npc.specialRuleList.add(Talent.trade_copyist);
		npc.specialRuleList.add(Bionic.cogitatorImplant);
		npc.specialRuleList.add(Bionic.interfacePort);
		npc.specialRuleList.add(Bionic.mindImpulseUnit_goodQuality);
		npc.skillList.add(Skill.contemplate.withBonus(20));
		npc.skillList.add(Skill.inquire.withBonus(20));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.referenceCommonLore.withBonus(20));
		npc.skillList.add(Skill.referenceScholasticLore.withBonus(20));
		npc.skillList.add(Skill.useTech.withBonus(20));
		npc.equippedItemList.add(Clothing.administratumRobes);
		npc.inventoryList.add(MiscItem.chrono);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Sage Loremaster", "30,30,30,30,30,50,30,40,30");
		npc.insanity = 20;
		npc.specialRuleList.add(Talent.darkSecrets.withParameter("2 Areas"));
		npc.specialRuleList.add(Talent.deepestSecrets);
		npc.specialRuleList.add(Talent.educated.withParameter("Bureaucracy"));
		npc.specialRuleList.add(Talent.expert.withParameter("3 Areas"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Administratum"));
		npc.specialRuleList.add(Talent.language.withParameter("High Gothic + Low Gothic"));
		npc.specialRuleList.add(Talent.specialistKnowledge);
		npc.specialRuleList.add(Talent.trade_copyist);
		npc.skillList.add(Skill.contemplate.withBonus(30));
		npc.skillList.add(Skill.inquire.withBonus(10));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.referenceForbiddenLore.withBonus(30));
		npc.skillList.add(Skill.referenceScholasticLore.withBonus(30));
		npc.equippedItemList.add(Clothing.administratumRobes);
		npc.inventoryList.add(Tool.dataTome_lore);
		npc.inventoryList.add(MiscItem.chrono);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		npc = new NPC("Sage Logister", "30,30,30,30,35,50,35,30,30");
		npc.specialRuleList.add(Talent.educated.withParameter("Bureaucracy + 7 Areas"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Administratum + Calixis Sector + Tech"));
		npc.specialRuleList.add(Talent.language.withParameter("High Gothic + Low Gothic"));
		npc.specialRuleList.add(Talent.operate.withParameter("1 Vehicle Type"));
		npc.specialRuleList.add(Talent.trade_copyist);
		npc.specialRuleList.add(Talent.unveiledSecrets.withParameter("3 Areas"));
		npc.specialRuleList.add(Bionic.cogitatorImplant);
		npc.specialRuleList.add(Bionic.interfacePort);
		npc.specialRuleList.add(Bionic.mindImpulseUnit_bestQuality);
		npc.skillList.add(Skill.contemplate.withBonus(30));
		npc.skillList.add(Skill.inquire.withBonus(30));
		npc.skillList.add(Skill.inspect.withBonus(10));
		npc.skillList.add(Skill.referenceCommonLore.withBonus(30));
		npc.skillList.add(Skill.referenceForbiddenLore.withBonus(10));
		npc.skillList.add(Skill.referenceScholasticLore.withBonus(30));
		npc.skillList.add(Skill.useTech.withBonus(20));
		npc.equippedItemList.add(Clothing.administratumRobes);
		npc.inventoryList.add(MiscItem.chrono);
		npc.inventoryList.add(MiscItem.gelt);
		npcList.add(npc);
		
		
	}
}