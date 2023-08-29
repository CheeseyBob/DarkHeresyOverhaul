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
			"[description]",
			"1d10 enforcers",
			"1d10-8 detainees");
	public static final Location shop_food = new Location("Shop selling food",
			"____",
			"[description]",
			"[residents]",
			"[guests]");
	public static final Location shop_clothing = new Location("Shop selling clothing and apparel",
			"____",
			"[description]",
			"[residents]",
			"[guests]");
	public static final Location dealer_weapons = new Location("Black-market dealer selling weapons and armour",
			"____'s Place (no public name)",
			"[description]",
			"1 Fixer (Outcasts)",
			"1 random Outcast");
	public static final Location shop_tech = new Location("Shop selling tech items",
			"____",
			"[description]",
			"[residents]",
			"[guests]");
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