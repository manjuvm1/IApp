package Constructor;
import java.io.*;
public class InsurancePolicy {

	public static void main(String[] args) throws IOException {
		String fileName = "H:\\git\\IApp\\InsurancePolicy.txt";
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		String name = br.readLine();
		int insuranceAmt = 0;
		int iPremium = 0;
		InsuranceEngine ie1 = new InsuranceEngine();
		InsuranceEngine ie2 = new InsuranceEngine(name);
		System.out.println("Insurer name : " + ie2.getName(name));
		InsuranceEngine ie3 = new InsuranceEngine(name, insuranceAmt);
		//int iPremium = ie3.insuranceAmt;
		System.out.println("Insurance premium " + iPremium);
	}

}
