package pkg;
import java.util.Scanner;
import java.util.Random;


public class Combinatorics {
	public static int factorial(int n){
		if (n != 1) {
			for(int i = n-1, i < n, i--)
				n = n * i; 
			return n; 
		}
		return n; 
	}

}
