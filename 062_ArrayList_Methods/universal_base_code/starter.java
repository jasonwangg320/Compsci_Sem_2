import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList; 


class starter {
	public static void toStringArrayList(ArrayList<Integer> a){
		System.out.println("arraylist elements: "); 
		for (int i = 0; i < a.size(); i++){
			System.out.print(a.get(i) + " "); 
		}
		System.out.println(); 
	}
	public static int getArrayListAverage(ArrayList<Integer> b){
		int temp = 0; 
		for (int i = 0; i < b.size(); i++){
			temp = temp + b.get(i); 
		}
		return temp/b.size(); 
	}
	public static int getArrayListMax(ArrayList<Integer> c){
		int max = 0; 
		for (int i = 0; i < c.size(); i++){
			if (max < c.get(i))
				max = c.get(i); 
		}
		return max; 
	}
	public static int getArrayListMin(ArrayList<Integer> d){
		int min = 1000; 
		for (int i = 0; i < d.size(); i++){
			if (min > d.get(i))
				min = d.get(i); 
		}
		return min; 
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in); 
		ArrayList<Integer> arr = new ArrayList<Integer>(); 
		int input = 1;
		while(input == 1){
			System.out.println("Choose a number"); 
				int user = sc.nextInt(); 
			for (int i = 0; i < user; i++){
				arr.add((int)Math.floor(Math.random()*100)); 
			}
			toStringArrayList(arr); 
			System.out.println("max is " + getArrayListMax(arr)); 
			System.out.println("min is " + getArrayListMin(arr)); 
			System.out.println("avg is " + getArrayListAverage(arr)); 
			System.out.println(); 
			System.out.println("Do you wanna go again: 1. for yes 2. for no"); 
				input = sc.nextInt(); 
		}
	}
}


