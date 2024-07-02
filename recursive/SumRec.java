package recursive;

import java.util.Scanner;

public class SumRec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(sumRec(sc.nextLong()));
	}
	
	static long sumRec(long number) {
		if(number == 1 || number == 0) {
			return 1;
		}
		
		return number * sumRec(number-1);
	}
}