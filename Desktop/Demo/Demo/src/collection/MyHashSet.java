package collection;

import java.util.HashSet;

public class MyHashSet {

	public static void main(String[] args) {
		
		//String HashSet
		HashSet<String> cars = new HashSet<String>();
		
		//Adding items to HashSet		(It does not include duplicate values, unordered)
		cars.add("VOLVO");
		cars.add("BMW");
		cars.add("Ecosport");
		cars.add("Volvo");
		cars.add("Volvo");
		cars.add("1");
		cars.add("1.5");
		System.out.println(cars);
		
		
		//Access item from HashSet
		//get() method is not here
		
		
		//Check item in HashSet
		System.out.println(cars.contains("BMW"));
		
		//Change item in HashSet
		//set() method is not here
		
		//HashSet Size
		System.out.println(cars.size());
		
		//For Loop does not work here as index does not exist
				
		//For-Each Loop
		for (String i : cars) {
			System.out.println(i);
			}
		
		//Sorting does not work here
				
		//Reversing does not work here
		
		//Remove item from HashSet
		cars.remove("Ecosport");
		System.out.println(cars);
		
		
		//Remove HashSet
		cars.clear();
		System.out.println(cars);
		
		
		//Integer HashSet
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(10);
	    numbers.add(15);
	    numbers.add(20);
	    System.out.println(numbers);
	   
		
	    
		//Double HashSet
	    HashSet<Double> decnumbers = new HashSet<Double>();
		decnumbers.add(10.1);
	    decnumbers.add(15.1);
	    decnumbers.add(20.1);
	    System.out.println(decnumbers);
	    

		//Multiple data HashSet
		HashSet<Object> multiData = new HashSet<Object>();
		multiData.add("John");
		multiData.add('b');
		multiData.add(15);
		multiData.add(20.5);
		multiData.add(true);
	    System.out.println(multiData);
		
	   
		
	}
}
