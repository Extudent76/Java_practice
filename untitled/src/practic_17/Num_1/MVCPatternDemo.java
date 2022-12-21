package practic_17.Num_1;

public class MVCPatternDemo {
	public static void main(String[] args) {
		StudentController controller = new StudentController(retreiveStudentFromDatabase());
		controller.updateView();
	}

	public static Student retreiveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Иван");
		student.setRollNo("...");
		return student;
	}
}
