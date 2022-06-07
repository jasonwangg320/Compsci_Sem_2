import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>(); 
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		removeDup(arr1);
		System.out.println(); 
		System.out.println(); //Create this method.
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(((int)(Math.random()*100)));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	public static ArrayList<Integer> removeDup(ArrayList<Integer> arr1){
		for (int x = 0; x < arr1.size(); x ++){
			for (int i = 0; i < arr1.size(); i++){
				if (arr1.get(x) == arr1.get(i) && x != i){
					arr1.remove(i); 
					i--; 
				}
			}
		}
		return arr1; 
	}
}
