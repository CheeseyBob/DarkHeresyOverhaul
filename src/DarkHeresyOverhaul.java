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
	private static PrintWriter pw = null;
	private static String title = "";
	private static NPCGroup npcGroup = null;
	private static NPC npc = null;
	private static SpecialRule special = null;
	private static Skill skill = null;
	private static Item item = null;
	private static boolean isItemEquipped = false;
	
	public static void main(String[] args) {
		
		NPCGroup[] npcGroupList = {NPCGroup.adeptusAdministratum, NPCGroup.adeptusArbites};
		for(NPCGroup group : npcGroupList) {
			printNPCGroupFile(group);
		}
		
	}
	
	private static void printCharacterSheets() {
		for(NPC npc : npcGroup.npcList) {
			DarkHeresyOverhaul.npc = npc;
			processFile("characterSheet");
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
		for(SpecialRule special : npc.specialRuleList) {
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
				Command.valueOf(line.substring(1)).run();
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
		TOP, TAIL, RANK_STRUCTURE, 
		CHARACTER_SHEETS, SPECIAL_RULE_LIST, SKILL_LIST, EQUIPPED_ITEM_LIST, INVENTORY_LIST;
		
		private void run() {
			switch(this) {
			case CHARACTER_SHEETS:
				printCharacterSheets();
				break;
			case RANK_STRUCTURE:
				processFile("rankStructure");
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
			case TAIL:
				processFile("tail");
				break;
			case TOP:
				processFile("top");
				break;
			default:
				throw new RuntimeException("Undefined Command: "+this);
			}
		}
	}
	
	private enum Variable {
		TITLE, 
		CHARACTER_ID, CHARACTER_NAME,
		CHARACTER_WOUNDS, CHARACTER_INSANITY, CHARACTER_CORRUPTION,
		CHARACTER_WS, CHARACTER_BS, CHARACTER_S, CHARACTER_T, CHARACTER_AG, CHARACTER_INT, CHARACTER_PER, CHARACTER_WP, CHARACTER_FEL,
		SPECIAL_NAME, SPECIAL_DESCRIPTION, SKILL_NAME, ITEM_NAME;
		
		private String get() {
			switch (this) {
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