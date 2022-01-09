package main;

import files.FileList;

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
	
	public static void main(String[] args) {
		System.out.println("Running DarkHeresyOverhaul html generation...");
		// Index //
		// TODO //
		
		// Characters //
		printFile(FileList.characterCreation, "CharacterCreation.html");
		printFile(FileList.talents, "Talents.html");
		printFile(FileList.traits, "Traits.html");
		printFile(FileList.bionics, "Bionics.html");
		printFile(FileList.items, "Items.html");
		printFile(FileList.ammo, "Ammo.html");
		printFile(FileList.armour, "Armour.html");
		printFile(FileList.consumables, "Consumables.html");
		printFile(FileList.meleeWeapons, "MeleeWeapons.html");
		printFile(FileList.rangedWeapons, "RangedWeapons.html");
		printFile(FileList.thrownWeapons, "ThrownWeapons.html");
		printFile(FileList.tools, "Tools.html");
		printFile(FileList.miscItems, "MiscItems.html");
		
		// Playing the Game //
		printFile(FileList.aspects, "Aspects.html");
		
		// Running the Game //
		
		// XXX NPC Groups //
//		NPCGroup[] npcGroupList = {
//				new NPCGroup_AdeptusAdministratum(),
//				new NPCGroup_AdeptusArbites(),
//				new NPCGroup_AdeptusAstraTelepathica(),
//				new NPCGroup_AdeptusMechanicus(),
//				new NPCGroup_ImperialGuard(),
//				new NPCGroup_Ministorum(),
//				new NPCGroup_Outcasts()};
//		for(NPCGroup group : npcGroupList) {
//			printNPCGroupFile(group);
//		}
		System.out.println("... done.");
	}
	
	private static void printFile(Printable printable, String filename) {
		DHOPrinter printer = new DHOPrinter(filename);
		printable.print(printer);
		printer.close();
	}
}