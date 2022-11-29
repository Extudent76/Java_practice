package practic_10.Num_1;

public class Student {
	private final String firstName;
	private final String lastName;
	private final int group;

	public Student(String firstName, String lastName, int group, int gpa) {
		this.firstName = firstName;
		this.lastName = lastName;

		this.group = group;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}


	public int getGroup() {
		return group;
	}

	@Override
	public String toString() {
		return "Student{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", group=" + group +
				'}';
	}

}
