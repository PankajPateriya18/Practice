package count_words;

import java.util.Scanner;

public class Count_Words {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		
		System.out.println("\nString is : " + s);
		
		s = s.trim();
		
		System.out.println("After Trim : " + s);
		
		String[] words = s.split(" ");
		
		System.out.println("Total Words Are : " + words.length);
		
		int count = 1, i;
		for(i=0; i<s.length()-1; i++) {
			if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ') count++;
		}
		System.out.println("Total Words Are : " + count);
	}
}
