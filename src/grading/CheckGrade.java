package grading;

import java.util.Scanner;

public class CheckGrade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		
		char grade='F';
		
		if(n >= 80) grade='A';
		else if(n >= 60) grade='B';
		else if(n >= 50) grade='C';
		else if(n >= 45) grade='D';
		else if(n >= 25) grade='E';
		else grade='F';
		
		System.out.println("Student Grade is : " + grade);
		sc.close();
	}
}
