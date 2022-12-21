package practic_24.Num_2;

public class Client {
	private Chair chair;

	public void setChair(Chair chair) {
		this.chair = chair;
	}

	public void sit() {
		System.out.println("Сидит на стуле " + chair.getClass().getSimpleName());
	}
}
