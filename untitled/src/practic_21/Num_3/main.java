package practic_21.Num_3;

import java.util.Arrays;

public class main {
	public static void main(String[] args) {
		AnyArrayType<Integer> arr = new AnyArrayType<>();
		arr.setArray(new Integer[]{3423, 2431, 2341});
		System.out.println(Arrays.toString(arr.getArray()));
		System.out.println(arr.get(2));
	}
}
