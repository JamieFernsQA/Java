package Abstraction;

public class Santander extends Bank {
	
	public void deposit(int a){
		System.out.println("You have deposited  £" + a + " by Santander payment" );
				
	}

	
	public void withdraw(int b) {
		
		System.out.println("You have withdrew  £" + b + " by Santander Withdrawal" );
	}

	
	public void checkBalance(int c) {
		
		System.out.println("You have  £" + c + " in your Santander Account" );
	}

}
