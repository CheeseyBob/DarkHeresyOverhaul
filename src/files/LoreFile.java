package files;

import main.*;

class LoreFile implements PrintableFile {
	
	private static final LoreArea adeptusAdministratum = new LoreArea("Adeptus Administratum",
			"The vast beaurocracy that administers the domains of the Imperium, including its labyrinthine workings, rules, traditions and dictates.",
			new String[] {
					"Identify planetary governors.",
					"Identify typical personel or well-known leaders of the Adeptus Administratum.",
			},
			new String[] {
					"Determine whether something is associated to the Adeptus Administratum and in what way.",
					"Determine whether something conforms to or violates Administratum rules and procedures.",
			},
			new String[] {
					"Assist with disguising oneself as an Administratum official.",
					"Assist with inquiring about something at an Administratum facility.",
					"Assist with persuading the Adeptus Administratum to provide help.",
			});
	
	private static final LoreArea adeptusArbites = new LoreArea("Adeptus Arbites",
			"The keepers of Imperial law and enforcers of loyalty to the Golden Throne, including details of rank structure, common procedures and the basic tents of Imperial justice.",
			new String[] {
					"Identify Adeptus Arbites equipment.",
					"Identify typical personel or well-known leaders of the Adeptus Arbites.",
			},
			new String[] {
					"Determine whether something is associated to the Adeptus Arbites and in what way.",
					"Determine whether something conforms to or violates Imperial Law.",
					},
			new String[] {
					"Assist with disguising oneself as an Arbitrator.",
					"Assist with inquiring about something at an Arbites facility.",
					"Assist with persuading the Adeptus Arbites to provide help.",
					});
	
	private static final LoreArea adeptusAstraTelepathica = new LoreArea("Adeptus Astra Telepathica",
			"The organisation that trains and sanctions Imperial psykers, including how psykers are gathered and sanctioned, how Astropaths are used throughout the Imperium, and the basics of astro-telepathy.",
			new String[] {
					"Identify Adeptus Astra Telepathica equipment.",
					"Identify typical personel or well-known leaders of the Adeptus Astra Telepathica.",
			},
			new String[] {
					"Determine whether something is associated to the Adeptus Astra Telepathica and in what way.",
					"Determine whether or not a psyker has been sanctioned.",
					"Determine details about astro-telepathy.",
					},
			new String[] {
					"Assist with disguising oneself as member of the Adeptus Astra Telepathica.",
					"Assist with inquiring about something at an Astra Telepathica facility.",
					"Assist with persuading the Adeptus Astra Telepathica to provide help.",
					});
	
	private static final LoreArea adeptusMechanicus = new LoreArea("Adeptus Mechanicus",
			"The disciples of the Omnissiah, who are the preservers and fabricators of technology, including the symbols and practices that the Cult of the Machine God commonly uses.",
			new String[] {
					"Identify Adeptus Mechanicus equipment.",
					"Identify typical personel or well-known leaders of the Adeptus Mechanicus.",
			},
			new String[] {
					"Determine whether something is associated to the Adeptus Mechanicus and in what way.",
					"Determine whether something is considered tech-heresy and in what way.",
					"Determine the motives of tech-priests.",
					},
			new String[] {
					"Assist with disguising oneself as a tech-priest.",
					"Assist with inquiring about something at a Mechanicus facility.",
					"Assist with persuading the Adeptus Mechanicus to provide help.",
					});
	
	private static final LoreArea adeptusMinistorum = new LoreArea("Adeptus Ministorum",
			"The keepers of faith in the Emperor's divinity, also known as the Ecclesiarchy, including its structure and general practices, and its role in the worship of the Emperor.",
			new String[] {
					"Identify Adeptus Ministorum equipment.",
					"Identify typical personel or well-known leaders of the Adeptus Ministorum.",
			},
			new String[] {
					"Determine whether something is associated to the Adeptus Ministorum and in what way.",
					"Determine whether or not something is in line with the traditions and practises of the Ministorum.",
					},
			new String[] {
					"Assist with disguising oneself as a member of the Ministorum.",
					"Assist with inspecting Ministorum documents.",
					"Assist with inquiring about something with the Ministorum.",
					"Assist with persuading the Ministorum to provide help.",
					});
	
