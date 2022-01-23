package files;

import java.util.LinkedList;
import java.util.List;

import main.PrintableFile;

public class FileList {
	// Index Page / Contents //
	public static PrintableFile indexFile = new IndexFile();
	
	// Characters //
	public static PrintableFile exampleCharacterSheet = new ExampleCharacterSheetFile();
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
	public static PrintableFile actionsInDowntime = new ActionsInDowntimeFile();
	public static PrintableFile aspects = new AspectsFile();
	public static PrintableFile criticalDamage = new CriticalDamageFile();
	public static PrintableFile fearAndInsanity = new FearAndInsanityFile();
	public static PrintableFile corruptionAndMutation = new CorruptionAndMutationFile();
	
	// Running the Game //
	public static PrintableFile npcs = new NPCsFile();
	public static PrintableFile adeptusAdministratum = NPCGroupFile.adeptusAdministratum;
	public static PrintableFile adeptusArbites = NPCGroupFile.adeptusArbites;
	public static PrintableFile adeptusAstraTelepathica = NPCGroupFile.adeptusAstraTelepathica;
	public static PrintableFile adeptusMechanicus = NPCGroupFile.adeptusMechanicus;
	public static PrintableFile adeptusMinistorum = NPCGroupFile.adeptusMinistorum;
	public static PrintableFile imperialGuard = NPCGroupFile.imperialGuard;
	public static PrintableFile outcasts = NPCGroupFile.outcasts;
	public static PrintableFile investigation = new InvestigationFile();
	public static PrintableFile lore = new LoreFile();
	public static PrintableFile overmap = new OvermapFile();
	public static PrintableFile locations = new LocationsFile();
	public static PrintableFile groupsAndEvents = new GroupsAndEventsFile();
	
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
		list.add(exampleCharacterSheet);
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
		list.add(actionsInDowntime);
		list.add(aspects);
		list.add(criticalDamage);
		list.add(fearAndInsanity);
		list.add(corruptionAndMutation);
		return list;
	}
	
	public static List<PrintableFile> section_runningTheGame() {
		List<PrintableFile> list = new LinkedList<PrintableFile>();
		list.add(npcs);
		list.add(adeptusAdministratum);
		list.add(adeptusArbites);
		list.add(adeptusAstraTelepathica);
		list.add(adeptusMechanicus);
		list.add(adeptusMinistorum);
		list.add(imperialGuard);
		list.add(outcasts);
		list.add(investigation);
		list.add(lore);
		list.add(overmap);
		list.add(locations);
		list.add(groupsAndEvents);
		return list;
	}
}