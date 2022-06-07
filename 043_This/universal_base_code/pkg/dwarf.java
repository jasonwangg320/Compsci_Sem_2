package pkg;
import java.util.Scanner;
import java.util.Random;


public class dwarf {
	public String name; 
	public int age; 

	public dwarf() {
		name = ""; 
		age = 0; 
	}
	
	public dwarf(String name, int age){ 
		this.name = name; 
		this.age = age; 
	}
	public void setAge(int age){
		this.age = age; 
	}
	public void setName(String name){
		this.name = name; 
	}
	public String getName() {
		this.name = name; 
		return name; 
	}
	
	public boolean isSameName(String name) {
		if (this.name.equals(name))
			return true;
		return false; 
 
	}
	
}

