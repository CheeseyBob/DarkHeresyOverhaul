package main;
class NPCGroup_Outcasts extends NPCGroup {

	NPCGroup_Outcasts() {
		super("Outcasts");
	}

	@Override
	protected void setNPCList() {
		NPC npc;
		
		npc = new NPC("NPC 1", "30,30,30,30,30,30,30,30,30");
		npcList.add(npc);
		
	}
}