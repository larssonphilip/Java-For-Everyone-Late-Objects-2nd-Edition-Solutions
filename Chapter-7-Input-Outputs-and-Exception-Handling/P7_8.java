/**
 * Write a program that replaces each line of a file with its reverse.
 * Of course, if you run Reverse twice on the same file, you get back the original file.
 */
 
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class P7_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("File to read: ");
		String fileToRead = input.next();
		input.close();
		
		ArrayList<String> list = new ArrayList<String>();
		try {
			readAndReverseText(list, fileToRead);
			writeTextToFile(list, fileToRead);
		}
		catch(FileNotFoundException e){
			System.out.println("File not found!");
		}
		
		System.out.println("The text in " + "'" + fileToRead + "'" + " has been successfully reversed.");
	}
	
	public static void readAndReverseText(ArrayList<String> list, String filename) throws FileNotFoundException {
			String text = "";
			Scanner inFile = new Scanner(new File(filename));
			
			while(inFile.hasNextLine()){
				text = inFile.nextLine();
				text = reverse(text);
				list.add(text);
			}
			inFile.close();
	}

	public static void writeTextToFile(ArrayList<String> list, String filename) throws FileNotFoundException {
		PrintWriter outFile = new PrintWriter(filename);
		for(Iterator<String> i = list.iterator(); i.hasNext();){
			outFile.println((String) i.next());
		}
		outFile.close();
	}

	public static String reverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}
}
