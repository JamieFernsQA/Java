package Interface;

public class HSBC implements Bank {
	
	public void deposit(int a){
		System.out.println("You have deposited  £" + a + " by HSBC payment" );
				
	}

	
	public void withdraw(int b) {
		
		System.out.println("You have withdrew  £" + b + " by HSBC Withdrawal" );
	}

	
	public void checkBalance(int c) {
		
		System.out.println("You have  £" + c + " in your HSBC Account" );
	}
	}


