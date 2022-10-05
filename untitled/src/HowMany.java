import java.util.Scanner;

public class HowMany {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner.nextLine().split("\\s+").length);
	}
}
