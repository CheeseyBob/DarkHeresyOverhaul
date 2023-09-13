package main.locations;


public class Location {
	public String name;
	public String namingPattern;
	public String description;
	public String residents, guests;
	public String notes;
	
	public Location(String name, String namingPattern, String description, String residents, String guests) {
		this.name = name;
		this.namingPattern = namingPattern;
		this.description = description;
		this.residents = residents;
		this.guests = guests;
	}
	
	public Location(String name, String namingPattern, String description, String residents, String guests, String notes) {
		this(name, namingPattern, description, residents, guests);
		this.notes = notes;
	}
}