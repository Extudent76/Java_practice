package practic_24.Num_1;

public class main {
	public static void main(String[] args) {
		Complex complex1 = new Complex(42, 10);
		System.out.println(complex1);

		ComplexAbstractFactory factory = new ConcreteFactory();
		Complex complex2 = factory.CreateComplex(555, 461);
		System.out.println(complex2);

		Complex complex3 = factory.createComplex();
		System.out.println(complex3);
	}
}