	private static final LoreArea calixisSector = new LoreArea("Calixis Sector",
			"The various worlds and power groups of the Calixis Sector, including their history and culture.",
			new String[] {
					"Identify famous items.",
					"Identify famous individuals.",
			},
			new String[] {
					"Determine whether something is associated to one of the sector's power groups and in what way.",
					"Determine whether something is associated to the sector's history and in what way.",
					"Determine whether something is associated to the culture of a specific world in the sector and which world.",
					},
			new String[] {
					"Assist with crafting artwork of cultural icons or in certain styles.",
					"Assist with searching for something from a specific world in the sector.",
					});
	
	private static final LoreArea imperialCreed = new LoreArea("Imperial Creed",
			"The rites, practices, festivals and saints of the Imperial Cult, as preached by the Ecclesiarchy.",
			new String[] {
					"Identify Imperial saints.",
					"Identify items associated with Imperial saints.",
			},
			new String[] {
					"Determine whether something is used in the rites and festivals of the Imperial Cult and in what way.",
					"Determine whether something is heretical.",
					},
			new String[] {
					"Assist with crafting artwork depicting saints or other icons of the Imperial Cult.",
					"Assist with inspecting the holy texts of the Ecclesiarchy.",
					"Assist with inquiring about matters pertaining to the Imperial Creed.",
					});
	
	private static final LoreArea imperialGuard = new LoreArea("Imperial Guard",
			"The Imperium's immesurable armies, fighting endless battles across the galaxy, including its ranks, logistics and structure, as well as common tactical and strategic practices.",
			new String[] {
					"Identify Imperial Guard equipment.",
					"Identify typical personel or well-known leaders of the Imperial Guard.",
			},
			new String[] {
					"Determine whether something is associated to the Imperial Guard and in what way.",
					"Determine whether or not something follows Imperial Guard protocol.",
					},
			new String[] {
					"Assist with disguising oneself as a Guardsman.",
					"Assist with inquiring about something at an Imperial Guard facility.",
					"Assist with persuading the Imperial Guard to provide help.",
					});
	
	private static final LoreArea tech = new LoreArea("Tech",
			"Revered technology, including the simple litanies and rituals to soothe and appease machine spirits.",
			new String[] {
					"Identify tech items.",
					"Identify bionics and machines.",
			},
			new String[] {
					"Determine the uses of tech items and machines.",
					"Determine whether something is considered tech-heresy and in what way.",
					},
			new String[] {
					"Assist with inspecting tech items and machines.",
					"Assist with Use Tech when trying to get a difficult piece of technology to work.",
					});
	
	private static final LoreArea underworld = new LoreArea("Underworld",
			"Crime and sedition within the Imperium, including the many organisations that operate outside the bounds of Imperial legal authorities.",
			new String[] {
					"Identify illicit items.",
					"Identify typical criminals and underworld types.",
			},
			new String[] {
					"Determine whether something is associated with a criminal organisation or crime generally.",
					"Determine the motives of criminals.",
					},
			new String[] {
					"Assist with disguising oneself as a criminal or member of a criminal organisation.",
					"Assist with inquiring about illicit matters.",
					"Assist with inquiring about something at a criminal organisation.",
					"Assist with persuading a criminal organisation to work with you.",
					});
	
	private static final LoreArea war = new LoreArea("War",
			"The great battles, famous strategems, heroes, and notable commanders of the endless battles for and against the Imperium.",
			new String[] {
					"Identify well-known weapons and war machines.",
					"Identify heroes and notable commanders.",
			},
			new String[] {
					"Determine whether something is millitary or civilian.",
					"Determine whether something is associated to a historical battle or military campaign.",
					},
			new String[] {
					"Assist with crafting artwork depicting historical battles and heroes.",
					"Assist with inquiring about matters pertaining to war.",
					});
	
	private static final LoreArea astromancy = new LoreArea("Astromancy",
			"Stars, the worlds around them, cosmic phenomena and astrolithic charts.",
			new String[] {
					"Identify cosmic phenomena.",
			},
			new String[] {
					"Determine whether something is associated with cosmic phenomena and in what way.",
					"Determine technical details about stars and planets.",
					"Determine the past and future behaviour of stars, planets and cosmic phenomena.",
					},
			new String[] {
					"Assist with crafting astrolithic charts.",
					"Assist with inspecting astrolithic data.",
					});
	
