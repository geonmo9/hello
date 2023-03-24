package week2;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		System.out.println("Input Number");
		try (Scanner input = new Scanner(System.in)) {
			int num = input.nextInt();
			
			if (num%2 == 1) {
				System.out.println("Odd Number");	
			}
			else {
				System.out.println("Even Number");
			}
		}
	}

}
