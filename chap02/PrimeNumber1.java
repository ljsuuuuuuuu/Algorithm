package chap02;

public class PrimeNumber1 {
	public static void main(String[] args) {
		int primeArr[] = new int[50];
		int numPrime = 0;
		
		for (int num = 2; num <= 100; num += 1) {
			if (isPrimeNumber(num, primeArr, numPrime)) {
				primeArr[numPrime++] = num;
				System.out.println(num + " ");
			}
		}
	}

	private static boolean isPrimeNumber(int num, int[] primeArr, int numPrime) {
		for (int i = 0; i < numPrime; i += 1) {
			if (num % primeArr[i] == 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean isPrimeNumber(int num) {
		for (int i = 2; i < num; i += 1) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}