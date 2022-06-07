import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Apprentice joe = new Apprentice(); 
		Apprentice foe = new Apprentice("Hello", 69); 
		Apprentice noe = new Apprentice("Tuason", 37); 
		Apprentice poe = new Apprentice("Idk", 21, "flute","GCC", 3); 
		
		joe.playInstrument(); 
		foe.practice(); 
		noe.perform();
		poe.practiceAtUniversity();
		
	}
}
