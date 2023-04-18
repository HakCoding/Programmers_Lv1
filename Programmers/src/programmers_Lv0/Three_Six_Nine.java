package programmers_Lv0;

import java.util.Scanner;

public class Three_Six_Nine {

	public static void main(String[] args) {

		// 머쓱이는 친구들과 369게임을 하고 있습니다.
		// 369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는
		// 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다.
		// 머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때,
		// 머쓱이가 쳐야할 박수 횟수를 return 하도록 함수를 완성해보세요.

		Scanner scanner = new Scanner(System.in);
		int input, num, three = 0, six = 0, nine = 0;		// 변수 입력

		System.out.print("숫자 입력 : ");
		input = Integer.parseInt(scanner.nextLine());
		num = input;														//	입력

		while (num > 0) {
			if (num % 10 == 3) {
				three++;														// 3이 있으면 3 변수 증가
			}
			if (num % 10 == 6) {
				six++;															// 6이 있으면 6 변수 증가
			}
			if (num % 10 == 9) {											
				nine++;														// 9가 있으면 9 변수 증가
			}
			num = num / 10;
		}

		System.out.print(input + "은 ");
		if (three != 0 && six == 0 && nine == 0) {
			System.out.print("3이 " + three + "개");
		} else if (three != 0) {
			System.out.print("3이 " + three + "개, ");
		}
		if (six != 0 && nine == 0) {
			System.out.print("6이 " + six + "개 ");
		}
		else if (six != 0) {
			System.out.print("6이 " + six + "개, ");
		}
		if (nine != 0) {
			System.out.print("9가 " + nine + "개 ");
		}
		System.out.println("있으므로" + (three + six + nine) + "을 출력합니다");
		scanner.close();													// 출력
	}

}
