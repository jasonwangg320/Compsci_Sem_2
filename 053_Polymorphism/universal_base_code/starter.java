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
		
		hi[0].perform(); 
		hi[0].practice(); 
		
		((Musician)hi[1]).perform();
		((Performer)hi[1]).practice(); 
		
		((Apprentice)hi[2]).practiceAtUni(); 
		((Apprentice)hi[2]).playInstruments(); 
		
		((Actor)hi[3]).monologue(); 
		((Actor)hi[3]).perform(); 
		
		


		
	}
}
