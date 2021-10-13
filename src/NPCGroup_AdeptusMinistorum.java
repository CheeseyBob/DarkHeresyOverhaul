class NPCGroup_Ministorum extends NPCGroup {

	NPCGroup_Ministorum() {
		super("Adeptus Ministorum");
	}

	@Override
	protected void setNPCList() {
		NPC npc;
		
		npc = new NPC("NPC 1", "30,30,30,30,30,30,30,30,30");
		npcList.add(npc);
		
	}
}