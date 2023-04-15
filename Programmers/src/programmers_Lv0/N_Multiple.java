package programmers_Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class N_Multiple {

	public static void main(String[] args) {

		// 정수 n과 정수 배열 numlist가 매개변수로 주어질 때, 	//1 ≤ n ≤ 10,000
		// numlist에서 n의 배수가 아닌 수들을 제거한 배열을 		// 1 ≤ numlist의 크기 ≤ 100
		// return하도록 함수를 완성해주세요.							// 1 ≤ numlist의 원소 ≤ 100,000

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> result = new ArrayList<Integer>();
		int n;
		String input;
		String[] numlist = null;
		int[] num = null;

		System.out.print("배수 값 입력 : ");
		n = Integer.parseInt(scanner.nextLine());
		System.out.print("배열 입력 : ");

		input = scanner.nextLine();
		numlist = input.split(" ");
		num = new int[numlist.length];
		for (int i = 0; i < numlist.length; i++) {
			num[i] = Integer.parseInt(numlist[i]);
		}

		for (int i = 0; i < num.length; i++) {
			if (num[i] % n == 0) {
				result.add(num[i]);
			}
		}
		System.out.printf("%s에서 %d의 배수만을 남긴 %s를 return합니다", Arrays.toString(num), n, result.toString());
		scanner.close();
	}
}
