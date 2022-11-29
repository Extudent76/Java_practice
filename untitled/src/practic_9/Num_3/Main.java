package practic_9.Num_3;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Student[] arr = MergeSortStudents.createArray(10);
		Student[] arr1 = MergeSortStudents.createArray(10);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		Student[] arr2 = MergeSortStudents.mergeSort(arr, arr1);
		System.out.println(Arrays.toString(arr2));
	}
}
