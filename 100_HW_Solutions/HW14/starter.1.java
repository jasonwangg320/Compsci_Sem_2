import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Ferret[] yes = new Ferret[5]; 
		yes[0] = new Ferret("moe", 3, true);
		yes[1] = new Ferret("joe", 6, false); 
		yes[2] = new Ferret("boe", 9, true); 
		yes[3] = new Ferret("noe", 10, true); 
		yes[4] = new Ferret("foe", 3, false); 
		
		System.out.println(); 
		yes[0].trick(); 
		yes[1].trick();
		yes[2].trick();
		yes[3].trick();
		yes[4].trick();
		
		System.out.println(); 
		Dog Snoopy = new Dog();						// Default Constructor
		Dog Snoopy2 = new Dog(36);					// Age Constructor
		Dog Snoop3 = new Dog(true);					// Trained Constructor
		Dog Toto = new Dog("Toto");					// Name Constructor
		Dog Clifford = new Dog("Clifford", true);	// Name, Trained Constructor
		Dog Scooby = new Dog("Scooby", 50, false);	// Name, Age, Trained Constructor
		Cat Felix = new Cat("Felix", 100, true);	// Name, Age, Trained Constructor

		System.out.println();
		Clifford.trick();							// Trained trick
		Scooby.trick();								// Untrained trick
		Felix.trick();
	}
}
