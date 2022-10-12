package main;

public class Calculator {

	//method signature: makeSum(int, int)
	int makeSum(int num1, int num2) {
		return num1+num2;
	}
	
	double makeSum(double num1, int num2) {
		return num1+num2;
	}
	
	
	//makeSum method is overloaded
	int makeSum(int x, int y, int z) {
		return x+y;
	}
	
	
}
