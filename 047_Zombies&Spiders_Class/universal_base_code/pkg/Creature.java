package pkg;
import java.util.Scanner;
import java.util.Random;

public interface Creature{ 
	public boolean isDead(); 
	public boolean takeDamage(int damage); 
	public String getName(); 
	public void attack(Role role); 
	public void bark(Creature creature); 
	public int getHealth(); 
	public void setHealth(int health); 
}
