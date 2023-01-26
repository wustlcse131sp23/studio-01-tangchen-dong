package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner inputname = new Scanner(System.in);
		System.out.print("Enter the 1st person's name: ");
		String s0 = inputname.nextLine();
		System.out.print("Enter the 2nd person's name: ");
		String s1 = inputname.nextLine();
		System.out.print("Enter the 3rd person's name: ");
		String s2 = inputname.nextLine();
		System.out.print("Enter the 4th person's name: ");
		String s3 = inputname.nextLine();
		System.out.print("Greetings, " + s0 + ", " + s1 + ", " + s2 + ", and " + s3 + ".");
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
