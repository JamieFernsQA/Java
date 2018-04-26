package TimesTable;

public class TimesTableMethods {
	
public void TimesTable1() {
		
		int a = 1;
		int Number = 2;
		System.out.println("Times Table of " + Number);
		System.out.println("-------------------------------------------------------");
		while (a <= 10) {
			System.out.println(Number + " x " + a + " = " + (Number*a));
			a += 1;
		}
						
	} 
	
	
public void TimesTable2(int Number, int Range ) {
		
		int a = 1;
		System.out.println("Times Table of " + Number + " In the range of " + Range);
		System.out.println("-------------------------------------------------------");
		while (a <= Range) {
			System.out.println(Number + " x " + a + " = " + (Number*a));
			a += 1;
		}
						
	} 
	
	
	public void TimesTable3(int Number, int Range ) {
		
		int a = 1;
		System.out.println("Times Table of " + Number + " In the range of " + Range);
		System.out.println("-------------------------------------------------------");
		while (a <= Range) {
			System.out.println(Number + " x " + a + " = " + (Number*a));
			a += 1;
		}
						
	} 

}
