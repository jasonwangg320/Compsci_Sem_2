package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass implements Creature{
	public boolean dead; 
	public int damage; 
	public String name; 
	public int attack; 

	public BaseClass() {
		dead = false; 
		damage = 0; 
		name = "default"; 
		attack = 0; 
	}

}

