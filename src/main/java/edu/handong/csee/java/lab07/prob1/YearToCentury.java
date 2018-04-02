package edu.handong.csee.java.lab07.prob1;
import java.util.Scanner;

public class YearToCentury{
	int year;
	
	public YearToCentury() {
		year=0;
	}
	
	public YearToCentury(int year) {
		this.year=year;
	}
	
	public int calc_century() {
		int century;
		if(year%100==0)	century = year/100;
		else century = year/100+1;
		return century;
	}
	
	public static void main(String [] args) {
		int yr = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Input year: ");
		yr = keyboard.nextInt();

		YearToCentury year = new YearToCentury(yr);
		System.out.println(yr+ "is "+ year.calc_century()+"th century");
		
	}
}