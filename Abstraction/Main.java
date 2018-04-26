package Abstraction;

public class Main {

	public static void main(String[] args) {
		
		Bank x = new HSBC();
		x.deposit(20);
		x.withdraw(30);
		x.checkBalance(10);
		System.out.println("");
		
		Barclays c = new Barclays();
		c.deposit(10);
		c.withdraw(130);
		c.checkBalance(120);
		c.barclaysgiftCard();
		System.out.println("");
		
		Bank d = new Santander();
		d.deposit(810);
		d.withdraw(230);
		d.checkBalance(120);
		System.out.println("");
		
		
		
			
			
			
			
		
		}

}
