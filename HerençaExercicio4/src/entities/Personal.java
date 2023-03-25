package entities;

public class Personal extends Contributor {
	
	private Double healthExpenses;
	
	Personal(){
		super();
	}
	
	public Personal(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public double tax() {
		if ( getAnnualIncome() <= 20000.0) {
			return annualIncome * 0.15;
		}
		else {
			return annualIncome * 0.25;
		}
	
	}
	
	public String toString() {
		return getName()
				+": R$"
				+String.format("%.2f", tax())
				+".";
	}
	
	

}
