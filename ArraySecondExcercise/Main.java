package ArraySecondExcercise;

public class Main {

	public static void main(String[] args) {
		
		int[] numArray = {83, 44, 17, 13, 96, 14, 39, 56, 49, 14, 86};
		
		int max = 0;
		int maxtwo = 0;
		int maxthree = 0;
		
		for(int a = 0,b = 0,c = 0; a < numArray.length; a++,b++,c++) {
			if (numArray[a] > max) {
			 max = numArray[a];
			}			
			if(numArray[b] > maxtwo & numArray[b] < max) {
				maxtwo = numArray[b];
			}
				if(numArray[c] > maxthree & numArray[c] < maxtwo) {
					maxthree = numArray[c];
		}
	}	
		System.out.println("Largest number is " + max);
		System.out.println("Second Largest number is " + maxtwo);
		System.out.println("Third Largest number is " + maxthree);
				
				
			}

	}
		
			 	
		
	
	
		
	
	
	
	
	
		
		
	

