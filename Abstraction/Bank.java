package Abstraction;

public abstract class Bank {
	
	abstract public void deposit(int a);
	abstract public void withdraw(int b);
	abstract public void checkBalance(int c);
	public void message() {
		System.out.println("Hello my friends");				
	}
	public void Go() {
		System.out.println("Bye");
	}
	

}
