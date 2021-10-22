import java.io.PrintWriter;
import java.util.LinkedList;

import files.TextFileHandler;

/**
 * Program for compiling the documentation for Dark Heresy Overhaul as an HTML document.
 * 
 * Files are processed from the /in/ folder to the /out/ folder.
 * Lines starting with !<command> run the command in place of that line.
 * Lines containing !!@<variable>!! have the variable inserted.
 * 
 * @author rob
 *
 */
class DarkHeresyOverhaul {
	// General //
	private static PrintWriter pw = null;
	private static String title = "", header = "", note = "";
	private static LinkedList<SpecialRule> specialRuleList = null; // Used for NPCs and Home Worlds.
	
	// Character Creation //
	private static HomeWorld homeWorld = null;
	private static Background background = null;
	private static Background.BackgroundPath backgroundPath = null;
	
	// NPC Groups //
	private static NPCGroup npcGroup = null;
	private static NPC npc = null;
	private static SpecialRule special = null;
	private static Skill skill = null;
	private static Item item = null;
	private static boolean isItemEquipped = false;
	
	public static void main(String[] args) {
		// Character Creation //
		printCharacterCreationFile();
		
		// Talents //
		printTalentsFile();
		
		// NPC Groups //
		NPCGroup[] npcGroupList = {
				new NPCGroup_AdeptusAdministratum(),
				new NPCGroup_AdeptusArbites(),
				new NPCGroup_AdeptusAstraTelepathica(),
				new NPCGroup_AdeptusMechanicus(),
				new NPCGroup_ImperialGuard(),
				new NPCGroup_Ministorum(),
				new NPCGroup_Outcasts()};
		for(NPCGroup group : npcGroupList) {
			printNPCGroupFile(group);
		}
	}
	
	public static String idFrom(String string) {
		String idString = "";
		for(char c : string.toCharArray()) {
			if(Character.isLetterOrDigit(c)) {
				idString += c;
			} else {
				idString += "";
			}
		}
		return idString;
	}
	
	private static void printBackgroundBenefitsList() {
		for(Background background : Background.list) {
			DarkHeresyOverhaul.background = background;
			processFile("BACKGROUND_BENEFITS");
		}
	}
	
	private static void printBackgroundPathList() {
		for(Background.BackgroundPath backgroundPath : background.backgroundPathList) {
			DarkHeresyOverhaul.backgroundPath = backgroundPath;
			processFile("BACKGROUND_PATH");
		}
	}
	
	private static void printBackgroundPathBenefitsList() {
		pw.println("				<b>Characteristic Increases</b>");
		pw.println("				<ul>");
		for(String characteristicIncrease : DarkHeresyOverhaul.backgroundPath.characteristicsIncreaseList) {
			pw.println("					<li>"+characteristicIncrease+"</li>");
		}
		if(DarkHeresyOverhaul.backgroundPath.characteristicsIncreaseList.length == 0) {
			pw.println("					<li>None</li>");
		}
		pw.println("				</ul>");
		pw.println("				<b>Talents</b>");
		pw.println("				<ul>");
		for(SpecialRule special : DarkHeresyOverhaul.backgroundPath.specialRuleList) {
			pw.println("					<li>"+special.getFullName()+"</li>");
		}
		if(DarkHeresyOverhaul.backgroundPath.specialRuleList.length == 0) {
			pw.println("					<li>None</li>");
		}
		pw.println("				</ul>");
		pw.println("				<b>Skills</b>");
		pw.println("				<ul>");
		for(Skill skill : DarkHeresyOverhaul.backgroundPath.skillList) {
			pw.println("					<li>"+skill.getFullName()+"</li>");
		}
		if(DarkHeresyOverhaul.backgroundPath.skillList.length == 0) {
			pw.println("					<li>None</li>");
		}
		pw.println("				</ul>");
		pw.println("				<b>Items</b>");
		pw.println("				<ul>");
		for(Item item : DarkHeresyOverhaul.backgroundPath.itemList) {
			pw.println("					<li>"+item.getFullName(false)+"</li>");
		}
		if(DarkHeresyOverhaul.backgroundPath.itemList.length == 0) {
			pw.println("					<li>None</li>");
		}
		pw.println("				</ul>");
	}
	
