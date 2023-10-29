package entities;

public class PhysicalPerson extends TaxPayer{

	public double healthCare;
	
	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(String taxPayerName, double annualIncome, double healthCare) {
		super(taxPayerName, annualIncome);
		this.healthCare = healthCare;
	}

	public double getHealthCare() {
		return healthCare;
	}

	public void setHealthCare(double healthCare) {
		this.healthCare = healthCare;
	}

	@Override
	public double taxCalc() {
		double tax;
		if(annualIncome < 200000.00) {
			tax = annualIncome -= annualIncome*0.15 - healthCare;
		}
		else {
			tax = annualIncome -= annualIncome*0.25 - healthCare;
		}
		return tax;
	}
	
	
	
	
}
