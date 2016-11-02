/**
 * Write a program that reads a file containing two columns of floating-point numbers.
 * Prompt the user for the file name. Print the average of each column.
 */
 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P7_4 {
	static double sumOfFirstCol = 0;
	static double sumOfSecondCol = 0;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Read from file: ");
		String fileToRead = input.next();
		input.close();

		try {
			Scanner inFile = new Scanner(new File(fileToRead));

			int arrSize = 10;
			int count = 0;
			
			double[] numbers = new double[arrSize];
			double[] firstColumn = new double[arrSize/2];
			double[] secondColumn = new double[arrSize/2];

			for(int i = 0; i < arrSize; i++) {
				numbers[i] = inFile.nextDouble();
			}
			
			inFile.close();

			for(int i = 0; i < arrSize/2; i++) {
				System.arraycopy(numbers, count, firstColumn, i, 1);
				count+=2;
			}

			count = 1;
			for(int i = 0; i < arrSize/2; i++) {
				System.arraycopy(numbers, count, secondColumn, i, 1);
				count+=2;
			}

			sumOfCols(firstColumn, secondColumn);
			printCols(firstColumn, secondColumn);
			System.out.println("Average of column 1: " + sumOfFirstCol / firstColumn.length);
			System.out.println("Average of column 2: " + sumOfSecondCol / secondColumn.length);
		}
		catch(FileNotFoundException e) {
			System.err.println("File not found!");
		}
	}

	public static void printCols(double[] firstCol, double[] secondCol) {
		System.out.println("\nCol 1:\t Col 2:");
		for(int i = 0; i < firstCol.length; i++) {
			System.out.print(firstCol[i]);
			System.out.println("\t " + secondCol[i] );
		}
		System.out.println();
	}

	public static void sumOfCols(double[] firstCol, double[] secondCol) {
		for(double i : firstCol) {
			sumOfFirstCol += i;
		}
		
		for(double i : secondCol) {
			sumOfSecondCol += i;
		}
	}
}

