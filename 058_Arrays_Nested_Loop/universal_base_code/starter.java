import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static Scanner sc = new Scanner(System.in); 
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
	System.out.println("Give me width of box"); 
		int width = sc.nextInt(); 
	System.out.println("Give me height of box"); 
		int height = sc.nextInt(); 
		sc.nextLine(); 
	System.out.println("Give me a character"); 
		String ok = sc.nextLine();
		
	for (int i = 0; i < height; i++)
		for (int x = 0; x < width -1; x++){
			System.out.print(ok+ " "); 
			if (x == width - 2) 
				System.out.println(ok); 
		}
		
	}
}
