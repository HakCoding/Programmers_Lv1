package programmers_Lv0;

import java.util.ArrayList;
import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {

		// 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로
		// 담은 배열을 return하도록 함수를 완성해주세요.

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int input;																		// 변수 선언

		System.out.print("정수 입력 : ");
		input = Integer.parseInt(scanner.nextLine());			// 입력

		for (int i = 1; i <= input; i++) {
			for (int j = 0; j <= input; j++) {
				if (i * j == input) {				
						arr.add(i);													//	약수 계산
				}
			}
		}
		arr.sort(null);																// 오름차순 정렬
		System.out.println(arr.toString());								// 출력
		scanner.close();
	}
}
