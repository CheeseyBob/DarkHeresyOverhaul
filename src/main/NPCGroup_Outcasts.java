package main;
class NPCGroup_Outcasts extends NPCGroup {
	
	// Ranked Characters //
	public static final NPC dreg = new NPC("Dreg", "30,30,30,30,35,30,35,30,30")
			.withSpecialRule(Talent.language.withParameter("Low Gothic"))
			.withItemEquipped(Clothing.ragCastings)
			.withItemInInventory(MiscItem.gelt)
			.withNotes("Obscurity: Ubiquitous (Automatic)"
					+ "<br>Awe of the Inquisition");
	// XP: 4/5

	public static final NPC outcast = new NPC("Outcast", "30,30,30,30,35,30,35,30,30")
			.withSpecialRule(Talent.language.withParameter("Low Gothic"))
			.withSpecialRule(Talent.trade_survivalist)
			.withSkill(Skill.run.withBonus(10))
			.withItemEquipped(Clothing.ragCastings)
			.withItemInInventory(MeleeWeapon.knife)
			.withItemInInventory(MiscItem.gelt)
			.withNotes("Obscurity: Ubiquitous (Automatic)"
					+ "<br>Awe of the Inquisition");
	// XP: 8/10

	public static final NPC sellSteel = new NPC("Sell-Steel", "35,35,30,30,35,30,35,30,30")
			.withSpecialRule(Talent.language.withParameter("Low Gothic"))
			.withItemEquipped(Armour.gangLeathers)
			.withItemEquipped(Clothing.ragCastings)
			.withItemInInventory(MeleeWeapon.knife)
			.withItemInInventory(RangedWeapon.pistol)
			.withItemInInventory(Ammo.pistol_mag)
			.withItemInInventory(MiscItem.gelt)
			.withNotes("Obscurity: Average (+0)"
					+ "<br>Hatred of the Inquisition");
	// XP: 8/10

	public static final NPC outlaw = new NPC("Outlaw", "30,30,30,30,35,30,35,30,30")
			.withSpecialRule(Talent.language.withParameter("Low Gothic"))
			.withSpecialRule(Talent.trade_survivalist)
			.withSpecialRule(Talent.trade_swindler)
			.withSkill(Skill.run.withBonus(10))
			.withSkill(Skill.search.withBonus(10))
			.withSkill(Skill.sneak.withBonus(10))
			.withSkill(Skill.unlock.withBonus(0))
			.withItemEquipped(Clothing.streetClothes)
			.withItemInInventory(Tool.lockpick)
			.withItemInInventory(MeleeWeapon.knife)
			.withItemInInventory(MiscItem.gelt)
			.withNotes("Obscurity: Average (+0)"
					+ "<br>Hatred of the Inquisition");
	// XP: 18/20

	public static final NPC shadesman = new NPC("Shadesman", "40,40,30,30,35,30,35,30,30")
			.withSpecialRule(Talent.language.withParameter("Low Gothic"))
			.withSkill(Skill.sneak.withBonus(10))
			.withItemEquipped(Armour.gangLeathers)
			.withItemEquipped(Clothing.streetClothes)
			.withItemInInventory(MeleeWeapon.longDagger)
			.withItemInInventory(RangedWeapon.pistol)
			.withItemInInventory(Ammo.pistol_mag)
			.withItemInInventory(MiscItem.gelt)
			.withNotes("Obscurity: Average (+0)"
					+ "<br>Hatred of the Inquisition");
	// XP: 18/20

	public static final NPC renegade = new NPC("Renegade", "30,30,30,30,35,35,35,30,35")
			.withSpecialRule(Talent.language.withParameter("Low Gothic"))
			.withSpecialRule(Talent.trade_survivalist)
			.withSpecialRule(Talent.trade_swindler)
			.withSkill(Skill.charm.withBonus(10))
			.withSkill(Skill.deceive.withBonus(10))
			.withSkill(Skill.run.withBonus(10))
			.withSkill(Skill.search.withBonus(10))
			.withSkill(Skill.sneak.withBonus(10))
			.withSkill(Skill.unlock.withBonus(10))
			.withItemEquipped(Clothing.streetClothes)
			.withItemInInventory(Tool.lockpick)
			.withItemInInventory(RangedWeapon.pistol)
			.withItemInInventory(MeleeWeapon.knife)
			.withItemInInventory(MiscItem.gelt)
			.withNotes("Obscurity: Average (+0)"
					+ "<br>Hatred of the Inquisition");
	// XP: 28/30