	private static final LoreArea beasts = new LoreArea("Beasts",
			"The many animals and beasts found across the sector.",
			new String[] {
					"Identify animals and beasts.",
			},
			new String[] {
					"Determine which type of animal something is associated to.",
					"Determine details about an animal.",
					"Determine the behaviour of animals.",
					},
			new String[] {
					"Assist with fighting beasts.",
					"Assist with inspecting animals.",
					"Assist with searching for animals or animal dens.",
					"Assist with wrangling animals.",
					});
	
	private static final LoreArea bureaucracy = new LoreArea("Bureaucracy",
			"",
			new String[] {
					"-",
			},
			new String[] {
					"Determine the purpose and validity of Administratum forms and paperwork.",
					"Determine the origin and reasoning behind the policies and regulations of the Administratum.",
					},
			new String[] {
					"Assist with crafting Administratum documents.",
					"Assist with inspecting Administratum documents.",
					});
	
	private static final LoreArea chymistry = new LoreArea("Chymistry",
			"Chemicals, their alchemical applications, and their prevalence or scarcity throughout the Imperium.",
			new String[] {
					"Identify chemicals and chemical apparatus.",
			},
			new String[] {
					"Determine the uses of chemicals.",
					"Determine what chemical something is.",
					"Determine what chemical caused some effect.",
					},
			new String[] {
					"Assist with crafting drugs, poisons and other chemicals.",
					"Assist with inspecting chemicals and chemical effects.",
					});
	
	private static final LoreArea cryptology = new LoreArea("Cryptology",
			"Codes, ciphers, secret languages and numerical keys.",
			new String[] {
					"-",
			},
			new String[] {
					"Determine which code, cipher or secret language something is.",
					"Determine the true meaning behind a coded message.",
					},
			new String[] {
					"Assist with crafting coded messages.",
					"Assist with hacking into encrypted systems or encrypting data.",
					});
	
	private static final LoreArea heraldry = new LoreArea("Heraldry",
			"The seals and heraldic devices used by noble houses.",
			new String[] {
					"Identify xxxxxxxxxxxx",
			},
			new String[] {
					"Determine xxxxxxxxxxxxxx",
					},
			new String[] {
					"Assist with xxxxxxxxxxxxxx",
					});
	
	private static final LoreArea judgement = new LoreArea("Judgement",
			"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
			new String[] {
					"Identify xxxxxxxxxxxx",
			},
			new String[] {
					"Determine xxxxxxxxxxxxxx",
					"Determine the origin or reasoning behind Imperial laws.",
					},
			new String[] {
					"Assist with xxxxxxxxxxxxxx",
					"Assist with inspecting legal documents.",
					});
	
	private static final LoreArea numerology = new LoreArea("Numerology",
			"The mysterious links between mathematics and the physical universe.",
			new String[] {
					"Identify xxxxxxxxxxxx",
			},
			new String[] {
					"Determine xxxxxxxxxxxxxx",
					},
			new String[] {
					"Assist with xxxxxxxxxxxxxx",
					});
	
	private static final LoreArea occult = new LoreArea("Occult",
			"Obscure rituals, theories and superstitions, and the better-known uses of occult items.",
			new String[] {
					"Identify xxxxxxxxxxxx",
			},
			new String[] {
					"Determine xxxxxxxxxxxxxx",
					},
			new String[] {
					"Assist with xxxxxxxxxxxxxx",
					});
	
	private static final LoreArea philosophy = new LoreArea("Philosophy",
			"Theories of thought, belief, existence and other intangibles, including logic, debate and crafting arguments.",
			new String[] {
					"Identify xxxxxxxxxxxx",
			},
			new String[] {
					"Determine xxxxxxxxxxxxxx",
					},
			new String[] {
					"Assist with xxxxxxxxxxxxxx",
					});
	
	private static final LoreArea tacticaImperialis = new LoreArea("Tactica Imperialis",
			"The codified military doctrines of the Inperial Guard, including theories of war, troop deployment and battle techniques.",
			new String[] {
					"Identify xxxxxxxxxxxx",
			},
			new String[] {
					"Determine xxxxxxxxxxxxxx",
					},
			new String[] {
					"Assist with xxxxxxxxxxxxxx",
					});
	
