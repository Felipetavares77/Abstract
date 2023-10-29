package entities;

public class LegalPerson extends TaxPayer{
	
	public int workerNumber;
	
	public LegalPerson() {
		super();
	}
	

	public LegalPerson(String taxPayerName, double annualIncome, int workerNumber) {
		super(taxPayerName, annualIncome);
		this.workerNumber = workerNumber;
	}

	public int getWorkerNumber() {
		return workerNumber;
	}

	public void setWorkerNumber(int workerNumber) {
		this.workerNumber = workerNumber;
	}


	@Override
	public double taxCalc() {
		double tax;
		if(workerNumber <= 10) {
			tax = annualIncome -= annualIncome * 0.16;
		}
		else {
			tax = annualIncome -= annualIncome * 0.14;
		}
		return tax;
	}
	

}
