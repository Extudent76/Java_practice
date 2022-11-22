package practic_6.Num_9;

public class main {
	public static void main(String[] args) {
		Printable[] shopList = new Printable[4];
		shopList[0] = new Book("Книга 1");
		shopList[1]	= new Magazine("Журнал 1");
		shopList[2]	= new Book("Книга 2");
		shopList[3]	= new Book("Журнал 2");
		for (int i = 0; i < 4; i++) {
			shopList[i].print();
		}
	}
}
