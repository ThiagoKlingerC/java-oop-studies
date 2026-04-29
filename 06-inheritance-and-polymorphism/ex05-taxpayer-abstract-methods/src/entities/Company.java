package entities;

public class Company extends TaxPayer{
	
	private int numberOfEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		
		Double payment = getAnualIncome() * 0.20;
		
		if (numberOfEmployees >= 10) {
			payment = getAnualIncome()  * 0.14;
		}
		return payment;
	}
}

