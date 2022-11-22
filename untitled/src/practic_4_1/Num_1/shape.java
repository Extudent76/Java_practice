package practic_4_1.Num_1;

abstract class shape {
	protected Double Perimeter;
	protected String Type;
	protected Double Area;

	public String getType() {
		return Type;
	}

	abstract public void getArea();

	abstract public void getPerimeter();

	@Override
	public String toString() {
		return getClass().getSimpleName() + "{" +
				"type='" + Type + '\'' +
				", area=" + Area +
				", perimeter=" + Perimeter +
				'}';
	}
}
