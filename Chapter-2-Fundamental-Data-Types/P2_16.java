import java.util.Scanner;

/**Write a program that reads in an integer and breaks it into a sequence of individual digits. 
 * For example, the input 19384 is display as 
 * 	1 6 3 8 4 
 * You may assume that the input has no more than five digits and is not negative
 */

public class P2_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type a five digit number: ");
		int integer = input.nextInt();
		input.close();
		
		int firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit;
		
		fifthDigit = integer % 10;
		integer = integer / 10;
		fourthDigit = integer % 10;
		integer = integer / 10;
		thirdDigit = integer % 10;
		integer = integer / 10;
		secondDigit = integer % 10;
		firstDigit = integer / 10;
		
		System.out.printf("%d %d %d %d %d", firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit);
	}

}
