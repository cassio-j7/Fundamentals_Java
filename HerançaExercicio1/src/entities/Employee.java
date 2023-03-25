package entities;

public class Employee {
	
	private String name;
	private Integer hour;
	private Double valuePerHour;
	
	public Employee(){}
	
	public Employee(String name, Integer hour, Double valuePerHour){
		this.name = name;
		this.hour = hour;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public Double getValuerHour() {
		return valuePerHour;
	}

	public void setValuerHour(Double valuerHour) {
		this.valuePerHour = valuerHour;
	}
	
	public Double payment() {
		return hour * valuePerHour;
	}
	
	
	

}
