package controlstatements;

public class Handle_ForLoop {

	public static void main(String[] args) {

		//Scenario 1 //Print 0 to 10
		for(int i = 0; i<=10; i++)
		{
		System.out.println(i);
		}



		//Scenario 2 //Print 10 to 0
		for(int j = 10; j>=0; j--)
		{
		System.out.println(j);
		}



		//Scenario 3 //Print 1 to 10 except 5
		for(int k = 1; k<=10; k++)
		{
		if(k !=5)
		{
		System.out.println(k);
		}
		}



		//Scenario 4 //Print 1 to 10 except 5 & 7
		for(int l = 1; l<=10; l++)
		{
		if((l !=5) && (l !=7))
		{
		System.out.println(l);
		}
		}


		//Scenario 5
		for(int i = 1; i<=10; i=i+3)
		{
		System.out.println(i);
		}


		}
}
