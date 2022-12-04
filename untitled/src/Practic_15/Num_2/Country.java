package Practic_15.Num_2;

public enum Country {
	USA(337363918),
	China(1458366678),
	India(1424457297),
	Russia(146078626);
	private final int population;

	Country(int population) {
		this.population = population;
	}

	public int getPopulation() {
		return population;
	}
}
