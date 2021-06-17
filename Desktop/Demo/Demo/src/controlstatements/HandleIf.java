package controlstatements;

public class HandleIf {

	public static void main(String[] args) {


		//Single Condition

		//E.g. 1
		if(true) {
		System.out.println("Hi");
		}

		//E.g. 2
		if(false) {
		System.out.println("bye");
		}


		//Positive
		int a = 10, b=5, c=3;

		if(a<b)
		{
		System.out.println("true");
		}


		//Negative
		int d = 5, e = 10;

		if(!(d>e))
		{
		System.out.println("true");
		}


		//Compound Condition

		if((a>b) && (a>c))
		{
		System.out.println("true");
		}

		//Using equals() method

		String month1 = "jan";
		if(month1.equals("jan"))
		{
		System.out.println("Month is January");
		}

		//Using relational(==) operator

		int month2 = 2;
		if(month2==2)
		{
		System.out.println("Month is February");
		}



		}
}
