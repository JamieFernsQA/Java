package AccountsProceduresMethods;

public class Main {

	public static void main(String[] args) {
		
		Accounts A = new Accounts();
		int Salary = 1100;
		float NetSalary = Salary - A.VAT(1000);
		System.out.println("Salary: " + Salary);
		System.out.println("VAT: " + A.VAT(Salary));
		System.out.println("Net Salary: " + NetSalary);
		
	}

}
