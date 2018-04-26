package ArrayFirstExcercise;

public class Main {

	public static void main(String[] args) {
		
		int[] numArray = {23, 44, 77, 13, 96, 14, 39, 56, 49, 14, 36};
		
		int max = 0;
		
		for(int a = 0; a < numArray.length; a++) {
						 
			 if (numArray[a] > max) {
				 max = numArray[a];
			 }
		}  
			 	 System.out.println(max);
		}
			
		}
		
	

