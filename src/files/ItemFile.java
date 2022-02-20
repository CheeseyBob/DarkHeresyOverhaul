package files;

import main.*;

public class ItemFile implements PrintableFile {
	Item item;
	
	public ItemFile(Item item) {
		this.item = item;
	}
	
	@Override
	public String filename() {
		return item.filename();
	}
	
	@Override
	public String title() {
		return item.name;
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title(), false, false);
		printer.println();
		if(item instanceof Ammo)
			printer.printItem((Ammo)item);
		if(item instanceof Armour)
			printer.printItem((Armour)item);
		if(item instanceof Clothing)
			printer.printItem((Clothing)item);
		if(item instanceof Consumable)
			printer.printItem((Consumable)item);
		if(item instanceof MeleeWeapon)
			printer.printItem((MeleeWeapon)item);
		if(item instanceof MiscItem)
			printer.printItem((MiscItem)item);
		if(item instanceof RangedWeapon)
			printer.printItem((RangedWeapon)item);
		if(item instanceof ThrownWeapon)
			printer.printItem((ThrownWeapon)item);
		if(item instanceof Tool)
			printer.printItem((Tool)item);
		printer.println();
		printer.printFileTail();
	}
}