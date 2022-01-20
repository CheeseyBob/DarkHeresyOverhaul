package files;

import java.util.LinkedList;
import java.util.List;

import main.PrintableFile;

public class FileList {
	// Index Page / Contents //
	public static PrintableFile indexFile = new IndexFile();
	
	// Characters //
	// TODO - character sheet //
	public static PrintableFile characterCreation = new CharacterCreationFile();
	public static PrintableFile characterAdvancement = new CharacterAdvancementFile();
	public static PrintableFile talents = new TalentsFile();
	public static PrintableFile traits = new TraitsFile();
	public static PrintableFile bionics = new BionicsFile();
	public static PrintableFile psychicPowers = new PsychicPowersFile();
	public static PrintableFile items = new ItemsFile();
	public static PrintableFile ammo = new AmmoFile();
	public static PrintableFile armour = new ArmourFile();
	public static PrintableFile consumables = new ConsumablesFile();
	public static PrintableFile meleeWeapons = new MeleeWeaponsFile();
	public static PrintableFile rangedWeapons = new RangedWeaponsFile();
	public static PrintableFile thrownWeapons = new ThrownWeaponsFile();
	public static PrintableFile tools = new ToolsFile();
	public static PrintableFile miscItems = new MiscItemsFile();
	
	// Playing the Game //
	public static PrintableFile fatePoints = new FatePointsFile();
	public static PrintableFile actionsOverview = new ActionsOverviewFile();
	public static PrintableFile actionsInCombatTime = new ActionsInCombatTimeFile();
	public static PrintableFile actionsInDowntimeFile = new ActionsInDowntimeFile();
	public static PrintableFile aspects = new AspectsFile();
	// TODO - critical damage //
	// TODO - fear and insanity //
	// TODO - corruption and mutation //
	
	// Running the Game //
	// TODO - NPCs //
	// TODO - Adeptus Administratum NPCs //
	// TODO - Adeptus Arbites NPCs //
	// TODO - Adeptus Astra Telepathica NPCs //
	// TODO - Adeptus Mechanicus NPCs //
	// TODO - Adeptus Ministorum NPCs //
	// TODO - Imperial Guard NPCs //
	// TODO - Outcast NPCs //
	// TODO - Investigation //
	// TODO - Lore //
	// TODO - Overmap //
	// TODO - Locations //
	// TODO - Groups and Events //
	
	public static List<PrintableFile> getAll() {
		List<PrintableFile> list = new LinkedList<PrintableFile>();
		list.add(indexFile);
		list.addAll(section_characters());
		list.addAll(section_playingTheGame());
		list.addAll(section_runningTheGame());
		return list;
	}
	
	public static List<PrintableFile> section_characters() {
		List<PrintableFile> list = new LinkedList<PrintableFile>();
		// TODO - character sheet //
		list.add(characterCreation);
		list.add(characterAdvancement);
		list.add(talents);
		list.add(traits);
		list.add(bionics);
		list.add(psychicPowers);
		list.add(items);
		list.add(ammo);
		list.add(armour);
		list.add(consumables);
		list.add(meleeWeapons);
		list.add(rangedWeapons);
		list.add(thrownWeapons);
		list.add(tools);
		list.add(miscItems);
		return list;
	}
	
	public static List<PrintableFile> section_playingTheGame() {
		List<PrintableFile> list = new LinkedList<PrintableFile>();
		list.add(fatePoints);
		list.add(actionsOverview);
		list.add(actionsInCombatTime);
		list.add(actionsInDowntimeFile);
		list.add(aspects);
		// TODO - critical damage //
		// TODO - fear and insanity //
		// TODO - corruption and mutation //
		return list;
	}
	
	public static List<PrintableFile> section_runningTheGame() {
		List<PrintableFile> list = new LinkedList<PrintableFile>();
		// TODO - NPCs //
		// TODO - Adeptus Administratum NPCs //
		// TODO - Adeptus Arbites NPCs //
		// TODO - Adeptus Astra Telepathica NPCs //
		// TODO - Adeptus Mechanicus NPCs //
		// TODO - Adeptus Ministorum NPCs //
		// TODO - Imperial Guard NPCs //
		// TODO - Outcast NPCs //
		// TODO - Investigation //
		// TODO - Lore //
		// TODO - Overmap //
		// TODO - Locations //
		// TODO - Groups and Events //
		return list;
	}
}