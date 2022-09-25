import java.util.Scanner;
public class practic_1_7 {
    public static void function1(int num )
    {
        int factorial =1;
        for (int i=1;i<=num;i++)
        {
            factorial  *= i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        int num;
        Scanner scn = new Scanner(System.in);
        num = scn.nextInt();
        function1 (num);
    }
}
