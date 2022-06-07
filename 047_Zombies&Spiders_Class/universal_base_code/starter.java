import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Creature joe = new Zombie(); 
		Creature moe = new Spider(); 
		Role foe = new Witch(); 
		Role noe = new Warrior(); 
		
		while (true) { 
			joe.attack(foe);
			if (foe.isDead()){
				System.out.println("Witch has dead. Creatures win"); 
				break; 
			}
			joe.attack(noe); 
			if (noe.isDead()){
				System.out.println("Warrior has dead. Creatures win"); 
				break; 
			}
			moe.attack(noe); 
			if (noe.isDead()){
				System.out.println("Warrior has dead. Creatues win"); 
				break;
			}
			moe.attack(foe);
			if (foe.isDead()){
				System.out.println("Witch has dead. Creatures win"); 
				break; 
			}
			
			foe.attack(joe);
			if (joe.isDead()){
				System.out.println("Zombie has dead. UnCreatures win"); 
				break;
			}
			foe.attack(moe); 
			if (moe.isDead()){
				System.out.println("Spider has dead. UnCreatures win");
				break; 
			}
			noe.attack(joe);
			if (joe.isDead()){
				System.out.println("Zombie has dead. UnCreatures win");
				break;
			}
			noe.attack(moe); 
			if (moe.isDead()){
				System.out.println("Spider has dead. UnCreatuers win"); 
				break; 
			}
	}
}
}