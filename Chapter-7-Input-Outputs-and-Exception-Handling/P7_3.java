/**
 * Repeat exercise P7.2, but allow the user to specify the file name on the command-line.
 * If the user doesn't specify any file name, then prompt the user for the name.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class P7_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String readFromFilename;
		String writeToFilename;
		if(args.length == 2) {
			readFromFilename = args[0];
			writeToFilename = args[1];
		}
		else {
			System.out.print("Filename to read: ");
			readFromFilename = input.next();
			
			System.out.print("Filename to write to: ");
			writeToFilename = input.next();
			input.close();
		}
		
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
