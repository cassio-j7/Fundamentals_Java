package entities;

public class BusinessAccount extends Account {
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer numb, String holder, Double balance, Double loanLimit) {
		super(numb, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit)
			balance += amount - 10.0;
	}
	
	//Segunda forma de sobreposição
		@Override
		public void withdraw(double amount) {
			super.withdraw(amount);
			balance -= 2.0;
		}
	
	
	
	

}
