package files;

import main.*;

class PsychicPhenomenaFile implements PrintableFile {
	
	private static final String[][] psychicPhenomenaTable = {
			{"1-3", "Mounting Paranoia", "The psyker gets an itch between their shoulder blades for a few moments."},
			{"4-6", "Dark Foreboding", "A faint breeze blows past. Everyone nearby (3d10m) gets the eerie feeling that something unfortunate has just happened somewhere."},
			{"7-9", "Memory Worm", "All people within line of sight of the psyker forget something trivial."},
			{"10-12", "Haunting Breeze", "Moderate winds whip up nearby (3d10m) for a few seconds, blowing very light objects about."},
			{"13-15", "Warp Echo", "For a few seconds, all sound nearby (3d10m) echos regardless of the surroundings."},
			{"16–18", "Unnatural Aura", "All animals within 1d100 metres become spooked and restless."},
			{"19-21", "Etherial Stench", "The air nearby (3d10m) fills with a faint smell, which can either be pleasant or noxious."},
			{"22–24", "Spoilage", "For a few seconds, everyone nearby (3d10m) gets a vile taste in their mouth."},
			{"25–27", "Grave Chill", "The temperature drops sharply for a few seconds and a fine coating of frost covers everything nearby (3d10m)."},
			{"28–30", "Unnatural Decay", "All plants nearby (3d10m) wither and die."},
			{"31–33", "Veil of Darkness", "The area nearby (3d10m) is plunged into Darkness for a few seconds."},
			{"34–36", "Distorted Reflection", "Mirrors break and other reflective surfaces nearby (5d10m) distort or ripple."},
			{"37–39", "Bloody Tears", "Blood weeps from stone and wood nearby (3d10m). If there are any pictures of people or statues, they appear to be crying blood."},
			{"40–42", "Breath Leech", "Everyone nearby (5d10m) becomes short of breath and takes a -20 penalty to Agility Tests for 1 round."},
			{"43–45", "The Furies", "Unseen hands thrash the psyker about (Knock Down with Stringth 70) as winds howl nearby."},
			{"46–48", "Daemonic Mask", "For a fleeting moment, the psyker takes on a daemonic appearance, gaining Fear Rating 1 for one round and taking 1 Corruption Point."},
			{"49–51", "The Earth Protests", "The ground suddenly shakes. Everyone nearby (5d10m) must succeed an Agility Test or become Prone."},
			{"52–54", "Psy Discharge", "Static electricity fills the air nearby (6d10m), causing hair to stand on end. The psyker rises 1d10 metres into the air, falling after a few seconds (1 round)."},
			{"55–57", "Warp Ghosts", "Ghostly apparitions fill the air nearby (3d10m), flying around and howling in pain for a few brief moments. Everyone in the radius gains 1 Insanity Point."},
			{"58–60", "Falling Upwards", "Everything nearby (2d10m) rises 1d10 metres into the air as gravity briefly disappears before falling to the ground after a few seconds (1 round)."},
			{"61–63", "Tech Scorn", "The machine spirits reject your unnatural ways. All tech devices nearby (5d10m) malfunction momentarily (1 round) and all ranged weapons become Jammed."},
			{"64–66", "Spectral Gale", "Howling winds erupt around the psyker, which attempt to Knock Down (Strength 60) everyone nearby (4d10m)."},
			{"67–69", "Banshee Howl", "A deafening keening sounds out for a kilometre, shattering glass and deafening everyone for 1d10 rounds."},
			{"70–72", "Shadow of the Warp", "For a split second the world changes in appearance and everyone within 1d100 metres has a glimpse of the heart of the warp. Everyone in the area gains 5 Insanity Points."},
			{"73–75", "Warp Madness", "A violent ripple of discord causes all creatures nearby (2d10m) to become Frenzied(2) and gain 1 Corruption Point."},
			{"76-00", "Perils of the Warp", "Roll on the Perils of the Warp table."},
	};
	
