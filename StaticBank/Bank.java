package StaticBank;

public class Bank {
	
	static int Dollar = 20;
	
	
	public static void SetDollar(int Set) {
		Dollar = Set;
		}
	
	public void Counter(int amount) {
		int Total = (Dollar * amount);
		System.out.println("$ " + Total);
		}
	


}
