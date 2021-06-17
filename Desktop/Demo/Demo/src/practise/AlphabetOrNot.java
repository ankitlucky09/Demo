package practise;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter anything");
		char i = sc.next().charAt(0);
		if( (i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z'))
            System.out.println("Alphabet");
        else
            System.out.println("Not an alphabet");
	}
}
