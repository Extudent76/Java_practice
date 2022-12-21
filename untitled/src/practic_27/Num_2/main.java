package practic_27.Num_2;

public class main {
	public static void main(String[] args) {
			People people = new People();
			people.setMap(People.createMap());
			System.out.println(people);
			System.out.println(people.getSameFirstNameCount("Name1"));
			System.out.println(people.getSameLastNameCount("Surname1"));
	}
}
