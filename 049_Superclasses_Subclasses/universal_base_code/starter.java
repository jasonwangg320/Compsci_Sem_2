import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Performer moe = new Performer(); 
	Performer joe = new Performer("joe", 69); 
	
	Musician boe = new Musician();
	Musician roe = new Musician("pickle"); 
	
	moe.getName(); 
	moe.practice(); 
	System.out.println(); 
	joe.getName(); 
	joe.practice(); 
	System.out.println(); 
	boe.getName(); 
	boe.perform(); 
	boe.playInstrument(); 
	System.out.println(); 
	roe.practice();
	roe.getInstrument(); 
	}
}
