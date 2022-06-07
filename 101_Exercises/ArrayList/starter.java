import java.util.*;

class starter {
	//Methods go here

	public static void printArrayList(ArrayList<Integer> a){
		for (int i = 0; i < a.size(); i++)
			System.out.println(a.get(i)); 
	}
	
	public static void addValuesArrayList(int a, ArrayList<Integer> b){
		Random rand = new Random(); 
		for (int i = 0; i < a; i++)
			b.add(rand.nextInt(100) + 1); 
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in); 
	//	Random rand = new Random(); 
		ArrayList<Integer> arr = new ArrayList <Integer>(); 
		System.out.println("How many values do you wanna add"); 
			int input = sc.nextInt(); 
		addValuesArrayList(input,arr); 
		printArrayList(arr); 

	}
}
