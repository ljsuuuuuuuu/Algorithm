package dividenconquer;

import java.util.Scanner;

public class BinartSearchTest {
	public static void main(String[] args) {
		int numArr[] = {2, 5, 9, 14, 39, 40, 52};
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(binarySearch(num, numArr));
		System.out.println(binarySearchRec(num, numArr, 0, numArr.length-1));
		
	}

	static int binarySearch(int num, int numArr[]) {
		int start = 0;
		int end = numArr.length;
		
		while(start <= end) {
			int mid = (start + end) / 2;
			
			if(num == numArr[mid]) {
				return mid;
			} else if (num < numArr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			
			
		}
		return -1;
	}
	
	static int binarySearchRec(int num, int numArr[], int start, int end) {
		if(start > end) {
			return -1;
		}
		
		int mid = (start + end) / 2;
		
		if(num == numArr[mid]) {
			return mid;
		}
		
		if(num < numArr[mid]) {
			end = mid - 1;
		} else {
			start = mid + 1;
		}
		return binarySearchRec(num, numArr, start, end);
		
	}
	
}
