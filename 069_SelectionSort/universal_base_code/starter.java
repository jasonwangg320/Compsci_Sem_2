import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int [] pie = new int[200]; 
		int inner, outer, min; 
		
		for (int i = 0; i < 200; i++){
			pie[i] = (int)(Math.random()*200); 
		}
		
		for (outer = 0; outer < pie.length; outer++){
			min = outer; 
			for (inner = outer + 1; inner < pie.length; inner++){
				if (pie[inner] < pie[min])
					min = inner; 
			}
			int temp = pie[outer]; 
			pie[outer] = pie[min]; 
			pie[min] = temp; 
		}
		for (int i = 0; i < pie.length; i++)
			System.out.print(pie[i] + " "); 
		
			

		
	}
}
