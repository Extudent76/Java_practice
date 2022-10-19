package Practic_4.Num_3;

import java.util.Scanner;

public class User {
	private String login = "alex";
	private String password = "123";
	public User() {
		Scanner scan = new Scanner(System.in);
		String login, password;
		boolean flag=true;
		while (flag){
			System.out.println("Введите логин");
			login = scan.next();
			System.out.println("Введите пароль");
			password = scan.next();
			if ((!this.login.equals(login))||(!this.password.equals(password)))
			{
				System.out.println("Логин или пароль не верные");
			}
			else {flag = false;}
		}
	}
}

