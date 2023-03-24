package hello;

import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Type a sentence: ");
			String sentence = scanner.nextLine();

			System.out.println("You typed: " + sentence);//안내문구를 띄우고, 센텐스 문장을 띄운다
		}
    }
}
