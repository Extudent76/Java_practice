import java.util.Scanner;

public class Change {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]  = scan.next();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 0; i < arr.length / 2; i++) {
			String rezerv = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = rezerv;
		}
		System.out.println("==========================");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
