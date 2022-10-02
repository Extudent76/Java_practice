 import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args) {
        String mail;
        Author x1 = new Author( "Alex","Alex@gmai.com",'M');
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите email");
        mail = scan.next();
        x1.setEmail(mail);
        System.out.println(x1.toString());
    }
}
