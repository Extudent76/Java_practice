package practic_19.Num_2;

public class EmptyStringException  extends IllegalArgumentException{
	public EmptyStringException() {
		super("Пустая строка не допускается!");
	}
}