	public static final NPC nighthawk = new NPC("Nighthawk", "40,40,30,30,35,30,35,30,30")
			.withSpecialRule(Talent.language.withParameter("Low Gothic"))
			.withSkill(Skill.conceal.withBonus(20))
			.withSkill(Skill.sneak.withBonus(20))
			.withItemEquipped(Clothing.streetClothes)
			.withItemInInventory(MeleeWeapon.longDagger)
			.withItemInInventory(RangedWeapon.pistol)
			.withItemInInventory(Ammo.pistol_mag)
			.withItemInInventory(MiscItem.gelt)
			.withNotes("Obscurity: Niche (-10)"
					+ "<br>Hatred of the Inquisition");
	// XP: 28/30

	public static final NPC rogue = new NPC("Rogue", "30,30,30,30,40,35,35,30,40")
			.withSpecialRule(Talent.accustomedToDarkness)
			.withSpecialRule(Talent.knowledgable.withParameter("Underworld"))
			.withSpecialRule(Talent.language.withParameter("Low Gothic"))
			.withSpecialRule(Talent.quickEntry)
			.withSpecialRule(Talent.sprinter)
			.withSpecialRule(Talent.trade_survivalist)
			.withSpecialRule(Talent.trade_swindler)
			.withSpecialRule(Talent.tricksOfTheTrade)
			.withSkill(Skill.charm.withBonus(10))
			.withSkill(Skill.deceive.withBonus(10))
			.withSkill(Skill.run.withBonus(10))
			.withSkill(Skill.search.withBonus(10))
			.withSkill(Skill.sneak.withBonus(20))
			.withSkill(Skill.unlock.withBonus(20))
			.withItemEquipped(Clothing.streetClothes)
			.withItemInInventory(Tool.multiKey)
			.withItemInInventory(Tool.stummer)
			.withItemInInventory(RangedWeapon.pistol)
			.withItemInInventory(MeleeWeapon.knife)
			.withItemInInventory(MiscItem.gelt)
			.withNotes("Obscurity: Average (+0)"
					+ "<br>Hatred of the Inquisition");
	// XP: 58/60

	public static final NPC ganger = new NPC("Ganger", "40,40,40,40,35,30,35,30,30")
			.withSpecialRule(Talent.knowledgable.withParameter("Underworld"))
			.withSpecialRule(Talent.language.withParameter("Low Gothic"))
			.withSkill(Skill.dodge.withBonus(10))
			.withSkill(Skill.intimidate.withBonus(20))
			.withSkill(Skill.notice.withBonus(10))
			.withSkill(Skill.reflex.withBonus(10))
			.withSkill(Skill.run.withBonus(10))
			.withSkill(Skill.search.withBonus(10))
			.withSkill(Skill.sneak.withBonus(10))
			.withSkill(Skill.unlock.withBonus(0))
			.withItemEquipped(Armour.gangLeathers)
			.withItemEquipped(Clothing.streetClothes)
			.withItemInInventory(RangedWeapon.autopistol)
			.withItemInInventory(Ammo.autopistol_mag)
			.withItemInInventory(MeleeWeapon.club)
			.withItemInInventory(MeleeWeapon.knife)
			.withItemInInventory(MiscItem.gelt)
			.withNotes("Obscurity: Prevalent (+20)"
					+ "<br>Hatred of the Inquisition");
	// XP: 58/60

