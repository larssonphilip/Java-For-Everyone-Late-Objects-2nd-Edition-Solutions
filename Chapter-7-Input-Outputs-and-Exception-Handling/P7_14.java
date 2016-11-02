/**
 * Using the mechanism described in Special Topic 7.1, write a program that reads all data from a web page and writes them to a file. 
 * Prompt the user for the web page URL and the file.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;


public class P7_14 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.print("Type the web page URL: ");
		String pageURL = input.next();
		System.out.print("Type the filename: ");
		String fileToRead = input.next();
		input.close();
		
		URL pageLocation = new URL(pageURL);
		Scanner inFile = new Scanner(pageLocation.openStream());
		
		PrintWriter outFile = new PrintWriter(fileToRead);
		while(inFile.hasNextLine()){
			String text = inFile.nextLine();
			outFile.println(text);
		}
		
		outFile.close();
		inFile.close();
		
		System.out.println("The data has been successfully written from " + pageURL +  " to " + "'" + fileToRead + "'.");
	}
}
