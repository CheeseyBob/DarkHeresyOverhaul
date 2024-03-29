package main.locations;


public class MiddleHiveEncounteredLocations {
	public static final Location ministorumShrine = new Location("Ministorum shrine",
			"Shrine to Saint ____",
			"Small alter room",
			"1 Adeptus Ministorum Peacher",
			"1d10 citizens");
	public static final Location ministorumTemple = new Location("Ministorum chapel/temple",
			"Chapel of ___ | Temple to Saint ____",
			"Large alter hall with pews; side rooms with small alters; rooms for preacher/priests",
			"1 Adeptus Ministorum Peacher; 1d10 Adeptus Ministorum Priests",
			"3d10 citizens");
	public static final Location enforcerStation = new Location("Enforcer station",
			"Station ____",
			"Lookout post; mess room; small armoury; holding cell",
			"1d10 Enforcers",
			"1d10-7 Rank 1-3 Outcasts (detainees)");
	public static final Location shop_food = new Location("Shop selling food",
			"____",
			"large room with shelves and counter; storeroom with crates; small office",
			"1-3 Citizens",
			"1d10 Citizens",
			"Sells Food up to Plentiful with Availability 50");
	public static final Location shop_clothing = new Location("Shop selling clothing and apparel",
			"____",
			"large room with shelves, dressing rooms and counter; storeroom with crates; small office",
			"1-3 Citizens",
			"1d10 Citizens",
			"Sells Clothing up to Common");
	public static final Location dealer_weapons = new Location("Black-market dealer selling weapons and armour",
			"____'s Place (no public name)",
			"small room with counter, locked storeroom with locked chests",
			"1 Fixer",
			"1 random Outcast",
			"Sells Weapons and Armour up to Rare with Availability 35");
	public static final Location shop_tech = new Location("Shop selling tech items",
			"____ Contraptions/Devices/Gadgets/Gizmos/Tech",
			"Smell of plastic; shelves; counter; storeroom; small office",
			"1 Citizen with Trade (Merchant)",
			"1d10 - 5 Citizens",
			"Sells Tools and Misc Items up to Scarce with Availability 50");
	public static final Location shop_specialist = new Location("Specialist shop selling a specific kind of item",
			"____",
			"[description]",
			"[residents]",
			"[guests]");
	public static final Location eatery_poor = new Location("Eatery - Poor Provisions",
			"____'s",
			"Smell of food; tables; kitchen; storeroom",
			"[residents]",
			"1d10 citizens");
	public static final Location eatery_standard = new Location("Eatery - Standard Provisions",
			"____'s",
			"Smell of food; tables; kitchen; storeroom; small office",
			"[residents]",
			"1d10 citizens");
	public static final Location shadyBar = new Location("Shady bar - Poor Provisions (booze)",
			"The ___ ___",
			"Offers Poor Provisions (booze); [Underworld hirelings?]",
			"[residents]",
			"1d10 citizens");
	public static final Location cheapPubWithRooms = new Location("Cheap pub with rooms",
			"The ___ ___",
			"Offers Poor Accomodation and Provisions (food & booze)",
			"[residents]",
			"1d10 citizens");
	public static final Location pubWithRooms = new Location("Pub with rooms - Standard Accomodation",
			"The ___ ___",
			"Offers Standard Accomodation and Provisions (food & booze)",
			"[residents]",
			"1d10 citizens");
}