	public static final NPC assassin = new NPC("Assassin", "40,40,30,30,35,30,35,30,30")
			.withSpecialRule(Talent.accustomedToDarkness)
			.withSpecialRule(Talent.assassinStrike)
			.withSpecialRule(Talent.carefulStrikes)
			.withSpecialRule(Talent.knowledgable.withParameter("Underworld"))
			.withSpecialRule(Talent.language.withParameter("Low Gothic"))
			.withSpecialRule(Talent.marksman)
			.withSkill(Skill.conceal.withBonus(20))
			.withSkill(Skill.deceive.withBonus(20))
			.withSkill(Skill.disguise.withBonus(20))
			.withSkill(Skill.sneak.withBonus(20))
			.withItemEquipped(Clothing.streetClothes)
			.withItemInInventory(RangedWeapon.huntingRifle_scoped)
			.withItemInInventory(RangedWeapon.pistol)
			.withItemInInventory(Ammo.huntingRifle_mag)
			.withItemInInventory(MeleeWeapon.longDagger)
			.withItemInInventory(Consumable.vial_lethalPoison_3)
			.withItemInInventory(MiscItem.gelt)
			.withNotes("Obscurity: Obscure (-20)"
					+ "<br>Hatred of the Inquisition");
	// XP: 60/60

	public static final NPC fixer = new NPC("Fixer", "30,30,30,30,40,40,40,30,40")
			.withSpecialRule(Talent.accustomedToDarkness)
			.withSpecialRule(Talent.experienced.withParameter("Underworld"))
			.withSpecialRule(Talent.language.withParameter("Low Gothic"))
			.withSpecialRule(Talent.peer.withParameter("Underworld"))
			.withSpecialRule(Talent.quickEntry)
			.withSpecialRule(Talent.sprinter)
			.withSpecialRule(Talent.trade_survivalist)
			.withSpecialRule(Talent.trade_swindler)
			.withSpecialRule(Talent.tricksOfTheTrade)
			.withSkill(Skill.charm.withBonus(10))
			.withSkill(Skill.deceive.withBonus(10))
			.withSkill(Skill.inquire.withBonus(20))
			.withSkill(Skill.inspect.withBonus(10))
			.withSkill(Skill.run.withBonus(10))
			.withSkill(Skill.search.withBonus(10))
			.withSkill(Skill.sneak.withBonus(20))
			.withSkill(Skill.unlock.withBonus(20))
			.withItemEquipped(Clothing.streetClothes)
			.withItemInInventory(Tool.dataSlate)
			.withItemInInventory(Tool.multiKey)
			.withItemInInventory(RangedWeapon.pistol)
			.withItemInInventory(MeleeWeapon.knife)
			.withItemInInventory(MiscItem.gelt)
			.withNotes("Obscurity: Niche (-10)"
					+ "<br>Hatred of the Inquisition");
	// XP: 80/80

	public static final NPC stubjack = new NPC("Stubjack", "40,40,40,40,40,30,35,30,30")
			.withSpecialRule(Talent.knowledgable.withParameter("Underworld"))
			.withSpecialRule(Talent.language.withParameter("Low Gothic"))
			.withSkill(Skill.conceal.withBonus(10))
			.withSkill(Skill.dodge.withBonus(20))
			.withSkill(Skill.intimidate.withBonus(20))
			.withSkill(Skill.notice.withBonus(20))
			.withSkill(Skill.reflex.withBonus(20))
			.withSkill(Skill.run.withBonus(20))
			.withSkill(Skill.search.withBonus(10))
			.withSkill(Skill.sneak.withBonus(10))
			.withSkill(Skill.unlock.withBonus(0))
			.withItemEquipped(Armour.gangLeathers)
			.withItemEquipped(Clothing.streetClothes)
			.withItemInInventory(RangedWeapon.autostubber)
			.withItemInInventory(Ammo.autostubber_mag)
			.withItemInInventory(MeleeWeapon.knife)
			.withItemInInventory(MiscItem.gelt)
			.withNotes("Obscurity: Average (+0)"
					+ "<br>Hatred of the Inquisition");
	// XP: 80/80

