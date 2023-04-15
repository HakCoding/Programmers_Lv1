package programmers_Lv0;

import java.util.ArrayList;
import java.util.Scanner;

public class Number_Of_Digits {

	public static void main(String[] args) {

		// 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을
		// return하도록 함수를 완성해주세요

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int num, sum = 0;														// 변수 선언

		System.out.print("정수 입력 : ");
		num = Integer.parseInt(scanner.nextLine());				// 입력

		while (num != 0) {
			sum = sum + (num % 10);										// 일의자리 덧셈
			arr.add(num % 10);													//	배열에 한자리씩 입력
			num = num / 10;														// >> 1 연산											
		}
		for (int i = arr.size() - 1; i >= 0; i--) {
			System.out.print(arr.get(i));
			if (i == 0) {
				System.out.print(" = ");										// 배열의 마지막이면 = 을 출력
			}
			else {
				System.out.print(" + ");										// 배열에 출력 값이 남았으면 + 출력
			}
		}
		System.out.println(sum + "을 return 합니다");
		scanner.close();															// 출력
	}
}