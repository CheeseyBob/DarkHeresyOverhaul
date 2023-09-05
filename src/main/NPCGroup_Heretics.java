package main;
class NPCGroup_Heretics extends NPCGroup {
	
	// Ranked Characters //

	// Misc Characters //
	public static final NPC heretek = new NPC("Heretek", "35,35,30,35,35,40,35,30,30")
			.withSpecialRule(Talent.language.withParameter("Low Gothic"))
			.withSpecialRule(Talent.trade_technomat)
			.withSpecialRule(Talent.knowledgable.withParameter("Tech"))
			.withSkill(Skill.useTech.withBonus(20))
			.withItemEquipped(Clothing.drabGarb)
			.withItemEquipped(Tool.auspex_heretek)
			.withItemEquipped(Tool.gasMask)
			.withItemInInventory(RangedWeapon.laspistol_heretek)
			.withItemInInventory(Ammo.laspistol_powerPack)
			.withItemInInventory(MeleeWeapon.knife_mono)
			.withItemInInventory(Tool.combiTool)
			.withItemInInventory(Tool.dataSlate_biolock)
			.withItemInInventory(MiscItem.gelt)
			.withNotes("Obscurity: Average (+0)"
					+ "<br>Hatred of the Inquisition"
					+ "<br>Rank 4 | 30 XP"
					+ "<br>"
					+ "<br>Data Slate contains tech-heretical schematics and can control the heretek's servitors.");
	// XP: 30

		NPCGroup_Heretics() {
			super("Heretics");
			miscCharacterList.add(heretek);
		}
}