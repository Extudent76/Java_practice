package practic_8.Num_2;

import java.util.Scanner;

public class Print {

	static void prn(int n, int c)
	{
		int k = c;
		int m = n;
		if (m == k-1) return;
		System.out.println(k);
		prn(m,k+1);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Print.prn(scan.nextInt(),1);
	}
}
