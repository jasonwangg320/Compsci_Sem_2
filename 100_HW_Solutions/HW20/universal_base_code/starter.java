import java.util.*;

class starter {
	
	public static void printArray(int[] ok){
		for (int i = 0; i < ok.length; i++){
			System.out.print(ok[i] + " "); 
		}
	}
	
	public static void bubbleSort(int[] a){
		int temp; 
		for (int outer = 0; outer < a.length - 1; outer++){
			for (int inner = 0; inner < a.length - outer - 1; inner ++){
				if (a[inner] > a[inner + 1]){
					temp = a[inner]; 
					a[inner] = a[inner + 1]; 
					a[inner + 1] = temp; 
				}
			}
		}
		printArray(a); 
	}
	
	public static void insertionSort(int[] b){
		int key, inner, outer; 
		for (outer = 1; outer < b.length; outer++){
			key = b[outer]; 
			inner = outer - 1; 
			while (inner >= 0 && b[inner] > key){
				b[inner + 1] = b[inner]; 
				inner--; 
			}
			b[inner + 1] = key; 
		}
		printArray(b); 
	}
	
	public static void selectionSort(int[] c){
		int inner, outer, min; 
		for (outer = 1; outer < c.length; outer++){
			min = outer; 
			for (inner = outer + 1; inner < c.length; inner ++){
				if (c[inner] < c[outer])
					min = outer; 
				int temp = c[inner]; 
				c[inner] = c[outer]; 
				c[outer] = temp; 
			}
		}
		printArray(c); 
	}
	
	public static void main(String args[]) {
		
		int[] joe = new int[100]; 
		int[] boe = new int[100]; 
		int[] moe = new int[100]; 
		
		for (int i = 0; i < 100; i++){
			joe[i] = (int)(Math.random()*100); 
			boe[i] = (int)(Math.random()*100); 
			moe[i] = (int)(Math.random()*100); 
		}
		
		System.out.println("This is bubble sort:"); 
		bubbleSort(joe); 
		bubbleSort(boe); 
		bubbleSort(moe); 
		System.out.println(); 
		System.out.println("This is selection sort:"); 
		selectionSort(joe); 
		selectionSort(boe); 
		selectionSort(moe); 
		System.out.println(); 
		System.out.println("This is insertion sort:"); 
		insertionSort(joe); 
		insertionSort(boe); 
		insertionSort(moe); 
		
		
		
		
	}
}
