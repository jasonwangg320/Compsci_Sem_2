package pkg; 
import java.util.ArrayList;

public class OnlinePurchaseManager{
   
   public ArrayList<Gizmo> purchases = new ArrayList<Gizmo>();
   public int counter; 
   public String maker; 
   public boolean isE; 
   public double cost;
   public double min;
   public String temp; 
   public boolean temp2; 
   public double temp3; 
   
   public OnlinePurchaseManager(){
      maker = "default"; 
      isE = false; 
      cost = 0; 
   }
   
   public OnlinePurchaseManager(String a, boolean b, double c){
      maker = a; 
      isE = b; 
      cost = c; 
   }

   public int countElectronicsByMaker(String a){
      counter = 0; 
      for (int i = 0; i < purchases.size(); i++){
         if (purchases.get(i).getMaker() == a && purchases.get(i).isElectronic())
            counter++; 
      }
      return counter; 
   }
   
   public boolean hasAdjacentEqualPair(){
      counter = 0; 
      for (int i = 0; i < purchases.size() - 1; i++){
         if (purchases.get(i).equals(purchases.get(i+1)))
            counter++; 
      }
      if (counter > 0)
         return true; 
      else 
         return false; 
   }
   
   public Gizmo getCheapestGizmoByMaker( String mkr ) {
      min = 1000000000; 
      for (int i = 0; i < purchases.size(); i++){
         if (purchases.get(i).getMaker().equals(mkr) && purchases.get(i).getCost() < min){
            min = purchases.get(i).getCost(); 
         }
      }
      for (int i = 0; i < purchases.size(); i++){
         if (purchases.get(i).getCost() == min)
            return purchases.get(i); 
      }
      return purchases.get(1); 
   }
   
   public void add(String a, boolean b, double c){
      temp = a; 
      temp2 = b; 
      temp3 = c; 
      Gizmo gz = new Gizmo (temp, temp2, temp3); 
      purchases.add(gz); 
   }
   
   
   public String toString()
   {
   	return "" + purchases;
   }
}
