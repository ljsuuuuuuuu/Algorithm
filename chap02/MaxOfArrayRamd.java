package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRamd {
	public static void main(String[] args) {
		int num = getPositiveNumber("사람 수 : ");

		int height[] = new int[num];
		getRandArray(height, 100, 200);

		for (int i = 0; i < height.length; i += 1) {
			System.out.print(height[i] + " ");
		}
		System.out.println();

		int max = maxOf(height);

		System.out.printf("가장 큰 키는 %dcm입니다", max);
	}

	static int maxOf(int[] height) {
		int max = height[0];
		for (int i = 1; i < height.length; i += 1) {
			if (height[i] > max) {
				max = height[i];
			}
		}
		return max;
	}

	static int getPositiveNumber(String message) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.print(message);
			num = sc.nextInt();
		} while (num <= 0);

		return num;
	}

	static void getRandArray(int numArr[], int start, int end) {
		Random ran = new Random();

		for (int i = 0; i < numArr.length; i += 1) {
			numArr[i] = start + ran.nextInt(end - start);
		}

	}

}
