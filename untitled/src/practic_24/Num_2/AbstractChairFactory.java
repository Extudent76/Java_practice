package practic_24.Num_2;

public interface AbstractChairFactory {
	VictorianChair createVictorianChair(int age);

	MagicChair createMagicChair();

	FunctionalChair createFunctionalChair();
}
