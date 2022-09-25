
import java.util.Scanner;
public class main {
    public static void function1(double num, int SS )
    {
        double fractionalPart =0,number;
        int rem =0, integralPart, k=3,c=0;
        int n =(int) num;
        StringBuilder s = new StringBuilder();
        fractionalPart = num-n;
        while(n!=0)
        {
            rem =n%SS;
            n=n/SS;
            switch (rem) {
                case 10 : s.insert(0,"A");
                    c++;
                    break;
                case 11 : s.insert(0,"B");
                    c++;
                    break;
                case 12 : s.insert(0,"C");
                    c++;
                    break;
                case 13 : s.insert(0,"D");
                    c++;
                    break;
                case 14 : s.insert(0,"E");
                    c++;
                    break;
                case 15 : s.insert(0,"F");
                    c++;
                    break;
                case 16 : s.insert(0,"G");
                    c++;
                    break;
                case 17 : s.insert(0,"H");
                    c++;
                    break;
                case 18 : s.insert(0,"I");
                    c++;
                    break;
                case 19 : s.insert(0,"J");
                    c++;
                    break;
                case 20 : s.insert(0,"K");
                    c++;
                    break;
                case 21 : s.insert(0,"L");
                    c++;
                    break;
                case 22 : s.insert(0,"M");
                    c++;
                    break;
                case 23 : s.insert(0,"N");
                    c++;
                    break;
                case 24 : s.insert(0,"O");
                    c++;
                    break;
                case 25 : s.insert(0,"P");
                    c++;
                    break;
                case 26 : s.insert(0,"Q");
                    c++;
                    break;
                case 27 : s.insert(0,"R");
                    c++;
                    break;
                case 28 : s.insert(0,"S");
                    c++;
                    break;
                case 29 : s.insert(0,"T");
                    c++;
                    break;
                case 30 : s.insert(0,"U");
                    c++;
                    break;
                case 31 :s.insert(0,"V");
                    c++;
                    break;
                case 32 : s.insert(0,"W");
                    c++;
                    break;
                case 33 : s.insert(0,"X");
                    c++;
                    break;
                case 34 : s.insert(0,"Y");
                    c++;
                    break;
                case 35 : s.insert(0,"Z");
                    c++;
                    break;
            }
            if (c==0){s.insert(0,rem);}
            c=0;
        }
        System.out.print(s+".");
        s = new StringBuilder();
        while (k!=0)
        {
            integralPart= (int) (fractionalPart * SS);
            switch (integralPart) {
                case 10 : s.append("A");
                    c++;
                    break;
                case 11 : s.append("B");
                    c++;
                    break;
                case 12 : s.append("C");
                    c++;
                    break;
                case 13 : s.append("D");
                    c++;
                    break;
                case 14 : s.append("E");
                    c++;
                    break;
                case 15 : s.append("F");
                    c++;
                    break;
                case 16 : s.append("G");
                    c++;
                    break;
                case 17 : s.append("H");
                    c++;
                    break;
                case 18 : s.append("I");
                    c++;
                    break;
                case 19 : s.append("J");
                    c++;
                    break;
                case 20 : s.append("K");
                    c++;
                    break;
                case 21 : s.append("L");
                    c++;
                    break;
                case 22 : s.append("M");
                    c++;
                    break;
                case 23 : s.append("N");
                    c++;
                    break;
                case 24 : s.append("O");
                    c++;
                    break;
                case 25 : s.append("P");
                    c++;
                    break;
                case 26 : s.append("Q");
                    c++;
                    break;
                case 27 : s.append("R");
                    c++;
                    break;
                case 28 : s.append("S");
                    c++;
                    break;
                case 29 : s.append("T");
                    c++;
                    break;
                case 30 : s.append("U");
                    c++;
                    break;
                case 31 : s.append("V");
                    c++;
                    break;
                case 32 : s.append("W");
                    c++;
                    break;
                case 33 : s.append("X");
                    c++;
                    break;
                case 34 : s.append("Y");
                    c++;
                    break;
                case 35 : s.append("Z");
                    c++;
                    break;
            }
            if (c==0){s.append(integralPart);}
            number = fractionalPart * SS;
            fractionalPart = number - integralPart;
            k--;
            c=0;
        }
        System.out.println(s);
    }
    public static void main (String[] args)
    {
        double num;
        int SS;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        num = scn.nextDouble();
        System.out.println("Enter the SS");
        SS = scn.nextInt();
        System.out.println("Output is");
        function1(num,SS);
        function1(123.123,2);
        function1(123.123,8);
        function1(123.123,16);
    }

}