	private static final LoreArea theology = new LoreArea("Theology",
			"The rituals of the Ecclesiarchy, the construction of their temples and the finer points of liturgy.",
			new String[] {
					"Identify Imperial saints.",
					"Identify items associated with Imperial saints.",
			},
			new String[] {
					"Determine whether something is used in the rites and festivals of the Imperial Cult and in what way.",
					"Determine xxxxxxxxxxxxxx",
					"Determine the origins behind the rituals and practises of the Ministorum.",
					},
			new String[] {
					"Assist with conducting the Ecclesiarchy's rituals.",
					"Assist with inspecting holy texts.",
					"Assist with xxxxxxxxxxxxxx",
					});
	
	private static final LoreArea archeotech = new LoreArea("Archeotech",
			"The great lost tech devices of times past, and clues to their functions and purposes.",
			new String[] {
					"Identify xxxxxxxxxxxx",
			},
			new String[] {
					"Determine xxxxxxxxxxxxxx",
			},
			new String[] {
					"Assist with xxxxxxxxxxxxxx",
					});
	
	private static final LoreArea daemonology = new LoreArea("Daemonology",
			"Warp entities and their twisted manifestations.",
			new String[] {
					"Identify xxxxxxxxxxxx",
			},
			new String[] {
					"Determine xxxxxxxxxxxxxx",
			},
			new String[] {
					"Assist with xxxxxxxxxxxxxx",
					});
	
	private static final LoreArea heresy = new LoreArea("Heresy",
			"The acts and practices deemed heretical by the Imperium.",
			new String[] {
					"Identify heretical items.",
					"Identify famous heretics.",
			},
			new String[] {
					"Determine whether something is heretical and in what way.",
					"Determine where a famous cult is based.",
					"Determine the motives of a cult.",
			},
			new String[] {
					"Assist with crafting heretical items.",
					"Assist with disguising oneself as a cultist.",
					"Assist with inquiring about heretical activities.",
					"Assist with interrogating a suspected cultist.",
					"Assist with searching for possible cult hideouts.",
					});
	
	private static final LoreArea mutants = new LoreArea("Mutants",
			"The various stable and unstable mutations within humanity.",
			new String[] {
					"Identify xxxxxxxxxxxx",
			},
			new String[] {
					"Determine xxxxxxxxxxxxxx",
			},
			new String[] {
					"Assist with xxxxxxxxxxxxxx",
					});
	
	private static final LoreArea psykers = new LoreArea("Psykers",
			"Psykers, the effects of their powers, their dangers and the extent of their capabilities.",
			new String[] {
					"Identify xxxxxxxxxxxx",
			},
			new String[] {
					"Determine xxxxxxxxxxxxxx",
			},
			new String[] {
					"Assist with xxxxxxxxxxxxxx",
					});
	
	private static final LoreArea theWarp = new LoreArea("The Warp",
			"The nature of the Immaterium, its interaction with realspace, and how its tides and eddies affect travel between the stars.",
			new String[] {
					"Identify xxxxxxxxxxxx",
			},
			new String[] {
					"Determine xxxxxxxxxxxxxx",
			},
			new String[] {
					"Assist with xxxxxxxxxxxxxx",
					});
	
	private static final LoreArea xenos = new LoreArea("Xenos",
			"The alien species known to the Imperium, the threat they pose to humanity, and their general appearance.",
			new String[] {
					"Identify xxxxxxxxxxxx",
			},
			new String[] {
					"Determine xxxxxxxxxxxxxx",
			},
			new String[] {
					"Assist with xxxxxxxxxxxxxx",
					});
	
	@Override
	public String filename() {
		return "Lore.html";
	}
	