	private static void printCharacterCreationFile() {
		pw = TextFileHandler.startWritingToFile("out/CharacterCreation.html");
		title = "Character Creation";
		processFile("CharacterCreation");
		pw.close();
	}
	
	private static void printCharacterSheetList() {
		for(NPC npc : npcGroup.npcList) {
			DarkHeresyOverhaul.npc = npc;
			DarkHeresyOverhaul.specialRuleList = npc.specialRuleList;
			processFile("CHARACTER_SHEET");
			pw.println();
			pw.println();
		}
	}
	
	private static void printEquippedItemList() {
		isItemEquipped = true;
		if(npc.equippedItemList.isEmpty()) {
			processFile("NO_ITEMS");
		}
		for(Item item : npc.equippedItemList) {
			DarkHeresyOverhaul.item = item;
			processFile("ITEM");
		}
	}
	
	private static void printHeader(String header) {
		DarkHeresyOverhaul.header = header;
		processFile("HEADER");
	}
	
	private static void printHeader_collapsible(String header) {
		DarkHeresyOverhaul.header = header;
		processFile("HEADER_COLLAPSIBLE");
	}
	
	private static void printHomeWorldBenefitsList() {
		for(HomeWorld homeWorld : HomeWorld.list) {
			DarkHeresyOverhaul.homeWorld = homeWorld;
			DarkHeresyOverhaul.specialRuleList = homeWorld.specialRuleList;
			processFile("HOME_WORLD_BENEFITS");
		}
	}
	
	private static void printInventoryList() {
		isItemEquipped = false;
		if(npc.inventoryList.isEmpty()) {
			processFile("NO_ITEMS");
		}
		for(Item item : npc.inventoryList) {
			DarkHeresyOverhaul.item = item;
			processFile("ITEM");
		}
	}
	
	private static void printNPCGroupFile(NPCGroup group) {
		npcGroup = group;
		pw = TextFileHandler.startWritingToFile("out/NPCs-"+group.id+".html");
		title = group.name+" NPCs";
		processFile("NPCs-GROUP");
		pw.close();
	}
	
	private static void printSpecialRuleList() {
		for(SpecialRule special : specialRuleList) {
			DarkHeresyOverhaul.special = special;
			processFile("SPECIAL");
		}
	}
	
	private static void printSkillList() {
		if(npc.skillList.isEmpty()) {
			processFile("NO_SKILLS");
		}
		for(Skill skill : npc.skillList) {
			DarkHeresyOverhaul.skill = skill;
			processFile("SKILL");
		}
	}
	
	private static void printSubheader(String subheader) {
		DarkHeresyOverhaul.header = subheader;
		processFile("SUBHEADER");
	}
	
	private static void printTableNote(String note) {
		DarkHeresyOverhaul.note = note;
		processFile("TABLE_NOTE");
	}
	
	private static void printTalent(Talent talent) {
		DarkHeresyOverhaul.special = talent;
		processFile("TALENT");
	}
	