	private static final String[][] perilsTable = {
			{"31–38", "Chronological Incontinence", "Time warps around the psyker. The character winks out of existence for a few seconds (until the start of their next turn)."},
			{"01–05", "The Gibbering", "The psyker screams in pain as uncontrolled warp energies surge through their unprotected mind. They gain 5 Insanity Points."},
			{"06–09", "Warp Burn", "A violent burst of energy from the warp smashes into the psyker’s mind, sending them reeling. They become Stunned."},
			{"10–13", "Psychic Concussion", "A crack of psychic energy bursts from the warp. The psyker becomes Dazzled(3) and everyone else within 3d10 metres becomes Dazzled(1)."},
			{"14–18", "Psy-Blast", "There is an explosion of power and the psyker takes a hit dealing 1d10 Impact damage and is thrown 1d10 metres in a random direction."},
			{"19–24", "Soul Sear", "Warp power courses through the psyker’s body, scorching their very soul. They take 5 Willpower damage and gain 5 Corruption Points."},
			{"25–30", "Life Drain", "The psyker's body suffers as the warp siphons away energy and matter. They become Fatigued(2)."},
			{"39–46", "Psychic Mirror", "The psyker suffers the effect of their own power instead of the intended target. If the target was the psyker, the power is instead reflected to a random nearby character."},
			{"47–55", "Warp Whispers", "The ghostly voices of Daemons fill the air nearby (4d10m). Apply the Corrupting Whispers psychic power to everyone in the area."},
			{"56–61", "Vice Versa", "The psyker’s mind is connected with that of a random character within 50m. Both characters gain 5 Insanity Points. Until the connection ends, they decide the other character's actions. Either can end the connection with a successful Willpower Test. Both characters are strangely revolted by the process and are unable to meet each other’s gaze for some time afterwards."},
			{"62–67", "Dark Summoning", "A Lesser Daemon pops into existence 3d10 meters away. It detests the fool that summoned it, focusing its attacks on the psyker."},
			{"68–72", "Ethereal Storm", "All characters within 1d100 metres take 1d10 Energy Damage that ignores Armour."},
			{"73–78", "Blood Rain", "A psychic storm erupts with whipping winds and rains of blood. A Warp Storm(3) 5d10 metres across appears."},
			{"79–82", "Cataclysmic Blast", "The psyker’s power overloads, arcing out in great bolts of warp energy. Everyone in  2d10 metres takes 1d10+5 Energy Damage and all of the psyker’s clothing and gear are destroyed, leaving them naked and smoking on the ground."},
			{"83–86", "Mass Possession", "Daemons ravage the minds of every living thing within 1d100 metres. Every character in the area xxxxxxxxxxxxxxxxxx."},
			{"87–90", "The Surly Bonds of Earth", "Reality buckles and all gravity within 1d100 metres reverses for 1d10 Rounds. All creatures and unattended objects begin to lift off the ground at a rate of three metres per Round. At the end of this time, reality asserts itself and everything comes crashing down, likely dealing Damage to all those affected."},
			{"91–99", "Daemonhost", "The psyker must immediately pass a Very Hard (–30) Willpower Test or be possessed by a Daemon and become a Daemonhost! Create an Unbound Daemonhost (See Chapter XII", "Aliens, Heretics & Antagonists Antagonists) that will immediately attack. Only the destruction of the Daemonhost will free the psyker (though he may die anyway if his body is destroyed in the process). If the psyker does somehow manage to survive this result, he automatically gains 4d10 Corruption Points."},
			{"100", "Warp Feast", "A rift in reality is torn open and the psyker is sucked into the warp with a little burping noise. He is no more."},
	};
	
	@Override
	public String filename() {
		return "PsychicPhenomena.html";
	}
	
	@Override
	public String title() {
		return "Psychic Phenomena";
	}

	@Override
	public void print(DHOPrinter printer) {
		printer.printFileTop(title());
		printer.printParagraph("Roll a d100 to determine the effect on the Psychic Phenomena table.");
		printer.printParagraph("Phenomena which affect an area around the psyker also affect the psyker.");
		printer.printHeader("Psychic Phenomena Table");
		printer.printTableTop("Roll", "Effect", true, true);
		for(int i = 0; i < psychicPhenomenaTable.length; i ++) {
			printTableRow(printer, psychicPhenomenaTable[i]);
		}
		printer.printTableTail();
		printer.printHeader("Perils of the Warp Table");
		printer.printTableTop("Roll", "Effect", true, true);
		for(int i = 0; i < perilsTable.length; i ++) {
			printTableRow(printer, perilsTable[i]);
		}
		printer.printTableTail();
		printer.println();
		printer.println();
		printer.printFileTail();
	}
	
	private void printTableRow(DHOPrinter printer, String[] row) {
		String roll = row[0];
		String effectName = row[1];
		String effectDescription = row[2];
		String effect = "<b>"+effectName+":</b> "+effectDescription;
		printer.printTableRow(roll, effect);
	}
}