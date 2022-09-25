import java.util.Scanner;

public class program5
{
    public static int Random()
    {
        return (int) (Math.random() * (100));
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("введите количество элементов массива:");
        int elements = in.nextInt();
        int[]chisla = new int[elements];
        int k;

        //заполнение и первый вывод
        for(int i=0;i<elements;i++)chisla[i]= Random();//in.nextInt();
        System.out.println("всего элементов массива:"+elements);
        System.out.println("массив:");
        for(int i=0;i<elements;i++)System.out.print(chisla[i]+" ");

        //удаление и второй вывод
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("введите удаляемое число:");
        int dlt = in.nextInt();
        for(int i=0;i<elements;i++)
        {
            if(dlt==chisla[i])
            {
                for(int j=i;j<elements-1;j++)
                {
                    if(j+1<=elements)chisla[j]=chisla[j+1];
                    else chisla[j]= Integer.parseInt(null);
                }
                elements--;
                i--;
            }
        }
        System.out.println("всего элементов массива:"+elements);
        System.out.println("массив:");
        for(int i=0;i<elements;i++)System.out.print(chisla[i]+" ");

        //еще одно удаление и третий вывод
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("введите удаляемое число:");
        dlt = in.nextInt();
        for(int i=0;i<elements;i++)
        {
            k=chisla[i];
            while((k>10))   {k=k%10;}
            if(k==dlt)
            {
                for(int j=i;j<elements-1;j++)
                {
                    if(j+1<=elements)chisla[j]=chisla[j+1];
                    else chisla[j]= Integer.parseInt(null);
                }
                elements--;
                i--;
            }
        }
        System.out.println("всего элементов массива:"+elements);
        System.out.println("массив:");
        for(int i=0;i<elements;i++)System.out.print(chisla[i]+" ");
    }
}
