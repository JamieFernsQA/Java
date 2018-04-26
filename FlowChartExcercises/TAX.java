package FlowChartExcercises;

public class TAX {
	
	
	
	public static void main(String[] args) {

	double salary = 18000;
	
	
	if(salary >= 18000) {
		double tax = (salary * 17 / 100);
		System.out.println("SALARY: " + salary);
		System.out.println("TAX: " + tax);
		System.out.println("NET PAY: " + (salary - tax));
		}
	else {
		double tax = (salary * 12 / 100);
		System.out.println("SALARY: " + salary);
		System.out.println("TAX: " + tax);
		System.out.println("NET PAY: " + (salary - tax));
			}
	}
}