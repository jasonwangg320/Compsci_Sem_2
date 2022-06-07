import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random(); 
		int nameT; 
		String name = "";  
		int age; 
		dwarf[] idk = new dwarf[100]; 
		for (int i = 0; i < 100; i++){
			idk[i] = new dwarf(); 
			nameT = rand.nextInt(6); 
			if (nameT == 0)
				name = "Sleepy"; 
			else if (nameT == 1)
				name = "Dopey"; 
			else if (nameT == 2) 
				name = "Doc"; 
			else if (nameT == 3) 
				name = "Happy"; 
			else if (nameT == 4)
				name = "Bashful"; 
			else if (nameT == 5)
				name = "Sneezy"; 
			else if (nameT == 6)
				name = "Grumpy"; 
			age = rand.nextInt(100) + 1; 
			idk[i].setAge(age); 
			idk[i].setName(name); 
		}
		for (int i = 0; i < 100; i++)
			System.out.println(idk[i].getName() + " " + idk[i].getAge()); 
	}
}
