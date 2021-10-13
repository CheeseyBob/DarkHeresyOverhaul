class NPCGroup_AdeptusMechanicus extends NPCGroup {

	NPCGroup_AdeptusMechanicus() {
		super("Adeptus Mechanicus");
	}

	@Override
	protected void setNPCList() {
		NPC npc;
		
		npc = new NPC("NPC 1", "30,30,30,30,30,30,30,30,30");
		npcList.add(npc);
		
	}
}