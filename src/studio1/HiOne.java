package studio1;

import java.util.Scanner;

public class HiOne {

	/**
	 * Says hello to the supplied argument
	 */
	public static void main(String[] args) {

		Scanner inputname = new Scanner(System.in);
		System.out.print("Enter your name here: ");
		String name = inputname.nextLine();
		//
		// Below this line, enter code so that this program's output says
		//      Hi, Pat.  How are you?
		// if the value of name is "Pat"
		//
	    System.out.print("Hi, " + name + ". How are you?");

	}

}
