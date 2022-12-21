package practic_24.Num_2;

public class ChairFactory implements AbstractChairFactory{
	@Override
	public FunctionalChair createFunctionalChair() {
		return new FunctionalChair();
	}

	@Override
	public MagicChair createMagicChair() {
		return new MagicChair();
	}

	@Override
	public VictorianChair createVictorianChair(int age) {
		return new VictorianChair(age);
	}
}
