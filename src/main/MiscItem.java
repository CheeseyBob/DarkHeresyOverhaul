package main;

public class MiscItem extends Item {

	MiscItem(String name, String description, int size, Availability availability) {
		super(name, size, availability);
		this.description = description;
	}
	
	public MiscItem withSpecialRule(SpecialRule specialRule) {
		return (MiscItem)super.withSpecialRule(specialRule);
	}
	
	// Special Rules //
	public static final SpecialRule ablative = new SpecialRule("Ablative",
			"Hits from this weapon damage cover, armour and other items.");
	
	// Misc Items //
	public static final MiscItem gelt = new MiscItem("Gelt",
			"Imperial currency.",
			0, null);
	public static final MiscItem lhoSticks = new MiscItem("Pack of Lho-Sticks",
			"Rolled paper tubes containing a mild, plant-derived narcotic, which can be lit and smoked.",
			0, Availability.UBIQUITOUS);
	public static final MiscItem lhoSticks_quality = new MiscItem("Pack of Quality Lho-Sticks",
			"Rolled paper tubes containing a mild, plant-derived narcotic, which can be lit and smoked.",
			0, Availability.ABUNDANT);
	public static final MiscItem bombTimer = new MiscItem("Bomb Timer",
			"Can be linked to explosives to detonate after a countdown.",
			1, Availability.ABUNDANT);
	public static final MiscItem chrono = new MiscItem("Chrono",
			"Can be used to tell the time.",
			0, Availability.ABUNDANT);
	public static final MiscItem filtrationPlugs = new MiscItem("Filtration Plugs",
			"Can be used to filter out harmful gases for 1 hour.",
			0, Availability.ABUNDANT);
	public static final MiscItem regicideSet = new MiscItem("Regicide Set",
			"Can be used to play the classic board game.",
			2, Availability.ABUNDANT);
	public static final MiscItem glowGlobe = new MiscItem("Glow Globe",
			"Creates an area of light.",
			1, Availability.ABUNDANT);
	public static final MiscItem dropHarness = new MiscItem("Drop Harness",
			"Can be used to rappel safely down vertical drops.",
			2, Availability.PLENTIFUL);
	public static final MiscItem handVox = new MiscItem("Hand-Vox",
			"Can send and receive audio communications in a short range.",
			1, Availability.PLENTIFUL);
	public static final MiscItem lampPack = new MiscItem("Lamp Pack",
			"Straps to the body, creating an area of light hands-free.",
			2, Availability.PLENTIFUL);
	public static final MiscItem laudHailer = new MiscItem("Laud Hailer",
			"Amplifies sound so that an entire crowd can hear a speakers words clearly.",
			1, Availability.PLENTIFUL);
	public static final MiscItem manacles = new MiscItem("Manacles",
			"Can restrain a character up to Strength 40.",
			1, Availability.PLENTIFUL);
	public static final MiscItem oxygenTank = new MiscItem("Oxygen Tank",
			"Contains 1 hour of oxygen.",
			3, Availability.PLENTIFUL);
	public static final MiscItem remoteDetonator = new MiscItem("Remote Detonator",
			"Can be linked to demolition charges to detonate them from a short range.",
			1, Availability.PLENTIFUL);
	public static final MiscItem respirator = new MiscItem("Respirator",
			"Can be used to breathe from oxygen tanks.",
			2, Availability.PLENTIFUL);
	public static final MiscItem explosiveCharge = new MiscItem("Explosive Charge",
			"Use Tech to become Planted, after which the detonator can be used to blow the charges: Everything within N meters takes a hit, where N is the number of charges, dealing Nd10+8 Explosive damage minus 1 per meter of distance to the target.",
			1, Availability.COMMON)
			.withSpecialRule(ablative);
	public static final MiscItem explosiveCollar = new MiscItem("Explosive Collar",
			"When activated, inflicts 10 Explosive Critical Damage to the wearer's head.",
			2, Availability.COMMON);
	public static final MiscItem portableScreamer = new MiscItem("Portable Screamer",
			"After being set up (Use Tech), activates an alarm if it detects motion in its field of vision (Perception 50).",
			2, Availability.COMMON);
	public static final MiscItem screamer = new MiscItem("Screamer",
			"After being set up (Use Tech), activates an alarm if it detects motion in its field of vision (Perception 75).",
			4, Availability.COMMON);
	public static final MiscItem microBead = new MiscItem("Micro-Bead",
			"Can send and receive audio communications over short distances, hands-free.",
			0, Availability.AVERAGE);
	public static final MiscItem voxCaster = new MiscItem("Vox Caster",
			"Can send and receive audio communications over long distances.",
			6, Availability.AVERAGE);
	public static final MiscItem microBead_encrypted = new MiscItem("Encrypted Micro-Bead",
			"Can send and receive audio communications over short distances, hands-free and without fear of being overheard.",
			0, Availability.SCARCE);
	public static final MiscItem infraRedGoggles = new MiscItem("Infra-Red Goggles",
			"Allows the wearer to see in the dark.",
			2, Availability.SCARCE);
}