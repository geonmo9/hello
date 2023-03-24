package week2;

	public class Star2 {

		   public static void main(String[] args) {

			   int i, j;
		      for(i = 1; i < 6; i++) 
		      {               
		         for(j = 1; j < 6; j++) 
		         {
		            if(i+j >= 6) 
		            {
		               System.out.print("*");
		            }
		            else 
		            {
		               System.out.print(" ");
		            }
		            
		         }System.out.println("");
		      }
		   }

		}