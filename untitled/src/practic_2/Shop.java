package practic_2;

import java.util.Vector;

public class Shop {
	Vector vector=new Vector();
	public void addPC(String comp)
	{
		vector.add(comp);
	}
	public void errasePC(int num)
	{
		vector.remove(num);
	}
	public int searchPC(String comp)
	{
		return vector.indexOf(comp);
	}
	public void output()
	{
		for (int i = 0; i < vector.size(); i++)
		{
			System.out.println(vector.get(i));
		}
	}
}
