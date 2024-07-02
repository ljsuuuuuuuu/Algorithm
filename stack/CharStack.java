package stack;

public class CharStack {
	private char[] stack;
	private int top;
	private int capacity;
	private int topP;

	public int getTopP() {
		return topP;
	}

	public CharStack(int capacity) {
		this.capacity = capacity;
		stack = new char[this.capacity];
	}

	public boolean push(char par) {
		if (isFull())
			return false;

		stack[top++] = par;
		return true;
	}

	public char pop() {
		if (isEmpty())
			return '!';

		return stack[--top];
	}

	public void setTopP() {
		if (isEmpty()) {
			topP = 0;
		} else {
			topP = stack[top - 1] == '(' ? 1 : stack[top - 1] == '<' ? 2 : 3;
		}
	}

	public char getTop() {
		if (isEmpty()) {
			return '!';
		}
		return stack[top - 1];
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public boolean isFull() {
		return top == capacity;
	}
}
