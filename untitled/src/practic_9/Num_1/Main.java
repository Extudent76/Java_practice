package practic_9.Num_1;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Student[] arr = SortByID.createArray(10);
		System.out.println(Arrays.toString(arr));
		SortByID.insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
