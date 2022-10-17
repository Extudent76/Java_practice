package Practic_4.Num_1;

public class Main {
	public static void main(String[] args) {
		Seasons seasons = Seasons.WINTER;
		switch (seasons) {
			case AUTUMN: System.out.println("Я люблю осень");
			break;
			case WINTER: System.out.println("Я люблю зиму");
			break;
			case SUMMER: System.out.println("Я люблю лето");
			break;
			case SPRING: System.out.println("Я люблю весну");
			break;
		}
		for (Seasons season : Seasons.values()) {
			System.out.println(season.toString());
		}
	}
}
