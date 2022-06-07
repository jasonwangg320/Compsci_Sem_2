import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void main(String args[]) {
		// Your code goes below here
		Warrior joe = new Warrior(); 
		Wizard moe = new Wizard(); 
		Witch boe = new Witch(); 		
		System.out.println("Warrior: " + joe.getName()); 
		System.out.println("Health: " + joe.getHealth());
		System.out.println("Wizard: " + moe.getName()); 
		System.out.println("Health: " + moe.getHealth());
		System.out.println("Witch: " + boe.getName()); 
		System.out.println("Health: " + boe.getHealth());

		
	}
}
