package string;

public class HandleString {
	
	public static void main(String[] args) {

		// Print String
		System.out.println("Hello String");
		System.out.println("Testing" + 1 + 1);//anything after the string will be treated as a string
		System.out.println(1 + 1 + "Testing");
		System.out.println(1 + 1 + "Testing" + 1 + 1);

		// String Variable
		String str = "How are you";
		System.out.println(str);

		String concate = "How" + "are" + "you";
		System.out.println(concate);

		// String Data Concatenation I
		String x = "Java";
		String y = "Programming";
		System.out.println(x + y); // Concatenation Operator(+)
		System.out.println(x.concat(y)); // Concatenation Method(concat)

		// String Data Concatenation II
		String firstName = "John";
		String lastName = "Well";
		System.out.println(firstName + " " + lastName);

		// String Data Concatenate III
		String str1 = "10";
		String str2 = "20";
		System.out.println(str1 + str2);

		// String Lowercase
		String lowercase = str.toLowerCase();
		System.out.println(lowercase);

		// String Uppercase
		String uppercase = str.toUpperCase();
		System.out.println(uppercase);

		// String Replace
		System.out.println(str.replace('u', 'e'));

		// Alphabet Location Value
		System.out.println(str.indexOf('w'));

		// String Length
		System.out.println(x.length());

		// String Comparison
		String str3 = "AUTOMATION";
		String str4 = "TESTING";
		String str5 = "testing";

		System.out.println(str3 == str4); // Relational Operator(==)
		System.out.println(str3.equals(str4)); // Equals Method(equals)
		System.out.println(!str3.equals(str4));
		System.out.println(str4.equals(str5));

		System.out.println(str4.equalsIgnoreCase(str5));

	}
}
