package FlowChartExcercises;

public class Salary {

	public static void main(String[] args) {
		float vat;
		float salary;
		
		salary = 15000;
		
		if (salary < 1000)  {
			 vat = 0;
			 System.out.println("VAT is £ " + vat);
		} 
		if(salary >= 1000 & salary < 2000){
			vat = salary * 10 / 100;
			System.out.println("VAT is £ " + vat);
				}
		if(salary >= 2000 & salary < 3000){
			vat = salary * 15 / 100;
			System.out.println("VAT is £ " + vat);
		
	}
		if(salary >= 3000 & salary < 4000){
			vat = salary * 17 / 100;
			System.out.println("VAT is £ " + vat);
		
	}
		if(salary >= 4000){
			vat = salary * 19 / 100;
			System.out.println("VAT is £ " + vat);
		
	}

}
}
