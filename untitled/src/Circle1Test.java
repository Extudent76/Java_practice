import java.util.Scanner;
public class Circle1Test {
	public static void main(String[] args) {
		Double s1,s2,l1,l2;
		Scanner scan = new Scanner(System.in);
		Circle1 num =new Circle1();
		System.out.println("Введите радиус первого круга:");
		double r1 = scan.nextInt();
		s1 = num.getArea(r1);
		l1 = num.getLength(r1);
		System.out.println("Введите радиус второго круга:");
		double r2 = scan.nextInt();
		s2 = num.getArea(r2);
		l2 = num.getLength(r2);
		num.Comparison(s1,s2,l1,l2);
	}
}
