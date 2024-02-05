package sorting;

public class Employee {
	private String firstName;
	private Long salary;

	
	public Employee(String firstName, Long salary) {
		super();
		this.firstName = firstName;
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", salary=" + salary + "]";
	}

	
}
