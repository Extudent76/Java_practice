package practic_18.Num_5;

public class ThrowsDemo {
	public void getDetails(String key) {
		try {
			if (key == null) throw new NullPointerException("null key in getDetails");
		} catch (Exception err) {
			System.out.println(err.getMessage());
		}
	}
}
