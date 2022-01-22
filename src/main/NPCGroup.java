package main;
import java.util.LinkedList;

public abstract class NPCGroup {
	public String id, name;
	public LinkedList<NPC> npcList = new LinkedList<NPC>();
	
	NPCGroup(String name) {
		this.id = DHOPrinter.idFrom(name);
		this.name = name;
		setNPCList();
	}
	
	protected abstract void setNPCList();
	
	// NPC Groups //
	public static final NPCGroup adeptusAdministratum = new NPCGroup_AdeptusAdministratum();
	public static final NPCGroup adeptusArbites = new NPCGroup_AdeptusArbites();
	public static final NPCGroup adeptusAstraTelepathica = new NPCGroup_AdeptusAstraTelepathica();
	public static final NPCGroup adeptusMechanicus = new NPCGroup_AdeptusMechanicus();
	public static final NPCGroup adeptusMinistorum = new NPCGroup_AdeptusMinistorum();
	public static final NPCGroup imperialGuard = new NPCGroup_ImperialGuard();
	public static final NPCGroup outcasts = new NPCGroup_Outcasts();
}