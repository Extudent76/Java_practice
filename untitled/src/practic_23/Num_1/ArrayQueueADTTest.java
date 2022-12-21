package practic_23.Num_1;

public class ArrayQueueADTTest {
	public static void main(String[] args) {
		ArrayQueueADT queue = new ArrayQueueADT();
		for (int i = 0; i < 10; i++) {
			ArrayQueueADT.enqueue(queue,i);
		}
		getArray(queue);
		System.out.println(ArrayQueueADT.element(queue));
		System.out.println(ArrayQueueADT.dequeue(queue));
		getArray(queue);
		System.out.println("\n" + ArrayQueueADT.size(queue));
		ArrayQueueADT.clear(queue);
		System.out.println(ArrayQueueADT.isEmpty(queue));
	}
	public static void getArray(ArrayQueueADT queue) {
		Object[] arr = ArrayQueueADT.toArray(queue);
		for (Object o : arr) {
			System.out.print(o + " ");
		}
	}

}
