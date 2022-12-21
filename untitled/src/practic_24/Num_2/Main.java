package practic_24.Num_2;

public class Main {
	public static void main(String[] args) {
		Client client = new Client();
		AbstractChairFactory factory = new ChairFactory();
		Chair chair = factory.createMagicChair();
		client.setChair(chair);
		client.sit();
		chair = factory.createVictorianChair(10);
		client.setChair(chair);
		client.sit();
		chair = factory.createFunctionalChair();
		client.setChair(chair);
		client.sit();
	}
}
