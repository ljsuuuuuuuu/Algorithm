package stack;

public class IntStack {
	int[] stack;
	int top = 0;
	int capacity;

	IntStack(int capacity) {
		this.capacity = capacity;
		this.stack = new int[capacity];
	}

	public boolean push(int num) {
		if (full()) {
			return false;
		}
		stack[top++] = num;
		return true;
	}

	public int pop() {
		if (empty()) {
			return -1;
		}
		return stack[--top];
	}

	public int top() {
		if(empty()) {
			return -1;
		}
		return stack[top-1];
	}

	public boolean empty() {
		return top == 0;
	}

	public boolean full() {
		return top == capacity;
	}

	public int size() {
		return top;
	}

	public int capacity() {
		return capacity;
	}
	
	public void dump() {
		if(empty()) {
			System.out.println("스택이 비어있습니다");
		} else {
			for(int i = 0; i < top; i += 1) {
				System.out.print(stack[i] + " ");
			}
			System.out.println();			
		}
	}
	
	public void clear() {
		top = 0;
	}
}
