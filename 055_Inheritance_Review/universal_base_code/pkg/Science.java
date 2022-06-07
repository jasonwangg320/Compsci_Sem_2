package pkg;
import java.util.Scanner;
import java.util.Random;


public class Science extends Course{
	private String Field, Teacher;
	private int grade, credit;

	public Science() {
		Field = "deffault"; 
	}
	public Science(String Field){
		this.Field = Field; 
	}
	public Science(String Field, String Teacher, int grade){
		super(Teacher, grade); 
		this.Field = Field; 
		this.Teacher = Teacher; 
		this.grade = grade; 
	}
	
	public String getField(){
		return Field; 
	}
	public int calCredit(){
		if (getField().equals("APSci"))
			grade = grade + 10; 
		else if (getField().equals("RecoverySci")){
			if (grade > 60)
				grade = 100; 
			else 
				grade = 0; 
		}
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

