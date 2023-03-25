package entities;

public class Account {
	
	private Integer numb;
	private String holder;
	protected Double balance;
	
	public Account() {}

	public Account(Integer numb, String holder, Double balance) {
		this.numb = numb;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumb() {
		return numb;
	}

	public void setNumb(Integer numb) {
		this.numb = numb;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	
	public void withdraw (double amount) {
		balance -= amount + 5.0;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	

}
