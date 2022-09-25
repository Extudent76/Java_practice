import java.util.Scanner;
public class practic_1_3 {
    public static void main(String[] args) {

        int[] array = new int []{1, 2, 3,4,5};
        int SA=0,sum=0;
        for (int i =0; i < 5; i++)
        {
            sum += array[i];
        }
        SA = sum/5;
        System.out.println(sum);
        System.out.println(SA);
    }
}
