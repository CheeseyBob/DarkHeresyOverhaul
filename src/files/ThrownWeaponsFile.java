package files;

import main.*;

class ThrownWeaponsFile implements PrintableFile {
	
	private static String[] getRangeTableRow(int row) {
		String[] rangeList = {
				"CQC", "2m", "5m", "10m", "15m", "20m", "25m", "30m", "35m", "40m", "45m"
		};
		String[] bonusList = {
				"-20", "+30", "+20", "+10", "+0", "-10", "-20", "-30", "-40", "-50", "-60"
		};
		return new String[] {rangeList[row], bonusList[row]};
	}
	
	@Override
	public String filename() {
		return "ThrownWeapons.html";
	}
	
	@Override
	public String title() {
		return "Thrown Weapons";
	}
	
	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printSubSubheader("Range");
		printer.printParagraph("You can throw an item of Size up to your Strength Bonus (or SB+1 if using both hands). The range of a throw is (2xSB - Item Size)x5m.");
		printer.printTableTop("Range", "Bonus", false, false);
		for(int i = 0; i < 11; i ++) {
			printer.printTableRow(getRangeTableRow(i));
		}
		printer.printTableTail();
		printer.printSubheader("Throwing Melee Weapons");
		printer.printParagraph("When you throw a Melee Weapon as an attack, simply treat the item as a Thrown Weapon - use the damage and special rules (if doing so makes sense) on the item card.");
		printer.printSubheader("Throwing Other Items");
		printer.printParagraph("When you throw another item as an attack, treat it as an Improvised Melee Weapon of the appropriate size.");
		printer.printSubheader("Scattering");
		printer.printParagraph("If you miss an attack with a Thrown Weapon which has an area of effect, [determine where it scatters].");
		printer.printHeader_collapsible("Grenades");
		printer.printCollapsibleTop();
		printer.printRowTop();
		printer.printCol_item(6, ThrownWeapon.fragHandGrenade);
		printer.printCol_item(6, ThrownWeapon.oversizedFragHandGrenade);
		printer.printCol_item(6, ThrownWeapon.krakHandGrenade);
		printer.printCol_item(6, ThrownWeapon.gasHandGrenade_painPoison);
		printer.printRowTail();
		printer.printCollapsibleTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}