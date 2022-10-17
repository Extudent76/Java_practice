package Practic_4.Num_2;

public class Atelier implements MenClothing,WomenClothing{
	@Override
	public void dressMan(Clothes[] clothes) {
		for (Clothes clothe : clothes) {
			if (clothe instanceof MenClothing) {
				System.out.println(clothe);
			}
		}
	}

	@Override
	public void dressWomen(Clothes[] clothes) {
		for (Clothes clothe : clothes) {
			if (clothe instanceof WomenClothing) {
				System.out.println(clothe);
			}
		}

	}
}