	public static final NPC deathAdept = new NPC("Death Adept", "45,45,30,30,40,30,35,30,30")
			.withSpecialRule(Talent.accustomedToDarkness)
			.withSpecialRule(Talent.assassinStrike)
			.withSpecialRule(Talent.carefulStrikes)
			.withSpecialRule(Talent.knowledgable.withParameter("Underworld"))
			.withSpecialRule(Talent.language.withParameter("Low Gothic"))
			.withSpecialRule(Talent.marksman)
			.withSkill(Skill.conceal.withBonus(20))
			.withSkill(Skill.deceive.withBonus(20))
			.withSkill(Skill.disguise.withBonus(20))
			.withSkill(Skill.sneak.withBonus(20))
			.withItemEquipped(Clothing.bodyglove)
			.withItemInInventory(RangedWeapon.huntingRifle_scoped)
			.withItemInInventory(Ammo.huntingRifle_mag)
			.withItemInInventory(MeleeWeapon.longDagger)
			.withItemInInventory(MeleeWeapon.longDagger)
			.withItemInInventory(Consumable.vial_lethalPoison_3)
			.withItemInInventory(MiscItem.gelt)
			.withNotes("Obscurity: Very Obscure (-30)"
					+ "<br>Hatred of the Inquisition");
	// XP: 80/80

	public static final NPC shark = new NPC("Shark", "30,30,30,30,40,40,40,30,45")
			.withSpecialRule(Talent.accustomedToDarkness)
			.withSpecialRule(Talent.experienced.withParameter("Underworld"))
			.withSpecialRule(Talent.language.withParameter("Low Gothic"))
			.withSpecialRule(Talent.peer.withParameter("Underworld"))
			.withSpecialRule(Talent.quickEntry)
			.withSpecialRule(Talent.sprinter)
			.withSpecialRule(Talent.trade_survivalist)
			.withSpecialRule(Talent.trade_swindler)
			.withSpecialRule(Talent.tricksOfTheTrade)
			.withSkill(Skill.charm.withBonus(10))
			.withSkill(Skill.deceive.withBonus(20))
			.withSkill(Skill.inquire.withBonus(20))
			.withSkill(Skill.inspect.withBonus(10))
			.withSkill(Skill.persuade.withBonus(20))
			.withSkill(Skill.readPerson.withBonus(10))
			.withSkill(Skill.run.withBonus(10))
			.withSkill(Skill.search.withBonus(10))
			.withSkill(Skill.sneak.withBonus(20))
			.withSkill(Skill.unlock.withBonus(20))
			.withItemEquipped(Clothing.streetClothes)
			.withItemInInventory(Tool.dataSlate)
			.withItemInInventory(Tool.multiKey)
			.withItemInInventory(RangedWeapon.pistol)
			.withItemInInventory(MeleeWeapon.knife)
			.withItemInInventory(MiscItem.gelt)
			.withNotes("Obscurity: Niche (-10)"
					+ "<br>Hatred of the Inquisition");
	// XP: 100/100

	public static final NPC gangBoss = new NPC("Gang Boss", "40,40,40,40,40,30,35,30,40")
			.withSpecialRule(Talent.language.withParameter("Low Gothic"))
			.withSpecialRule(Talent.experienced.withParameter("Underworld"))
			.withSpecialRule(Talent.peer.withParameter("Underworld"))
			.withSkill(Skill.command.withBonus(20))
			.withSkill(Skill.conceal.withBonus(10))
			.withSkill(Skill.dodge.withBonus(20))
			.withSkill(Skill.intimidate.withBonus(20))
			.withSkill(Skill.notice.withBonus(20))
			.withSkill(Skill.reflex.withBonus(20))
			.withSkill(Skill.run.withBonus(20))
			.withSkill(Skill.search.withBonus(10))
			.withSkill(Skill.sneak.withBonus(10))
			.withSkill(Skill.unlock.withBonus(0))
			.withItemEquipped(Clothing.streetClothes)
			.withItemInInventory(RangedWeapon.autostubber)
			.withItemInInventory(Ammo.autostubber_mag)
			.withItemInInventory(RangedWeapon.pistol)
			.withItemInInventory(MeleeWeapon.knife)
			.withItemInInventory(MiscItem.gelt)
			.withNotes("Obscurity: Niche (-10)"
					+ "<br>Hatred of the Inquisition");
	// XP: 98/100

