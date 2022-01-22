package files;

import main.*;

class InvestigationFile implements PrintableFile {
	
	@Override
	public String filename() {
		return "Investigation.html";
	}
	
	@Override
	public String title() {
		return "Investigation";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printParagraph("Investigations comprise finding Clues, coming up with Leads, then following the Leads (which often leads to further Clues). Clues are bits of information relevant to the investigation. Leads are hints about the direction the investigation should go, generally in the form \"investigate X\".");
		printer.printSubheader("Physical Clues");
		printer.printParagraph("An object isn't a clue in and of itself - rather, the fact that an object was somewhere at a certain time is the clue. For example, 'an archeotech factory' isn't a clue; 'a cult is guarding an archeotech factory' is a clue.");
		printer.printHeader("Leads");
		printer.printParagraph("Clues will often prompt obvious Leads which don't require a Test to obtain. Other times (or additionally), a character can Contemplate to get more leads - this could either be new leads unrelated to existing ones, or splitting something more specific from a broader lead (for example, \"investigate the ship\" could split off into \"investigate the bridge crew\" or \"investigate the ships's navigation logs\").");
		printer.printHeader("Clues");
		printer.printParagraph("Clues can be obtained in various ways:");
		printer.printList(false, new String[] {
				"Notice or Sense Immaterium to get Clues passively in the course of the investigation.",
				"Inspect to get Clues from objects.",
				"Interrogate to get Clues from unwilling individuals.",
				"Inquire to get Clues from individuals or groups of people.",
				"Reference Lore to get Clues from remembered or researched knowledge.",
				"Search to get Clues from a location.",
		});
		printer.printParagraph("Sometimes simply going somewhere or meeting someone will reveal obvious clues which don't require a Test to obtain.");
		printer.printParagraph("Social and stealth skills can help with obtaining Clues (for example, by persuading someone to hand over evidence, or hacking to obtain encrypted data), but do not directly generate Clues in the way investigation skills do.");
		printer.printParagraph("Sometimes Clues obtained from an action will be a series of progressively more detailed information. For example:");
		printer.printList(true, new String[] {
				"The archeotech factory was producing weapons.",
				"Those weapons were powerful enough to destroy a battleship.",
				"The weapons were called Warp-Bombs.",
				"Warp-Bombs drag a ship into the warp unprotected.",
		});
		printer.printSubheader("Conclusions");
		printer.printParagraph("A special type of Clue is obtained when the Acolytes put different Clues together and form hypotheses or conclusions of their own. Forming Conclusions is up to the players; skills don't generate conclusions.");
		printer.printHeader("Tracking the Investigation");
		printer.printParagraph("The Clues and Leads can be kept track of using something like the example below.");
		// TODO - Tidy this up! //
		printer.println(
				"<ul>\n"
				+ "		<li>\n"
				+ "			Clue - Sol Invictus disappeared mid-battle with pirates\n"
				+ "			<ul>\n"
				+ "				<li>\n"
				+ "					Lead - investigate the other ships in the fleet\n"
				+ "					<ul>\n"
				+ "						<li>\n"
				+ "							Lead - speak to the crew of the other ships\n"
				+ "							<ul>\n"
				+ "								<li>\n"
				+ "									 Clue - no signs of mutiny\n"
				+ "								</li>\n"
				+ "							</ul>\n"
				+ "						</li>\n"
				+ "						<li>\n"
				+ "							Lead - speak to the captains of the other ships\n"
				+ "							<ul>\n"
				+ "								<li>\n"
				+ "									Clue - Sol Invictus was separated from the fleet\n"
				+ "								</li>\n"
				+ "								<li>\n"
				+ "									Clue - another small ship disappeared\n"
				+ "								</li>\n"
				+ "							</ul>\n"
				+ "						</li>\n"
				+ "						<li>\n"
				+ "							Lead - go through the sensor logs of the other ships\n"
				+ "							<ul>\n"
				+ "								<li>\n"
				+ "									Clue - the small ship which disappeared was close to the Sol Invictus\n"
				+ "								</li>\n"
				+ "								<li>\n"
				+ "									Clue - there was only one warp signature\n"
				+ "									<ul>\n"
				+ "										<li>\n"
				+ "											Lead - investigate the warp signature of that class of battleship\n"
				+ "											<ul>\n"
				+ "												<li>\n"
				+ "													Clue - the Sol Invictus' warp signature was different to usual\n"
				+ "													<ul>\n"
				+ "														<li>\n"
				+ "															Conclusion - perhaps the warp drive was tampered with\n"
				+ "														</li>\n"
				+ "													</ul>\n"
				+ "												</li>\n"
				+ "											</ul>\n"
				+ "										</li>\n"
				+ "									</ul>\n"
				+ "								</li>\n"
				+ "							</ul>\n"
				+ "						</li>\n"
				+ "					</ul>\n"
				+ "				</li>\n"
				+ "				<li>\n"
				+ "					Lead - investigate the site of the disappearance\n"
				+ "				</li>\n"
				+ "				<li>\n"
				+ "					Lead - investigate the pirates\n"
				+ "				</li>\n"
				+ "			</ul>\n"
				+ "		</li>\n"
				+ "	</ul>"
		);
		printer.println();
		printer.println();
		printer.printFileTail();
	}
}