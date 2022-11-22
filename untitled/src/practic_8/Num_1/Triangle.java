package practic_8.Num_1;

import java.util.Scanner;

public class Triangle {

	public static void tri (int n) {
		int cur = 1,k=0;
		for (int i = 0; i < n; i=i+0) {
			System.out.print(cur+ " ");
			k++;
			if (k == cur){k = 0;
				cur = cur + 1;
				i++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Triangle.tri(scan.nextInt());
	}
}