	@Override
	public String title() {
		return "Lore";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printParagraph("There are three uses for the lore skills:");
		printer.printList(false, new String[] {
				"Identify - to get Clues or Info when you first encounter something.",
				"Assist - to help with some other Action (after you successfully Identify).",
				"Research - to get Clues or Info by doing research.",
		});
		printer.printSubheader("Assist");
		printer.printParagraph("You can Assist when your knowledge would help taking the Action against the target. For example, Common Lore (Imperial Guard) would help with getting assistance from the Guard against a dangerous xeno threat, whereas Forbidden Lore (Xenos) would help with interacting with the xeno. Common Lore (Tech) would help with getting a difficult piece of technology to work, but wouldn't help whenever you used a multi-tool to do something.");
		printer.printParagraph("The bonus from the created Aspect can also benefit others when it makes sense (i.e. if you can convey the information).");
		printer.printSubheader("Research");
		printer.printParagraph("Research can only be done with Scholastic Lore or Forbidden Lore and requires access to the appropriate facilities. This could mean anything from a data-tome on the appropriate topic to an entire Administratum Archive (modifiers can be applied for different facilities).");
		printer.printSubheader("Examples");
		printer.printList(false, new String[] {
				"While exploring a cave, you come across a strange xeno species. You Reference Forbidden Lore (Xenos) and successfully Identify it, revealing its more notable abilities.",
				"Having successfully Identified the xeno, you decide to sneak past it. You take a moment to think about how your knowledge of the xeno could Assist you. You succeed, which then helps you Sneak past without it spotting you.",
				"Before heading to the cultists' lair, you head to the Inquisitorial Librarium to Reference Forbidden Lore (Daemonology) to Research the daemon you know they worship. You spend several hours pouring through data-tomes with some success before you hit a dead end [critical failure], leaving with several useful pieces of information.",
				"When you find the recently-deceased body of a Guardsman in the cultists' lair, you successfully Reference Common Lore (Imperial Guard) to Identify the Guardsman. You realise he is a high ranking officer and is from a regiment based at a different planet in the subsector - two Clues which could help your investigation.",
				"Pouring through the archives once again to Reference Forbidden Lore (Heresy) to Research possible connections between the cult and the Guard regiment, you discover that the regiment has been linked to cult activity a number of times in the past, giving you a few Clues to investigate further.",
		});
		printer.printHeader_collapsible("Common Lore Areas");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printLoreArea(printer, adeptusAdministratum);
		printLoreArea(printer, adeptusArbites);
		printLoreArea(printer, adeptusAstraTelepathica);
		printLoreArea(printer, adeptusMechanicus);
		printLoreArea(printer, adeptusMinistorum);
		printLoreArea(printer, calixisSector);
		printLoreArea(printer, imperialCreed);
		printLoreArea(printer, imperialGuard);
		printLoreArea(printer, tech);
		printLoreArea(printer, underworld);
		printLoreArea(printer, war);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Scholastic Lore Areas");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printLoreArea(printer, astromancy);
		printLoreArea(printer, beasts);
		printLoreArea(printer, bureaucracy);
		printLoreArea(printer, chymistry);
		printLoreArea(printer, cryptology);
		printLoreArea(printer, heraldry);
		printLoreArea(printer, judgement);
		printLoreArea(printer, numerology);
		printLoreArea(printer, occult);
		printLoreArea(printer, philosophy);
		printLoreArea(printer, tacticaImperialis);
		printLoreArea(printer, theology);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Forbidden Lore Areas");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printLoreArea(printer, archeotech);
		printLoreArea(printer, daemonology);
		printLoreArea(printer, heresy);
		printLoreArea(printer, mutants);
		printLoreArea(printer, psykers);
		printLoreArea(printer, theWarp);
		printLoreArea(printer, xenos);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
	
	private void printLoreArea(DHOPrinter printer, LoreArea area) {
		printer.printColTop(6);
		printer.printSubheader(area.header);
		printer.printParagraph(area.description);
		printer.printSubSubheader("Get Info");
		printer.printList(false, area.getInfo);
		printer.printSubSubheader("Get Clues");
		printer.printList(false, area.getClues);
		printer.printSubSubheader("Assist");
		printer.printList(false, area.assist);
		printer.printColTail();
	}
	
	private static class LoreArea {
		String header;
		String description;
		String[] getInfo, getClues, assist;
		
		LoreArea(String header, String description,
				String[] getInfo, String[] getClues, String[] assist) {
			this.header = header;
			this.description = description;
			this.getInfo = getInfo;
			this.getClues = getClues;
			this.assist = assist;
		}
	}
}