package practic_19.Num_2;

import java.util.ArrayList;

public class LabClassDriver {
	public static void main(String[] args) {
		new LabClassUI(getStudentList());
	}

	public static ArrayList<Student> getStudentList() {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Иван", "Иванов", "09.03.04", 1, "ИКБО-02-22", 4));
		students.add(new Student("Александр", "Пивкин", "09.03.03", 2, "ИНБО-08-21", 5));
		return students;
	}
}
