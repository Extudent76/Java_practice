package practic_1;
public class practic_1_6 {
    public static void main(String[] args) {
        System.out.println("гармонические числа:");
        double[] chisla = new double[10];
        double n;
        for(int i=0;i<10;i++)
        {
            n=1./(i+1);
            chisla[i]=n;
            System.out.println(" ");
            System.out.printf("%.2f",chisla[i]);
        }
        n=0;
        for(int i=0;i<10;i++)
        {
            n+=chisla[i];
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.printf("%.2f",n);
    }
    }

