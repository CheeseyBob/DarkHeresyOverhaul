import java.util.LinkedList;

abstract class NPCGroup {
	String id, name;
	LinkedList<NPC> npcList = new LinkedList<NPC>();
	
	private static String assignID(String name) {
		return name.replace(" ", "");
	}
	
	NPCGroup(String name) {
		this.id = assignID(name);
		this.name = name;
		setNPCList();
	}
	
	protected abstract void setNPCList();
	
	public static final NPCGroup adeptusAdministratum = new NPCGroup("Adeptus Administratum") {
		@Override
		protected void setNPCList() {
			NPC npc;
			npc = new NPC("Administratum 1", "30,30,30,30,30,30,30,30,30");
			npcList.add(npc);

			npc = new NPC("Administratum 2", "30,30,30,30,30,30,30,30,30");
			npcList.add(npc);
			
		}
	};
	
	public static final NPCGroup adeptusArbites = new NPCGroup("Adeptus Arbites") {
		@Override
		protected void setNPCList() {
			NPC npc;
			
			npc = new NPC("Trooper", "35,35,30,30,30,30,30,30,30");
			npc.specialRuleList.add(SpecialRule.language.withParameter("Low Gothic"));
			npc.equippedItemList.add(Item.enforcerUniform);
			npc.equippedItemList.add(Armour.flakJacket);
			npc.inventoryList.add(Item.club);
			npc.inventoryList.add(Item.pistol);
			npc.inventoryList.add(Item.pistol_mag);
			npc.inventoryList.add(Item.gelt);
			npcList.add(npc);
			
			npc = new NPC("Enforcer", "35,35,35,35,30,30,30,30,30");
			npc.specialRuleList.add(SpecialRule.language.withParameter("Low Gothic"));
			npc.equippedItemList.add(Item.enforcerUniform);
			npc.equippedItemList.add(Armour.flakCoat);
			npc.inventoryList.add(Item.club);
			npc.inventoryList.add(Item.pistol);
			npc.inventoryList.add(Item.pistol_mag);
			npc.inventoryList.add(Item.manacles);
			npc.inventoryList.add(Item.lhoSticks);
			npc.inventoryList.add(Item.gelt);
			npcList.add(npc);
			
			npc = new NPC("Regulator", "35,35,35,35,30,30,30,30,30");
			npc.specialRuleList.add(SpecialRule.language.withParameter("Low Gothic"));
			npc.skillList.add(Skill.grapple.withBonus(10));
			npc.skillList.add(Skill.knockDown.withBonus(10));
			npc.skillList.add(Skill.notice.withBonus(10));
			npc.skillList.add(Skill.run.withBonus(10));
			npc.equippedItemList.add(Item.enforcerUniform);
			npc.equippedItemList.add(Armour.flakJacket);
			npc.inventoryList.add(Item.club);
			npc.inventoryList.add(Item.pumpActionShotgun);
			npc.inventoryList.add(Item.pumpActionShotgun_mag);
			npc.inventoryList.add(Item.pistol);
			npc.inventoryList.add(Item.pistol_mag);
			npc.inventoryList.add(Item.handVox);
			npc.inventoryList.add(Item.manacles);
			npc.inventoryList.add(Item.lhoSticks);
			npc.inventoryList.add(Item.gelt);
			npcList.add(npc);
			
			npc = new NPC("Investigator", "35,35,35,35,35,30,35,30,30");
			npc.specialRuleList.add(SpecialRule.language.withParameter("Low Gothic"));
			npcList.add(npc);
			
			npc = new NPC("Arbitrator", "40,40,40,40,35,35,35,30,30");
			npc.specialRuleList.add(SpecialRule.language.withParameter("Low Gothic"));
			npcList.add(npc);
			
			npc = new NPC("Proctor", "40,40,40,40,35,35,35,30,30");
			npc.specialRuleList.add(SpecialRule.language.withParameter("Low Gothic"));
			npcList.add(npc);
			
			npc = new NPC("Intelligencer", "40,40,40,40,35,40,40,30,35");
			npc.specialRuleList.add(SpecialRule.language.withParameter("Low Gothic"));
			npcList.add(npc);
			
			npc = new NPC("Marshall", "40,40,40,40,35,35,35,35,35");
			npc.specialRuleList.add(SpecialRule.language.withParameter("Low Gothic"));
			npcList.add(npc);
			
			npc = new NPC("Magistrate", "40,40,40,40,35,45,40,35,35");
			npc.specialRuleList.add(SpecialRule.language.withParameter("Low Gothic"));
			npcList.add(npc);
			
			npc = new NPC("Lord Marshall", "45,45,45,50,35,35,35,35,35");
			npc.specialRuleList.add(SpecialRule.language.withParameter("Low Gothic"));
			npcList.add(npc);
			
			npc = new NPC("Justicar", "40,40,40,40,35,45,40,35,35");
			npc.specialRuleList.add(SpecialRule.language.withParameter("Low Gothic"));
			npcList.add(npc);
			
		}
	};
}