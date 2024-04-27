package test;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Income : ");
		Double income = sc.nextDouble();
		
		System.out.println("Persons Income is : " + income);
		calculateTax(income);
	}
	
	private static void calculateTax(double income) {
		double tax = 0;
		
		if (income <= 50000) {
	        tax = 0;
	    } else if (income <= 100000) {
	        tax = (income - 50000) * 0.1;
	    } else if (income <= 250000) {
	        tax = (100000 - 50000) * 0.1 + (income - 100000) * 0.2;
	    } else {
	        tax = (100000 - 50000) * 0.1 + (250000 - 100000) * 0.2 + (income - 250000) * 0.3;
	    }

	    double surcharge = 0;
	    
	    if (tax > 10000) {
	        surcharge = tax * 0.02;
	    }
	    
	    System.out.println("Tax is : " + tax);
	    System.out.println("Surcharge is : " + surcharge);

	}
}
