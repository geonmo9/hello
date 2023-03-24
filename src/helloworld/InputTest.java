package helloworld;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {

		Scanner input;
		
		input = new Scanner(System.in);
	//warning: 문법적으로 문제없는데 바람직하지 않음.
		
		System.out.println("input:");
		
		int ival= input.nextInt();
		
		System.out.println(ival);
		
	}

}
