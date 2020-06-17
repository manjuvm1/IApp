package Constructor;

public class InsuranceEngine {
	private int insuranceAmt;
	private String name;
	private String insName;
	
	public void setName(String name) {
		name = this.name;			
	}
	
	public String getName(String name) {
		return this.name;
	}

		InsuranceEngine() {
			System.out.println("Welcome to Insurance portal..!");
		}
		
		InsuranceEngine(String name) {
			this.name = "Steve";
		//	System.out.println("Insurer name : " + name);
		}
		
		InsuranceEngine(String name, int insuranceAmt) {
			this.name = name;
			this.insuranceAmt = insuranceAmt;
			insuranceAmt /= 12;
			System.out.println("InsuranceAmt in constructor");
			System.out.println("Insurer Name : " + this.name + " Premium amount : " + this.insuranceAmt);
		}
}
