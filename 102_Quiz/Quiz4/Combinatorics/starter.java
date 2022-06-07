import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static int factorial(int n){
		if (n != 1) {
			for(int i = n-1, i > 0, i--)
				n = n * i; 
			return n; 
		}
		return n; 
	}
	
	public static void numCombinations(int n, int r){
		int answer; 
		if (r > n)
			System.out.println("this is not possible because it is impossible to choose " + r " items from " + n + " choices"); 
		else {
			answer = factorial(n) / (factorial(r) * factorial(n-r)); 
			System.out.println("There are " + answer + " different ways to choose " + r + " items from " + n + " choices"); 
		}
			
			
			
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();


		
	}
}
