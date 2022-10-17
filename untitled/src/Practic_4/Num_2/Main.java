package Practic_4.Num_2;

public class Main {
	public static void main(String[] args) {
		Clothes [] clothes  = {
				new Tshirt(Size.M, 120, "Синий"),
				new Pants( Size.L, 350, "Белый"),
				new Skirt( Size.XXS, 500, "Красный"),
				new Tie( Size.L, 100, "Черный")
		};
		Atelier atelier = new Atelier();
		atelier.dressMan(clothes);
		System.out.println();
		atelier.dressWomen(clothes);
	}
}
