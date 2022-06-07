import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Course[] jeff = new Course[3]; 
		
		jeff[0] = new Science ("APSci", "Platty Daddy", 85); 
		jeff[1] = new math ("hard", "Daddy Greg", 90); 
		jeff[2] = new History (1900, "Hall", 73); 
		
		System.out.println(jeff[0].getTeacher() + ": " +  jeff[0].calCredit() + " credits"); 
		System.out.println(jeff[1].getTeacher() + ": " + jeff[1].calCredit() + " credits"); 
		System.out.println(jeff[2].getTeacher() + ": " + jeff[2].calCredit() + " credits"); 


		
	}
}
