class NPCGroup_ImperialGuard extends NPCGroup {

	NPCGroup_ImperialGuard() {
		super("Imperial Guard");
	}

	@Override
	protected void setNPCList() {
		NPC npc;
		
		npc = new NPC("NPC 1", "30,30,30,30,30,30,30,30,30");
		npcList.add(npc);
		
	}
}