	private static void printTalentsFile() {
		pw = TextFileHandler.startWritingToFile("out/Talents.html");
		title = "Talents";
		processFile("TOP");
		printHeader_collapsible("General");
		processFile("TABLE_TOP_TALENTS");
		printTalent(Talent.intimidating);
		printTalent(Talent.rapidReload);
		printTalent(Talent.sprinter);
		printTalent(Talent.teamFighting);
		printTalent(Talent.unarmedMaster);
		printTalent(Talent.weaponFamiliarity_melee);
		printTalent(Talent.weaponFamiliarity_ranged);
		printTalent(Talent.weaponMaster_melee);
		printTalent(Talent.weaponMaster_ranged);
		printTalent(Talent.wrestler);
		processFile("TABLE_TAIL");
		pw.println("	</div>");
		pw.println();
		pw.println();
		printHeader_collapsible("Offence");
		processFile("TABLE_TOP_TALENTS");
		printTalent(Talent.assaultFire);
		printTalent(Talent.battleRage);
		printTalent(Talent.brutalCharge);
		printTalent(Talent.crushingBlow);
		printTalent(Talent.followThrough);
		printTalent(Talent.frenzy);
		printTalent(Talent.furiousAssault);
		printTalent(Talent.ironFists);
		printTalent(Talent.meleeShooting);
		printTalent(Talent.recoilCompensation);
		printTalent(Talent.stampede);
		printTalent(Talent.strongAttacks);
		printTalent(Talent.stunningBlow);
		printTalent(Talent.sweepingAttack);
		printTalent(Talent.thunderousCharge);
		processFile("TABLE_TAIL");
		pw.println("	</div>");
		pw.println();
		pw.println();
		
		printHeader_collapsible("Finesse");
		processFile("TABLE_TOP_TALENTS");
		printTalent(Talent.agileFighter);
		printTalent(Talent.agileStrike);
		printTalent(Talent.assassinStrike);
		printTalent(Talent.hipShooting);
		printTalent(Talent.carefulStrikes);
		printTalent(Talent.deftBladesman);
		printTalent(Talent.dualWielder);
		printTalent(Talent.effortlessDodge);
		printTalent(Talent.effortlessParry);
		printTalent(Talent.gunslinger);
		printTalent(Talent.independentTargeting);
		printTalent(Talent.leapUp);
		printTalent(Talent.marksman);
		printTalent(Talent.martialArtist);
		printTalent(Talent.masterGunslinger);
		printTalent(Talent.quickDraw);
		printTalent(Talent.riposte);
		printTalent(Talent.sniperShot);
		printTalent(Talent.swiftBlade);
		printTalent(Talent.twoWeaponMaster);
		processFile("TABLE_TAIL");
		pw.println("	</div>");
		pw.println();
		pw.println();
		
		printHeader_collapsible("Defence");
		processFile("TABLE_TOP_TALENTS");
		printTalent(Talent.adamantiumWill);
		printTalent(Talent.constantVigilance);
		printTalent(Talent.denyTheWitch);
		printTalent(Talent.dieHard);
		printTalent(Talent.dirtyFighting);
		printTalent(Talent.disarm);
		printTalent(Talent.hardTarget);
		printTalent(Talent.ignorePain);
		printTalent(Talent.mentalFortress);
		printTalent(Talent.nervesOfSteel);
		printTalent(Talent.numbToPain);
		printTalent(Talent.resistance.withParameter("Specify*"));
		printTableNote("*Cold, Heat, Poison, Radiation, Vacuum");
		processFile("TABLE_TAIL");
		pw.println("	</div>");
		pw.println();
		pw.println();
		
		printHeader_collapsible("Psyker");
		processFile("TABLE_TOP_TALENTS");
		printTalent(Talent.psyker.withParameter("Specify*"));
		printTableNote("*Sanctioned: You aquire the Sense Immaterium Skill. Adeptus Astra Telepathica Background only.");
		printTableNote("*Unsanctioned: You aquire the Sense Immaterium Skill. You gain 1d10+5 Corruption and Insanity Points.");
		printTalent(Talent.psyRating1);
		printTalent(Talent.psyRating2);
		printTalent(Talent.psyRating3);
		printTalent(Talent.psyRating4);
		printTalent(Talent.psyRating5);
		printTalent(Talent.drawDeeper);
		printTalent(Talent.masteredPsychicPower.withParameter("Specify*"));
		printTableNote("*Any Psychic Power you have. The XP cost is the same as that Psychic Power.");
		printTalent(Talent.powerJuggler);
		printTalent(Talent.subtlePsyker);
		printTalent(Talent.strongConnection);
		printTalent(Talent.strongMind);
		printTalent(Talent.theConstantThreat);
		processFile("TABLE_TAIL");
		pw.println("	</div>");
		pw.println();
		pw.println();
		
		printHeader_collapsible("Tech");
		processFile("TABLE_TOP_TALENTS");
		// TODO //
		processFile("TABLE_TAIL");
		pw.println("	</div>");
		pw.println();
		pw.println();
		
		printHeader_collapsible("Leadership");
		processFile("TABLE_TOP_TALENTS");
		// TODO //
		processFile("TABLE_TAIL");
		pw.println("	</div>");
		pw.println();
		pw.println();
		
		printHeader_collapsible("Fieldcraft");
		processFile("TABLE_TOP_TALENTS");
		// TODO //
		processFile("TABLE_TAIL");
		pw.println("	</div>");
		pw.println();
		pw.println();
		
		printHeader_collapsible("Social");
		processFile("TABLE_TOP_TALENTS");
		// TODO //
		processFile("TABLE_TAIL");
		pw.println("	</div>");
		pw.println();
		pw.println();
		
		printHeader_collapsible("Knowledge");
		processFile("TABLE_TOP_TALENTS");
		// TODO //
		processFile("TABLE_TAIL");
		pw.println("	</div>");
		pw.println();
		pw.println();
		
		printHeader_collapsible("Trades (General)");
		processFile("TABLE_TOP_TALENTS");
		// TODO //
		processFile("TABLE_TAIL");
		pw.println("	</div>");
		pw.println();
		pw.println();
		
		processFile("TAIL");
		pw.close();
	}
	
