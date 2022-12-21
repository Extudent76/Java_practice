package practic_17.Num_2;

public class Main {

	public static void main(String[] args) {
		EmployeeController controller = new EmployeeController();
		retrieveDataFromDatabase(controller);
		controller.updateView();
	}
	public static void retrieveDataFromDatabase(EmployeeController controller) {
		controller.setName("Иван");
		controller.setWorkHours(10);
		controller.setCoefficient(2);

	}
}
