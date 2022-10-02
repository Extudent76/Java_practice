import java.util.Scanner;
public class practic_1_4 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int n=0, max =0, min=0;
        int[] array = new int[num];
        System.out.println("ввод элементов:");
        for(int i=0;i<num;i++)
        {array[i] = in.nextInt();}
        int i=0;
        while(i<num)
        {n+=array[i];
                if (max < array[i]) max = array[i];
                if (i == 0) {
                    min = array[i];
                }
                if (min > array[i]) min = array[i];
            i++;}
        System.out.println(n);
        n=0;
        i=0;
        do
        { n+=array[i];
            i++;}
        while(i<num);
        System.out.println(n);
        System.out.println(max);
        System.out.println(min);
    }
}
