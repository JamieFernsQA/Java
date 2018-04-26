package SecondDayMorning;

public class NestedIfStatement {

	public static void main(String[] args) {
		
		int no = 265;
		if(no > 500) { 
		System.out.println("A");
		if(no > 1000) {	System.out.println("B");} 
		else{System.out.println("C");}
		}
		else {System.out.println("D"); 
		if (no > 200) { System.out.println("F");}
		else {System.out.println("E");} 
		}
	}

}

