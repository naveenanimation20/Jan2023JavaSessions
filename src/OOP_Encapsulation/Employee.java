package OOP_Encapsulation;

public class Employee {

	private String name;
	private int age;
	private double salary;
	private String city;
	private String country;

	// const...
	public Employee(String name, int age, double salary, String city, String country) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.city = city;
		this.country = country;
	}

	// public getter and setter:
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
