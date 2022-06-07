package pkg;
import java.util.Scanner;
import java.util.Random;

public class Witch implements Role { 
	public String name; 
	public int health; 
	public int attack; 
	public Random rand = new Random(); 
	
	public Witch(){ 
		name = "default"; 
		health = rand.nextInt(15) + 1; 
		attack = rand.nextInt(15) + 1; 
	} 
	public Witch(String name){
		this.name = name; 
		health = rand.nextInt(15) + 1; 
		attack = rand.nextInt(15) + 1; 
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
	public boolean attack(Creature creature){ 
		this.attack = rand.nextInt(attack - 1) + 1; 
		creature.setHealth(creature.getHealth() - attack); 
		if (creature.getHealth() < 0)
			return true;
		else	
			return false; 
	}
	public boolean isDead(){
		if (health < 0)
			return true;
		else 
			return false; 
	}
}

