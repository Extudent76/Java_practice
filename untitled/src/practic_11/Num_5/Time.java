package practic_11.Num_5;


import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Random;

public class Time {
	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		Random random = new Random();
		int value = random.nextInt(100, 1000);
		Date startAddLinkedTime = new Date();
		for (int i = 0; i < 6000000; i++) {
			linkedList.add(value + i);
		}
		Date finishAddLinkedTime = new Date();
		Date addLinkedTime = new Date(finishAddLinkedTime.getTime() - startAddLinkedTime.getTime());

		Date startAddArrayTime = new Date();
		for (int i = 0; i < 6000000; i++) {
			arrayList.add(value + i);
		}
		Date finishAddArrayTime = new Date();
		Date addArrayTime = new Date(finishAddArrayTime.getTime() - startAddArrayTime.getTime());

		if (addArrayTime.after(addLinkedTime)) {
			System.out.println("LinkedList быстрее в добавлении");
		} else {
			System.out.println("ArrayList быстрее в добавлении");
		}

		startAddLinkedTime = new Date();
		for (int i = 0; i < 2000; i++) {
			linkedList.remove(value + i);
		}
		finishAddLinkedTime = new Date();
		addLinkedTime = new Date(finishAddLinkedTime.getTime() - startAddLinkedTime.getTime());

		startAddArrayTime = new Date();
		for (int i = 0; i < 2000; i++) {
			arrayList.remove(value + i);
		}
		finishAddArrayTime = new Date();
		addArrayTime = new Date(finishAddArrayTime.getTime() - startAddArrayTime.getTime());

		if (addArrayTime.after(addLinkedTime)) {
			System.out.println("LinkedList быстрее в удалении");
		} else {
			System.out.println("ArrayList быстрее в удалении");
		}

		startAddLinkedTime = new Date();
		for (int i = 0; i < 2000; i++) {
			linkedList.contains(value + i);
		}
		finishAddLinkedTime = new Date();
		addLinkedTime = new Date(finishAddLinkedTime.getTime() - startAddLinkedTime.getTime());

		startAddArrayTime = new Date();
		for (int i = 0; i < 2000; i++) {
			arrayList.contains(value + i);
		}
		finishAddArrayTime = new Date();
		addArrayTime = new Date(finishAddArrayTime.getTime() - startAddArrayTime.getTime());

		if (addArrayTime.after(addLinkedTime)) {
			System.out.println("LinkedList быстрее в поиске");
		} else {
			System.out.println("ArrayList быстрее в поиске");
		}
	}
}
