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
		super(instrument);
		this.instrument = instrument;
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
	public void playInstrument(){
		System.out.println(getInstrument() + " is being played differently"); 
	}
	public void practice(){
		super.practice(); 
		System.out.println(name + " has been practicing for " + yearsOfExperience);
	}
	public void perform(){
		super.perform(); 
		System.out.println(name + " is performing very differently"); 
	}
	public void practiceAtUniversity(){
		super.practice();
		System.out.println(" at " + school);
	}
}

