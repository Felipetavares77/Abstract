package entities;

public abstract class TaxPayer {
	
	public String taxPayerName;
	public double annualIncome;
	
	public TaxPayer() {
		
	}

	public TaxPayer(String taxPayerName, double annualIncome) {
		this.taxPayerName = taxPayerName;
		this.annualIncome = annualIncome;
	}

	public String getTaxPayerName() {
		return taxPayerName;
	}

	public void setNameTaxPayer(String taxPayerName) {
		this.taxPayerName = taxPayerName;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	public abstract double taxCalc();
	

}
