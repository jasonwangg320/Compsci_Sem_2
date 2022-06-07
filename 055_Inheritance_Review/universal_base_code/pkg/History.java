package pkg;
import java.util.Scanner;
import java.util.Random;


public class History extends Course{
	String Teacher; 
	int era, grade; 

	public History() {
		era = 0; 
	}
	public History(int era){
		this.era = era; 
	}
	public History (int era, String Teacher, int grade){
		super(Teacher, grade); 
		this.era = era; 
		this.Teacher = Teacher; 
		this.grade = grade;
	}

}

