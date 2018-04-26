package FlowChartExcercises;

public class GradesResults {

	public static void main(String[] args) {
		
		int Maths;
		int Chemistry;
		int Physics;
		int Total;
		float Per;
		
		Maths = 110;	
	    Physics = 150; 
		Chemistry = 150;
		
		Total = Maths + Physics + Chemistry; 
		Per = Total * 100 / 450;
		
		if(Per >= 90) {
			System.out.println("Mark Obtained " + Total);
			System.out.println("Percentage " + Per);
			System.out.println("A-GRADE");
		}
		if(Per < 90 & Per >= 80) {
			System.out.println("Mark Obtained " + Total);
			System.out.println("Percentage " + Per);
			System.out.println("B-GRADE");
		}
		if(Per < 80 & Per >= 70) {
			System.out.println("Mark Obtained " + Total);
			System.out.println("Percentage " + Per);
			System.out.println("C-GRADE");
		}
		if(Per < 70) {
			System.out.println("Mark Obtained " + Total);
			System.out.println("Percentage " + Per);
			System.out.println("FAIL");
		}
	}

}
  