package practic_3;
import java.util.Random;
import java.util.Scanner;
public class MathAndRandom_3 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите размер массива");
		int[] arr = new int[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10, 100);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		int flag =0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				System.out.println("массив не является строго возрастающей последовательностью");
				flag =1;
				break;
			} }
			if (flag ==0)
			System.out.println("массив является строго возрастающей последовательностью");
	}
}

