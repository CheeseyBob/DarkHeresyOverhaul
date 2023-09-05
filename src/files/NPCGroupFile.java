package files;

import main.*;

class NPCGroupFile implements PrintableFile {
	NPCGroup npcGroup;
	String filename, title;
	
	NPCGroupFile(NPCGroup npcGroup) {
		this.npcGroup = npcGroup;
		this.filename = npcGroup.id+".html";
		this.title = npcGroup.name;
	}
	
	@Override
	public String filename() {
		return filename;
	}
	
	@Override
	public String title() {
		return title;
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		if(!npcGroup.rankedCharacterList.isEmpty()) {
			printer.printRankStructure(npcGroup);
			printer.printHeader("Ranked Characters");
			printer.printCharacterSheetList(npcGroup.rankedCharacterList);
		}
		if(!npcGroup.miscCharacterList.isEmpty()) {
			printer.printHeader("Misc Characters");
			printer.printCharacterSheetList(npcGroup.miscCharacterList);
		}
		printer.printFileTail();
	}
	
	// NPC Group Files //
	public static final NPCGroupFile adeptusAdministratum = new NPCGroupFile(NPCGroup.adeptusAdministratum);
	public static final NPCGroupFile adeptusArbites = new NPCGroupFile(NPCGroup.adeptusArbites);
	public static final NPCGroupFile adeptusAstraTelepathica = new NPCGroupFile(NPCGroup.adeptusAstraTelepathica);
	public static final NPCGroupFile adeptusMechanicus = new NPCGroupFile(NPCGroup.adeptusMechanicus);
	public static final NPCGroupFile adeptusMinistorum = new NPCGroupFile(NPCGroup.adeptusMinistorum);
	public static final NPCGroupFile imperialGuard = new NPCGroupFile(NPCGroup.imperialGuard);
	public static final NPCGroupFile outcasts = new NPCGroupFile(NPCGroup.outcasts);
	public static final NPCGroupFile heretics = new NPCGroupFile(NPCGroup.heretics);
}