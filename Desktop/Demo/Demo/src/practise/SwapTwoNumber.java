package practise;

import java.util.Scanner;

public class SwapTwoNumber {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number no1 = ");
		int no1 = sc.nextInt();
		System.out.println("Enter the second number no2 = ");
		int no2 = sc.nextInt();
		int temp = no2;
//		temp = no2;
		no2 = no1;
		no1 = temp;
		System.out.println("The swapped value is no1, no2 "+ no1 + " " + no2);
	}

}
