package practise;

import java.util.Scanner;

public class RepetativeCharacterInAString {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		int length = s.length();
		char[] ch = s.toCharArray();
		int count = 0;
		for(int i=0 ; i<length; i++) {
			
				if(ch[i]==ch[i+1])
				{
					//a = a + i;
					System.out.println("The repeatitive values are "+ ch[i] + "it is printing the value ");
					break;
				}
				
			}
		}
	}

