package PriceAndVat;

public class ThirdExcercise {

	public static void main(String[] args) {
		
		int QTY;
		float Price;
		
		QTY = 15;
		Price = 1.75f;
		
		System.out.println("Product: 7UP");
		System.out.println("Quantity: " + QTY);
		System.out.println("Unit Price: " + Price);
		System.out.println("Total Amount: " + "£ " + QTY * Price);
		System.out.println("VAT: " + "£ " + (QTY * Price) * 15 / 100);
		System.out.println("----------------------------------------");
		System.out.println("Net Amount: " + "£ " + ((QTY * Price) - (QTY * Price) * 15 / 100 ));
        
	} 

}
