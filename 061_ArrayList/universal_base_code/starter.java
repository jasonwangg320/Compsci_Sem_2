import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList; 


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();5
		
		Scanner sc = new Scanner(System.in); 
		ArrayList<String> cookies = new ArrayList<String>(); 
		System.out.println("How many cookies do you want?"); 
			int input = sc.nextInt(); 
		for (int i = 0; i < input; i++){
			cookies.add("cookies"); 
		}	
		System.out.print("cookies: "); 
		for (int i = 0; i < input; i++){
			System.out.print(cookies.get(i) + " "); 
		}
	
		
	}
}