	public static final NPC assassinAtMarque = new NPC("Assassin at Marque", "45,45,30,30,40,30,35,30,40")
			.withSpecialRule(Talent.accustomedToDarkness)
			.withSpecialRule(Talent.assassinStrike)
			.withSpecialRule(Talent.carefulStrikes)
			.withSpecialRule(Talent.knowledgable.withParameter("Underworld"))
			.withSpecialRule(Talent.language.withParameter("High Gothic + Low Gothic"))
			.withSpecialRule(Talent.marksman)
			.withSkill(Skill.conceal.withBonus(20))
			.withSkill(Skill.deceive.withBonus(20))
			.withSkill(Skill.disguise.withBonus(30))
			.withSkill(Skill.sneak.withBonus(20))
			.withSkill(Skill.unlock.withBonus(0))
			.withItemEquipped(Clothing.smartClothes)
			.withItemInInventory(MeleeWeapon.longDagger)
			.withItemInInventory(MeleeWeapon.longDagger)
			.withItemInInventory(Consumable.vial_lethalPoison_5)
			.withItemInInventory(Tool.multiKey)
			.withItemInInventory(MiscItem.gelt)
			.withNotes("Obscurity: Extremely Obscure (-40)"
					+ "<br>Hatred of the Inquisition");
	// XP: 98/100

	public static final NPC charlatan = new NPC("Charlatan", "30,30,30,30,40,40,40,30,45")
			.withSpecialRule(Talent.accustomedToDarkness)
			.withSpecialRule(Talent.conversationalist)
			.withSpecialRule(Talent.experienced.withParameter("Underworld"))
			.withSpecialRule(Talent.language.withParameter("High Gothic + Low Gothic"))
			.withSpecialRule(Talent.peer.withParameter("Underworld"))
			.withSpecialRule(Talent.quickEntry)
			.withSpecialRule(Talent.sprinter)
			.withSpecialRule(Talent.trade_survivalist)
			.withSpecialRule(Talent.trade_swindler)
			.withSpecialRule(Talent.tricksOfTheTrade)
			.withSkill(Skill.charm.withBonus(30))
			.withSkill(Skill.deceive.withBonus(30))
			.withSkill(Skill.disguise.withBonus(20))
			.withSkill(Skill.inquire.withBonus(20))
			.withSkill(Skill.inspect.withBonus(10))
			.withSkill(Skill.persuade.withBonus(30))
			.withSkill(Skill.readPerson.withBonus(20))
			.withSkill(Skill.run.withBonus(10))
			.withSkill(Skill.search.withBonus(10))
			.withSkill(Skill.sneak.withBonus(20))
			.withSkill(Skill.unlock.withBonus(20))
			.withItemEquipped(Clothing.streetClothes)
			.withItemInInventory(Tool.dataSlate)
			.withItemInInventory(Tool.multiKey)
			.withItemInInventory(MiscItem.gelt)
			.withNotes("Obscurity: Niche (-10)"
					+ "<br>Hatred of the Inquisition");
	// XP: 148/150

