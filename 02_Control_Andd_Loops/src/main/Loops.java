package main;

public class Loops {
	
	
	public static void main(String[] args) {
		
		//for(incrementer)
		//while
		//do while
		
		for(int i=0;i<10;i++) {
			System.out.println("i is " + i);
		}
		
		/*
		while(CONDITION) {
			
		}
		*/
		
		int i = 0;
		
		while(i<10) {
			
			System.out.println("i is " + i);
			i++;

		}
		
		// break and continue
		
		while(i<10) {
			
			System.out.println("i is " + i);
			i++;
			
			if(i==5) break;

		}
		
		
		
		
		
	}

}
