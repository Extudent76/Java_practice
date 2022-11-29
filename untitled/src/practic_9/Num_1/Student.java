package practic_9.Num_1;

public class Student {
	private final int IDNumber;

	public Student(int IDNumber) {
		this.IDNumber = IDNumber;
	}

	public int getIDNumber() {
		return IDNumber;
	}

	@Override
	public String toString() {
		return "Student{" +
				"IDNumber=" + IDNumber +
				'}';
	}
}