	public static final NPC gangLord = new NPC("Gang Lord", "40,40,40,40,40,40,40,40,45")
			.withSpecialRule(Talent.language.withParameter("Low Gothic"))
			.withSpecialRule(Talent.experienced.withParameter("Underworld"))
			.withSpecialRule(Talent.peer.withParameter("Underworld"))
			.withSkill(Skill.command.withBonus(20))
			.withSkill(Skill.conceal.withBonus(10))
			.withSkill(Skill.dodge.withBonus(20))
			.withSkill(Skill.inquire.withBonus(20))
			.withSkill(Skill.interrogate.withBonus(20))
			.withSkill(Skill.intimidate.withBonus(30))
			.withSkill(Skill.notice.withBonus(20))
			.withSkill(Skill.readPerson.withBonus(20))
			.withSkill(Skill.reflex.withBonus(20))
			.withSkill(Skill.run.withBonus(20))
			.withSkill(Skill.search.withBonus(10))
			.withSkill(Skill.sneak.withBonus(10))
			.withSkill(Skill.unlock.withBonus(0))
			.withItemEquipped(Clothing.streetClothes)
			.withItemInInventory(RangedWeapon.autostubber)
			.withItemInInventory(Ammo.autostubber_mag)
			.withItemInInventory(RangedWeapon.pistol)
			.withItemInInventory(MeleeWeapon.knife)
			.withItemInInventory(MiscItem.gelt)
			.withNotes("Obscurity: Niche (-10)"
					+ "<br>Hatred of the Inquisition");
	// XP: 148/150
	
	public static final NPC lordOfAssassins = new NPC("Lord of Assassins", "50,50,30,30,40,30,35,30,40")
			.withSpecialRule(Talent.accustomedToDarkness)
			.withSpecialRule(Talent.assassinStrike)
			.withSpecialRule(Talent.carefulStrikes)
			.withSpecialRule(Talent.deftBladesman)
			.withSpecialRule(Talent.experienced.withParameter("Underworld"))
			.withSpecialRule(Talent.language.withParameter("High Gothic + Low Gothic"))
			.withSpecialRule(Talent.marksman)
			.withSpecialRule(Talent.network)
			.withSpecialRule(Talent.expandedNetwork)
			.withSpecialRule(Talent.peer.withParameter("Underworld"))
			.withSpecialRule(Talent.quickDraw)
			.withSkill(Skill.conceal.withBonus(20))
			.withSkill(Skill.deceive.withBonus(20))
			.withSkill(Skill.disguise.withBonus(30))
			.withSkill(Skill.sneak.withBonus(20))
			.withSkill(Skill.unlock.withBonus(20))
			.withItemEquipped(Clothing.smartClothes)
			.withItemEquipped(Tool.cameleolineCloak)
			.withItemInInventory(MeleeWeapon.longDagger)
			.withItemInInventory(MeleeWeapon.longDagger)
			.withItemInInventory(Consumable.vial_lethalPoison_5)
			.withItemInInventory(Tool.dataSlate)
			.withItemInInventory(Tool.multiKey)
			.withItemInInventory(MiscItem.gelt)
			.withNotes("Obscurity: Extremely Obscure (-40)"
					+ "<br>Hatred of the Inquisition");
	// XP: 150/150

	// Misc Characters //
	public static final NPC heretek = new NPC("Heretek", "30,30,30,30,30,30,30,30,30")
			.withSpecialRule(Talent.language.withParameter("Low Gothic"))
			.withItemEquipped(Clothing.drabGarb)
			.withItemInInventory(MeleeWeapon.knife_mono)
			.withItemInInventory(Tool.dataSlate_biolock)
			.withItemInInventory(MiscItem.gelt)
			.withNotes("Obscurity: Obscure (-20)"
					+ "<br>Hatred of the Inquisition");
	// XP: 0

		NPCGroup_Outcasts() {
			super("Outcasts");
			rankedCharacterList.add(dreg);
			rankedCharacterList.add(outcast);
			rankedCharacterList.add(sellSteel);
			rankedCharacterList.add(outlaw);
			rankedCharacterList.add(shadesman);
			rankedCharacterList.add(renegade);
			rankedCharacterList.add(nighthawk);
			rankedCharacterList.add(rogue);
			rankedCharacterList.add(ganger);
			rankedCharacterList.add(assassin);
			rankedCharacterList.add(fixer);
			rankedCharacterList.add(stubjack);
			rankedCharacterList.add(deathAdept);
			rankedCharacterList.add(shark);
			rankedCharacterList.add(gangBoss);
			rankedCharacterList.add(assassinAtMarque);
			rankedCharacterList.add(charlatan);
			rankedCharacterList.add(gangLord);
			rankedCharacterList.add(lordOfAssassins);
			miscCharacterList.add(heretek);
		}
}