	private static void processFile(String filename) {
		LinkedList<String> lineList = TextFileHandler.readEntireFile("in/"+filename+".txt");
		for(String line : lineList) {
			if(line.contains("!!")){
				processLineWithCommand(line);
			} else if(line.startsWith("!")) {
				Command.run(line.substring(1));
			} else {
				pw.println(line);
			}
		}
	}
	
	private static void processLineWithCommand(String line) {
		String[] partList = line.split("!!");
		line = "";
		for(String part : partList) {
			if(part.startsWith("@"))
				part = Variable.valueOf(part.substring(1)).get();
			line += part;
		}
		pw.println(line);
	}
	
	private enum Command {
		PROCESS,
		HOME_WORLD_BENEFITS_LIST, HOME_WORLD_BENEFITS, BACKGROUND_BENEFITS_LIST, BACKGROUND_PATH_LIST, BACKGROUND_PATH_BENEFITS_LIST,
		RANK_STRUCTURE, CHARACTER_SHEET_LIST, SPECIAL_RULE_LIST, SKILL_LIST, EQUIPPED_ITEM_LIST, INVENTORY_LIST;
		
		private static void run(String commandCode) {
			String[] partList = commandCode.split(":");
			String[] parameterList = new String[partList.length - 1];
			for(int i = 0; i < parameterList.length; i ++) {
				parameterList[i] = partList[i+1];
			}
			Command.valueOf(partList[0]).run(parameterList);
		}
		
		private void run(String[] parameterList) {
			switch(this) {
			case PROCESS:
				processFile(parameterList[0]);
				break;
			case HOME_WORLD_BENEFITS_LIST:
				printHomeWorldBenefitsList();
				break;
			case HOME_WORLD_BENEFITS:
				processFile("HOME_WORLD_BENEFITS");
				break;
			case BACKGROUND_BENEFITS_LIST:
				printBackgroundBenefitsList();
				break;
			case BACKGROUND_PATH_LIST:
				printBackgroundPathList();
				break;
			case BACKGROUND_PATH_BENEFITS_LIST:
				printBackgroundPathBenefitsList();
				break;
			case CHARACTER_SHEET_LIST:
				printCharacterSheetList();
				break;
			case RANK_STRUCTURE:
				processFile("RANK_STRUCTURE-"+npcGroup.id);
				break;
			case SPECIAL_RULE_LIST:
				printSpecialRuleList();
				break;
			case SKILL_LIST:
				printSkillList();
				break;
			case EQUIPPED_ITEM_LIST:
				printEquippedItemList();
				break;
			case INVENTORY_LIST:
				printInventoryList();
				break;
			default:
				throw new RuntimeException("Undefined Command: "+this);
			}
		}
	}
	
