package practic_9.Num_3;

import java.util.Comparator;
import java.util.Random;

public class MergeSortStudents {
	public static Student[] createArray(int size) {
		Random random = new Random();
		Student[] arr = new Student[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Student(random.nextInt(0, 100), random.nextInt(0, 10));
		}
		return arr;
	}
	public static Student[] mergeSort(Student[] l, Student[] r) {
		mergeSort(l, l.length);
		mergeSort(r, r.length);
		Student[] a = new Student[l.length + r.length];
		merge(a, l, r, l.length, r.length);
		return a;
	}

	public static void mergeSort(Student[] a, int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		Student[] l = new Student[mid];
		Student[] r = new Student[n - mid];

		for (int i = 0; i < mid; i++) {
			l[i] = a[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = a[i];
		}

		mergeSort(l, mid);
		mergeSort(r, n - mid);

		merge(a, l, r, mid, n - mid);
	}
	public static void merge(Student[] a, Student[] l, Student[] r, int left, int right) {

		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (l[i].getIDNumber() <= r[j].getIDNumber()) {
				a[k++] = l[i++];
			} else {
				a[k++] = r[j++];
			}
		}
		while (i < left) {
			a[k++] = l[i++];
		}
		while (j < right) {
			a[k++] = r[j++];
		}
	}
}
