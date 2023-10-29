package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.PhysicalPerson;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> taxList = new ArrayList<>();
		
		System.out.print("How many Tax Payer will enter? ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.print("Physical person(p) or Legal Person(l)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Tax Payer Name: ");
			sc.nextLine();
			String taxPayerName = sc.nextLine();
			System.out.print("Annual Income: ");
			double annualIncome = sc.nextDouble();
			if(ch == 'p') {
				System.out.print("Health Expenses: ");
				double healthCare = sc.nextDouble();
				TaxPayer taxPay = new PhysicalPerson(taxPayerName, annualIncome, healthCare);
				taxList.add(taxPay);
			}
			else if(ch == 'l') {
				System.out.print("Workers number: ");
				int workerNumber = sc.nextInt();
				TaxPayer taxPay = new LegalPerson(taxPayerName, annualIncome, workerNumber);
				taxList.add(taxPay);
			}
		}
		System.out.println();
		System.out.println("Tax Payer List: ");
		for (TaxPayer taxPay : taxList) {
			System.out.println(taxPay.taxCalc());
			System.out.println();
		}
		
		sc.close();

	}

}
