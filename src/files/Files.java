package files;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;

import main.Item;
import main.PrintableFile;

public class Files {
	// Index Page & Contents //
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
	public static PrintableFile psychicPhenomena = new PsychicPhenomenaFile();
	
	// Running the Game //
	public static PrintableFile proceduresOfPlay = new ProceduresOfPlayFile();
	public static PrintableFile npcs = new NPCsFile();
	public static PrintableFile investigation = new InvestigationFile();
	public static PrintableFile lore = new LoreFile();
	public static PrintableFile overmap = new OvermapFile();
	public static PrintableFile locations = new LocationsFile();
	public static PrintableFile groupsAndEvents = new GroupsAndEventsFile();
	
	// NPC Stats //
	public static PrintableFile adeptusAdministratum = NPCGroupFile.adeptusAdministratum;
	public static PrintableFile adeptusArbites = NPCGroupFile.adeptusArbites;
	public static PrintableFile adeptusAstraTelepathica = NPCGroupFile.adeptusAstraTelepathica;
	public static PrintableFile adeptusMechanicus = NPCGroupFile.adeptusMechanicus;
	public static PrintableFile adeptusMinistorum = NPCGroupFile.adeptusMinistorum;
	public static PrintableFile imperialGuard = NPCGroupFile.imperialGuard;
	public static PrintableFile citizens = NPCGroupFile.citizens;
	public static PrintableFile outcasts = NPCGroupFile.outcasts;
	public static PrintableFile heretics = NPCGroupFile.heretics;
	
	// Cards //
	public static class Cards {
		public static List<PrintableFile> itemList = Item.list.stream().map(ItemFile::new).collect(Collectors.toList());
	}
	
	public static List<PrintableFile> getAll() {
		List<PrintableFile> list = List.of(Files.class.getFields()).stream()
				.map(Files::toPrintableFile)
				.collect(Collectors.toList());
		list.addAll(Cards.itemList);
		return list;
	}
	
	private static PrintableFile toPrintableFile(Field field) {
		try {
			return (PrintableFile)field.get(null);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
}