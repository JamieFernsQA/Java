package NumbersToWords;

public class ClassesToCall {
	
	
	    private String Ones(int a) {
		
		String Word = "";
		switch(a) {
		case 1: Word = "One"; break;
		case 2: Word = "Two"; break;
		case 3: Word = "Three"; break;
		case 4: Word = "Four"; break;
		case 5: Word = "Five"; break;
		case 6: Word = "Six"; break;
		case 7: Word = "Seven"; break;
		case 8: Word = "Eight"; break;
		case 9: Word = "Nine"; break;
		case 10: Word = "Ten"; break;
		case 11: Word = "Eleven"; break;
		case 12: Word = "Twelve"; break;
		case 13: Word = "Thirteen"; break;
		case 14: Word = "Fourteen"; break;
		case 15: Word = "Fifteen"; break;
		case 16: Word = "Sixten"; break;
		case 17: Word = "Seventeen"; break;
		case 18: Word = "Eighteen"; break;
		case 19: Word = "Nineteen"; break;
		}
		return Word;
	    }
		
		
		    private String TY(int a){
			String Word = "";
			switch(a){
			case 20: Word = "Twenty"; break;
			case 30: Word = "Thirty"; break;
			case 40: Word = "Forty"; break;
			case 50: Word = "Fifty"; break;
			case 60: Word = "Sixty"; break;
			case 70: Word = "Seventy"; break;
			case 80: Word = "Eighty"; break;
			case 90: Word = "Ninety"; break;
			}
			return Word;
			}
		 		
		public void PrintWord(int d){
			 String Answer = "";
			 if(d >= 1000) {
			    Answer = Ones(d/1000) + " Thousand ";
				d = d -((d/1000) * 1000);
				System.out.print(Answer);
			    }
			if(d >= 100) {
				 Answer = Ones(d/100) + " Hundred ";
				 d = d -((d/100) * 100);
				 System.out.print(Answer);
				}
			if(d >= 20 ) {
				Answer = TY(d/10*10) + " "; 
				d = d -((d/10) * 10);
				System.out.print(Answer);
			}
			if(d <20) {
				Answer = Ones(d);
				System.out.print(Answer);
			}
		
			
				
		}
				
	}


