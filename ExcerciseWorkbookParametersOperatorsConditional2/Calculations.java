package ExcerciseWorkbookParametersOperatorsConditional2;

public class Calculations {
	
	public void sum(int x, int y, boolean z) {
		
		for (int a = 0; a <= 10; a++) {
		
		
		if(x == 0) {
			
			System.out.println(y);
		}
		else if(y == 0 ) {
			
			System.out.println(x);
			
		}
		
		else if(z == true) {
		System.out.println(x + y);
		
	}
		else {
			System.out.println(x * y);
		
		}
		}
}
	
}	


