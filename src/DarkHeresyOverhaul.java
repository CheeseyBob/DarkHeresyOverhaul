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
	private static String title = "";
	private static LinkedList<SpecialRule> specialRuleList = null; // Used for NPCs and Home Worlds.
	
	// Character Creation //
	private static HomeWorld homeWorld = null;
	
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
	
	private static void printHomeWorldBenefitsList() {
		HomeWorld[] homeWorldList = {
				new HomeWorld_Feral(),
				new HomeWorld_Forge(),
				new HomeWorld_Highborn(),
				new HomeWorld_Hive(),
				new HomeWorld_Shrine(),
				new HomeWorld_Tithe(),
				new HomeWorld_Void(),
				new HomeWorld_War()
		};
		for(HomeWorld homeWorld : homeWorldList) {
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
		HOME_WORLD_BENEFITS_LIST, HOME_WORLD_BENEFITS,
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
		TITLE,
		HOME_WORLD_NAME, 
		CHARACTER_ID, CHARACTER_NAME,
		CHARACTER_WOUNDS, CHARACTER_INSANITY, CHARACTER_CORRUPTION,
		CHARACTER_WS, CHARACTER_BS, CHARACTER_S, CHARACTER_T, CHARACTER_AG, CHARACTER_INT, CHARACTER_PER, CHARACTER_WP, CHARACTER_FEL,
		SPECIAL_NAME, SPECIAL_DESCRIPTION, SKILL_NAME, ITEM_NAME;
		
		private String get() {
			switch (this) {
			case HOME_WORLD_NAME:
				return homeWorld.name;
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
			case SPECIAL_NAME:
				return special.getFullName();
			case SPECIAL_DESCRIPTION:
				return special.description;
			case SKILL_NAME:
				return skill.getFullName();
			case ITEM_NAME:
				return item.getFullName(isItemEquipped);
			case TITLE:
				return title;
			default:
				throw new RuntimeException("Undefined Variable: "+this);
			}
		}
	}
}