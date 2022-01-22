package files;

import main.*;

class CorruptionAndMutationFile implements PrintableFile {
	
	private static String[][] corruptionTrack = {
			{"10", "Malignancy Test (+0)"},
			{"20", "Malignancy Test (+0)"},
			{"30", "Malignancy Test (+0)"},
			{"40", "Malignancy Test (-10) and Mutation Test (60)"},
			{"50", "Malignancy Test (-10)"},
			{"60", "Malignancy Test (-20) and Mutation Test (40)"},
			{"70", "Malignancy Test (-20)"},
			{"80", "Malignancy Test (-30) and Mutation Test (20)"},
			{"90", "Malignancy Test (-30)"},
			{"100", "Terminally Insane - the character becomes unplayable"},
	};
	
	private static String[][] malignanciesTable = {
			{"1-5", "Wasted Frame: Your pallor becomes corpse-like and your muscles waste away. Your Strength is permenantly reduced by 1d10."},
			{"6-10", "Poor Health: You constantly suffer petty illnesses and your wounds never seem to fully heal. Your Toughness is permenantly reduced by 1d10."},
			{"11-15", "Palsy: You suffer from numerous minor tics, shakes and tremors with no medical cause. Your Agility is permenantly reduced by 1d10."},
			{"16-25", "Morbid: You find it hard to concentrate as you become prone to tortured, gloom-filled trains of thought. Your Intelligence is permenantly reduced by 1d10."},
			{"26-30", "Malign Sight: The world seems to darken, tarnish and rot if you look at anything too long. Your Perception is permenantly reduced by 1d10."},
			{"31-40", "Dark Hearted: You grow increasingly cruel, callous and vindictive. Your Fellowship is permenantly reduced by 1d10."},
			{"41-50", "Bloodlust: Murderous rage is never far from your mind. You must succeed a Willpower Test to allow enemies to flee, be captured or be incapacitated rather than killing them, even if your intent is otherwise."},
			{"51-55", "Distrustful: You cannot conceal the distrust and antipathy you have for others. You take a -10 penalty to Fellowship Tests when interacting with strangers."},
			{"56-60", "Skin Afflictions: You are plagued by boils, scabs and weeping sores across your body. You take a -20 penalty to Charm."},
			{"61-70", "Witch-Mark (Specify): You develop some minor physical deformity or mutation. It is small and easily concealable, but perhaps enough to consign you to death if found by a fanatical witch hunter."},
			{"71-80", "Daemonic Nightmares: When you Rest after any stressful situation, you must succeed a Willpower Test or become Fatigued."},
			{"81-83", "Ashen Taste: You can barely stomach eating as food and drink always tastes foul to you. You take a -10 penalty to Toughness Tests to Overcome being Fatigued."},
			{"84-88", "Irrational Nausea (Prayer Books/Holy Items/Bare Flesh/Laughter/Fresh Food/etc.): You feel sick at the sight, sound or smell of something otherwise innocuous. You must succeed a Toughness Test or take a -10 penalty to Tests made in its presence."},
			{"89-93", "Strange Addiction (Fresh Blood/Tears/etc.): You have a craving for some bizarre substance, which is freakish enough to cause serious suspicion if discovered. You must succeed a Willpower Test to not act upon the craving."},
			{"94-98", "Fell Obsession (Collecting Fingers/Ritual Sacrifice/Vivisection/etc.): You have a compulsion to do something sinister or malign. You must succeed a Willpower Test to not act upon the compulsion."},
			{"99-100", "Blackouts: You suffer from inexplicable blackouts in which your mind relinquishes control to Chaos."}
	};
	
