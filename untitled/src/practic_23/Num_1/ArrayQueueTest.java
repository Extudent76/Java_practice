package practic_23.Num_1;

public class ArrayQueueTest {
	public static void main(String[] args) {
		ArrayQueue queue = new ArrayQueue();
		for (int i = 0; i < 10; i++) {
			queue.enqueue(i);
		}
		getArray(queue);
		System.out.println(queue.element());
		System.out.println(queue.dequeue());
		getArray(queue);
		System.out.println("\n" + queue.size());
		queue.clear();
		System.out.println(queue.isEmpty());
	}
	public static void getArray(ArrayQueue queue) {
		Object[] arr = queue.toArray();
		for (Object o : arr) {
			System.out.print(o + " ");
		}
	}
}

