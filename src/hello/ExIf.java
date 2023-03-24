package hello;

import java.util.Scanner;

public class ExIf {

	public static void main(String[] args) {
		System.out.println("Input Number:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		if (num>0) {
			System.out.println("positive number");
		}
		System.out.println("End!");
		
	}

}
