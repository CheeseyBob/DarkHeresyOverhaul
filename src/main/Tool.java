package main;

public class Tool extends Item {
	String bonus;

	Tool(String name, String description, int size, String bonus, Availability availability) {
		super(name, size, availability);
		this.bonus = bonus;
		this.description = description;
	}
	
	public Tool withSpecialRule(SpecialRule specialRule) {
		return (Tool)super.withSpecialRule(specialRule);
	}
	
	// Special Rules //
	public static final SpecialRule bioLock = new SpecialRule("Bio-Lock",
			"A biometric security device prevents this item being used by unauthorised characters.");
	
	// Worn //
	public static final Tool gasMask = new Tool("Gas Mask",
			"Wearable. Used to protect against harmful gases.",
			2, "+30", Availability.COMMON);
	public static final Tool cameleolineCloak = new Tool("Cameleoline Cloak",
			"Wearable. Used to aid concealment.",
			2, "+40", Availability.AVERAGE);
	public static final Tool photoVisor = new Tool("Photo-Visor",
			"Wearable. Used to protect the eyes.",
			1, "+30", Availability.AVERAGE);
	public static final Tool photoContacts = new Tool("Photo-Contacts",
			"Wearable. Used to protect the eyes.",
			0, "+30", Availability.SCARCE);
	
	// Held //
	public static final Tool dataSlate = new Tool("Data-Slate",
			"Used to store and display data such as text, audio and video.",
			1, "+0", Availability.ABUNDANT);
	public static final Tool dataSlate_biolock = new Tool("Bio-locked Data-Slate",
			"Used to store and display data such as text, audio and video.",
			1, "+0", Availability.PLENTIFUL)
			.withSpecialRule(bioLock);
	public static final Tool pictRecorder = new Tool("Pict Recorder",
			"Used to record audio and video data.",
			1, "+0", Availability.ABUNDANT);
	public static final Tool writingKit = new Tool("Writing Kit",
			"Used to create written material.",
			1, "+0", Availability.ABUNDANT);
	public static final Tool dataSlate_lore = new Tool("Data-Slate (A Lore Area)",
			"Used to reference the topic.",
			1, "+10", Availability.PLENTIFUL);
	public static final Tool lockpick = new Tool("Lockpick",
			"Used to pick locks.",
			0, "+0", Availability.PLENTIFUL);
	public static final Tool psyFocus = new Tool("Psy-Focus",
			"Used to help psykers focus their minds on the warp.",
			1, "+10", Availability.PLENTIFUL);
	public static final Tool smallRelic = new Tool("Small Relic",
			"Used to help overcome fear.",
			1, "+10", Availability.PLENTIFUL);
	public static final Tool scroll_lore = new Tool("Scroll (A Lore Area)",
			"Used to reference the topic.",
			1, "+10", Availability.PLENTIFUL);
	public static final Tool scroll_imperialCreed = new Tool("Scroll (Imperial Creed)",
			"Used to reference the topic.",
			1, "+10", Availability.PLENTIFUL);
	public static final Tool auspex = new Tool("Auspex",
			"Used to detect things not visible to human senses (gases, radiation, bio-signs, etc.).",
			1, "+20", Availability.COMMON);
	public static final Tool auspex_heretek = new Tool("Heretek Heads-Up Auspex",
			"Wearable. Used to detect things not visible to human senses (gases, radiation, bio-signs, etc.).",
			2, "+30", Availability.RARE);
	public static final Tool autoquill = new Tool("Autoquill",
			"Used to create written material.",
			1, "+20", Availability.COMMON);
	public static final Tool combiTool = new Tool("Combi-Tool",
			"Used to repair and maintain tech.",
			1, "+20", Availability.COMMON);
	public static final Tool desktopAutoquill = new Tool("Desktop Autoquill",
			"Used to create written material.",
			3, "+40", Availability.COMMON);
	public static final Tool excruciatorKit = new Tool("Excruciator Kit",
			"Used to aid in interrogation.",
			1, "+20", Availability.COMMON);
	public static final Tool grapnel = new Tool("Grapnel",
			"Used to aid climbing.",
			3, "+40", Availability.COMMON);
	public static final Tool lascutter = new Tool("Lascutter",
			"Used to cut through or weld shut hard materials like steel and rock.",
			1, "+20", Availability.COMMON);
	public static final Tool magnoculars = new Tool("Magnoculars",
			"Used to aid viewing distant objects.",
			1, "+20", Availability.COMMON);
	public static final Tool multiKey = new Tool("Multi-Key",
			"Used to pick locks.",
			1, "+20", Availability.COMMON);
	public static final Tool smallishRelic = new Tool("Smallish Relic",
			"Used to help overcome fear.",
			2, "+20", Availability.COMMON);
	public static final Tool stummer = new Tool("Stummer",
			"Used to aid moving silently.",
			1, "+20", Availability.COMMON);
	public static final Tool surgicalTools = new Tool("Surgical Tools",
			"Used to perform surgery.",
			1, "+20", Availability.COMMON);
	public static final Tool tome_lore = new Tool("Tome (A Lore Area)",
			"Used to research the topic.",
			2, "+30", Availability.COMMON);
	public static final Tool tome_imperialCreed = new Tool("Tome (Imperial Creed)",
			"Used to research the topic.",
			2, "+30", Availability.COMMON);
	public static final Tool dataTome_lore = new Tool("Data-Tome (A Lore Area)",
			"Used to research the topic.",
			1, "+30", Availability.AVERAGE);
	public static final Tool dataTome_judgement = new Tool("Data-Tome (Judgement)",
			"Used to research the topic.",
			1, "+30", Availability.AVERAGE);
	public static final Tool industrialLascutter = new Tool("Industrial Lascutter",
			"Used to cut through or weld shut hard materials like steel and rock.",
			3, "+50", Availability.AVERAGE);
	public static final Tool relic = new Tool("Relic",
			"Used to help overcome fear.",
			3, "+30", Availability.AVERAGE);
	
}