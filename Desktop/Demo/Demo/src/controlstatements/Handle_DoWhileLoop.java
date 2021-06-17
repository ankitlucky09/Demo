 package controlstatements;

public class Handle_DoWhileLoop {

	public static void main(String[] args) {



		//Scenario 1 //Print 1 to 10
		int i = 1;
		do
		{
		System.out.println(i);
		i++;
		} while(i<=10);



		//Scenario 2 //Print 10 to 1
		int j = 10;
		do
		{
		System.out.println(j);
		j--;
		}while(j>=1);



		//Scenario 3 //Print 1 to 10 except 5
		int k = 1;
		do
		{
		if(k !=5)
		{
		System.out.println(k);
		}
		k++;
		}while(k<=10);



		//Scenario 4 //Print 1 to 10 except 5 and 7
		int l = 1;
		do
		{
		if((l !=5) && (l !=7))
		{
		System.out.println(l);
		}
		l++;
		}while(l<=10);






		}
}
