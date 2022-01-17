package files;

import main.*;

class FatePointsFile implements PrintableFile {
	
	@Override
	public String filename() {
		return "FatePoints.html";
	}
	
	@Override
	public String title() {
		return "Fate Points";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printParagraph("Fate points are a meta-game resource which each player has (the GM does not get Fate Points)."
				+ "You start with 3 and get 3 more whenever your character dies."
				+ "When you choose a new character, you keep all the Fate Points you had with the previous character."
		);
		printer.printParagraph("You can also spend a Fate Point to take an Advance by inspiration (see Character Advancement).");
		printer.printHeader("Spending Fate Points");
		printer.printParagraph("After any roll (except in character creation), you can spend a Fate Point to reroll and use your preferred result."
				+ "You can spend more than one Fate Point on one roll."
				+ "You get spent Fate Points back at the start of each session.");
		printer.printHeader("Burning Fate Points");
		printer.printParagraph("Instead of spending a Fate Point, you can burn a Fate Point to change the result of the dice to whatever you want."
				+ "You do not get back burnt Fate Points, but you can burn spent Fate Points."
				+ "You can also burn a Fate Point to bench your character (at an appropriate time) and choose a new one.");
		printer.printHeader("Bonus Fate Points");
		printer.printParagraph("You can earn bonus Fate Points if you have your character take a risky action which fits the character (in other words, when you maintain roleplaying to your detriment)."
				+ "Bonus Fate Points are lost when you spend them and cannot be burned.");
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}