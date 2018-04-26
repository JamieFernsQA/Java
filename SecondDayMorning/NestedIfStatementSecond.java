package SecondDayMorning;

public class NestedIfStatementSecond {

	public static void main(String[] args) {
		
		int no = 99;
		if(no > 1000 ){
			System.out.println("A");
				if(no > 5000) {
					System.out.println("B"); 
					if(no > 7000) {
						System.out.println("C");
						}
					else {System.out.println("D");
					}
					}
						else {System.out.println("E");
						}
						}
		    else {System.out.println("1");{
		    		if(no > 500) {
		    			System.out.println("6");
		    			if(no > 700) {
		    				System.out.println("8");
		    			}
		    			else {
		    				System.out.println("7");
		    			}
		    			System.out.println("9");
		    		}
		    		else {System.out.println("2"); 
		    		if(no > 100){System.out.println("4");
		    		}
		    		else {System.out.println("3");}
		    		System.out.println("5");
		    		}
		    		System.out.println("10");
					}
		}
		}
	    }
	

	
