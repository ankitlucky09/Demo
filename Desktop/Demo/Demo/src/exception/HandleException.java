package exception;

public class HandleException {

	public static void main(String[] args) {
		
		/*	
			//Arithmetic Exception
			int var1 = 10;
			int var2 = 0;
			int res = var1/var2;
			System.out.println(res);
			System.out.println("Hello Exception");		
		*/	
			
			/*
			//Arithmetic Exception Handling - Way I
			int var1;
			int var2;
			try {
				var1 = 10;
				var2 = 0;
				int res = var1/var2;
				System.out.println(res);
				System.out.println("Not excuted");
			} catch (Exception e) {
				System.out.println("Exception is caught");
				//e.printStackTrace();
			}
			System.out.println("Exception Bypassed");	
			*/
			
			/*
			//Arithmetic Exception Handling - Way II
			int var1;
			int var2;
			try {
				var1 = 10;
				var2 = 0;
				int res = var1 / var2;
				System.out.println(res);
			} catch (ArithmeticException e) {
				System.out.println("Exception is caught");
			}
			System.out.println("Exception Bypassed");		
			*/
			
			
			/*
			//Array Exception
			int[] num = {1,2,3};
			System.out.println(num[4]);
			*/
			
			/*
			//Array Exception Handling
			try {
				int[] num = {1,2,3};
				System.out.println(num[4]);
			}
			catch (Exception e)
			{
			
				System.out.println("Exception is caught");
				
			}
			System.out.println("Exception Bypassed");
			*/
			
			/*
			//Finally Handling
			try {
				int[] num = {1,2,3};
				System.out.println(num[4]);
			}
			catch (Exception e)
			{
				System.out.println("Exception Bypassed");
			}
			finally {
				System.out.println("Finally block executed");
			}
			*/
			
			
			
			// Multiple Exceptions Handling
			try
			{
				int [] arr = new int [2];
				
				arr[0] = 10/0;
				arr[0] = 10;
				arr[1] = 20;
			System.out.println(arr[4]);
			}
			catch(ArithmeticException e1)
			{
				System.out.println("Arithmetic Exception is caught");
			}
			catch(ArrayIndexOutOfBoundsException e2)
			{
				System.out.println("Array Exception is caught");
			}
			
			System.out.println("Try-Catch bypassed");
			
		}

}
