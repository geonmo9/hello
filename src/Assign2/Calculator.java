package Assign2;

import java.util.Scanner;
//계산기를 만들기 위해 scanner 선언하고, main 안에 변수도 선언한다
//정수 2개를 연산하기 위해 필요한 2개의 변수와 1개의 연산자를 입력하라는 안내문을 출력한다.
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//scanner 클래스 객체 생성

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();//사용자로부터 입력받은 정수를 변수 num1 에 저장

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();//사용자로부터 입력받은 정수를 변수 num2 에 저장

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = input.next().charAt(0); //저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환합니다.
        double result = 0.0;

        switch(operator) {
            case '+':
                result = num1 + num2; // case '+' 에 결과를 할당 합니다 . 이 문은 switch 문을 종료하고 코드가 다음 사례를 실행하지 못하도록 하는 데 사용됩니다.
                break;
            case '-':
                result = num1 - num2; //연산자가 이면 -첫 번째 숫자에서 두 번째 숫자를 빼고 결과를 인쇄합니다.
                break;
            case '*':
                result = num1 * num2; //연산자가 이면 *두 숫자를 곱하고 결과를 인쇄합니다.
                break;
            case '/':
                result = num1 / (double) num2; // 연산자가/ 이면 두 번째 숫자가 0이 아니면 첫 번째 숫자를 두 번째 숫자로 나누고 결과를 인쇄합니다.
                break;
                
            default:
                System.out.println("Invalid operator"); //두 번째 숫자가 0인지 나누기 오류를 방지합니다.
                System.exit(0);
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}

