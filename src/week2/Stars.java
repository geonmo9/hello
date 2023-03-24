package week2;

public class Stars {

	int i, j;
	
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
		
			for (int j = 5-i; j>0; j--){
				System.out.print("*");
			}
		
			System.out.println("");
		}

	}
}
	


//한줄이 내려갈때마나 한개씩 줄어들음. 처음값을 5로 두고 i가1이면 4가되고.. 빈칸이 늘어난다?
//두번쨰포문에서 바깥에 아이변수를 연결시키는 방법
//세번째 공백을 문자로 출력을 하는것 : 공백을 비우면 별표하나가 나옴?