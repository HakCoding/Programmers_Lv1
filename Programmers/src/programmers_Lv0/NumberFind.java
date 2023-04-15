package programmers_Lv0;

import java.util.Scanner;

public class NumberFind {

	public static void main(String[] args) {
		
		// 정수 num과 k가 매개변수로 주어질 때,
		// num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고
		// 없으면 -1을 return 하도록 함수를 완성해보세요.

		Scanner scanner = new Scanner(System.in);
		String input;
		int num, k, result = -1;
		int count;																// 변수 선언

		System.out.print("숫자 입력 : ");
		input = scanner.nextLine();
		System.out.print("찾을 숫자 입력 : ");
		k = Integer.parseInt(scanner.nextLine());
		count = input.length();
		num = Integer.parseInt(input);							// 입력	

		for (int i = input.length(); i >= 1; i--) {				// 마지막 위치에서 비교하여
			if (num % 10 == k) {											// 찾을 숫자가 포함 되어있으면
				count = i;														// 위치를 저장
				result = 0;													// 출력 방식 결정
			}
			num = num / 10;
		}
		if (result == 0) {
			System.out.printf("%s에서 %d(은/는) %d번째에 있습니다", input, k, count);
		}
		else {
			System.out.printf("%s에서 %d(은/는) 없으므로 %d을 return 합니다", input, k, result);
		}																			// 출력
		scanner.close();
	}
}
