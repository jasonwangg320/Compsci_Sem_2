package pkg;

public class Gizmo { 
   
   public String maker; 
   public boolean isE; 
   public double cost; 
   
   public Gizmo (){
      maker = "default"; 
      isE = false; 
      cost = 0; 
   }
   
   public Gizmo (String a, boolean b){
      maker = a; 
      isE = b; 
      cost = 0; 
   }
   public Gizmo (String a, boolean b, double c){
      maker = a; 
      isE = b; 
      cost = c; 
   }
   
   public String getMaker(){
         return maker; 
   }
   public double getCost(){
      return cost; 
   }
   
   public boolean isElectronic(){
      return isE; 
   }
   
   public String toString()   {
   	return "" + maker + " " + isE + " " + cost;
   }
}
