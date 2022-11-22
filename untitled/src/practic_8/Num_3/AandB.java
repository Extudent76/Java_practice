package practic_8.Num_3;

import java.util.Scanner;

public class AandB {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (a < b) {
			for (int i = a; i <= b; i++) {
				System.out.println(i);
			}
		}
		if (a > b){
			for (int i = a; i >= b; i--) {
				System.out.println(i);
			}
		}
	}
}
