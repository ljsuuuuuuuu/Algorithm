package queue;

public class IntQueue {
	private int[] queue;
	private int front;
	private int rear;
	private int size;
	private int capacity;

	public IntQueue(int capacity) {
		queue = new int[capacity];
		front = rear = size = 0;
		this.capacity = capacity;
	}

	public boolean enqueue(int data) {
		if (isFull()) {
			return false;			
		}
		queue[rear++] = data;
		if (rear == capacity) {
			rear = 0;			
		}
		size += 1;
		return true;
	}

	public int dequeue() {
		if (isEmpty()) {
			return -1;			
		}
		int result = queue[front++];
		if (front == capacity) {
			front = 0;			
		}
		size -= 1;
		return result;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public int getFront() {
		return queue[front];
	}

	public int getCapacity() {
		return capacity;
	}

	public int getSize() {
		return size;
	}

	public void clear() {
		size = front = rear = 0;
	}

	public void dump() {
		if (isEmpty()) {
			System.out.println("Empty");			
		}
		else if (front < rear) {
			for (int i = front; i < rear; i += 1) {
				System.out.print(queue[i] + " ");
			}
			System.out.println();
		} else {
//			for(int i = front; i < front + capacity; i += 1) {
//				System.out.print(queue[i + front % capacity] + " ");
//			}
			for(int i = front; i < capacity; i += 1) {
				System.out.print(queue[i] + " ");
			}
			for(int i = 0; i < rear; i += 1) {
				System.out.println(queue[i] + " ");
			}
			System.out.println();
		}
	}
}
