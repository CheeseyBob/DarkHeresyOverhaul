package main;
class NPCGroup_AdeptusAstraTelepathica extends NPCGroup {

	NPCGroup_AdeptusAstraTelepathica() {
		super("Adeptus Astra Telepathica");
	}

	@Override
	protected void setNPCList() {
		NPC npc;
		
		npc = new NPC("NPC 1", "30,30,30,30,30,30,30,30,30");
		npcList.add(npc);
		
	}
}