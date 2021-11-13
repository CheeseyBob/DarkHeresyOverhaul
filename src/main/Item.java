package main;

import java.util.LinkedList;

class Item {
	String name;
	String description;
	int size;
	Availability availability = null;
	LinkedList<SpecialRule> specialRuleList = new LinkedList<SpecialRule>();
	
	Item(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	Item(String name, int size, Availability availability) {
		this.name = name;
		this.size = size;
		this.availability = availability;
	}
	
	public String getAvailability() {
		if(availability == null) return "N/A";
		else return availability.toString();
	}
	
	public String getFullName(boolean isItemEquipped) {
		if(isItemEquipped) {
			return name;
		} else {
			return name+" ["+size+"]";
		}
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
		return name;
	}
	
	class ItemStack extends Item {
		int amount;
		
		ItemStack(Item item, int amount){
			super(item.name, item.size);
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