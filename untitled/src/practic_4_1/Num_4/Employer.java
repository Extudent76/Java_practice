package practic_4_1.Num_4;

public class Employer {
	private String firstName;
	private String lastName;
	private double income ;

	public Employer(String firstName, String lastName, double income){
		this.firstName = firstName;
		this.lastName = lastName;
		this.income = income;
	}
	public double getIncome() {
		return income;
	}

	@Override
	public String toString() {
		return firstName +" " + lastName + " " + getIncome();
	}
}
