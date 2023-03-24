package week2;

import java.util.Scanner;

public class LabContinue {

	public static void main(String[] args) {
	
		
		for (int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				if(i==5) {
					continue;
				}
			
				System.out.println("i" +"*"+ "j"+"=" + i*j  );
			}
			
		}

	}

}
