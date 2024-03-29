package main;

import files.Files;


/**
 * Program for compiling the documentation for Dark Heresy Overhaul as an HTML document.
 * 
 * Files are processed from the /in/ folder to the /out/ folder.
 * Lines starting with !<command> run the command in place of that line.
 * Lines containing !!@<variable>!! have the variable inserted.
 * 
 * @author CheeseyBob
 *
 */
class DarkHeresyOverhaul {
	
	public static void main(String[] args) {
		System.out.println("Running DarkHeresyOverhaul html generation...");
		for(PrintableFile file : Files.getAll()) {
			printFile(file);
		}
		System.out.println("HTML file generation complete.");
	}
	
	private static void printFile(PrintableFile file) {
		System.out.print("Generating "+file.filename()+"... ");
		DHOPrinter printer = new DHOPrinter(file.filename());
		file.print(printer);
		printer.close();
		System.out.println("done.");
	}
}