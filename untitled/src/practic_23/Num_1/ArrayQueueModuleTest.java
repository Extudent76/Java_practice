package practic_23.Num_1;

public class ArrayQueueModuleTest {
	public static void main(String[] args) {
		ArrayQueueModule queue = new ArrayQueueModule();
		for (int i = 0; i < 10; i++) {
			ArrayQueueModule.enqueue(i);
		}
		getArray();
		System.out.println(ArrayQueueModule.element());
		System.out.println(ArrayQueueModule.dequeue());
		getArray();
		System.out.println("\n" + ArrayQueueModule.size());
		ArrayQueueModule.clear();
		System.out.println(ArrayQueueModule.isEmpty());

	}
	public static void getArray() {
		Object[] arr = ArrayQueueModule.toArray();
		for (Object o : arr) {
			System.out.print(o + " ");
		}
	}
}
