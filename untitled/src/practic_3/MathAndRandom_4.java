package practic_3;

import java.util.Random;
import java.util.Scanner;
public class MathAndRandom_4
{
	public static void main(String[] args) {

		int cons = 10,n=10, n2= 0;
		Scanner scanner = new Scanner(System.in);
		while (n >= cons) {
			System.out.println("Введите размер массива");
			n = scanner.nextInt();
		}
		Random rand = new Random();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int m = rand.nextInt(n);
			arr[i] = m;
			if (arr[i] % 2 == 0) {
				n2++;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+ " ");
			}
		System.out.println();
		int j = 0;
		int[] arr2 = new int[n2];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr2[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < n2; i++) {
			System.out.print(arr2[i]+ " ");
		}
	}
}
