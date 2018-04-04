package edu.handong.csee.java.lab07.prob3;
import java.util.Random;
public class Attendance {


	private String name;
	private int year;
	private String student_id;
	private int missed;
	
	public Attendance() {
		this.name = "";
		this.year=0;
		this.student_id="";
		this.missed=0;
	}
	
	public Attendance(String name, int year, String student_id, int missed) {
		this.name = name;
		this.year = year;
		this.student_id = student_id;
		this.missed = missed;
	}
	
	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public String getStudent_id() {
		return student_id;
	}

	public int getMissed() {
		return missed;
	}
	
	public void passOrNot(String name, int year, int missed) {
		if(missed>6) {
			System.out.println("I'm sorry "+ name + ". You fail this course");
			System.out.println("number of absence: "+ missed);
		}
		else	System.out.println("We'll see about the grade, "+name);
	}
	
	public static void main(String[] args) {

		Random missed = new Random();
		
		Attendance s1 = new Attendance("Jess", 4,"21400999", missed.nextInt(10));
		Attendance s2 = new Attendance("Kent", 2, "21700111", missed.nextInt(10));
		Attendance s3 = new Attendance("Lucas", 1, "21833222", missed.nextInt(10));
		Attendance s4 = new Attendance("Martha", 2, "21733444", missed.nextInt(10));
		
		Attendance pass = new Attendance();
		pass.passOrNot(s1.getName(), s1.getYear(), s1.getMissed());
		pass.passOrNot(s2.getName(),s2. getYear(), s2.getMissed());
		pass.passOrNot(s3.getName(), s3.getYear(), s3.getMissed());
		
				
	}

}
