/**
 * Write a program that asks the user for a file name and prints the
 * number of characters, word, and lines in that file.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P7_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Read from file: ");
		String fileToRead = input.next();
		input.close();
		
		System.out.println("Number of characters: " + countChars(fileToRead));
		System.out.println("Number of words: " + countWords(fileToRead));
		System.out.println("Number of lines: " + countLines(fileToRead));
	}
	
	public static int countChars(String filename) {
		try {
			Scanner inFile = new Scanner(new File(filename));
			
			int charCounter = 0;
			while(inFile.hasNextLine()) {
				String line = inFile.nextLine();
				charCounter += line.trim().length();
			}
			
			inFile.close();
			return charCounter;
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found!");
		}
		
		return 0;
	}
	
	public static int countWords(String filename) {
		try {
			Scanner inFile = new Scanner(new File(filename));
			
			int wordCounter = 0;
			while(inFile.hasNext()) {
				wordCounter++;
				inFile.next();
			}
			
			inFile.close();
			
			return wordCounter;
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found!");
		}
		return 0;
	}
	
	public static int countLines(String filename) {
		try {
			Scanner inFile = new Scanner(new File(filename));
			
			int lineCounter = 0;
			while(inFile.hasNextLine()) {
				lineCounter++;
				inFile.nextLine();
			}
			
			inFile.close();
			
			return lineCounter;
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found!");
		}
		return 0;
	}
}
