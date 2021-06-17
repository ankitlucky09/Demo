package casting;

public class TypeCasting {

public static void main(String[] args) {
		

		//Int to Float(Automatic)
		int num1 = 10;
		float fnum1 = num1;
		System.out.println(num1);
		System.out.println(fnum1);
		
		
		//Int to Double
		int num2 = 10;
		double dnum2 = num2;
		System.out.println(num2);
		System.out.println(dnum2);
		
		//Float to Int(Manual)
		float fnum2 = 15.5f;
		int num3 = (int)fnum2;
		System.out.println(fnum2);
		System.out.println(num3);
		
		//Double to Int
		double dnum4 = 15.5;
		int num4 = (int) dnum4;
		System.out.println(dnum4);
		System.out.println(num4);
		
		//Int to Long
		int num5 = 10;
		long lnum1 = num5;
		System.out.println(num5);
		System.out.println(lnum1);
		
		//Long to Int
		long lnum2 = 10;
		int num6 = (int)lnum2;
		System.out.println(lnum2);
		System.out.println(num6);
		
		//Char to Int will give Ascii code for the character
		char ch = 'c';
		int num7 = ch;
		System.out.println(ch);
		System.out.println(num7);
		
		//Int to String
		int num8 = 14;
		String str = String.valueOf(num8);
		System.out.println(num8);
		System.out.println(str);
		
		//String to Int conversion cannot be done
				
	}
}
