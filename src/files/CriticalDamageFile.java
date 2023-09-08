package files;

import main.*;

class CriticalDamageFile implements PrintableFile {
	
	private static String[][] locationTable = {
			{"1-5", "Body"},
			{"6", "Left Arm"},
			{"7", "Right Arm"},
			{"8", "Left Leg"},
			{"9", "Right Leg"},
			{"10", "Head"},
	};
	
	private static String[][] effectsTable_chemical_arm = {
			{"1-2", "Become Stunned; drop held item; 1d10 WS and BS damage"},
			{"3-4", "Become Stunned(2); drop held item; 1d10 WS and BS damage and permenant reduction"},
			{"5-6", "Become Stunned(3); drop held item; 1d10+5 WS and BS damage and permenant reduction"},
			{"7-8", "Become Stunned(4); held item becomes Damaged; 1d10+10 WS and BS damage and permenant reduction"},
			{"9-10", "Become Stunned(5); held item becomes Damaged(2); 1d10+15 WS and BS damage and permenant reduction"},
			{"11+", "As above, plus permenantly reduce WS and BS by the amount of critical damage taken"},
	};
	private static String[][] effectsTable_chemical_body = {
			{"1-2", "Become Stunned; 1 Strength and Toughness damage"},
			{"3-4", "Become Stunned(2); 1d10 Strength and Toughness damage"},
			{"5-6", "Become Stunned(3); 1d10 Strength and Toughness damage and permenant reduction"},
			{"7-8", "Become Stunned(4); 1d10+5 Strength and Toughness damage and permenant reduction; worn items become Damaged"},
			{"9-10", "Become Stunned(5); 1d10+10 Strength and Toughness damage and permenant reduction; worn items become Damaged(2)"},
			{"11+", "As above, plus permenantly reduce Strength and Toughness by the amount of critical damage taken"},
	};
	private static String[][] effectsTable_chemical_head = {
			{"1-2", "Become Stunned and Dazzled; 1d10 Perception and Fellowship damage"},
			{"3-4", "Become Stunned(2) and Dazzled(2); 1d10 Perception and Fellowship damage and permenant reduction"},
			{"5-6", "Become Stunned(3) and Dazzled(3); 1d10+5 Perception and Fellowship damage and permenant reduction (if 9-10, gain Lost Eye)"},
			{"7-8", "Become Stunned(4) and Dazzled(4); 1d10+10 Perception and Fellowship damage and permenant reduction; gain Blind"},
			{"9-10", "Become Stunned(5) and Dazzled(5); 1d10+15 Perception and Fellowship damage and permenant reduction; gain Blind"},
			{"11+", "As above, plus permenantly reduce Perception and Fellowship by the amount of critical damage taken"},
	};
	private static String[][] effectsTable_chemical_leg = {
			{"1-2", "Become Stunned and Prone; 1d10 Agility damage"},
			{"3-4", "Become Stunned(2) and Prone; 1d10 Agility damage and permenant reduction"},
			{"5-6", "Become Stunned(3) and Prone; 1d10+5 Agility damage and permenant reduction"},
			{"7-8", "Become Stunned(4) and Prone; 1d10+10 Agility damage and permenant reduction"},
			{"9-10", "Become Stunned(5) and Prone; 1d10+15 Agility damage and permenant reduction"},
			{"11+", "As above, plus permenantly reduce Agility by the amount of critical damage taken"},
	};
	
