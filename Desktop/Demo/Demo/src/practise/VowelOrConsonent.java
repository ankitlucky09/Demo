package practise;

import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		String str = sc.next();
		
		if(str == "a" || str == "e" || str == "i" || str == "o" || str == "u")
		{
			System.out.println("The enter value is a Vowel");
		}
		else if(str == "A" || str == "E" || str == "I" || str == "O" || str == "U")
		{
			System.out.println("The enter value is a Vowel");
		}
		else
			System.out.println("The enter value is Consonent");
	}
}
