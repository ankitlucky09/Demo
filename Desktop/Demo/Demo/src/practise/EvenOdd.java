package practise;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();
		
		if(number%2 == 0)
		{
			System.out.println("The number is Even");
		}
		else
			System.out.println("The number is Odd");
		sc.close();
	}
}
