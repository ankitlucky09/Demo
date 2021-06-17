package controlstatements;

public class HandleIfElse {

	public static void main(String[] args) {


		//Scenario 1
		int a = 100, b=50;
		if(a>b)
		{
		System.out.println("true");
		}
		else
		{
		System.out.println("false");
		}


		//Scenario 2
		int c = 30, d=30;
		if(c>d)
		{
		System.out.println("true");
		}
		else
		{
		System.out.println("false");
		}



		//Scenario 3
		int x = 5, y = 0;
		int z = x/y;
		if(z == 5) {
		System.out.println("Inside If");
		}
		else
		{
		System.out.println("Inside Else");
		}

		System.out.println("Outside the if-else block");
		}
}