	private static String[][] effectsTable_energy_arm = {
			{"1-2", "Become Stunned; drop held item"},
			{"3-4", "Become Stunned(2); drop held item; 1d10 WS and BS damage"},
			{"5-6", "Become Stunned(3); drop held item; permenantly reduce WS and BS by 1d10"},
			{"7-8", "Become Stunned(4); held item becomes Damaged; gain Lost Hand; become Burning"},
			{"9-10", "Become Stunned(5); held item is destroyed; gain Lost Arm; become Burning(2)"},
			{"11+", "Immediate death; area of Fire created"},
	};
	private static String[][] effectsTable_energy_body = {
			{"1-2", "Become Stunned"},
			{"3-4", "Become Stunned(2) and Burning"},
			{"5-6", "Become Stunned(3) and Burning(2); 1d10 Strength and Toughness damage"},
			{"7-8", "Become Stunned(4) and Burning(3); permenantly reduce Strength and Toughness by 1d10; worn items become Damaged"},
			{"9-10", "Become Stunned(5) and Burning(4); permenantly reduce Strength and Toughness by 1d10+5; worn items are destroyed"},
			{"11+", "Immediate death; area of Fire created; all carried items are destroyed"},
	};
	private static String[][] effectsTable_energy_head = {
			{"1-2", "Become Stunned and Dazzled"},
			{"3-4", "Become Stunned(2) and Dazzled(2); 1d10 Perception and Fellowship damage"},
			{"5-6", "Become Stunned(3) and Dazzled(3); permenantly reduce Perception and Fellowship by 1d10 (if 9-10, gain Lost Eye)"},
			{"7-8", "Become Stunned(4) and Dazzled(4); permenantly reduce Fellowship by 1d10+5; gain Blind"},
			{"9-10", "Immediate death"},
			{"11+", "Immediate death; area of Fire created"},
	};
	private static String[][] effectsTable_energy_leg = {
			{"1-2", "Become Stunned and Prone"},
			{"3-4", "Become Stunned(2) and Prone; 1d10 Agility damage"},
			{"5-6", "Become Stunned(3) and Prone; permenantly reduce Agility by 1d10"},
			{"7-8", "Become Stunned(4) and Prone; gain Lost Foot; become Burning"},
			{"9-10", "Become Stunned(5) and Prone; gain Lost Leg; become Burning(2)"},
			{"11+", "Immediate death; area of Fire created"},
	};
	
	private static String[][] effectsTable_explosive_arm = {
			{"1-2", "Become Stunned; drop held item"},
			{"3-4", "Become Stunned(2); held item is flung 1d10m; 1d10 WS and BS damage"},
			{"5-6", "Become Stunned(3); held item is flung 1d10+5m and becomes Damaged; permenantly reduce WS and BS by 1d10"},
			{"7-8", "Become Stunned(4); held item is flung 1d10+10m and becomes Damaged; gain Lost Hand; become Bleeding Out"},
			{"9-10", "Become Stunned(5); held item is destroyed; gain Lost Arm; become Bleeding Out(2)"},
			{"11+", "Immediate death; carried explosives detonate and all other carried items are destroyed"},
	};
	private static String[][] effectsTable_explosive_body = {
			{"1-2", "Become Stunned and Prone"},
			{"3-4", "Become Stunned(2) and Prone; flung 1d5m"},
			{"5-6", "Become Stunned(3) and Prone; flung 2d5m; 1d10 Strength and Toughness damage; worn items become Damaged"},
			{"7-8", "Become Stunned(4) and Prone and Bleeding Out; flung 3d5m; permenantly reduce Strength and Toughness by 1d10; worn items become Damaged"},
			{"9-10", "Become Stunned(4) and Prone and Bleeding Out(2); flung 4d5m; permenantly reduce Strength and Toughness by 1d10+5; worn items are destroyed"},
			{"11+", "Immediate death; carried explosives detonate and all other carried items are destroyed"},
	};
	private static String[][] effectsTable_explosive_head = {
			{"1-2", "Become Stunned and Dazzled"},
			{"3-4", "Become Stunned(2) and Dazzled(2); 1d10 Intelligence, Perception and Fellowship damage"},
			{"5-6", "Become Stunned(3) and Dazzled(3); permenantly reduce Intelligence, Perception and Fellowship by 1d10"},
			{"7-8", "Become Stunned(4) and Dazzled(4); permenantly reduce Intelligence and Fellowship by 1d10+5; gain Deaf"},
			{"9-10", "Immediate death"},
			{"11+", "Immediate death; carried explosives detonate and all other carried items are destroyed"},
	};
	private static String[][] effectsTable_explosive_leg = {
			{"1-2", "Become Stunned and Prone"},
			{"3-4", "Become Stunned(2) and Prone; flung 1d5m; 1d10 Agility damage"},
			{"5-6", "Become Stunned(3) and Prone; flung 1d5m; permenantly reduce Agility by 1d10"},
			{"7-8", "Become Stunned(4) and Prone; flung 2d5m; gain Lost Foot; become Bleeding Out"},
			{"9-10", "Become Stunned(5) and Prone; flung 3d5m; gain Lost Leg; become Bleeding Out(2)"},
			{"11+", "Immediate death; carried explosives detonate and all other carried items are destroyed"},
	};
	
