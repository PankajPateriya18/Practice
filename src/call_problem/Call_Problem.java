package call_problem;

import java.util.Scanner;

public class Call_Problem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number of Calls : ");
		int calls = sc.nextInt();
		
		float charge = 0.0f;
		
		if(calls <= 100);
		else if(calls <= 200) {
			charge = (calls-100) * 90;
		}
		else if(calls <= 400) {
			charge = (100 * 90) + ((calls-200) * 80);
		}
		else {
			charge = (100 * 90) + (200 * 80) + ((calls-400) * 70);
		}
		
		System.out.println("\nTotal Charge is : " + charge);
	}
}