	private enum Variable {
		TITLE, HEADER, HEADER_ID, SUBHEADER, SUBHEADER_ID, NOTE,
		HOME_WORLD_ID, HOME_WORLD_NAME, HOME_WORLD_APTITUDE, BACKGROUND_ID, BACKGROUND_NAME, BACKGROUND_APTITUDE, BACKGROUND_PATH_NAME, BACKGROUND_PATH_COL_SIZE,
		CHARACTER_ID, CHARACTER_NAME,
		CHARACTER_WOUNDS, CHARACTER_INSANITY, CHARACTER_CORRUPTION,
		CHARACTER_WS, CHARACTER_BS, CHARACTER_S, CHARACTER_T, CHARACTER_AG, CHARACTER_INT, CHARACTER_PER, CHARACTER_WP, CHARACTER_FEL,
		SPECIAL_NAME, SPECIAL_DESCRIPTION, SKILL_NAME, ITEM_NAME,
		TALENT_NAME, TALENT_DESCRIPTION, TALENT_REQUIREMENT, TALENT_APTITUDE, TALENT_XP;
		
		private String get() {
			switch (this) {
			case TITLE:
				return title;
			case HEADER:
				return header;
			case HEADER_ID:
				return idFrom(header);
			case NOTE:
				return note;
			case HOME_WORLD_ID:
				return homeWorld.id;
			case HOME_WORLD_NAME:
				return homeWorld.name;
			case HOME_WORLD_APTITUDE:
				return homeWorld.getAptitudes();
			case BACKGROUND_ID:
				return background.id;
			case BACKGROUND_NAME:
				return background.name;
			case BACKGROUND_APTITUDE:
				return background.aptitude;
			case BACKGROUND_PATH_NAME:
				return backgroundPath.name;
			case BACKGROUND_PATH_COL_SIZE:
				return ""+(12/background.backgroundPathList.size());
			case CHARACTER_ID:
				return npc.id;
			case CHARACTER_NAME:
				return npc.name;
			case CHARACTER_WOUNDS:
				return ""+npc.wounds;
			case CHARACTER_INSANITY:
				return ""+npc.insanity;
			case CHARACTER_CORRUPTION:
				return ""+npc.corruption;
			case CHARACTER_WS:
				return ""+npc.weaponSkill;
			case CHARACTER_BS:
				return ""+npc.ballisticSkill;
			case CHARACTER_S:
				return ""+npc.strength;
			case CHARACTER_T:
				return ""+npc.toughness;
			case CHARACTER_AG:
				return ""+npc.agility;
			case CHARACTER_INT:
				return ""+npc.intelligence;
			case CHARACTER_PER:
				return ""+npc.perception;
			case CHARACTER_WP:
				return ""+npc.willpower;
			case CHARACTER_FEL:
				return ""+npc.fellowship;
			case SPECIAL_NAME: case TALENT_NAME:
				return special.getFullName();
			case SPECIAL_DESCRIPTION: case TALENT_DESCRIPTION:
				return special.description;
			case TALENT_REQUIREMENT:
				return ((Talent)special).requirement;
			case TALENT_APTITUDE:
				return ((Talent)special).aptitude;
			case TALENT_XP:
				return ""+((Talent)special).xp;
			case SKILL_NAME:
				return skill.getFullName();
			case ITEM_NAME:
				return item.getFullName(isItemEquipped);
			default:
				throw new RuntimeException("Undefined Variable: "+this);
			}
		}
	}
}