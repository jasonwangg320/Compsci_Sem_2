import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Performer[] hi = new Performer[4]; 
		
		hi[0] = new Performer(); 
		hi[1] = new Musician();
		hi[2] = new Apprentice(); 
		hi[3] = new Actor(); 

		for (int i = 0; i <= 3; i++){
			for (int z = 0; z <= 3; z++){
				if (i != z) {
					if (hi[i].equals(hi[z])){
						System.out.println(hi[i].getName() + " is the same as " + hi[z].getName()); 
					}
				}
			}
		}
		
	}
}
