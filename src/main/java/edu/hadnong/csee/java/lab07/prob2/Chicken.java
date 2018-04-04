package edu.hadnong.csee.java.lab07.prob2;	// name of the package and the directory where the class file will be saved

/**
 * This Class will print out the information of the menu of chickens, prices and evaluations
 * @author KKB
 *
 */
public class Chicken {	//declare the class named Chicken
	
	
	private String name;	//declare the string variable 'name' to get the name of the chicken
	private double price;	//declare the double variable 'price' to get the price of the chicken
	private int stars;		//declare the integer value 'stars' to get evaluations of the chicken
	
	public Chicken(String name, double price, int stars) {	//declare the constructor
		this.name = name;	//put the name to the class variable 'name'
		this.price = price;	//put the price to the class variable 'price'
		this.stars = stars;	//put the rating to the class variable 'stars'
	}
	
	public String getName() {	//declare the getter method
		return name;	//return the name value
	}

	public double getPrice() {	//declare the getter method
		return price;	//return the price value
	}

	public int getStars() {	//declare the getter method
		return stars;	//return the stars value
	}
	
	public void setStars(int stars) {	//declare the setter method
		this.stars = stars;	//set the stars to the class value 'stars'
	}
	
	public static void main(String[] args) {	//declare the main method
		Chicken menu1 = new Chicken("Cheese_mustard",16000.00,5);	//instantiate and initiate menu 1
		Chicken menu2 = new Chicken("Honey_mustard",16000.00,5);	//instantiate and initiate menu 2
		Chicken menu3 = new Chicken("Spicy_chicken",16000.00,1);	//instantiate and initiate menu 3
		
		menu1.setStars(3);	//set the stars 3 to menu1
		menu2.setStars(4);	//set the stars 4 to menu2
		menu3.setStars(1);	//set the stars 1 to menu3
		
		System.out.println(menu1.getName()+"'s rating is "+ menu1.getStars());	//print out the rating of menu1	
		System.out.println(menu2.getName()+"'s rating is "+ menu2.getStars());	//print out the rating of menu2
		System.out.println(menu3.getName()+"'s rating is "+ menu3.getStars());	//print out the rating of menu3
		
	}

}
