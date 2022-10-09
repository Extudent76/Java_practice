package practic_2;

public class Book {
	private String Author;
	private int year;
	private String name;

	public String getAuthor() {return Author;}
	public void setAuthor(String author) {Author = author;}

	public int getYear() {return year;}
	public void setYear(int year) {this.year = year;}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	@Override
	public String toString() {
		return "practic_2.Book{" +
				"practic_2.Author='" + Author + '\'' +
				", year=" + year +
				", name='" + name + '\'' +
				'}';
	}
}
