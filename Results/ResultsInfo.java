package Results;

public class ResultsInfo {

int phy, che, mat;

public void TestResults() {
	int tot = phy + che + mat;
	float per = (float)tot * 100 / 450;
	System.out.println("TOTAL: " + tot);
	System.out.println("PERCENTAGE " + per);
	System.out.println();
}
	
}
