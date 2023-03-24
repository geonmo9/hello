package hello;

public class ExPrintStarts {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			for (int j = 0; j<10; j++) {
				System.out.print("*");//println으로하면 줄바꿈이 되어서 안됨.
			}
			System.out.println("");
		}
	}

}
	
