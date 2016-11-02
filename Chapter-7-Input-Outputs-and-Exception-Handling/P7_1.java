/**
 * Write a program that carries out the following tasks:
 * 	Open a file with the name hello.txt
 * 	Store the message "Hello, World!" in the file.
 * 	Close the file.
 * 	Open the same file again.
 * 	Read the message into a string variable and print it
 */
 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class P7_1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Type the file name: ");
		String filename = input.nextLine();
		input.close();
		System.out.println();

		writeTextToFile(filename);
		printTextFromFile(filename);
	}

	public static void writeTextToFile (String filename) {
		try {
			PrintWriter outFile = new PrintWriter(filename);
			outFile.println("Hello, World!");
			outFile.close();	
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
	public static void printTextFromFile (String filename) {
		try {
			Scanner inFile = new Scanner(new File(filename));
			String str = inFile.nextLine();
			System.out.println("'" + str + "'" + " has been successfully written in " + filename + ".");
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}


