package chap02;

import java.util.Scanner;

public class Q16 {
	public static void main(String[] args) {
		int num = new Scanner(System.in).nextInt();
		nPira(num);
	}

	static void nPira(int num) {
		int temp = 0;
		for (int i = 1; i < num + 1; i += 1) {
			for (int k = 0; k < num - i; k += 1) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + temp; j += 1) {
				System.out.print(i % 10);
			}
			System.out.println();
			temp += 1;
		}
	}
}
