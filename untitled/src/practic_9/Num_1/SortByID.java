package practic_9.Num_1;
import java.util.List;
import java.util.Random;

import static java.util.Collections.swap;

public class SortByID {
	static Student[] createArray(int size)
	{
		Random rand = new Random();
		Student[] IDnumber = new Student[size];
		for (int i = 0; i < IDnumber.length; i++) {
			IDnumber[i] = new Student(rand.nextInt(0, 100));
		}
		return  IDnumber;
	}
	static Student[] insertionSort(Student[] IDnumber)
	{
		int n = IDnumber.length;

		for (int i = 0; i < n; i++) {
			Student key = IDnumber[i];
			int j = i - 1;
			for (; j >= 0; j--) {
				if(key.getIDNumber()<IDnumber[j].getIDNumber())
				{
					IDnumber[j+1] = IDnumber[j];
				}
				else {break;}
			}
			IDnumber[j + 1] = key;
		}
		return IDnumber;
	}

}
