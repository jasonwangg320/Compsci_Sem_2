import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Role[] role= new Role[3]; 
		role[0] = new Wizard("joe"); 
		role[1] = new Warrior("moe"); 
		role[2] = new Witch("boe"); 

		System.out.println("Their names are: "); 
		System.out.println(role[0].getName()); 
		System.out.println(role[1].getName()); 
		System.out.println(role[2].getName()); 
	}
}
