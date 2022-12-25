package main;
import java.util.LinkedList;

public abstract class HomeWorld {
	public String id, name, roll;
	public Characteristic bonusCharacteristic1, bonusCharacteristic2, penaltyCharacteristic;
	public LinkedList<SpecialRule> specialRuleList = new LinkedList<SpecialRule>();
	public String[] ageTable;
	public String[] buildTable;
	public String[] complexionTable;
	public String[] eyesTable;
	public String[] hairTable;
	public String[] quirksTable;
	public String[][] subcultureTable = {
			{"xx-xx", "xxxxxxxx"},
			{"xx-xx", "xxxxxxxx"}
	};
	
	HomeWorld(String name, Characteristic bonus1, Characteristic bonus2, Characteristic penalty) {
		this.id = DHOPrinter.idFrom(name);
		this.name = name;
		this.bonusCharacteristic1 = bonus1;
		this.bonusCharacteristic2 = bonus2;
		this.penaltyCharacteristic = penalty;
		setSpecialRuleList();
	}
	
	public String getAptitudes() {
		return bonusCharacteristic1.fullName()+" or "+bonusCharacteristic2.fullName();
	}
	
	public String getCharacteristicBonus() {
		return bonusCharacteristic1.fullName()+" and "+bonusCharacteristic2.fullName();
	}
	
	public String getCharacteristicPenalty() {
		return penaltyCharacteristic.fullName();
	}
	
	protected abstract void setSpecialRuleList();
	
	public static final HomeWorld[] list = {
			new HomeWorld_Feral(), // 10%
			new HomeWorld_Forge(), // 10%
			new HomeWorld_Highborn(), // 5%
			new HomeWorld_Hive(), // 40%
			new HomeWorld_Shrine(), // 10%
			new HomeWorld_Tithe(), // 10%
			new HomeWorld_Void(), // 10%
			new HomeWorld_War(), // 5%
	};
	public static final String[] rollList = {
			"01-10",
			"11-20",
			"21-25",
			"26-65",
			"66-75",
			"76-85",
			"86-95",
			"96-00",
	};
	public static final String[][] backgroundRollList = {
			{"01-05", "06-10", "11-20", "21-25", "25-40", "41-80", "81-00"},
			{"01-15", "16-25", "26-35", "36-60", "61-70", "71-85", "86-00"},
			{"01-25", "26-30", "31-40", "41-45", "46-75", "76-90", "91-00"},
			{"01-10", "11-30", "31-35", "36-50", "51-65", "66-75", "76-00"},
			{"01-05", "06-15", "16-25", "26-30", "31-70", "71-85", "86-00"},
			{"01-10", "11-15", "16-25", "26-35", "36-45", "46-85", "86-00"},
			{"01-10", "11-20", "21-60", "61-75", "76-80", "81-85", "86-00"},
			{"01-05", "06-10", "11-25", "26-30", "31-40", "41-75", "76-00"},
	};
	
	public static class QuirksTable {
		public static String[] rollList = {
				"01-10", "11-20", "21-30", "31-40", "41-50", "51-60", "61-70", "71-80", "81-90", "91-00"};
		
		public static String[] top() {
			String[] list = new String[HomeWorld.list.length + 1];
			list[0] = "d100";
			for(int i = 0; i < HomeWorld.list.length; i ++)
				list[i+1] = HomeWorld.list[i].name;
			return list;
		}
	}
}