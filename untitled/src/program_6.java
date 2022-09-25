import java.util.Scanner;
import java.util.Arrays;
public class program_6 {
    public static void main(String[] args) {
        int size,ind;
        Scanner scn_ind = new Scanner(System.in);
        ind = scn_ind.nextInt();
        Scanner scn_size = new Scanner(System.in);
        size = scn_size.nextInt();
        int [] fibarr = new int[size];
        for (int i=0; i<size;i++)
        {
            if (i == 0) fibarr[0]=0;
            if (i == 1) fibarr[1]=1;
            if (i>1)
            {
                fibarr[i]= fibarr[i-1]+fibarr[i-2];
            }
        }
        for (int i=ind; i<size;i++)
            System.out.print(fibarr[i]+" ");
    }
}
