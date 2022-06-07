package pkg;

public class Ferret{
    public String name;
    public int age;  
    public boolean trained; 
    
   /* public interface Ferret {
        public String name = ""; 
        public int age = 0;  
        public boolean trained = false; 
    }
    */
    public Ferret(){
        name = ""; 
        age = 0; 
        trained = false; 
        interact(); 
    }
    public Ferret(String name){
        this.name = name; 
        age = 0; 
        trained = false; 
        interact(); 
        }
    public Ferret(boolean trained){
        name = ""; 
        age = 0; 
        this.trained = trained;
        interact(); 
    }
    public Ferret (int age){
        name = ""; 
        this.age = age; 
        trained = false; 
        interact(); 
    }
    public Ferret(String name, boolean trained){
        this.name = name; 
        age = 0; 
        this.trained = trained; 
        interact(); 
    }
    public Ferret(String name, int age, boolean trained){
        this.name = name; 
        this.age = age; 
        this.trained = trained; 
        interact(); 
    }
    public void setName(String name){
        this.name = name; 
    }       	// Sets name of the pet
    public void setAge(int age){
        this.age = age; 
    }            	// Sets age of the pet
    public void setIsTrained(boolean trained){
        this.trained = trained; 
    }// Sets if the pet is trained or not. True if trained.
    public String getName(){
        return name; 
    }            	// Returns name of the pet
    public int getAge(){
        return age; 
    }                  	// Returns age of the pet
    public boolean getIsTrained(){
        return trained; 
    }             // Returns if the pet is trained
    public void interact(){
        System.out.println(name + " ferret fereret's at its owner"); 
    }                 	// This is like bark or meow, say pet name and what they do!
	public void trick(){
	    if (getIsTrained())
	        System.out.println(name + " played dead"); 
	    else 
	       System.out.println(name + " did nothing"); 
	}						// The pet performs a trick if the pet is trained. If not, the pet just acts normal.
}