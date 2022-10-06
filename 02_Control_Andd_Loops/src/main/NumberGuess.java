package main;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	// generate a random number
	// ask the user for the number
	// if the guess>number -> predict less
	// id the guess>number -> predict more
	
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int random = rnd.nextInt(10);
		
		System.out.println("I generated a number, can you guess it");
		System.out.println("Random: " + random);
		
		Scanner input = new Scanner(System.in);
		
		boolean hasWon = false;
		
		int steps = 0;
		
		while(steps<5) {
			
			
			int guess = input.nextInt();
			
			if(guess<random) {
				System.out.println("Higher");
			}else if(guess>random) {
				System.out.println("Lower");
			}else {
				hasWon = true;
				break;
			}
			steps++;
		}
		
		if(hasWon) {
			System.out.println("You win the game");
		}else {
			System.out.println("You ost the game");
		}
		
		
		
	}
	
	
	
}
