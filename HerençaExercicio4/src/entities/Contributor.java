package entities;

public abstract class Contributor {
	
	private String name;
	protected Double annualIncome;

	public Contributor() {}

	public Contributor(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualncome) {
		this.annualIncome = annualncome;
	}
	
	public abstract double tax();

	
}
