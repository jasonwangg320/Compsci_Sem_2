package pkg;
import java.util.Scanner;
import java.util.Random;


public class Actor extends Performer {
	String type; 

	public Actor () {
		type = "theater"; 
	}
	public Actor (String name, String type){
		super.getName();
		this.name = name; 
		this.type = type; 
	}
	public void practice(){
		System.out.println(name + " is fake practicing"); 
	}
	public void perform(){
		System.out.println(name + " is not performing"); 
	}
	public void monologue(){
		System.out.println("I'm Moby goddamn Dick"); 
	}

}

