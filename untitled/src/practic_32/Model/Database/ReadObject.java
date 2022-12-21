package practic_32.Model.Database;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
	public static Object read() throws IOException, ClassNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\exstu\\Desktop\\Лекции\\Джава\\untitled\\src\\practic_32\\Model\\Database\\orders.bin");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		return objectInputStream.readObject();
	}
}
