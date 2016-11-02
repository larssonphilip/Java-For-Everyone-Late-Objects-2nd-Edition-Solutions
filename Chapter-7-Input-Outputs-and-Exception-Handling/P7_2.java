/**
 * Write a program that reads a file containing text. Read each line and send it to the output file, preceded by line numbers.
 * If the input file is:
 * Mary had a little lamb
 * Whose fleece was white as snow.
 * And everywhere that mary went,
 * The lamb was sure to go!
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class P7_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Filename to read: ");
		String readFromFilename = input.next();
		
		System.out.print("Filename to write to: ");
		String writeToFilename = input.next();
		input.close();

		File readFile = new File(readFromFilename);

		try {
			PrintWriter outFile = new PrintWriter(writeToFilename);
			Scanner inFile = new Scanner(readFile);
			
			int counter = 1;
			while(inFile.hasNextLine()) {
				String line = inFile.nextLine();
				outFile.println("/* " + counter++ + " */ " + line);
			}
			System.out.println("Your text has been successfully written in " + writeToFilename + ".");
			inFile.close();
			outFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}	
	}
}
