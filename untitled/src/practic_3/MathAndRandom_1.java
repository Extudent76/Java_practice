package practic_3;
import java.util.*;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class MathAndRandom_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int n;
		Double[] arr1 = new Double[ n = scan.nextInt()];
		Double[] arr2 = new Double[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = Math.random();
			arr2[i] = rand.nextDouble();
		}
		System.out.print("Первый массив:");
		for (int i = 0; i < arr1.length; i++) {System.out.print(arr1[i]+ " ");}
		System.out.println(" ");
		System.out.print("Второй массив:");
		for (int i = 0; i < arr2.length; i++) {System.out.print(arr2[i]+ " ");}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(" ");
		System.out.print("Первый массив:");
		for (int i = 0; i < arr1.length; i++) {System.out.print(arr1[i]+ " ");}
		System.out.println(" ");
		System.out.print("Второй массив:");
		for (int i = 0; i < arr2.length; i++) {System.out.print(arr2[i]+ " ");}
	}
}
