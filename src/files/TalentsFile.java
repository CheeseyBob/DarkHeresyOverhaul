package files;

import main.*;

class TalentsFile implements PrintableFile {
	
	@Override
	public String filename() {
		return "Talents.html";
	}
	
	@Override
	public String title() {
		return "Talents";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printHeader_collapsible("General");
		printer.printCollapsibleTop();
		printer.printTableTop_talents();
		printer.printTableRow_talent(Talent.intimidating);
		printer.printTableRow_talent(Talent.rapidReload);
		printer.printTableRow_talent(Talent.sprinter);
		printer.printTableRow_talent(Talent.teamFighting);
		printer.printTableRow_talent(Talent.unarmedMaster);
		printer.printTableRow_talent(Talent.weaponFamiliarity_melee);
		printer.printTableRow_talent(Talent.weaponFamiliarity_ranged);
		printer.printTableRow_talent(Talent.weaponMaster_melee);
		printer.printTableRow_talent(Talent.weaponMaster_ranged);
		printer.printTableRow_talent(Talent.wrestler);
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Offence");
		printer.printCollapsibleTop();
		printer.printTableTop_talents();
		printer.printTableRow_talent(Talent.assaultFire);
		printer.printTableRow_talent(Talent.battleRage);
		printer.printTableRow_talent(Talent.brutalCharge);
		printer.printTableRow_talent(Talent.crushingBlow);
		printer.printTableRow_talent(Talent.followThrough);
		printer.printTableRow_talent(Talent.frenzy);
		printer.printTableRow_talent(Talent.furiousAssault);
		printer.printTableRow_talent(Talent.ironFists);
		printer.printTableRow_talent(Talent.meleeShooting);
		printer.printTableRow_talent(Talent.recoilCompensation);
		printer.printTableRow_talent(Talent.stampede);
		printer.printTableRow_talent(Talent.strongAttacks);
		printer.printTableRow_talent(Talent.stunningBlow);
		printer.printTableRow_talent(Talent.sweepingAttack);
		printer.printTableRow_talent(Talent.thunderousCharge);
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Finesse");
		printer.printCollapsibleTop();
		printer.printTableTop_talents();
		printer.printTableRow_talent(Talent.agileFighter);
		printer.printTableRow_talent(Talent.agileStrike);
		printer.printTableRow_talent(Talent.assassinStrike);
		printer.printTableRow_talent(Talent.hipShooting);
		printer.printTableRow_talent(Talent.carefulStrikes);
		printer.printTableRow_talent(Talent.deftBladesman);
		printer.printTableRow_talent(Talent.dualWielder);
		printer.printTableRow_talent(Talent.effortlessDodge);
		printer.printTableRow_talent(Talent.effortlessParry);
		printer.printTableRow_talent(Talent.gunslinger);
		printer.printTableRow_talent(Talent.independentTargeting);
		printer.printTableRow_talent(Talent.leapUp);
		printer.printTableRow_talent(Talent.marksman);
		printer.printTableRow_talent(Talent.martialArtist);
		printer.printTableRow_talent(Talent.masterGunslinger);
		printer.printTableRow_talent(Talent.quickDraw);
		printer.printTableRow_talent(Talent.riposte);
		printer.printTableRow_talent(Talent.sniperShot);
		printer.printTableRow_talent(Talent.swiftBlade);
		printer.printTableRow_talent(Talent.twoWeaponMaster);
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Defence");
		printer.printCollapsibleTop();
		printer.printTableTop_talents();
		printer.printTableRow_talent(Talent.adamantiumWill);
		printer.printTableRow_talent(Talent.constantVigilance);
		printer.printTableRow_talent(Talent.denyTheWitch);
		printer.printTableRow_talent(Talent.dieHard);
		printer.printTableRow_talent(Talent.dirtyFighting);
		printer.printTableRow_talent(Talent.disarm);
		printer.printTableRow_talent(Talent.hardTarget);
		printer.printTableRow_talent(Talent.ignorePain);
		printer.printTableRow_talent(Talent.mentalFortress);
		printer.printTableRow_talent(Talent.nervesOfSteel);
		printer.printTableRow_talent(Talent.numbToPain);
		printer.printTableRow_talent(Talent.resistance.withParameter("Specify*"));
		printer.printTableRow_note("*Cold, Heat, Poison, Radiation, Vacuum");
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Psyker");
		printer.printCollapsibleTop();
		printer.printTableTop_talents();
		printer.printTableRow_talent(Talent.psyker.withParameter("Specify*"));
		printer.printTableRow_note("*Sanctioned: You aquire the Sense Immaterium Skill. Adeptus Astra Telepathica Background only.");
		printer.printTableRow_note("*Unsanctioned: You aquire the Sense Immaterium Skill. You gain 1d10+5 Corruption and Insanity Points.");
		printer.printTableRow_talent(Talent.psyRating1);
		printer.printTableRow_talent(Talent.psyRating2);
		printer.printTableRow_talent(Talent.psyRating3);
		printer.printTableRow_talent(Talent.psyRating4);
		printer.printTableRow_talent(Talent.psyRating5);
		printer.printTableRow_talent(Talent.drawDeeper);
		printer.printTableRow_talent(Talent.masteredPsychicPower.withParameter("Specify*"));
		printer.printTableRow_note("*Any Psychic Power you have. The XP cost is the same as that Psychic Power.");
		printer.printTableRow_talent(Talent.powerJuggler);
		printer.printTableRow_talent(Talent.subtlePsyker);
		printer.printTableRow_talent(Talent.strongConnection);
		printer.printTableRow_talent(Talent.strongMind);
		printer.printTableRow_talent(Talent.theConstantThreat);
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Tech");
		printer.printCollapsibleTop();
		printer.printTableTop_talents();
		printer.printTableRow_talent(Talent.demolitionsExpert);
		printer.printTableRow_talent(Talent.operate_ag.withParameter("Specify*"));
		printer.printTableRow_note("*Jump-Pack, Bike, Skimmer");
		printer.printTableRow_talent(Talent.operate_int.withParameter("Specify*"));
		printer.printTableRow_note("*Wheeled, Tracked, Walker, Flier, Spacecraft, Voidship");
		printer.printTableRow_talent(Talent.technicalKnock);
		printer.printTableRow_talent(Talent.weaponTech);
		printer.printTableTail();
		printer.printSubheader("Adeptus Mechanicus");
		printer.printTableTop_talents();
		printer.printTableRow_talent(Talent.bloodFiltration);
		printer.printTableRow_talent(Talent.ferricSummons);
		printer.printTableRow_talent(Talent.luminenBlast);
		printer.printTableRow_talent(Talent.luminenShock);
		printer.printTableRow_talent(Talent.maglevTranscendence);
		printer.printTableRow_talent(Talent.prosanguine);
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Leadership");
		printer.printCollapsibleTop();
		printer.printTableTop_talents();
		printer.printTableRow_talent(Talent.commanding);
		printer.printTableRow_talent(Talent.dominatingBellow);
		printer.printTableRow_talent(Talent.expandedNetword);
		printer.printTableRow_talent(Talent.haloOfCommand);
		printer.printTableRow_talent(Talent.inspiring);
		printer.printTableRow_talent(Talent.intoTheJawsOfHell);
		printer.printTableRow_talent(Talent.ironDiscipline);
		printer.printTableRow_talent(Talent.leadByExample);
		printer.printTableRow_talent(Talent.network);
		printer.printTableRow_talent(Talent.publicSpeaker);
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Fieldcraft");
		printer.printCollapsibleTop();
		printer.printTableTop_talents();
		printer.printTableRow_talent(Talent.accustomedToDarkness);
		printer.printTableRow_talent(Talent.accustomedToZeroGravity);
		printer.printTableRow_talent(Talent.catfall);
		printer.printTableRow_talent(Talent.firstAider);
		printer.printTableRow_talent(Talent.rideBeast);
		printer.printTableRow_talent(Talent.tracker);
		printer.printTableRow_talent(Talent.quickEntry);
		printer.printTableRow_talent(Talent.spotWeakness);
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Social");
		printer.printCollapsibleTop();
		printer.printTableTop_talents();
		printer.printTableRow_talent(Talent.charming);
		printer.printTableRow_talent(Talent.cluesFromTheCrowds);
		printer.printTableRow_talent(Talent.conversationalist);
		printer.printTableRow_talent(Talent.coordinatedInterrogation);
		printer.printTableRow_talent(Talent.coverUp);
		printer.printTableRow_talent(Talent.delicateInterrogation);
		printer.printTableRow_talent(Talent.entrapment);
		printer.printTableRow_talent(Talent.faceInACrowd);
		printer.printTableRow_talent(Talent.logicalCommunicator);
		printer.printTableRow_talent(Talent.persuasive);
		printer.printTableRow_talent(Talent.peer.withParameter("Specify*"));
		printer.printTableRow_note("*A power group:" + "\n"
				+ "<ul>" + "\n"
				+ "<li>Adeptus Administratum: The vast beaurocracy that administers the domains of the Imperium.</li>" + "\n"
				+ "<li>Adeptus Arbites: The keepers of Imperial law and enforcers of loyalty to the Golden Throne.</li>" + "\n"
				+ "<li>Adeptus Astra Telepathica: The organisation that trains and sanctions Imperial psykers.</li>" + "\n"
				+ "<li>Adeptus Mechanicus: The disciples of the Machine God, who are the preservers and fabricators of technology.</li>" + "\n" 
				+ "<li>Adeptus Ministorum: The keepers of faith in the Emperor's divinity, also known as the Ecclesiarchy.</li>" + "\n"
				+ "<li>Imperial Guard: The Imperium's immesurable armies, fighting andless battles across the galaxy.</li>" + "\n"
				+ "<li>Underworld: The many organisations that operate outside the bounds of Imperial legal authorities.</li>" + "\n"
				+ "</ul>");
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Knowledge");
		printer.printCollapsibleTop();
		printer.printTableTop_talents();
		printer.printTableRow_talent(Talent.creativeProblemSolving);
		printer.printTableRow_talent(Talent.deepestSecrets);
		printer.printTableRow_talent(Talent.specialistKnowledge);
		printer.printTableRow_talent(Talent.language.withParameter("Specify*"));
		printer.printTableRow_note("*A language:" + "\n"
				+ "<ul>" + "\n"
				+ "<li>Low Gothic: The common tongue of the Imperium.</li>" + "\n"
				+ "<li>High Gothic: The language used by Imperial officials, clergy and nobility.</li>" + "\n"
				+ "<li>Binary Cant: The language of the Machine Spirits. Communicating with Machine Spirits uses Intelligence instead of Fellowship.</li>" + "\n"
				+ "<li>Imperial Codes: The numbers, acronyms and code words of the battle language employed by the Imperial Guard and Imperial Navy.</li>" + "\n"
				+ "<li>Chaos Marks: The symbols and signs that followers of the Ruinous Powers use to share their dark secrets.</li>" + "\n"
				+ "<li>A Xeno Language.</li>" + "\n"
				+ "</ul>");
		printer.printTableRow_talent(Talent.knowledgable.withParameter("Specify*"));
		printer.printTableRow_talent(Talent.experienced.withParameter("Specify*"));
		printer.printTableRow_note("*A common lore area:" + "\n"
				+ "<ul>" + "\n"
				+ "<li>Adeptus Administratum: The vast beaurocracy that administers the domains of the Imperium, including its labyrinthine workings, rules, traditions and dictates.</li>" + "\n"
				+ "<li>Adeptus Arbites: The keepers of Imperial law and enforcers of loyalty to the Golden Throne, including details of rank structure, common procedures and the basic tents of Imperial justice.</li>" + "\n"
				+ "<li>Adeptus Astra Telepathica: The organisation that trains and sanctions Imperial psykers, including how psykers are gathered and sanctioned, how Astropaths are used throughout the Imperium, and the basics of astro-telepathy.</li>" + "\n"
				+ "<li>Adeptus Mechanicus: The disciples of the Omnissiah, who are the preservers and fabricators of technology, including the symbols and practices that the Cult of the Machine God commonly uses.</li>" + "\n"
				+ "<li>Adeptus Ministorum: The keepers of faith in the Emperor's divinity, also known as the Ecclesiarchy, including its structure and general practices, and its role in the worship of the Emperor.</li>" + "\n"
				+ "<li>Calixis Sector: The various worlds and power groups of the Calixis Sector, including their history and culture.</li>" + "\n"
				+ "<li>Imperial Creed: The rites, practices, festivals and saints of the Imperial Cult, as preached by the Ecclesiarchy.</li>" + "\n"
				+ "<li>Imperial Guard: The Imperium's immesurable armies, fighting endless battles across the galaxy, including its ranks, logistics and structure, as well as common tactical and strategic practices.</li>" + "\n"
				+ "<li>Tech: Revered technology, including the simple litanies and rituals to soothe and appease machine spirits.</li>" + "\n"
				+ "<li>Underworld: Crime and sedition within the Imperium, including the many organisations that operate outside the bounds of Imperial legal authorities.</li>" + "\n" 
				+ "<li>War: The great battles, famous strategems, heroes, and notable commanders of the endless battles for and against the Imperium.</li>" + "\n"
				+ "</ul>");
		printer.printTableRow_talent(Talent.educated.withParameter("Specify*"));
		printer.printTableRow_talent(Talent.expert.withParameter("Specify*"));
		printer.printTableRow_talent(Talent.naturalExpertise.withParameter("Specify*"));
		printer.printTableRow_note("*A scholastic lore area:" + "\n"
				+ "<ul>" + "\n"
				+ "<li>Astromancy: Stars, the worlds around them, cosmic phenomena and astrolithic charts.</li>" + "\n"
				+ "<li>Beasts: The many animals and beasts found across the sector.</li>" + "\n"
				+ "<li>Bureaucracy: Governments and the Administratum, their rules, regulations, policies, forms and departments.</li>" + "\n"
				+ "<li>Chymistry: Chemicals, their alchemical applications, and their prevalence or scarcity throughout the Imperium.</li>" + "\n"
				+ "<li>Cryptology: Codes, ciphers, secret languages and numerical keys.</li>" + "\n"
				+ "<li>Heraldry: The seals and heraldic devices used by noble houses.</li>" + "\n"
				+ "<li>Judgement: The proper sentences for the myriad crimes and heresies punishable by Imperial law.</li>" + "\n"
				+ "<li>Numerology: The mysterious links between mathematics and the physical universe.</li>" + "\n"
				+ "<li>Occult: Obscure rituals, theories and superstitions, and the better-known uses of occult items.</li>" + "\n"
				+ "<li>Philosophy: Theories of thought, belief, existence and other intangibles, including logic, debate and crafting arguments.</li>" + "\n"
				+ "<li>Tactica Imperialis: The codified military doctrines of the Imperial Guard, including theories of war, troop deployment and battle techniques.</li>" + "\n"
				+ "<li>Theology: The rituals of the Ecclesiarchy, the construction of their temples and the finer points of liturgy.</li>" + "\n"
				+ "</ul>");
		printer.printTableRow_talent(Talent.unveiledSecrets.withParameter("Specify*"));
		printer.printTableRow_talent(Talent.darkSecrets.withParameter("Specify*"));
		printer.printTableRow_note("*A forbidden lore area:" + "\n"
				+ "<ul>" + "\n"
				+ "<li>Archeotech: The great lost tech devices of times past, and clues to their functions and purposes.</li>" + "\n"
				+ "<li>Daemonology: Warp entities and their twisted manifestations.</li>" + "\n"
				+ "<li>Heresy: The acts and practices deemed heretical by the Imperium.</li>" + "\n"
				+ "<li>Mutants: The various stable and unstable mutations within humanity.</li>" + "\n"
				+ "<li>Psykers: Psykers, the effects of their powers, their dangers and the extent of their capabilities.</li>" + "\n"
				+ "<li>The Warp: The nature of the Immaterium, its interaction with realspace, and how its tides and eddies affect travel between the stars.</li>" + "\n"
				+ "<li>Xenos: The alien species known to the Imperium, the threat they pose to humanity, and their general appearance.</li>" + "\n"
				+ "</ul>");
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Trades (General)");
		printer.printCollapsibleTop();
		printer.printTableTop_talents();
		printer.printTableRow_talent(Talent.trade_agriWorker);
		printer.printTableRow_talent(Talent.trade_apothecary);
		printer.printTableRow_talent(Talent.trade_archeologist);
		printer.printTableRow_talent(Talent.trade_armourer);
		printer.printTableRow_talent(Talent.trade_astrographer);
		printer.printTableRow_talent(Talent.trade_cartographer);
		printer.printTableRow_talent(Talent.trade_chymist);
		printer.printTableRow_talent(Talent.trade_cryptographer);
		printer.printTableRow_talent(Talent.trade_cook);
		printer.printTableRow_talent(Talent.trade_copyist);
		printer.printTableRow_talent(Talent.trade_linguist);
		printer.printTableRow_talent(Talent.trade_loremancer);
		printer.printTableRow_talent(Talent.trade_mason);
		printer.printTableRow_talent(Talent.trade_merchant);
		printer.printTableRow_talent(Talent.trade_miner);
		printer.printTableRow_talent(Talent.trade_morticator);
		printer.printTableRow_talent(Talent.trade_performer);
		printer.printTableRow_talent(Talent.trade_prospector);
		printer.printTableRow_talent(Talent.trade_scrimshaw);
		printer.printTableRow_talent(Talent.trade_sculptor);
		printer.printTableRow_talent(Talent.trade_shipwright);
		printer.printTableRow_talent(Talent.trade_soothsayer);
		printer.printTableRow_talent(Talent.trade_survivalist);
		printer.printTableRow_talent(Talent.trade_swindler);
		printer.printTableRow_talent(Talent.trade_technomat);
		printer.printTableRow_talent(Talent.trade_valet);
		printer.printTableRow_talent(Talent.trade_voidfarer);
		printer.printTableRow_talent(Talent.trade_wright);
		printer.printTableTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}