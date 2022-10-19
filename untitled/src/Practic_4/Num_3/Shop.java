package Practic_4.Num_3;
import java.util.Scanner;
public class Shop implements Adidas,Nike,Basket {

	double cost;
	public Shop() {
		Scanner scan = new Scanner(System.in);
		User user = new User();
		boolean flag = true;
		int n =10;
		int i =0;
		while (flag) {
			Sneakers[] basket = new Sneakers[n];
			System.out.println("Выберите каталог");
			System.out.println("1 -  Кроссовки Adidas");
			System.out.println("2 -  Кроссовки Nike");
			int p;
			switch (p = scan.nextInt()) {
				case 1:
					Adidas(sneakers);
					break;
				case 2:
					Nike(sneakers);
			}
			if (p == 2) {
				System.out.println("Выберите кроссовки, которые хотите добавить в корзину");
				System.out.println("1 -  Force");
				System.out.println("2 -  Jordan");
				System.out.println("3 -  Выход");
				int o;
				switch (o = scan.nextInt()) {
					case 1:
						 basket[i] = new NK_Air_Force("Force",5000.0,"Зелёные", Size.S);
						 cost+=5000.0;
						System.out.println("Force - добалены в корзину");
						break;
					case 2:
						basket[i] = new NK_Jordan("Jordan",20000.0,"Красные", Size.XS);
						cost+=20000.0;
						System.out.println("Jordan - добалены в корзину");
					case 3:
						System.out.println("Выход");
						System.out.println("К оплате " + cost);
						flag= false;
						break;
				}
				}
			if (p == 1) {
				System.out.println("Выберите кроссовки, которые хотите добавить в корзину");
				System.out.println("1 -  Superstar");
				System.out.println("2 -  Forum");
				System.out.println("3 -  Выход");
				int o;
				switch (o = scan.nextInt()) {
					case 1:
						basket[i] = new  AD_Superstar("Superstar",7000.0,"Белые", Size.L);
						cost+=7000.0;
						System.out.println("Superstar - добалены в корзину");
						break;
					case 2:
						basket[i] = new AD_Forum("Forum",9000.0,"Чёрные", Size.M);
						cost+=9000.0;
						System.out.println("Forum - добалены в корзину");
					case 3:
						System.out.println("Выход");
						System.out.println("К оплате " + cost);
						flag= false;
						break;
				}
			}
			System.out.println("Выберите перейти в корзину и оплатить товар, или продолжить смотреть товар");
			System.out.println("1 -  Корзина");
			System.out.println("2 -  Продолжить");
			int o;
			switch (o = scan.nextInt()) {
				case 1:
					Basket(basket);
					System.out.println("К оплате " + cost);
					flag = false;
					break;
				case 2:
					flag = true;
					break;
			}
			i++;
			}
		}

		Sneakers[] sneakers = new Sneakers[]{
				new  AD_Superstar("Superstar",7000.0,"Белые", Size.L),
				new AD_Forum("Forum",9000.0,"Чёрные", Size.M),
				new NK_Air_Force("Force",5000.0,"Зелёные", Size.S),
				new NK_Jordan("Jordan",20000.0,"Красные", Size.XS),
	};

	@Override
	public void Adidas(Sneakers[] sneakers) {
		for (Sneakers clothe : sneakers) {
			if (clothe instanceof Adidas) {
				System.out.println(clothe);
			}
		}
	}
	@Override
	public void Nike(Sneakers[] sneakers) {
		for (Sneakers clothe : sneakers) {
			if (clothe instanceof Nike) {
				System.out.println(clothe);
			}
		}
	}
	@Override
	public void Basket(Sneakers[] basket) {
		for (Sneakers clothe : basket) {
			if (clothe instanceof Basket) {
				System.out.println(clothe);
			}
		}
	}

}
