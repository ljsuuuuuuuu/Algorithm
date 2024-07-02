package stack;

import java.util.Scanner;

public class IntStackTester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		IntStack intStack = new IntStack(64); // 최대 64 개를 푸시할 수 있는 스택
		boolean run = true;
		while (run) {
			System.out.println("=================================================");
			System.out.printf("현재 데이터 개수: %d / %d\n", intStack.top, intStack.capacity);
			System.out.print("(1)푸시　(2)팝　(3)피크　(4)덤프　(0)종료: ");

			int menu = input.nextInt();
			if (menu == 0)
				break;
			int data;
			switch (menu) {
			case 1:
				System.out.print("데이터: ");
				if (!intStack.push(input.nextInt())) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			case 2:
				data = intStack.pop();
				if (data != -1) {
					System.out.println("팝한 데이터는 " + data + "입니다.");
				} else {
					System.out.println("스택이 비어있습니다.");
				}
				break;

			case 3:
				data = intStack.top();
				if (data != -1) {
					System.out.println("피크한 데이터는 " + data + "입니다.");
				} else {
					System.out.println("스택이 비어있습니다.");
				}
				break;

			case 4:
				intStack.dump();
				break;

			case 0:
				run = false;
				break;
			
			default :
				System.out.println("없는 메뉴.");
			}
		}

	}
}