package practic_4_1.Num_4;
public class main {
    public static void main(String[] args) {
        Employer[] a = new Employer[6];
        for(int i =0;i<6;i++){
            if((i-1)/2 != 0)a[i] = new Manager("a"+i,"b"+i,10+i,12+i);
            else a[i] = new Employer("A"+i,"B"+i,10+i);
        }
        for(int i =0;i<6;i++){
            System.out.println(a[i]);
        }


    }
}
