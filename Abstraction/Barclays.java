package Abstraction;

public class Barclays extends Bank { 
	public void deposit(int a){
		System.out.println("You have deposited  £" + a + " by Barclays payment" );
				
	}

	
	public void withdraw(int b) {
		
		System.out.println("You have withdrew  £" + b + " by Barclays Withdrawal" );
	}

	
	public void checkBalance(int c) {
		
		System.out.println("You have  £" + c + " in your Barclays Account" );
	}
	public void barclaysgiftCard() {
		
		System.out.println("You have a Barclays gift card");
	}
	

}
