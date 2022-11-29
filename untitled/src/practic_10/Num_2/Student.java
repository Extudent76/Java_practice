package practic_10.Num_2;

public class Student implements Comparable<Student> {
	private final String firstName;
	private final String lastName;
	private final int group;
	private final int GPA;

	public Student(String firstName, String lastName, int group, int gpa) {
		this.firstName = firstName;
		this.lastName = lastName;

		this.group = group;
		GPA = gpa;
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
				", GPA=" + GPA +
				'}';
	}

	public int getGPA() {
		return GPA;
	}

	@Override
	public int compareTo(Student o) {
		return this.group - o.group;
	}
}
