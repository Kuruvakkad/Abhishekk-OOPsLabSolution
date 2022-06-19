package Emailapp.Employee;

public class Employee {
	private String FirstName;
	private String LastName;
	
	public Employee(String FirstName, String LastName) {
		this.FirstName=FirstName;
		this.LastName=LastName;
		
		
	}
	public String getFirstName() {
		return FirstName;

	}
	public void setFirstName(String FirstName) {
		this.FirstName=FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String LastName) {
		this.LastName=LastName;
	}

}