	private static String[][] mutationsTable = {
			{"01-05", "Nightsider: Your eyes become incredibly sensitive, forcing you to squint in even modest light, though you can see well in the dark. Your Perception is permenantly reduced by 10. You gain the Dark Sight Trait."},
			{"06-10", "Talons: Your nails lengthen, thicken and sharpen into lethal talons. Instead of Punch, you now have the Talons unarmed attack."},
			{"11-15", "Bug Eyes: Your eyes are changed, bulging out of their sockets. Your Perception is permenantly increased by 10; your Fellowship permenantly decreased by 10."},
			{"16-18", "Restless Speed: Your movements speed up to the point where you are constantly juddering and shaking unnaturally, and you can easily outrun any normal human. Your Agility is permenantly increased by 20; your Weapon Skill and Ballistic Skill are permenantly reduced by 10; you gain the Sprinter Talent."},
			{"19-21", "Monsterous Appearance: You are badly deformed, scarred or beastial in appearance, marking you as accursed and impure. Your Fellowship is permenantly reduced by 10, but you get a +10 bonus to Intimidate."},
			{"22-23", "Scythe: One of your arms elongates, the hand withering away as the bone juts out and becomes a long, sharp scythe. You lose a hand and gain the Scythe-Arm unarmed attack."},
			{"24-26", "Bone-Blades: The bones in your hands and arms grow long, twisted spurs that sprout painfully from your flesh on your command. You gain the Bone-Blade attack."},
			{"27-31", "Beastial Hide: Your skin becomes toughened with layers of thick scales or chitin. You gain the Armoured(2) Trait."},
			{"32-36", "Razor Fangs: Your teeth grow into long, tearing fangs. Your Fellowship is permenantly reduced by 5 and you gain the Razor Fangs attack."},
			{"37-38", "Feels No Pain: Your sense of touch is dulled to the point that you care little for even the most serious injuries. You are immune to becoming Stunned."},
			{"39-40", "Sightless Orbs: Your eyes become sightless, cracked windows into a corrupt soul. You gain the Blind and Unnatural Senses(CBx10) Traits."},
			{"41-45", "Hideous Strength: Your muscles swell to an unnatural extent. You permenantly increase your Strength by 20."},
			{"46-50", "Swollen Brute: You become excessively bloated and disturbingly muscular. Your Strength and Toughness is permenantly increased by 10; your Agility is permenantly reduced by 10."},
			{"51-55", "Corpulent: Your body swells into a huge and bloated frame. Your Size increases by 1; your Toughness is permenantly increased by 20; your Agility is permenantly reduced by 10."},
			{"56-57", "Deathsight: Your mind becomes twisted, with constant visions of how to bring death to anyone or anything you gaze upon. You can choose to take 1 Corruption Point to double the bonus gained from Aim (Full or Secondary Action)."},
			{"58-60", "Necrophage: You gain a near-insatiable apetite for raw human flesh. You can consume an entire corpse as a Long Action, recovering all Wounds and all levels of Fatigued and Bleeding Out, and gaining 1d10+5 Corruption Points."},
			{"61-65", "Witch-Curse: A small stigma in the shape of a maddening rune appears on your body, marking you as touched by Chaos. You gain the Unsanctioned Psyker and Psy Rating 1 Talents (or increase your Psy Rating by 1) and gain any 1 psychic power worth 100 XP. You take 1 Corruption Point whenever you use this power."},
			{"66-68", "Unnatural Arms: Twisted appendages emerge from your torso. You gain the Arms(CB) Trait."},
			{"69-71", "Excessive Legs: You develop extra legs that support your upper torso above a centauroid lower body. You gain the Legs(CB) Trait."},
			{"72-73", "Wings: Massive feathered or leathery wings erupt from your spine. You gain the Flight(CBx2) Trait."},
			{"74-76", "Serpantine Tail: Your legs wither while your spine elongates into a serpentine tail that supports your body. You gain the Crawler Trait and the Tail Whip attack. You can also Grapple with the tail."},
			{"77-79", "Nightmarish Visage: Your flesh is warped and twisted into such a horrific state that it causes many to flee from you in terror. You gain the Fear(1) Trait."},
			{"80-82", "Caustic Blood: Your veins are filled with caustic chemicals in place of blood, though somehow the corrosive effects do not burn your own flesh. When you become Bleeding Out, the foul liquid erupts and inflicts 1d10+CB Chemical damage to all adjacent characters."},
			{"83-87", "Unholy Aura: The warp corruption within you leaks out and swirls around you like a daemonic aura. You gain the Daemonic Presence(20m) Trait."},
			{"88-89", "Cursed Fleshmetal: The armour you are wearing and the weapons you are holding become fused with your flesh and cannot be removed without surgery. If you have a free hand or are not wearing armour (either by chance or after such surgery), you can choose to take 1 Corruption Point and fuse with a new item. Fused items are reloaded and repaired when you Rest; instead of a fused item becoming Out Of Power, you become Fatigued."},
			{"90-93", "Warp Gaze: All who see your eyes dispair as they gaze into the fire of the warp. You can choose to take 3 Corruption Points to make all characters within 20m in your field of vision make a Fear(1) test."},
			{"94-95", "Corrupted Flesh: Instead of blood, when your flesh is torn asunder, horrific insects, worms and other creatures spill forth. When you take a Wound, you gain the Fear(1) Trait momentarily. When you become Bleeding Out, you gain the Fear(2) Trait until you are Treated."},
			{"96-97", "Warp Regeneration: Corruption seethes through your flesh, sewing your body back together whenever you reach out to the unholy powers. You can choose to gain 3 Corruption Points to regenerate as a Main Action Willpower Test, recovering CB Wounds plus 1 per DoS."},
			{"98-99", "Cursed Immortality: You are infused with the power of the warp, keeping you alive even upon suffering terrible wounds. You do not die from Bleeding Out or from Critical Damage, unless the hit deals at least 10+CB Wounds."},
			{"100", "The Warp Made Manifest: Utterly flooded with warp energy, your body is remade in the image of your corrupt soul as you undergo a complete daemonic transformation. You permenantly increase your Strength and Toughness by 20; you gain the Daemonic, Fear(2) and Warp Instability Traits."},
	};
	
