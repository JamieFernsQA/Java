package Results;

public class ResultsMain {

	public static void main(String[] args) {
		
		ResultsInfo Charles, Sam;
		
		Charles = new ResultsInfo();
		Charles.che = 100;
		Charles.mat = 120;
		Charles.phy = 90;
		Charles.TestResults(); 
		
		Sam = new ResultsInfo();
		Sam.che = 120;
		Sam.mat = 120;
		Sam.phy = 110;
		Sam.TestResults();
		
		
		
	}

}
