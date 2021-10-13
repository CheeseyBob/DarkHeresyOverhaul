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
}