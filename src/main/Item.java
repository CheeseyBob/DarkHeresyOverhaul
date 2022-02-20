package main;

import java.util.LinkedList;

public class Item {
	public static final LinkedList<Item> list = new LinkedList<Item>();
	
	public String name, id;
	public String description;
	public int size;
	public Availability availability = null;
	public LinkedList<SpecialRule> specialRuleList = new LinkedList<SpecialRule>();
	
	Item(String name, int size, Availability availability, boolean addToList) {
		this.id = DHOPrinter.idFrom(name);
		this.name = name;
		this.size = size;
		if(addToList)
			list.add(this);
	}
	
	Item(String name, int size) {
		this(name, size, null, true);
	}
	
	Item(String name, int size, Availability availability) {
		this(name, size, availability, true);
	}
	
	public String filename() {
		return getClass().getSimpleName()+"/"+id+".html";
	}
	
	public String getAvailability() {
		if(availability == null) return "N/A";
		else return availability.toString();
	}
	
	public String hyperlink() {
		return "<a href="+'"'+filename()+'"'+">"+name+"</a>";
	}
	
	public String nameInInventory() {
		return hyperlink()+" ["+size+"]";
	}
	
	public String nameWhenEquipped() {
		return hyperlink();
	}
	
	public Item withSpecialRule(SpecialRule specialRule) {
		specialRuleList.add(specialRule);
		return this;
	}
	
	public Item times(int amount) {
		return new ItemStack(this, amount);
	}
	
	@Override
	public String toString() {
		return hyperlink();
		//return name;
	}
	
	class ItemStack extends Item {
		int amount;
		
		ItemStack(Item item, int amount){
			super(item.name, item.size, null, false);
			this.amount = amount;
		}
		
		public String getFullName(boolean isItemEquipped) {
			if(isItemEquipped) {
				return name+" x"+amount;
			} else {
				return name+" ["+size+"] x"+amount;
			}
		}
	}
}