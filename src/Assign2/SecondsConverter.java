package Assign2;

public class SecondsConverter {
    public static void main(String[] args) {
        int seconds = 100000;
        int minutes = seconds / 60;
        int hours = minutes / 60;
        int days = hours / 24;
        int years = days / 365;
        int remainingDays = days % 365;
        int remainingHours = hours % 24;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " seconds is equivalent to:");
        System.out.println(years + " years, " + remainingDays + " days, " + remainingHours + " hours, " +
                remainingMinutes + " minutes, and " + remainingSeconds + " seconds.");

        if (seconds > 31536000) {
            System.out.println("100000 seconds is more than 1 year.");
        } else {
            System.out.println("100000 seconds is less than or equal to 1 year.");
        }
    }
}

/*이 프로그램에서는 먼저 초를 정수 변수로 정의합니다 seconds. 그런 다음 초를 각 시간 단위(예: 분당 60초, 시간당 60분, 하루 24시간)의 적절한 초 수로 나누어 분, 시간, 일 수를 계산합니다. 또한 일수를 365로 나누어 년 수를 계산합니다.

그런 다음 모듈로 연산자(%)를 사용하여 남은 일, 시, 분, 초를 계산하여 적절한 단위 수로 나눈 나머지를 얻습니다. 문장을 사용하여 결과를 출력합니다 System.out.println().

if마지막으로, 초가 1년(분당 60초, 시간당 60분, 하루 24시간, 1년 365일이 있으므로 31536000초)보다 큰지 확인하는 문을 사용합니다 . 그렇다면 100000초가 1년 이상이라는 메시지를 인쇄합니다. 그렇지 않으면 1년 이하라는 메시지를 인쇄합니다.*/