package pkg;
import java.util.Scanner;
import java.util.Random;


public class Musician extends Performer{
	public String instrument; 
	
	public Musician(){
		instrument = "Cello"; 
	}
	public Musician(String instrument){
		this.instrument = instrument; 
	}
	public Musician(String name, String instrument){
		super(name); 
		this.name = name; 
		this.instrument = instrument; 
	}
	public Musician(String name, int age, String instrument){ 
		super(name,age); 
		this.name = name; 
		this.age = age; 
		this.instrument = instrument; 
	}
	public String getInstrument(){
		return instrument; 
	}
	public void playInstrument(){
		System.out.println(getInstrument() + " is being played"); 
	}
	public void practice(){
		System.out.println(name + " is practicing and has been for the past 3 years"); 
	}
	public void perform(){
		System.out.println(name + " is performing differently"); 
	}
}

