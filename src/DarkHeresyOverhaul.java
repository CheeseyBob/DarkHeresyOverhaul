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
	private static NPC npc = null;
	
	public static void main(String[] args) {
		
		pw = TextFileHandler.startWritingToFile("out/testFile.html");
		title = "Adeptus Arbites NPCs";
		processFile("NPCs-Group");
		pw.close();
		
	}
	
	private static void printCharacterSheets() {
		
		// TODO - set NPCs based on Group. //
		
		NPC[] npcList = new NPC[11];
		npcList[0] = new NPC("Trooper", "30, 30, 30, 30, 30, 30, 30, 30, 30");
		npcList[1] = new NPC("Enforcer", "30, 30, 30, 30, 30, 30, 30, 30, 30");
		npcList[2] = new NPC("Regulator", "30, 30, 30, 30, 30, 30, 30, 30, 30");
		npcList[3] = new NPC("Investigator", "30, 30, 30, 30, 30, 30, 30, 30, 30");
		npcList[4] = new NPC("Arbitrator", "30, 30, 30, 30, 30, 30, 30, 30, 30");
		npcList[5] = new NPC("Proctor", "30, 30, 30, 30, 30, 30, 30, 30, 30");
		npcList[6] = new NPC("Intelligencer", "30, 30, 30, 30, 30, 30, 30, 30, 30");
		npcList[7] = new NPC("Marshall", "30, 30, 30, 30, 30, 30, 30, 30, 30");
		npcList[8] = new NPC("Magistrate", "30, 30, 30, 30, 30, 30, 30, 30, 30");
		npcList[9] = new NPC("Lord Marshall", "30, 30, 30, 30, 30, 30, 30, 30, 30");
		npcList[10] = new NPC("Justicar", "30, 30, 30, 30, 30, 30, 30, 30, 30");
		
		for(NPC npc : npcList) {
			DarkHeresyOverhaul.npc = npc;
			processFile("characterSheet");
			pw.println();
			pw.println();
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
		TOP, TAIL, RANK_STRUCTURE, CHARACTER_SHEETS;
		
		private void run() {
			switch(this) {
			case CHARACTER_SHEETS:
				printCharacterSheets();
				break;
			case RANK_STRUCTURE:
				processFile("rankStructure");
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
		TITLE, CHARACTER_ID, CHARACTER_NAME;
		
		private String get() {
			switch (this) {
			case CHARACTER_ID:
				return npc.id;
			case CHARACTER_NAME:
				return npc.name;
			case TITLE:
				return title;
			default:
				throw new RuntimeException("Undefined Variable: "+this);
			}
		}
	}
}