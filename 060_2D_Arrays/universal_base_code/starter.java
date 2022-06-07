import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static Scanner sc = new Scanner (System.in); 
	
	public static void rowAvg(int[][]a){
		double total = 0.0; 
		for (int x = 0; x < a.length;  x++){
			for (int y = 0; y < a[0].length; y++){
				total = total + a[x][y]; 
			}
			System.out.println("avg row " + x + ": " + total/a[0].length); 
			total = 0; 
		}
	}
	
	public static void avgAvg(int[][]b){
		double total = 0.0; 
		double counter = 0.0; 
		for (int x = 0; x < b.length; x++){
			for (int y = 0; y < b[0].length; y++){
				total = total + b[x][y]; 
				counter++; 
			}
		}
		System.out.println("The average average is " + total/counter);
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();

		System.out.println("Choose a number");
			int user = sc.nextInt(); 
		System.out.println("Choose another number"); 
			int user2 = sc.nextInt(); 
		int arr[][] = new int[user][user2]; 
		int variable = 0; 
		int integer = 0; 
		for (int x = 0; x < user; x++){
			for (int y = 0; y < user2; y++){
				variable = (int)(Math.random()*10) + 1; 
			//	integer = (int) variable; 
				arr[x][y] = variable; 
			}
		}
		for (int i = 0; i < arr.length; i++){
			for (int x = 0; x < arr[0].length; x++)
				System.out.print(arr[i][x] + " "); 
			System.out.println(); 
		}
		rowAvg(arr); 
		avgAvg(arr); 
		
	}
}
