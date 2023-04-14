package programmers_Lv0;

import java.util.Scanner;

public class Square_number {
	public static void main(String[] args) {

		// 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
		// 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록
		// solution 함수를 완성해주세요.
		// 1<= n <= 1,000,000 ( n 의 범위)

		Scanner scanner = new Scanner(System.in);
		int input, num = 0, answer = 2;
		System.out.print("정수 입력 : ");
		input = Integer.parseInt(scanner.nextLine());

		for (int i = 1; i <= 10000000; i++) {
			if (i * i == input) {
				answer = 1;
				num = i;
				break;
			}
		}

		if (answer == 1) {
			System.out.printf("%d는 %d의 제곱이므로 제곱수입니다. " + "따라서 %d을 return합니다", input, num, answer);
		} else {
			System.out.printf("%d은 제곱수가 아닙니다. " + "따라서 %d를 return합니다", input, answer);
		}
		scanner.close();
	}
}
