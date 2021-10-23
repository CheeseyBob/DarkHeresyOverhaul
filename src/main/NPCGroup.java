package main;
import java.util.LinkedList;

abstract class NPCGroup {
	String id, name;
	LinkedList<NPC> npcList = new LinkedList<NPC>();
	
	NPCGroup(String name) {
		this.id = DHOPrinter.idFrom(name);
		this.name = name;
		setNPCList();
	}
	
	protected abstract void setNPCList();
}