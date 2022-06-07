package pkg;
import java.util.Scanner;
import java.util.Random;


public class Course {
	private String Teacher; 
	private int grade; 
	private int credit; 

	public Course() {
		Teacher = "greg"; 
		grade = 0; 
		credit = 0; 
	}
	public Course(String Teacher){
		this.Teacher = Teacher; 
		grade = 0; 
		credit = 0; 
	}
	public Course(String Teacher, int grade){
		this.Teacher = Teacher; 
		this.grade = grade; 
		credit = 0; 
	}
	public Course(String Teacher, int grade, int credit){
		this.Teacher = Teacher; 
		this.grade = grade; 
		this.credit = credit; 
	}
	public String getTeacher(){
		return Teacher; 
	}
	public int getGrade(){
		return grade; 
	}
	public int getCredit(){
		return credit; 
	}
	public String toString(){
		return ("Teacher: " + Teacher + ", Credit: " + credit); 
	}
	public boolean equals(Course other){
		if (!(other instanceof Course))
			return false; 
		else 
			return this.getTeacher() == other.getTeacher(); 
	}
	
	public int calCredit(){
		if (grade >= 100)
			credit = credit + 5; 
		else if (grade >= 90)
			credit = credit + 4; 
		else if (grade >= 80)
			credit = credit + 3; 
		else if (grade >= 70)
			credit = credit + 2; 
		else if (grade >= 60)
			credit = credit + 1; 
		else if (grade < 60)
			credit = credit + 0; 
		return credit; 
	}

}

