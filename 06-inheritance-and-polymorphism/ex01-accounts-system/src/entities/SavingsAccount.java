package entities;

public class SavingsAccount extends Account {
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestsRate) {
		super(number, holder, balance);
		this.interestRate = interestsRate;
	}

	public Double getInterestsRate() {
		return interestRate;
	}

	public void setInterestsRate(Double interestsRate) {
		this.interestRate = interestsRate;
	}
	
	public void updadeBalance() {
		balance += balance*interestRate;
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

}
