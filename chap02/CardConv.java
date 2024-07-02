package chap02;

import java.util.Scanner;

public class CardConv {
	public static void main(String[] args) {

		int num = getPositiveNumber("양의 숫자 : ");

		char cardNum[] = new char[64];
		int numDigit;
		int N = getPositiveNumber("몇 진수로 변환할까요?(양수) : ");
		numDigit = cardConv(num, N, cardNum);
		displayResult(cardNum, numDigit);

	}
	
	static int cardConv(int num, int N, char[] cardNum) {
		int numDigit = 0;
		
		
		String digitChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		while (num > 0) {
			cardNum[numDigit++] = digitChar.charAt(num % N);
			num /= N;
		}

		return numDigit;
	
	}

	private static void displayResult(char[] cardNum, int numDigit) {
		for (int i = numDigit - 1; i >= 0; i -= 1) {
			System.out.print(cardNum[i]);
		}
		System.out.println();
	}

	private static int cardConv2(int num, char[] cardNum) {
		int numDigit = 0;
		String digitChar = "0123456789ABCDEF";
		while (num > 0) {
			cardNum[numDigit++] = digitChar.charAt(num % 2);
			num /= 2;
		}

		return numDigit;
	}

	private static int cardConv16(int num, char[] cardNum) {
		int numDigit = 0;
		String digitChar = "0123456789ABCDEF";
		while (num > 0) {
			cardNum[numDigit++] = digitChar.charAt(num % 16);
			num /= 16;
		}

		return numDigit;
	}
	
	private static int getPositiveNumber(String message) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.print(message);
			num = sc.nextInt();
		} while (num <= 0);

		return num;
	}

}
