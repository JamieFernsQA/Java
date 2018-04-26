package GradesExcercise;

public class GradesAndAverages {

	public static void main(String[] args) {
		
		
		int Maths;
		int Chemistry;
		int Physics;
		int Total;
		float Per;
		
		Maths = 90;	
	    Physics = 70; 
		Chemistry = 80;
		
		Total = Maths + Physics + Chemistry;
		Per = Total * 100 / 450;
		
		System.out.println("Mark Obtained " + Total);
		System.out.println("Percentage " + Per);
		
		
		

	}

}