	private static String[][] effectsTable_impact_arm = {
			{"1-2", "Become Stunned; drop held item"},
			{"3-4", "Become Stunned(2); held item flung 1d10m; 1d10 WS and BS damage"},
			{"5-6", "Become Stunned(3); held item flung 1d10+5m and becomes Damaged; permenantly reduce WS and BS by 1d10"},
			{"7-8", "Become Stunned(4) and Bleeding Out; held item flung 1d10+5m and becomes Damaged; gain Lost Hand"},
			{"9-10", "Become Stunned(5) and Bleeding Out(2); held item flung 1d10+10m and is destroyed; gain Lost Arm"},
			{"11+", "Immediate death; if holding a firearm, severed arm does Attack Repeatedly (Ranged) in a random direction with Ballistic Skill 5"},
	};
	private static String[][] effectsTable_impact_body = {
			{"1-2", "Become Stunned"},
			{"3-4", "Become Stunned(2) and Fatigued"},
			{"5-6", "Become Stunned(3) and Fatigued(2) and Prone; flung 1d5m; 1d10 Strength and Toughness damage"},
			{"7-8", "Become Stunned(4) and Fatigued(3) and Prone; flung 2d5m; permenantly reduce Strength and Toughness by 1d10"},
			{"9-10", "Become Stunned(5) and Fatigued(4) and Prone and Bleeding Out; flung 3d5m; permenantly reduce Strength and Toughness by 1d10+5"},
			{"11+", "Immediate death"},
	};
	private static String[][] effectsTable_impact_head = {
			{"1-2", "Become Stunned(2)"},
			{"3-4", "Become Stunned(4); stagger 1d5m; 1d10 Intelligence and Fellowship damage"},
			{"5-6", "Become Stunned(6) and Prone; flung 1d5m; permenantly reduce Intelligence and Fellowship by 1d10"},
			{"7-8", "Become Stunned(8) and Prone; flung 2d5m; permenantly reduce Intelligence, Perception and Fellowship by 1d10+5"},
			{"9-10", "Immediate death"},
			{"11+", "Immediate death"},
	};
	private static String[][] effectsTable_impact_leg = {
			{"1-2", "Become Stunned and Prone"},
			{"3-4", "Become Stunned(2) and Prone; 1d10 Agility damage"},
			{"5-6", "Become Stunned(3) and Prone; permenantly reduce Agility by 1d10"},
			{"7-8", "Become Stunned(4) and Prone; gain Lost Foot; become Bleeding Out"},
			{"9-10", "Become Stunned(5) and Prone; gain Lost Leg; become Bleeding Out(2)"},
			{"11+", "Immediate death"},
	};
	
	private static String[][] effectsTable_rending_arm = {
			{"1-2", "Become Stunned; drop held item"},
			{"3-4", "Become Stunned(2) and Bleeding Out; drop held item; 1d10 WS and BS damage"},
			{"5-6", "Become Stunned(3) and Bleeding Out(2); drop held item; permenantly reduce WS and BS by 1d10"},
			{"7-8", "Become Stunned(4) and Bleeding Out(3); drop held item; gain Lost Hand"},
			{"9-10", "Become Stunned(5) and Bleeding Out(4); drop held item; gain Lost Arm"},
			{"11+", "Immediate death; if holding a firearm, severed arm does Attack Repeatedly (Ranged) in a random direction with Ballistic Skill 5"},
	};
	private static String[][] effectsTable_rending_body = {
			{"1-2", "Become Stunned"},
			{"3-4", "Become Stunned(2) and Bleeding Out"},
			{"5-6", "Become Stunned(3) and Bleeding Out(2); 1d10 Strength and Toughness damage"},
			{"7-8", "Become Stunned(4) and Bleeding Out(3); permenantly reduce Strength and Toughness by 1d10"},
			{"9-10", "Become Stunned(5) and Bleeding Out(4); permenantly reduce Strength and Toughness by 1d10+5"},
			{"11+", "Immediate death"},
	};
	private static String[][] effectsTable_rending_head = {
			{"1-2", "Become Stunned and Bleeding Out"},
			{"3-4", "Become Stunned(2) and Bleeding Out(2); 1d10 Fellowship damage"},
			{"5-6", "Become Stunned(3) and Bleeding Out(3); permenantly reduce Fellowship by 1d10 (if 9-10, gain Lost Eye)"},
			{"7-8", "Become Stunned(4) and Bleeding Out(4); permenantly reduce Fellowship by 1d10+5 (if 9-11, gain Lost Eye, if 12-13, gain Mute, if 14-15, gain Blind)"},
			{"9-10", "Immediate death"},
			{"11+", "Immediate death"},
	};
	private static String[][] effectsTable_rending_leg = {
			{"1-2", "Become Stunned and Prone"},
			{"3-4", "Become Stunned(2) and Prone and Bleeding Out; 1d10 Agility damage"},
			{"5-6", "Become Stunned(3) and Prone and Bleeding Out(2); permenantly reduce Agility by 1d10"},
			{"7-8", "Become Stunned(4) and Prone and Bleeding Out(3); gain Lost Foot"},
			{"9-10", "Become Stunned(5) and Prone and Bleeding Out(4); gain Lost Leg"},
			{"11+", "Immediate death"},
	};
	
