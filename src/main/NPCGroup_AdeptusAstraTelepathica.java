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
		npcList.add(npc);
		
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
		npcList.add(npc);
		
		npc = new NPC("Aspirant", "30,30,30,30,30,30,30,35,30");
		npc.specialRuleList.add(Talent.language.withParameter("Low Gothic"));
		npc.specialRuleList.add(Talent.psyker.withParameter("Sanctioned"));
		npc.specialRuleList.add(Talent.psyRating2);
		npc.specialRuleList.add(PsychicPower.restrain);
		npc.specialRuleList.add(PsychicPower.telekineticControl);
		npc.skillList.add(Skill.senseImmateruim.withBonus(10));
		npc.equippedItemList.add(Clothing.astraTelepathicaRobes);
		npc.equippedItemList.add(MeleeWeapon.staff_astraTelepathica);
		npc.inventoryList.add(Tool.psyFocus);
		npc.inventoryList.add(MeleeWeapon.knife_psykanaMercyBlade);
		npc.inventoryList.add(MiscItem.gelt);
		// XP: 19/20
		// Powers: 3 XP
		npcList.add(npc);
		
		npc = new NPC("Savant Initiate", "35,35,30,30,30,30,30,40,30");
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
		npcList.add(npc);
		
		npc = new NPC("Savant Militant", "35,35,30,30,30,30,30,45,30");
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
		npcList.add(npc);
		
		npc = new NPC("Savant Warrant", "35,35,30,30,30,30,30,45,35");
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
		npcList.add(npc);
		
		npc = new NPC("Savant Adjunct", "35,35,30,30,30,30,30,45,35");
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
		npcList.add(npc);
		
		npc = new NPC("Savant Preceptor", "35,35,30,30,30,30,30,50,35");
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
		npcList.add(npc);
		
	}
}