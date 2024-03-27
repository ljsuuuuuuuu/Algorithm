package chap02;

public class ReverseArray {
	public static void main(String[] args) {
		int numArr[] = { 0, 1, 2, 3, 4, 5 };

		reverseArray(numArr);

		displayArray(numArr);
	}

	private static void reverseArray(int[] numArr) {
		for (int i = 0; i < numArr.length / 2; i += 1) {
			swap(numArr, i, numArr.length - 1 - i);
		}
	}

	private static void swap(int[] numArr, int i, int j) {
		int temp = numArr[i];
		numArr[i] = numArr[j];
		numArr[j] = temp;
	}

	private static void displayArray(int[] numArr) {
		for (int i = 0; i < numArr.length; i += 1) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
	}

}
