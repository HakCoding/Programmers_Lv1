package programmers_Lv0;

import java.util.Scanner;

public class Paper_Cut {

	public static void main(String[] args) {

		// 머쓱이는 큰 종이를 1 x 1 크기로 자르려고 합니다.
		// 예를 들어 2 x 2 크기의 종이를 1 x 1 크기로 자르려면 최소 가위질 세 번이 필요합니다.
		// 정수 M, N이 매개변수로 주어질 때, M x N 크기의 종이를 최소로 가위질 해야하는 횟수를
		// return 하도록 solution 함수를 완성해보세요.

		Scanner scanner = new Scanner(System.in);
		int inputN1, inputN2;
		int n1 = 0, n2 = 0, cut = 0;

		System.out.print("가로 길이 입력 : ");
		inputN1 = Integer.parseInt(scanner.nextLine());
		System.out.print("세로 길이 입력 : ");
		inputN2 = Integer.parseInt(scanner.nextLine());

		if (inputN1 == 1 && inputN2 == 1) {
			System.out.println("이미 1 X 1 크기이므로 0을 return 합니다");
		} else {
			cut = (inputN1 - 1) + (inputN2 - 1) * inputN1;
			n2 = (inputN2 - 1) * inputN1;
			n1 = inputN1 - 1;
		}
		System.out.printf("가로 %d, 세로 %d인 종이는 가로로 %d번 세로로%d번 총 가위질 %d번이 필요합니다", inputN1, inputN2, n1, n2, cut);

		scanner.close();
	}
}
