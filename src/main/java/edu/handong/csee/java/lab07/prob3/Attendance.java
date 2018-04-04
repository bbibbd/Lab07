package edu.handong.csee.java.lab07.prob3;	// name of the package and the directory where the class file will be saved
import java.util.Random;	//import the class 'Random'

/**
 * This class gets name, student's id, year, number of the missed class of the students and print out the result of pass or fail
 * @author KKB
 *
 */
public class Attendance {	//declare the class Attendance


	private String name;	//declare the string variable 'name'
	private int year;	//declare the integer variable 'year'
	private String student_id;	//declare the String variable 'student_id'
	private int missed;	//declare the integer variable 'missed'
	
	/**
	 * the empty constructor to make it possible to instantiate the class with no parameters
	 */
	public Attendance() {	//declare the constructor
		name = "";	//initiate the class variable name to ""
		year=0;	//initiate the class variable year to 0
		student_id="";	//initiate the class variable student_id to ""
		missed=0;	//initiate the class variable missed to 0
	}
	
	public Attendance(String name, int year, String student_id, int missed) {	//declare the constructor
		this.name = name;	//set name to class variable 'name'
		this.year = year;	//set year to class variable 'year'
		this.student_id = student_id;	//set student_id to class variable 'student_id'	
		this.missed = missed;	//set missed to class variable 'missed'
	}
	
	public String getName() {	//declare a getter method
		return name;	//return name
	}

	public int getYear() {	//declare a getter method
		return year;	//return the year
	}

	public String getStudent_id() {	//declare a getter method
		return student_id;	//return the student_id
	}

	public int getMissed() {	//declare a getter method
		return missed;	//return the missed
	}
	
	public void passOrNot(String name, int year, int missed) {	//declare the method
		if(missed>6) {	//if the number of the absence is bigger than 6
			System.out.println("I'm sorry "+ name + ". You fail this course");	//print out the failure massage
			System.out.println("number of absence: "+ missed);	//print out how many the student miss the class
		}
		else	System.out.println("We'll see about the grade, "+name);	//else, print out the massage 
	}
	
	public static void main(String[] args) {	//declare the main method

		Random missed = new Random();	//instantiate Random to missed to randomly generate the number of missed class
		
		Attendance s1 = new Attendance("Jess", 4,"21400999", missed.nextInt(10));		//instantiate s1 and initiate
		Attendance s2 = new Attendance("Kent", 2, "21700111", missed.nextInt(10));		//instantiate s2 and initiate
		Attendance s3 = new Attendance("Lucas", 1, "21833222", missed.nextInt(10));		//instantiate s3 and initiate
		Attendance s4 = new Attendance("Martha", 2, "21733444", missed.nextInt(10));	//instantiate s4 and initiate
		
		Attendance pass = new Attendance();	//instantiate Attendance to pass
		pass.passOrNot(s1.getName(), s1.getYear(), s1.getMissed());	//check pass or fail and print out the result of s1
		pass.passOrNot(s2.getName(),s2. getYear(), s2.getMissed());	//check pass or fail and print out the result of s2
		pass.passOrNot(s3.getName(), s3.getYear(), s3.getMissed());	//check pass or fail and print out the result of s3
		pass.passOrNot(s4.getName(), s4.getYear(), s4.getMissed());	//check pass or fail and print out the result of s4
				
	}

}
