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
	Musician poe = new Musician("poe", "kazoo"); 
	Musician noe = new Musician("noe", 4, "piano"); 
	
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
	System.out.println(); 
	poe.getName();
	poe.practice();
	poe.getInstrument(); 
	System.out.println(); 
	noe.getName(); 
	noe.perform();
	noe.playInstrument(); 
	}
}
