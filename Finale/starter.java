import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static int getMedian(int[]a){
		if (a.length%2 == 0)
			return ((a[a.length / 2 - 1] + a[a.length / 2]) / 2); 
		return a[(a.length / 2)]; 
		
		if (a.length%2 == 1) 
			return ((a[a.length / 2])); 
	}
	
	public static int getMode(int[]b){
		int eachNumber = 0; 
		int frequency  = 0; 
		int occurance =1; 
		int temptemp = 1; 
		int comparing = 1; 
		int tempMedian = 0; 
		
		while (eachNumber < b.length){
			while (frequency < b.length) {
				if (b[eachNumber] == b[frequency])
					occurance++; 
				frequency++;
			}
			if (occurance > comparing ){
				comparing  = occurance; 
				tempMedian = b[eachNumber]; 
			}
			//value of mode if there are more than 1
			//if occurance of index is more --> mode is new index
			eachNumber++; 
		}
		return tempMedian; 
	}
	
	public static int getMode { 
		int mode, modeVal; 
		for(int x = 0; x < arr.length; x ++) { 
			int count = 0; 
			for (int y = 0; y < arr.length; y++){ 
				if (arr[x] == arr[y])
					count++
			}
			if (mode < count){
				mode = count; 
				modeVal = arr[x]; 
			}
			
		
		
	public static void main(String args[]) {
		// Your code goes below here
		//BaseClass test = new BaseClass();
		int [ ] arr4 = {1, 2, 3, 4, 5, 6, 7};
		int [ ] arr5 = {1, 2, 3, 4, 5, 6};
		System.out.println(getMedian(arr4)); 
		System.out.println(getMedian(arr5)); 
		int [ ] arr1 = {2, 7, 4, 3, 8, 5, 5, 3, 5, 6};	
		int [ ] arr2 = {2, 7, 9, 7, 1, 7, 2, 8, 2};
		int [ ] arr3 = {2, 6, 4, 5, 3, 8, 9, 1};
		System.out.println(getMode(arr1)); 
		System.out.println(getMode(arr2)); 
		System.out.println(getMode(arr3)); 
	}
}
