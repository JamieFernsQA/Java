package TimesTableForLoops;

public class TimesTableFor {
	
		public void TimesTable1() {
		
		int a = 1;
		int Number = 2;
		System.out.println("Times Table of " +  Number);
		System.out.println("-------------------------------------------------------");
		for (;a <= 10; a += 1) {
		System.out.println(Number + " x " + a + " = " + (Number*a));
						}
		
	}
	public void TimesTable2(int Number) {
		
		int a = 1;
		System.out.println("Times Table of " + Number );
		System.out.println("-------------------------------------------------------");
		for (;a <= 10; a += 1) {
		System.out.println(Number + " x " + a + " = " + (Number*a));
						}
		
	}
			
	public void TimesTable3(int Number, int Range ) {
			
			int a = 1;
			System.out.println("Times Table of " + Number + " In the range of " + Range);
			System.out.println("-------------------------------------------------------");
			for (;a <= Range; a += 1) {
			System.out.println(Number + " x " + a + " = " + (Number*a));
							}
				
	}

}
