package entities;

public class Person {
	
	private String name;
	private Integer age;
	private Double height;
	private Character gender;
	
	public Person() {}

	public Person(String name, Integer age, Double height, Character gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return "Name: " + name +
			   ", age: " + age + 
			   ", height: " + String.format("%.2f", height) +
			   ", gender: " + gender;
	}

}
