package controlstatements;

public class HandleBreakAndContinue_ForIf {

	public static void main(String[] args) {


		//Break with For Loop
		for(int i = 0; i<=10; i++)
		{
		if((i==6))
		break;
		System.out.println(i);
		}

		System.out.println("Outside the break block");



		//Continue with For Loop
		for(int i = 0; i<=10; i++) {
		if(i==3) {
		continue;
		}
		System.out.println(i);
		}

		System.out.println("Outside the continue block");




		}
}
