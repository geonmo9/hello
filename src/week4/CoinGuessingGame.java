package week4;

import java.util.Scanner;


public class CoinGuessingGame {
    // 사용자 입력을 위한 스캐너 클래스를 가져옵니다.

	public static void main(String[] args) {
        // 사용자 입력을 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 사용자에게 추측을 요청
        System.out.println("추측을 입력하세요 (H는 앞면, T는 뒷면):");

        // 사용자의 추측 읽기
        String userGuess = scanner.nextLine().toUpperCase();

        // 사용자 입력 확인
        while (!userGuess.equals("H") && !userGuess.equals("T")) {
            System.out.println("잘못된 입력입니다. 'H'는 앞면, 'T'는 뒷면을 입력하세요:");
            userGuess = scanner.nextLine().toUpperCase();
        }

        // 무작위 동전 뒤집기 생성 (0 = 앞면, 1 = 뒷면)
        int randomResult = (int) (Math.random() * 2);
        String coinSide = randomResult == 0 ? "H" : "T";

        // 사용자의 추측과 실제 동전 뒤집기 결과 비교


        if (userGuess.equals(coinSide)) {
            System.out.println("맞았습니다.");
        } else {
            System.out.println("틀렸습니다.");
        }

        // 스캐너 닫기
        scanner.close();
    }
}