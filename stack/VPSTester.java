package stack;

import java.util.Scanner;

public class VPSTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isVPS = true;
		CharStack cs = new CharStack(64);
		System.out.print("괄호 문자열 입력 : ");
		char[] pArr = sc.next().toCharArray();

		for (char p : pArr) {
			if (p == '(' || p == '<' || p == '{') {
				cs.push(p);
			} else if (p == ')' || p == '>' || p == '}') {
				int inP = p == ')' ? 1 : p == '>' ? 2 : 3;
				cs.setTopP();
				if (cs.getTopP() == inP) {
					cs.pop();
				} else {
					isVPS = false;
					break;
				}
			}
		}

		if (!cs.isEmpty())
			isVPS = false;

		String result = isVPS ? "yes" : "no";
		System.out.println(result);
	}
}