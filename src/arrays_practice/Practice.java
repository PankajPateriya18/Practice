package arrays_practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int size = sc.nextInt();
		System.out.println("Enter Array Elements");
		int[][] arr = new int[size][size];
		int i, j;
		for(i=0; i<size; i++) {
			for(j=0; j<size; j++) {
				System.out.print((i+1)+"-"+(j+1)+" element : ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		
	}
}
