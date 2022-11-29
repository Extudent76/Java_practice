package practic_9.Num_3;

public class Student {
	private final int IDNumber;
	private final int GPA;

	public Student(int IDNumber, int GPA) {
		this.GPA = GPA;
		this.IDNumber = IDNumber;
	}

	public int getFS() {
		return GPA;
	}

	public int getIDNumber() {
		return IDNumber;
	}

	@Override
	public String toString() {
		return "Student{" +
				"IDNumber=" + IDNumber +
				", GPA=" + GPA +
				'}';
	}
}
