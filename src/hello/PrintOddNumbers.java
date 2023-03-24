package hello;

import java.util.Scanner;

public class PrintOddNumbers {
	public static void main(String[] args) {
		System.out.println("Input Number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int i =0;
		while (i<num) {
			System.out.println("Rule #"+i+2);
			i = i+1;
		}
		
		
	}

}
//출력을 바꾸면 됨