package Practic_4.Num_2;

public enum Size {
	XXS(32) {
		@Override
		public String getDescription() {
			return "Детский размер";
		}
	},
	XS(36),
	S(36),
	M(38),
	L(40);
	private final int  euroSize;

	Size (int euroSize) {
		this.euroSize = euroSize;
	}
	public String getDescription() {
		return "Взрослый размер";
	}
	@Override
	public String toString() {
		return name() + "{Размер: " + euroSize + ", описание: " + getDescription() + "}";
	}
}
