package main;

public class ArrayExample {

	public static void main(String[] args) {
		
		// arrays are fixed sized mutable datastructures
		
		int[] numberArray = {2,3,4,5,6};
		
		System.out.println(numberArray[2]);
		
		numberArray[2] = 10;
		
		System.out.println(numberArray[2]);
		
		// enhanced for loops or foreach loop
		
		System.out.println("---------------------");
		
		for(int num: numberArray) {
			System.out.println("number: " + num);
		}
		
		
	}
	
	
	
	
}
