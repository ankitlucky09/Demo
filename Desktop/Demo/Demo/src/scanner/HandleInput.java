package scanner;

import java.util.Scanner;

public class HandleInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// taking string input
		System.out.println("Enter any String data");
		// String stringdata = scanner.nextLine();
		String stringdata = scanner.next();

		System.out.println(stringdata);

		// taking integer input
		System.out.println("Enter any integer data");
		int integerdata = scanner.nextInt();
		System.out.println(integerdata);

		// taking floating input
		System.out.println("Enter any floating data");
		float floatingdata = scanner.nextFloat();
		System.out.println(floatingdata);

		// taking Character input
		System.out.println("Enter any Character data");
		char character = scanner.next().charAt(2);// minimum 3 value
		System.out.println(character);

		//taking boolean input
		System.out.println("Enter any boolean data");
		boolean bool = scanner.nextBoolean();
		System.out.println(bool);
		
		scanner.close();

	}
}