	@Override
	public String filename() {
		return "CorruptionAndMutation.html";
	}
	
	@Override
	public String title() {
		return "Corruption and Mutation";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printHeader_collapsible("Corruption");
		printer.printCollapsibleTop();
		printer.printParagraph("Each time a character gains Corruption Points, check whether they have passed thresholds for taking a Malignancy Test or Mutation Test - resolve this in the aftermath of the encounter.");
		printer.printTableTop("Corruption", "Effect", false, true);
		for(int i = 0; i < corruptionTrack.length; i ++) {
			printer.printTableRow(corruptionTrack[i]);
		}
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Malignancies");
		printer.printCollapsibleTop();
		printer.printParagraph("A Malignancy Test is a Willpower Test with the modifier specified on the Corruption Track. If you succeed, you are unaffected; if you fail, roll on the Malignancies table below (reroll inappropriate repeat results).");
		printer.printTableTop("d100", "Effect", true, true);
		for(int i = 0; i < malignanciesTable.length; i ++) {
			printer.printTableRow(malignanciesTable[i]);
		}
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Mutation");
		printer.printCollapsibleTop();
		printer.printParagraph("A Mutation Test is a Test using the Characteristic value specified on the Corruption Track. If you succeed, roll on the Mutations table (reroll inappropriate repeat results).");
		printer.printList(false, new String[] {
				"At Corruption 40, roll twice and use the lower roll on the Mutations table.",
				"At Corruption 60, roll once on the Mutations table",
				"At Corruption 80, roll twice and use the higher roll on the Mutations table.",
		});
		printer.printSubSubheader("Mutations Without Corruption");
		printer.printParagraph("For instances of mutation arising from causes other than warp-corruption, roll on the Mutations table twice and use the lower result - if this is over 55, roll again. If the mutation depends on your Corruption Bonus, instead use a value of 3.");
		printer.printTableTop("d100", "Effect", true, true);
		for(int i = 0; i < mutationsTable.length; i ++) {
			printer.printTableRow(mutationsTable[i]);
		}
		printer.printTableTail();
		printer.printSubSubheader("Attacks from Mutations");
		printer.printRowTop();
		printer.printCol_item(6, MeleeWeapon.talons);
		printer.printCol_item(6, MeleeWeapon.scytheArm);
		printer.printCol_item(6, MeleeWeapon.boneBlades);
		printer.printCol_item(6, MeleeWeapon.razorFangs);
		printer.printCol_item(6, MeleeWeapon.tailWhip);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}