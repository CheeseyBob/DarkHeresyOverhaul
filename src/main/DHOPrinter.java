package main;
import java.io.PrintWriter;
import java.util.LinkedList;

import files.TextFileHandler;

public class DHOPrinter {
	// Printing //
	private PrintWriter pw = null;
	public String path = "out/";
	
	// General //
	private String title = "", header = "", note = "";
	private int colSize = 1;
	private LinkedList<SpecialRule> specialRuleList = null; // Used for NPCs and Home Worlds.
	
	// Character Creation //
	private HomeWorld homeWorld = null;
	private Background background = null;
	private Background.BackgroundPath backgroundPath = null;
	
	// NPC Groups //
	private NPCGroup npcGroup = null;
	private NPC npc = null;
	private SpecialRule special = null;
	private Skill skill = null;
	private Item item = null;
	private boolean isItemEquipped = false;
	
	DHOPrinter(String filename) {
		this.pw = TextFileHandler.startWritingToFile(path+filename);
	}
	
	public void close() {
		pw.close();
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

	@Deprecated
	private void printCharacterSheetList() {
		for(NPC npc : npcGroup.npcList) {
			this.npc = npc;
			this.specialRuleList = npc.specialRuleList;
			processFile("CHARACTER_SHEET");
			pw.println();
			pw.println();
		}
	}
	
	public void printCollapsibleTail() {
		processFile("COLLAPSIBLE_TAIL");
	}
	
	public void printCollapsibleTop() {
		processFile("COLLAPSIBLE_TOP");
	}
	
	public void printColTail() {
		processFile("COL_TAIL");
	}
	
	public void printColTop(int colSize) {
		this.colSize = colSize;
		processFile("COL_TOP");
	}

	@Deprecated
	private void printEquippedItemList() {
		isItemEquipped = true;
		if(npc.equippedItemList.isEmpty()) {
			processFile("NO_ITEMS");
		}
		for(Item item : npc.equippedItemList) {
			this.item = item;
			processFile("ITEM");
		}
	}
	
	public void printFileTail() {
		processFile("FILE_TAIL");
	}
	
	public void printFileTop(String title) {
		this.title = title;
		processFile("FILE_TOP");
	}
	
	public void printHeader(String header) {
		this.header = header;
		processFile("HEADER");
	}
	
	public void printHeader_collapsible(String header) {
		this.header = header;
		processFile("HEADER_COLLAPSIBLE");
	}

	@Deprecated
	private void printInventoryList() {
		isItemEquipped = false;
		if(npc.inventoryList.isEmpty()) {
			processFile("NO_ITEMS");
		}
		for(Item item : npc.inventoryList) {
			this.item = item;
			processFile("ITEM");
		}
	}
	
	public void printList(Object[] list, boolean ordered) {
		pw.println(ordered ? "<ol>" : "<ul>");
		for(Object item : list) {
			pw.println("<li>"+item+"</li>");
		}
		pw.println(ordered ? "</ol>" : "</ul>");
	}
	
	public void printList(LinkedList<? extends Object> list, boolean ordered) {
		pw.println(ordered ? "<ol>" : "<ul>");
		for(Object item : list) {
			pw.println("<li>"+item+"</li>");
		}
		pw.println(ordered ? "</ol>" : "</ul>");
	}
	
	public void println() {
		pw.println();
	}
	
	public void println(String x) {
		pw.println(x);
	}

	@Deprecated
	private void printNPCGroupFile(NPCGroup group) {
		npcGroup = group;
		pw = TextFileHandler.startWritingToFile("out/NPCs-"+group.id+".html");
		title = group.name+" NPCs";
		processFile("NPCs-GROUP");
		pw.close();
	}
	
	public void printParagraph(String x) {
		pw.println("<p>"+x+"</p>");
	}
	
	public void printRowTail() {
		processFile("ROW_TAIL");
	}
	
	public void printRowTop() {
		processFile("ROW_TOP");
	}

	@Deprecated
	private void printSpecialRuleList() {
		for(SpecialRule special : specialRuleList) {
			this.special = special;
			processFile("SPECIAL");
		}
	}

	@Deprecated
	private void printSkillList() {
		if(npc.skillList.isEmpty()) {
			processFile("NO_SKILLS");
		}
		for(Skill skill : npc.skillList) {
			this.skill = skill;
			processFile("SKILL");
		}
	}
	
	public void printSubheader(String subheader) {
		this.header = subheader;
		processFile("SUBHEADER");
	}
	
	public void printSubheader_collapsible(String subheader) {
		this.header = subheader;
		processFile("SUBHEADER_COLLAPSIBLE");
	}
	
	public void printSubSubheader(String subheader) {
		this.header = subheader;
		processFile("SUBSUBHEADER");
	}
	
	public void printTableRow(String[] entryList) {
		pw.println("<tr>");
		for(String entry : entryList) {
			pw.println("<td>"+entry+"</td>");
		}
		pw.println("</tr>");
	}
	
	public void printTableRow(String e1, String e2, String e3, String e4) {
		printTableRow(new String[] {e1, e2, e3, e4});
	}
	
	public void printTableRow_bionic(Bionic bionic) {
		this.special = bionic;
		processFile("TABLE_ROW_BIONIC");
	}
	
	public void printTableRow_note(String note) {
		this.note = note;
		processFile("TABLE_ROW_NOTE");
	}
	
	public void printTableRow_specialRule(SpecialRule special) {
		this.special = special;
		processFile("TABLE_ROW_SPECIAL_RULE");
	}
	
	public void printTableRow_subheader(String subheader) {
		this.header = subheader;
		processFile("TABLE_ROW_SUBHEADER");
	}
	
	public void printTableRow_talent(Talent talent) {
		this.special = talent;
		processFile("TABLE_ROW_TALENT");
	}
	
	public void printTableRow_trait(Trait trait) {
		this.special = trait;
		processFile("TABLE_ROW_SPECIAL_RULE"); // Nothing different about traits. //
	}
	
	public void printTableTail() {
		processFile("TABLE_TAIL");
	}
	
	public void printTableTop(String[] headerList, boolean wide, boolean striped) {
		String tableType = wide ? "_WIDE" : "_NARROW";
		tableType += striped ? "_STRIPED" : "_UNSTRIPED";
		processFile("TABLE_TOP"+tableType);
		for(String header : headerList) {
			this.header = header;
			processFile("TABLE_HEADER");
		}
		processFile("TABLE_BODY_TOP");
	}
	
	public void printTableTop(boolean wide, boolean striped) {
		printTableTop(new String[] {}, wide, striped);
	}
	
	public void printTableTop(String header1, boolean wide, boolean striped) {
		printTableTop(new String[] {header1}, wide, striped);
	}
	
	public void printTableTop(String header1, String header2, boolean wide, boolean striped) {
		printTableTop(new String[] {header1, header2}, wide, striped);
	}
	
	public void printTableTop(String header1, String header2, String header3, String header4, boolean wide, boolean striped) {
		printTableTop(new String[] {header1, header2, header3, header4}, wide, striped);
	}
	
	public void printTableTop_bionics() {
		printTableTop("Bionic", "Availability", true, true);
	}
	
	public void printTableTop_talents() {
		printTableTop("Talent", "Requirement", "Aptitude", "XP", true, true);
	}
	
	private void processFile(String filename) {
		LinkedList<String> lineList = TextFileHandler.readEntireFile("in/"+filename+".txt");
		for(String line : lineList) {
			if(line.contains("!!")){
				processLineWithCommand(line);
			} else if(line.startsWith("!")) {
				run(line.substring(1));
			} else {
				pw.println(line);
			}
		}
	}
	
	private void processLineWithCommand(String line) {
		String[] partList = line.split("!!");
		line = "";
		for(String part : partList) {
			if(part.startsWith("@"))
				part = valueOf(Variable.valueOf(part.substring(1)));
			line += part;
		}
		pw.println(line);
	}
	
	private void run(String commandCode) {
		String[] partList = commandCode.split(":");
		String[] parameterList = new String[partList.length - 1];
		for(int i = 0; i < parameterList.length; i ++) {
			parameterList[i] = partList[i+1];
		}
		run(Command.valueOf(partList[0]), parameterList);
	}
	
	private void run(Command command, String[] parameterList) {
		switch(command) {
		case PROCESS:
			processFile(parameterList[0]);
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
	
	private String valueOf(Variable variable) {
		switch (variable) {
		case TITLE:
			return title;
		case HEADER:
			return header;
		case HEADER_ID:
			return idFrom(header);
		case NOTE:
			return note;
		case COL_SIZE:
			return ""+colSize;
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
		case SPECIAL_NAME: case TALENT_NAME: case BIONIC_NAME:
			return special.getFullName();
		case SPECIAL_DESCRIPTION: case TALENT_DESCRIPTION: case BIONIC_DESCRIPTION:
			return special.description;
		case TALENT_REQUIREMENT:
			return ((Talent)special).requirement;
		case TALENT_APTITUDE:
			return ((Talent)special).aptitude;
		case TALENT_XP:
			return ""+((Talent)special).xp;
		case BIONIC_AVAILABILITY:
			return ((Bionic)special).availability;
		case SKILL_NAME:
			return skill.getFullName();
		case ITEM_NAME:
			return item.getFullName(isItemEquipped);
		default:
			throw new RuntimeException("Undefined Variable: "+this);
		}
	}
	
	private enum Command {
		PROCESS,
		RANK_STRUCTURE, CHARACTER_SHEET_LIST, SPECIAL_RULE_LIST, SKILL_LIST, EQUIPPED_ITEM_LIST, INVENTORY_LIST;
	}
	
	private enum Variable {
		TITLE, HEADER, HEADER_ID, SUBHEADER, SUBHEADER_ID, NOTE, COL_SIZE,
		HOME_WORLD_ID, HOME_WORLD_NAME, HOME_WORLD_APTITUDE, BACKGROUND_ID, BACKGROUND_NAME, BACKGROUND_APTITUDE, BACKGROUND_PATH_NAME, BACKGROUND_PATH_COL_SIZE,
		CHARACTER_ID, CHARACTER_NAME,
		CHARACTER_WOUNDS, CHARACTER_INSANITY, CHARACTER_CORRUPTION,
		CHARACTER_WS, CHARACTER_BS, CHARACTER_S, CHARACTER_T, CHARACTER_AG, CHARACTER_INT, CHARACTER_PER, CHARACTER_WP, CHARACTER_FEL,
		SPECIAL_NAME, SPECIAL_DESCRIPTION,
		TALENT_NAME, TALENT_DESCRIPTION, TALENT_REQUIREMENT, TALENT_APTITUDE, TALENT_XP,
		BIONIC_NAME, BIONIC_DESCRIPTION, BIONIC_AVAILABILITY,
		SKILL_NAME, ITEM_NAME;
	}
}