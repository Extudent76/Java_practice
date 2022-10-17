package Practic_4.Num_1;

public enum Seasons {
	AUTUMN(7),
	WINTER(-30),
	SUMMER (28){
		@Override
		public String getDescription() {
			return "Жаркое время года";
		}
	},
	SPRING(15);

	private final int temp;

	Seasons(int temp) {
		this.temp = temp;
	}

	public String getDescription() {
		return "Холодное время года";
	}
	@Override
	public String toString() {
		return name() + "{Температура: " + temp + ", описание: " + getDescription() + "}";
	}

}
