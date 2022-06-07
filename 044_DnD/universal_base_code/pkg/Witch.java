package pkg;
import java.util.Scanner;
import java.util.Random;


public class Witch {
	public String name; 
	public int health; 
	public int attack; 
	public Random rand = new Random(); 
	
	public Witch() {
		name = "Default"; 
		health = rand.nextInt(15) + 1;
		attack = rand.nextInt(15) + 1; 
	}
	public Witch(String name){ 
		this.name = name; 
		health = rand.nextInt(15) + 1;; 
		attack = rand.nextInt(15) + 1;; 
	} 
	public void setHealth(int health){ 
		this.health = health; 
	}
	public int getHealth(){
		return health; 
	}
	public String getName(){
		return name;
	}
	public void attack(Warrior joe){
		this.attack = rand.nextInt(attack-1) + 1; 
		joe.setHealth(joe.getHealth() - attack); 
		System.out.println("You did " + attack + " damage"); 
	}
	public void attack(Wizard moe){ 
		this.attack = rand.nextInt(attack-1) + 1; 
		moe.setHealth(moe.getHealth() - attack); 
		System.out.println("You did " + attack + " damage"); 
	}
}

