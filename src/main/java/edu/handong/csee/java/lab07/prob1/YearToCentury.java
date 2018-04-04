package edu.handong.csee.java.lab07.prob1;	// name of the package and the directory where the class file will be saved
import java.util.Scanner;	// Import the class 'Scanner'

/**
 * This class will get the year from user and calculate the century.
 * @author KKB
 *
 */
public class YearToCentury{		//Declare the class for public so that any package and class can call this class.
	int year;	//declare class variables so that any method in the class can use this two variables.
	
	/**
	 * This constructor will put user inputed value to the class value 'year'.
	 * @param year
	 */
	public YearToCentury(int year) {	// declare the constructor
		this.year=year;	//get user inputed value and put the class value 'year'
	}
	
	/**
	 * This method converts the year user inputed to century. 
	 * @return
	 */
	public int calc_century() {	//declare the method
		int century;	//declare the local variable 'century'
		if(year%100==0)	century = year/100;	//if year divided by 100 has no remains, century is year divided by 100
		else century = year/100+1;	//if it has remains, century is year divided by 100 plus 1
		return century;	//return the century
	}
	
	/**
	 * This main method gets year from user and print out the result of converting year to century
	 * @param args
	 */
	public static void main(String [] args) {	//declare the main method
		int yr = 0;	//initiate the variable 'yr' to 0
		Scanner keyboard = new Scanner(System.in);	//instantiate the Scanner to keyboard
		
		System.out.print("Input year: ");	//print out this massage to get the year from user
		yr = keyboard.nextInt();	//put user inputed value to the variable 'yr'

		YearToCentury year = new YearToCentury(yr);	//instantiate and initiate the class and the class value to year using constructor
		System.out.println(yr+ "is "+ year.calc_century()+"th century");	//print out the result of the calculation. 
		
	}
}