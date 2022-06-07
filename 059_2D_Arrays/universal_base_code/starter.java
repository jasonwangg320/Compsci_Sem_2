import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int [][] ok = new int[2][2]; 
		ok[0][0] = 1; 
		ok[0][1] = 2; 
		ok[1][0] = 3; 
		ok[1][1] = 4; 
		
		System.out.println((ok[0][0] + ok[0][1] + ok[1][0] + ok[1][1])/(ok.length * ok[0].length)); 

		
	}
}
