import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int[] pie = new int [200]; 
		int key, outer, inner; 
		
		for (int i = 0; i < 200; i++){
			pie[i] = (int)(Math.random()*200); 
		}
		
		for (outer = 1; outer < pie.length; outer++){
			key = pie[outer]; 
			inner = outer - 1; 
			
			while (inner >= 0 && pie[inner] > key){
				pie[inner + 1] = pie[inner]; 
				inner = inner - 1; 
			}
			pie[inner + 1] = key; 
		
		}
		
		for (int i = 0; i < pie.length; i++){
			System.out.print(pie[i] + " "); 
		}
		
	}
}
