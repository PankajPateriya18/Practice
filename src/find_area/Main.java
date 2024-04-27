package find_area;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\t1 Rectangle");
			System.out.println("\t2 Circle");
			System.out.print("Chose Option : ");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1 : System.out.print("Length : ");
			         int l = sc.nextInt();
			         System.out.print("Breath : ");
			         int b = sc.nextInt();
			         Rectangle r = new Rectangle();
			         r.setLength(l);
			         r.setBreath(b);
			         r.area();
			}
		}while(true);
	}
}
