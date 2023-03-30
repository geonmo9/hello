package week4;

import java.util.LinkedHashSet;

public class WordCounter {
    public static void main(String[] args) {
        // 1. 문자열 변수 quote에 'The Lord of the Rings'에서 인용한 문장을 저장한다.
        String quote = "A wizard is never late, Frodo Baggins. Nor is he early. He arrives precisely when he means to.";

        // 2. 문자열을 단어 단위로 나눠서 배열 wordArray에 저장한다.
        String[] wordArray = quote.split(" ");

        // 3. LinkedHashSet을 이용해 중복이 없는 단어들만을 저장할 uniqueWords를 선언한다.
        LinkedHashSet<String> uniqueWords = new LinkedHashSet<String>();

        // 4. for 루프를 이용해 모든 단어를 uniqueWords에 추가한다.
        //    toLowerCase() 메소드를 이용해 대소문자를 무시한다.
        for (int i = 0; i < wordArray.length; i++) {
            uniqueWords.add(wordArray[i].toLowerCase());
        }

        // 5. uniqueWords에 저장된 단어의 개수를 uniqueCount 변수에 저장한다.
        int uniqueCount = uniqueWords.size();

        // 6. 총 단어 개수를 출력한다.
        System.out.println("Number of unique words: " + uniqueCount);
    }
}

