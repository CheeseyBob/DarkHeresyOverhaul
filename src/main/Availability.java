package main;

public enum Availability {
	UBIQUITOUS(
			"Ubiquitous",
			"Automatic",
			"1",
			"1",
			"1"
	),
	ABUNDANT(
			"Abundant",
			"+30",
			"1 - 10",
			"1d10",
			"2"
	),
	PLENTIFUL(
			"Plentiful",
			"+20",
			"10 - 30",
			"1d10 × 2 + 10",
			"4"
	),
	COMMON(
			"Common",
			"+10",
			"30 - 100",
			"1d10 × 6 + 40",
			"8"
	),
	AVERAGE(
			"Average",
			"+0",
			"100 - 300",
			"1d10 × 20 + 100",
			"16"
	),
	SCARCE(
			"Scarce",
			"-10",
			"300 - 1,000",
			"1d10 × 60 + 300",
			"32"
	),
	RARE(
			"Rare",
			"-20",
			"1,000 - 3,000",
			"1d10 × 200 + 1,000",
			"64"
	),
	VERY_RARE(
			"Very Rare",
			"-30",
			"3,000 - 10,000",
			"1d10 × 600 + 3,000",
			"128"
	),
	EXTREMELY_RARE(
			"Extremely Rare",
			"-40",
			"10,000 - 30,000",
			"1d10 × 2,000 + 10,000",
			"256"
	),
	NEAR_UNIQUE(
			"Near Unique",
			"-50",
			"30,000 - 100,000",
			"1d10 × 6,000 + 30,000",
			"512"
	),
	UNIQUE(
			"Unique",
			"-60",
			"100,000+",
			"1d10 × 20,000 + 100,000",
			"1024"
	);
	
	public final String name, modifier, priceBracket, priceRoll, craftingSteps;
	
	Availability(String name, String modifier, String priceBracket, String priceRoll, String craftingSteps) {
		this.name = name;
		this.modifier = modifier;
		this.priceBracket = priceBracket;
		this.priceRoll = priceRoll;
		this.craftingSteps = craftingSteps;
	} 
	
	public String getFullName() {
		return name+" ("+modifier+")";
	}
	
	@Override
	public String toString() {
		return name;
	}
}