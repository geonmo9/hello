package hello;

import java.util.Scanner;//스캐너를 쓰려면 정의를 해야된다

public class TemperatureConverter {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in); //입력한 값을 스캐너란 이름의 메모리에 저장
        
        System.out.print("Enter Fahrenheit temperature: ");//프린트에 안내문구를 띄운다
        double fahrenheit = scanner.nextDouble();//스캐너를 화씨로 옮긴다, 정의 안하면 아래 더블 셀셔스 식에서 에러가 뜬다
       

        double celsius = (5.0 / 9.0) * (fahrenheit - 32.0);//섭시의 정의와 동시에 함수식을 적용한다

        System.out.println("Celsius temperature is: " + celsius);//안내문구를 띄우고, 섭시라는 이름의 실수를 띄운다
    }
}
