import pkg.*;
import java.util.Scanner;
import java.util.Random;


class BatteryCharger {
	private int[] rateTable' 
	
	private int getChargingCost(int startHour, int chargeTime){
		int total = 0; 
		int nextDay = (startHour + chargeTime) - 23; 
		if (nextday =< 0){
			for (int i = startHour; i < (startHour + chargeTime);i++)
				total = total + rateTable[i]; 
		} 
		else { 
			for (int i = startHour; i <= 23; i++)
				total = total + rateTable[i]; 
			for (int i = 0; i < nextday - 1; i++)
				total = total + rateTable[i]; 
		}
		return total; 
	}
	
	public int getChargeStartTime(int chargeTime){
		int min = 100000000000000;
		int temp;  
		for (int i = 0; i <= 23; i++){
			temp = getChargingCost(i, chargeTime); 
			if (temp < min)
				min = temp; 
		}
		return min; 
	}
}
