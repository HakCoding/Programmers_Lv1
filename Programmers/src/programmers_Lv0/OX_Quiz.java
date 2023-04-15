package programmers_Lv0;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class OX_Quiz {

	public static void main(String[] args) {

		// 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는
		// 문자열 배열 quiz가 매개변수로 주어집니다.
		// 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을
		// return하도록 solution 함수를 완성해주세요.

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<String> OX = new ArrayList<String>();
		Random ran = new Random();

		int n1, n2, calculation, num, answer;
		int i = 0; // count 변수
		int sign; // + - 계산 변수
		String pm = ""; // +, - 변수											

		System.out.println("연산할 횟수 입력 (1 ~ 5)");
		num = Integer.parseInt(scanner.nextLine());				//	변수 선언

		while (num > i) {
			n1 = ran.nextInt(201) - 100;
			n2 = ran.nextInt(201) - 100;									// 랜덤으로 숫자 결정
			sign = ran.nextInt(2);												// 랜덤으로 부호 결정
			if (sign == 1) {
				pm = "+";
				calculation = n1 + n2;											// + 계산식 출제
				arr.add(calculation);											// 계산값 저장												
			} else {
				pm = "-";
				calculation = n1 - n2;											// - 계산식 출제
				arr.add(calculation);											// 계산값 저장							 	
			}
			i++;
			System.out.printf("%d %s %d = ?\n", n1, pm, n2);
		}																					// 문제 출력

		for (int j = 1; j <= num; j++) {
			System.out.print(j + "번째 답 입력 : \n");
			answer = Integer.parseInt(scanner.nextLine());
			if (arr.get(j - 1).equals(answer)) {
				OX.add("O");
			} else {
				OX.add("X");														// 정답 입력
			}
		}																				

		System.out.println(OX.toString());								// 결과 출력

		scanner.close();
	}
}
