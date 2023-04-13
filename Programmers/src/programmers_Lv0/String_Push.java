package programmers_Lv0;

import java.util.Scanner;

public class String_Push {

	public static void main(String[] args) {

		// 문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고
		// 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다.
		// 이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때,
		// A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고 밀어서
		// B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

		Scanner scanner = new Scanner(System.in);
		char[] arrA = null;
		char[] arrB = null;
		String inputA, inputB;
		char tmp;
		int result = 0, check = 0;

		System.out.print("문자 입력 : ");
		inputA = scanner.nextLine();
		System.out.println();
		System.out.print("밀린 문자 입력 : ");
		inputB = scanner.nextLine();
		System.out.println();

		arrA = inputA.toCharArray();
		arrB = inputB.toCharArray();
		System.out.println();

		while (result < arrA.length) {
			for (int i = 0; i < arrA.length; i++) {
				if (arrA[i] != arrB[i]) {
					check = 1;
				}
			}
			if (check == 1) {
				check = 0;
				tmp = arrA[inputA.length() - 1];
				for (int j = arrA.length - 1; j > 0; j--) {
					arrA[j] = arrA[j - 1];
				}
				arrA[0] = tmp;
				result++;
			} else {
				break;
			}
		}
		if (inputA.length() > result) {
			System.out.printf("\"%s\"를 오른쪽으로 %s 칸 밀면 \"%s\"가 됩니다", inputA, result, inputB);
		} else {
			System.out.printf("\"%s\"은 몇 번을 밀어도 \"%s\"가 될 수 없습니다.", inputA, inputB);
		}
		scanner.close();
	}
}
