package practic_21.Num_1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayToArrayList {
	public static <E> ArrayList<E> convert(E[] e) {
		ArrayList<E> eArrayList = new ArrayList<>();
		Collections.addAll(eArrayList, e);
		return eArrayList;
	}
}
