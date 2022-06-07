package pkg;
import java.util.Scanner;
import java.util.Random;


public class Apprentice extends Musician{
	public String school; 
	public int yearsOfExperience; 
	
	public Apprentice() {
		school = "CVHS"; 
		yearsOfExperience = 0; 
	}
	public Apprentice (String school, int yearsOfExperience){
		this.school = school; 
		this.yearsOfExperience = yearsOfExperience; 
	}
	public Apprentice (String instrument, String school, int yearsOfExperience){
		super.instrument = instrument; 
		this.school = school; 
		this.yearsOfExperience = yearsOfExperience; 
	}
	public Apprentice (String name, int age, String instrument, String school, int yearsOfExperience){
		super(name, age, instrument); 
		this.name = name; 
		this.age = age; 
		this.instrument = instrument; 
		this.school = school; 
		this.yearsOfExperience = yearsOfExperience; 
	}
	public void playInstruments(){
		super.playInstrument(); 
	}
	public void practiceAtUni(){
		super.practiceAtUniversity(); 
	}
	public String toString(){
		String hi = " name is " + name +", instrument is " + instrument + ", university is " + school;
		return hi; 
	}
}

 