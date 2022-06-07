import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int[] pie = new int[200]; 
		int temp; 
		
		for (int i = 0; i < 200; i++){
			pie[i] = (int)(Math.random()*200); 
		}
		
		for (int outer = 0; outer < pie.length - 1; outer++){
			for (int inner = 0; inner < pie.length - outer - 1; inner++){
				if (pie[inner] > pie[inner + 1]){
					temp = pie[inner +1]; 
					pie[inner + 1] = pie[inner]; 
					pie[inner] = temp; 
				}
			}
		}
		
		for (int i = 0; i < 200; i++){ 
			System.out.print(pie[i] + " ");
		}


		
	}
}
