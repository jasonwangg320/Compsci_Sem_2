package pkg;
import java.util.Scanner;
import java.util.Random;


public class CombinedTable {
	public static int seats; 
	public static double desirability; 
	
	public CombinedTable() {
		seats = 0;
		desirability = 0; 
	}
	public CombinedTable(SingleTable t1, SingleTable t2){
		seats = (t1.getNumSeats() + t2.getNumSeats()) - 2; 
		desirability = 0; 
	}
	public static boolean canSeat(int party){
		if (seats >= party)
			return true; 
		return false; 
	}
	public static double getDesirability(){
		if (t1.getHeight() + t2.getHeight())
			desirability = (t1.getViewQuality() + t2.getViewQuality()) / 2; 
		else 
			desirability = ((t1.getViewQuality() + t2.getViewQuality ) / 2) - 10; 
		return desirability; 
	}

}

