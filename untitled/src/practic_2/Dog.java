package practic_2;

public class Dog {
	private String name;
	private int age;

	public Dog(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public Dog() {
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}

	public void changeAge( int age)
	{
		age = age*7;
		setAge(age);
	}
	public String toString()
	{
		return "Кличка собаки " + getName() +
				"Возраст собаки " + getAge();
	}
}
