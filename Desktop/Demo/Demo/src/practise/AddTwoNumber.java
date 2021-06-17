package practise;

import java.util.Scanner;

public class AddTwoNumber {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int no1 = sc.nextInt();
		System.out.println("Enter the second number");
		int no2 = sc.nextInt();
		int add = no1 + no2;
		System.out.println("Addition = "+ add);
	}
}
