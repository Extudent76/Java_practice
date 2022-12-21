package practic_21.Num_2;

import java.util.Arrays;

public class main {
	public static void main(String[] args) {
		AnyArrayType<Integer> storage = new AnyArrayType<>();
		storage.setArray(new Integer[]{3423, 2431, 2341});
		System.out.println(Arrays.toString(storage.getArray()));
	}
}
