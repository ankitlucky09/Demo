package array;

public class Handle1DArrayLoop {

	public static void main(String[] args) {


		//Array with For loop(int array)
		int[] arr1 = {10,20,30};


		for(int i=0; i<3; i++)
		{
		System.out.println(arr1[i]);
		}


		//OR


		for(int i=0; i<arr1.length; i++)
		{
		System.out.println(arr1[i]);
		}


		//OR


		//For-Each
		for(int element : arr1)
		{
		System.out.println(element);
		}



		//Array with For loop(string array)
		String [] arrData = {"alpha","beta","gamma","delta","sigma"};

		for(int i=0; i<arrData.length; i++)
		{
		System.out.println(arrData[i]);
		}


		//OR


		for(String keyword : arrData)
		{
		System.out.println(keyword);
		}



		//Copy all values from array1 to array2
		int [] arr2 = {1, 2, 3, 4, 5};
		int [] arr3= arr2;
		System.out.println(arr3.length);
		for(int j=0; j<arr3.length; j++)
		{
		System.out.println(arr3[j]);
		}


		//For-Each with If-Else
		int[] array = {10,20,30};
		for(int element : array)
		{
		if(element==10) {
		System.out.println("Yes");
		}
		else {
		System.out.println("No");
		}
		}

		}
}
