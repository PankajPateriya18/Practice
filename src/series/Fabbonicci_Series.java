package series;

import java.util.Scanner;

public class Fabbonicci_Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Range : ");
		int range = sc.nextInt();
		
		int i, a=0, b=1, c;
		System.out.print("Fabbonicci Series is : ");
		for(i=1; i<=range; i++) {
			System.out.print(a + " ");
			c = a+b;
			a = b;
			b = c;
		}
		sc.close();
	}
}
