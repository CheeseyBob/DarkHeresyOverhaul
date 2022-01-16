package main;

import files.FileList;

/**
 * Program for compiling the documentation for Dark Heresy Overhaul as an HTML document.
 * 
 * Files are processed from the /in/ folder to the /out/ folder.
 * Lines starting with !<command> run the command in place of that line.
 * Lines containing !!@<variable>!! have the variable inserted.
 * 
 * @author rob
 *
 */
class DarkHeresyOverhaul {
	
	public static void main(String[] args) {
		System.out.println("Running DarkHeresyOverhaul html generation...");
		for(PrintableFile file : FileList.getAll()) {
			printFile(file);
		}
		System.out.println("... done.");
	}
	
	private static void printFile(PrintableFile printable) {
		DHOPrinter printer = new DHOPrinter(printable.filename());
		printable.print(printer);
		printer.close();
	}
}