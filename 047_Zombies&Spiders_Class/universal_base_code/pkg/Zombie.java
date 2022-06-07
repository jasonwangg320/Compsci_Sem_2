package pkg;
import java.util.Scanner;
import java.util.Random;

public class Zombie implements Creature{
	public String name; 
	public int health; 
	public int attack; 
	public Random rand = new Random();
	
	public Zombie(){
		name = "Zack"; 
		health = rand.nextInt(5) + 5; 
		attack = rand.nextInt(5) + 5; 
	}
		
	public boolean isDead(){
		if (health < 0)
			return true;
		else 
			return false; 
	}
	public boolean takeDamage(int damage){
	health = health - damage; 
	if (isDead()) 
		return true; 
	else  
		return false; 
	}
	public String getName(){
		return  name; 
	}
	public void attack(Role role){
		role.setHealth(role.getHealth() - attack); 
	}
	public void bark(Creature creature){
		System.out.println(creature + " has barked"); 
	}
	public int getHealth(){
		return health; 
	}
	public void setHealth(int health){
		this.health = health; 
	}
}