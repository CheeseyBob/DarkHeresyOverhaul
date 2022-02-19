package main;
class NPCGroup_AdeptusAstraTelepathica extends NPCGroup {

	NPCGroup_AdeptusAstraTelepathica() {
		super("Adeptus Astra Telepathica");
	}

	@Override
	protected void setNPCList() {
		NPC npc;
		
		npc = new NPC("Sanctionite", "30,30,30,30,30,30,30,30,30");
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.psyker.withParameter("Sanctioned"));
		npc.specialRuleList.add(Talent.psyRating1);
		npc.specialRuleList.add(PsychicPower.telekineticControl);
		npc.skillList.add(Skill.senseImmateruim.withBonus(0));
		npc.equippedItemList.add(Clothing.astraTelepathicaRobes);
		npc.equippedItemList.add(MeleeWeapon.staff_astraTelepathica);
		npc.inventoryList.add(Tool.psyFocus);
		npc.inventoryList.add(MeleeWeapon.knife_psykanaMercyBlade);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 5/5
		// Powers: 1 XP
		rankedCharacterList.add(npc);
		
		npc = new NPC("Neonate", "30,30,30,30,30,30,30,35,30");
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.psyker.withParameter("Sanctioned"));
		npc.specialRuleList.add(Talent.psyRating1);
		npc.specialRuleList.add(PsychicPower.telekineticControl);
		npc.skillList.add(Skill.senseImmateruim.withBonus(10));
		npc.equippedItemList.add(Clothing.astraTelepathicaRobes);
		npc.equippedItemList.add(MeleeWeapon.staff_astraTelepathica);
		npc.inventoryList.add(Tool.psyFocus);
		npc.inventoryList.add(MeleeWeapon.knife_psykanaMercyBlade);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 9/10
		// Powers: 1 XP
		rankedCharacterList.add(npc);
		
		npc = new NPC("Aspirant", "30,30,30,30,30,30,30,35,30");
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Adeptus Astra Telepathica"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.psyker.withParameter("Sanctioned"));
		npc.specialRuleList.add(Talent.psyRating2);
		npc.specialRuleList.add(PsychicPower.telekineticControl);
		npc.specialRuleList.add(PsychicPower.telekineticShove);
		npc.skillList.add(Skill.senseImmateruim.withBonus(10));
		npc.equippedItemList.add(Clothing.astraTelepathicaRobes);
		npc.equippedItemList.add(MeleeWeapon.staff_astraTelepathica);
		npc.inventoryList.add(Tool.psyFocus);
		npc.inventoryList.add(MeleeWeapon.knife_psykanaMercyBlade);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 20/20
		// Powers: 2 XP
		rankedCharacterList.add(npc);
		
		npc = new NPC("Savant Initiate", "30,35,30,30,30,30,30,40,30");
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Adeptus Astra Telepathica"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.psyker.withParameter("Sanctioned"));
		npc.specialRuleList.add(Talent.psyRating2);
		npc.specialRuleList.add(PsychicPower.deflect);
		npc.specialRuleList.add(PsychicPower.restrain);
		npc.specialRuleList.add(PsychicPower.telekineticControl);
		npc.specialRuleList.add(PsychicPower.telekineticShove);
		npc.skillList.add(Skill.senseImmateruim.withBonus(10));
		npc.equippedItemList.add(Armour.flakJacket);
		npc.equippedItemList.add(Clothing.astraTelepathicaRobes);
		npc.equippedItemList.add(MeleeWeapon.staff_astraTelepathica);
		npc.inventoryList.add(Tool.psyFocus);
		npc.inventoryList.add(MeleeWeapon.knife_psykanaMercyBlade);
		npc.inventoryList.add(RangedWeapon.laspistol);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 30/30
		// Powers: 6 XP
		rankedCharacterList.add(npc);
		
		npc = new NPC("Scholar Initiate", "30,30,30,30,30,35,35,40,30");
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Adeptus Astra Telepathica"));
		npc.specialRuleList.add(Talent.language.withParameter("High Gothic + Low Gothic"));
		npc.specialRuleList.add(Talent.psyker.withParameter("Sanctioned"));
		npc.specialRuleList.add(Talent.psyRating2);
		npc.specialRuleList.add(PsychicPower.telekineticControl);
		npc.specialRuleList.add(PsychicPower.telekineticShove);
		npc.skillList.add(Skill.senseImmateruim.withBonus(10));
		npc.equippedItemList.add(Clothing.astraTelepathicaRobes);
		npc.equippedItemList.add(MeleeWeapon.staff_astraTelepathica);
		npc.inventoryList.add(Tool.psyFocus);
		npc.inventoryList.add(MeleeWeapon.knife_psykanaMercyBlade);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 30/30
		// Powers: 2 XP
		rankedCharacterList.add(npc);
		
		npc = new NPC("Savant Militant", "30,35,30,30,30,30,30,45,30");
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Adeptus Astra Telepathica"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.mentalResilience);
		npc.specialRuleList.add(Talent.psyker.withParameter("Sanctioned"));
		npc.specialRuleList.add(Talent.psyRating2);
		npc.specialRuleList.add(Talent.strongConnection);
		npc.specialRuleList.add(PsychicPower.deflect);
		npc.specialRuleList.add(PsychicPower.restrain);
		npc.specialRuleList.add(PsychicPower.telekineDash);
		npc.specialRuleList.add(PsychicPower.telekineticControl);
		npc.specialRuleList.add(PsychicPower.telekineticShove);
		npc.specialRuleList.add(PsychicPower.waveOfForce);
		npc.skillList.add(Skill.dodge.withBonus(10));
		npc.skillList.add(Skill.notice.withBonus(10));
		npc.skillList.add(Skill.parry.withBonus(10));
		npc.skillList.add(Skill.run.withBonus(10));
		npc.skillList.add(Skill.senseImmateruim.withBonus(10));
		npc.equippedItemList.add(Armour.flakJacket);
		npc.equippedItemList.add(Clothing.astraTelepathicaRobes);
		npc.equippedItemList.add(MeleeWeapon.staff_astraTelepathica);
		npc.inventoryList.add(Tool.psyFocus);
		npc.inventoryList.add(MeleeWeapon.knife_psykanaMercyBlade);
		npc.inventoryList.add(RangedWeapon.laspistol);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 60/60
		// Powers: 12 XP
		rankedCharacterList.add(npc);
		
		npc = new NPC("Scholar Materium", "30,30,30,30,30,45,35,45,30");
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Adeptus Astra Telepathica"));
		npc.specialRuleList.add(Talent.language.withParameter("High Gothic + Low Gothic"));
		npc.specialRuleList.add(Talent.unveiledSecrets.withParameter("Psykers"));
		npc.specialRuleList.add(Talent.unveiledSecrets.withParameter("The Warp"));
		npc.specialRuleList.add(Talent.psyker.withParameter("Sanctioned"));
		npc.specialRuleList.add(Talent.psyRating2);
		npc.specialRuleList.add(PsychicPower.deflect);
		npc.specialRuleList.add(PsychicPower.telekineDash);
		npc.specialRuleList.add(PsychicPower.telekineticControl);
		npc.specialRuleList.add(PsychicPower.telekineticShove);
		npc.skillList.add(Skill.referenceLore.withBonus(10));
		npc.skillList.add(Skill.senseImmateruim.withBonus(10));
		npc.equippedItemList.add(Clothing.astraTelepathicaRobes);
		npc.equippedItemList.add(MeleeWeapon.staff_astraTelepathica);
		npc.inventoryList.add(Tool.psyFocus);
		npc.inventoryList.add(MeleeWeapon.knife_psykanaMercyBlade);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 60/60
		// Powers: 6 XP
		rankedCharacterList.add(npc);
		
		npc = new NPC("Savant Warrant", "30,35,30,30,30,30,30,45,35");
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Adeptus Astra Telepathica"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.mentalResilience);
		npc.specialRuleList.add(Talent.psyker.withParameter("Sanctioned"));
		npc.specialRuleList.add(Talent.psyRating3);
		npc.specialRuleList.add(Talent.strongConnection);
		npc.specialRuleList.add(PsychicPower.deflect);
		npc.specialRuleList.add(PsychicPower.restrain);
		npc.specialRuleList.add(PsychicPower.telekineDash);
		npc.specialRuleList.add(PsychicPower.telekineticControl);
		npc.specialRuleList.add(PsychicPower.telekineticShove);
		npc.specialRuleList.add(PsychicPower.waveOfForce);
		npc.skillList.add(Skill.command.withBonus(20));
		npc.skillList.add(Skill.dodge.withBonus(10));
		npc.skillList.add(Skill.notice.withBonus(10));
		npc.skillList.add(Skill.parry.withBonus(10));
		npc.skillList.add(Skill.run.withBonus(10));
		npc.skillList.add(Skill.senseImmateruim.withBonus(10));
		npc.equippedItemList.add(Armour.flakArmour);
		npc.equippedItemList.add(Clothing.astraTelepathicaRobes);
		npc.equippedItemList.add(MeleeWeapon.staff_astraTelepathica);
		npc.inventoryList.add(Tool.psyFocus);
		npc.inventoryList.add(MeleeWeapon.knife_psykanaMercyBlade);
		npc.inventoryList.add(RangedWeapon.laspistol);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 80/80
		// Powers: 12 XP
		rankedCharacterList.add(npc);
		
		npc = new NPC("Scholar Arcanum", "30,30,30,30,30,45,35,45,30");
		npc.specialRuleList.add(Talent.educated.withParameter("Philosophy"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Adeptus Astra Telepathica"));
		npc.specialRuleList.add(Talent.language.withParameter("High Gothic + Low Gothic"));
		npc.specialRuleList.add(Talent.unveiledSecrets.withParameter("Psykers"));
		npc.specialRuleList.add(Talent.unveiledSecrets.withParameter("The Warp"));
		npc.specialRuleList.add(Talent.psyker.withParameter("Sanctioned"));
		npc.specialRuleList.add(Talent.psyRating2);
		npc.specialRuleList.add(Talent.masteredPsychicPower.withParameter(PsychicPower.deflect.name));
		npc.specialRuleList.add(Talent.subtlePsyker);
		npc.specialRuleList.add(PsychicPower.deflect);
		npc.specialRuleList.add(PsychicPower.restrain);
		npc.specialRuleList.add(PsychicPower.telekineDash);
		npc.specialRuleList.add(PsychicPower.telekineticControl);
		npc.specialRuleList.add(PsychicPower.telekineticPunch);
		npc.skillList.add(Skill.referenceLore.withBonus(20));
		npc.skillList.add(Skill.senseImmateruim.withBonus(20));
		npc.equippedItemList.add(Clothing.astraTelepathicaRobes);
		npc.equippedItemList.add(MeleeWeapon.staff_astraTelepathica);
		npc.inventoryList.add(Tool.psyFocus);
		npc.inventoryList.add(MeleeWeapon.knife_psykanaMercyBlade);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 80/80
		// Powers: 8 XP
		rankedCharacterList.add(npc);
		
		npc = new NPC("Savant Adjunct", "30,35,30,30,30,30,30,45,35");
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Adeptus Astra Telepathica"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.mentalResilience);
		npc.specialRuleList.add(Talent.psyker.withParameter("Sanctioned"));
		npc.specialRuleList.add(Talent.psyRating4);
		npc.specialRuleList.add(Talent.strongConnection);
		npc.specialRuleList.add(PsychicPower.deflect);
		npc.specialRuleList.add(PsychicPower.restrain);
		npc.specialRuleList.add(PsychicPower.telekineDash);
		npc.specialRuleList.add(PsychicPower.telekineticControl);
		npc.specialRuleList.add(PsychicPower.telekineticShove);
		npc.specialRuleList.add(PsychicPower.wallOfForce);
		npc.specialRuleList.add(PsychicPower.waveOfForce);
		npc.skillList.add(Skill.command.withBonus(20));
		npc.skillList.add(Skill.dodge.withBonus(10));
		npc.skillList.add(Skill.notice.withBonus(10));
		npc.skillList.add(Skill.parry.withBonus(10));
		npc.skillList.add(Skill.run.withBonus(10));
		npc.skillList.add(Skill.senseImmateruim.withBonus(10));
		npc.equippedItemList.add(Armour.carapaceChestplate);
		npc.equippedItemList.add(Clothing.astraTelepathicaRobes);
		npc.equippedItemList.add(MeleeWeapon.staff_astraTelepathica);
		npc.inventoryList.add(Tool.psyFocus);
		npc.inventoryList.add(MeleeWeapon.knife_psykanaMercyBlade);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 100/100
		// Powers: 16 XP
		rankedCharacterList.add(npc);
		
		npc = new NPC("Scholar Obscurus", "30,30,30,30,30,45,35,45,30");
		npc.specialRuleList.add(Talent.deepestSecrets);
		npc.specialRuleList.add(Talent.educated.withParameter("Philosophy"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Adeptus Astra Telepathica"));
		npc.specialRuleList.add(Talent.language.withParameter("High Gothic + Low Gothic"));
		npc.specialRuleList.add(Talent.unveiledSecrets.withParameter("Daemonology"));
		npc.specialRuleList.add(Talent.unveiledSecrets.withParameter("Psykers"));
		npc.specialRuleList.add(Talent.unveiledSecrets.withParameter("The Warp"));
		npc.specialRuleList.add(Talent.psyker.withParameter("Sanctioned"));
		npc.specialRuleList.add(Talent.psyRating2);
		npc.specialRuleList.add(Talent.masteredPsychicPower.withParameter(PsychicPower.deflect.name));
		npc.specialRuleList.add(Talent.masteredPsychicPower.withParameter(PsychicPower.telekineDash.name));
		npc.specialRuleList.add(Talent.subtlePsyker);
		npc.specialRuleList.add(PsychicPower.deflect);
		npc.specialRuleList.add(PsychicPower.restrain);
		npc.specialRuleList.add(PsychicPower.telekineDash);
		npc.specialRuleList.add(PsychicPower.telekineticControl);
		npc.specialRuleList.add(PsychicPower.telekineticPunch);
		npc.skillList.add(Skill.referenceLore.withBonus(30));
		npc.skillList.add(Skill.senseImmateruim.withBonus(20));
		npc.equippedItemList.add(Clothing.astraTelepathicaRobes);
		npc.equippedItemList.add(MeleeWeapon.staff_astraTelepathica);
		npc.inventoryList.add(Tool.psyFocus);
		npc.inventoryList.add(MeleeWeapon.knife_psykanaMercyBlade);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 100/100
		// Powers: 8 XP
		rankedCharacterList.add(npc);
		
		npc = new NPC("Savant Preceptor", "30,35,30,30,30,30,30,50,35");
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Adeptus Astra Telepathica"));
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.mentalResilience);
		npc.specialRuleList.add(Talent.psyker.withParameter("Sanctioned"));
		npc.specialRuleList.add(Talent.psyRating5);
		npc.specialRuleList.add(Talent.drawDeeper);
		npc.specialRuleList.add(Talent.strongConnection);
		npc.specialRuleList.add(Talent.masteredPsychicPower.withParameter(PsychicPower.telekineticControl.name));
		npc.specialRuleList.add(Talent.masteredPsychicPower.withParameter(PsychicPower.telekineticShove.name));
		npc.specialRuleList.add(PsychicPower.deflect);
		npc.specialRuleList.add(PsychicPower.restrain);
		npc.specialRuleList.add(PsychicPower.telekineDash);
		npc.specialRuleList.add(PsychicPower.telekineShield);
		npc.specialRuleList.add(PsychicPower.telekineticControl);
		npc.specialRuleList.add(PsychicPower.telekineticShove);
		npc.specialRuleList.add(PsychicPower.wallOfForce);
		npc.specialRuleList.add(PsychicPower.waveOfForce);
		npc.skillList.add(Skill.command.withBonus(20));
		npc.skillList.add(Skill.dodge.withBonus(10));
		npc.skillList.add(Skill.notice.withBonus(10));
		npc.skillList.add(Skill.parry.withBonus(10));
		npc.skillList.add(Skill.run.withBonus(10));
		npc.skillList.add(Skill.senseImmateruim.withBonus(10));
		npc.equippedItemList.add(Armour.carapaceArmour);
		npc.equippedItemList.add(Clothing.astraTelepathicaRobes);
		npc.equippedItemList.add(MeleeWeapon.staff_astraTelepathica);
		npc.inventoryList.add(Tool.psyFocus);
		npc.inventoryList.add(MeleeWeapon.knife_psykanaMercyBlade);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 150/150
		// Powers: 20 XP
		rankedCharacterList.add(npc);
		
		npc = new NPC("Scholar Empyrean", "30,30,30,30,30,45,35,45,30");
		npc.specialRuleList.add(Talent.deepestSecrets);
		npc.specialRuleList.add(Talent.educated.withParameter("Philosophy"));
		npc.specialRuleList.add(Talent.knowledgable.withParameter("Adeptus Astra Telepathica"));
		npc.specialRuleList.add(Talent.language.withParameter("High Gothic + Low Gothic"));
		npc.specialRuleList.add(Talent.darkSecrets.withParameter("Daemonology + Mutants + Psykers + The Warp"));
		npc.specialRuleList.add(Talent.psyker.withParameter("Sanctioned"));
		npc.specialRuleList.add(Talent.psyRating3);
		npc.specialRuleList.add(Talent.masteredPsychicPower.withParameter(PsychicPower.deflect.name+" + "+PsychicPower.telekineDash.name));
		npc.specialRuleList.add(Talent.subtlePsyker);
		npc.specialRuleList.add(PsychicPower.deflect);
		npc.specialRuleList.add(PsychicPower.restrain);
		npc.specialRuleList.add(PsychicPower.telekineDash);
		npc.specialRuleList.add(PsychicPower.telekineShield);
		npc.specialRuleList.add(PsychicPower.telekineticControl);
		npc.specialRuleList.add(PsychicPower.telekineticPunch);
		npc.skillList.add(Skill.contemplate.withBonus(20));
		npc.skillList.add(Skill.referenceLore.withBonus(30));
		npc.skillList.add(Skill.senseImmateruim.withBonus(30));
		npc.equippedItemList.add(Clothing.astraTelepathicaRobes);
		npc.equippedItemList.add(MeleeWeapon.staff_astraTelepathica);
		npc.inventoryList.add(Tool.psyFocus);
		npc.inventoryList.add(MeleeWeapon.knife_psykanaMercyBlade);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 148/150
		// Powers: 8 XP
		rankedCharacterList.add(npc);
		
	}
}