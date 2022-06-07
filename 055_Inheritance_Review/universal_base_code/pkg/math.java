package pkg;
import java.util.Scanner;
import java.util.Random;


public class math extends Course{
	String difficulty, Teacher; 
	int grade; 

	public math() {
		difficulty = "difficult"; 
	}
	public math(String difficulty){
		this.difficulty = difficulty; 
	}
	public math(String difficulty, String Teacher, int grade){
		super(Teacher, grade); 
		this.Teacher = Teacher; 
		this.difficulty = difficulty; 
		this.grade = grade; 
	}
	

}