	@Override
	public String filename() {
		return "CriticalDamage.html";
	}
	
	@Override
	public String title() {
		return "Critical Damage";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printParagraph("When a character's Wounds exceed their Maximum Wounds, any damage they take causes Critical Damage in addition to inflicting Wounds"
				+ " - this includes the hit which first causes them to exceed their Maximum Wounds. "
				+ "Determine the location hit and apply the result from the relevant table. "
				+ "If the hit location would be a missing limb, consider the body to be hit. ");
		printer.printParagraph("When Critical Damage results in a character's Aspect being upgraded, unlike a Create Advantage Action, this isn't limited by any Characteristic Bonus.");
		
		printer.printHeader("Critical Damage Location");
		printer.printRowTop();
		printer.printColTop(6);
		printer.printSubheader("Humanoids");
		printer.printTableTop(false, true, "d10", "Location");
		for(int i = 0; i < locationTable.length; i ++) {
			printer.printTableRow(locationTable[i]);
		}
		printer.printTableTail();
		printer.printColTail();
		printer.println();
		printer.printColTop(6);
		printer.printSubheader("Non-Humanoids");
		printer.printList(true,
				"Roll a d10 for each arm. On a 10, that arm is hit.",
				"If an arm is not hit, roll a d10 for each leg. On a 10, that leg is hit.",
				"If a leg is not hit, roll a d10 for each head. On a 10, that head is hit.",
				"If a head is not hit, the body is hit"
		);
		printer.printColTail();
		printer.println();
		printer.printRowTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Chemical");
		printer.printCollapsibleTop();
		printCriticalDamageEffectsTables(printer, "Chemical", effectsTable_chemical_arm, effectsTable_chemical_body, effectsTable_chemical_head, effectsTable_chemical_leg);
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Energy");
		printer.printCollapsibleTop();
		printCriticalDamageEffectsTables(printer, "Energy", effectsTable_energy_arm, effectsTable_energy_body, effectsTable_energy_head, effectsTable_energy_leg);
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Explosive");
		printer.printCollapsibleTop();
		printCriticalDamageEffectsTables(printer, "Explosive", effectsTable_explosive_arm, effectsTable_explosive_body, effectsTable_explosive_head, effectsTable_explosive_leg);
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Impact");
		printer.printCollapsibleTop();
		printCriticalDamageEffectsTables(printer, "Impact", effectsTable_impact_arm, effectsTable_impact_body, effectsTable_impact_head, effectsTable_impact_leg);
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printHeader_collapsible("Rending");
		printer.printCollapsibleTop();
		printCriticalDamageEffectsTables(printer, "Rending", effectsTable_rending_arm, effectsTable_rending_body, effectsTable_rending_head, effectsTable_rending_leg);
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
	
	private void printCriticalDamageEffectsTables(DHOPrinter printer, String type, String[][] arm, String[][] body, String[][] head, String[][] leg) {
		printer.printRowTop();
		printCriticalDamageEffectsTable(printer, type, "Arm", arm);
		printCriticalDamageEffectsTable(printer, type, "Body", body);
		printCriticalDamageEffectsTable(printer, type, "Head", head);
		printCriticalDamageEffectsTable(printer, type, "Leg", leg);
		printer.printRowTail();
	}
	
	private void printCriticalDamageEffectsTable(DHOPrinter printer, String type, String location, String[][] table) {
		printer.printColTop(6);
		printer.printSubSubheader(type+" Critical Damage Effects - "+location);
		printer.printTableTop(true, true, "Damage", "Effect");
		for(int i = 0; i < table.length; i ++) {
			printer.printTableRow(table[i]);
		}
		printer.printTableTail();
		printer.printColTail();
	}
}