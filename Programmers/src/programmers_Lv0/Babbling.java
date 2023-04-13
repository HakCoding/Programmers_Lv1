package programmers_Lv0;

import java.util.Scanner;

public class Babbling {
	public static void main(String[] args) {

		// 머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다.
		// 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대
		// 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다.
		// 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가
		// 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.

		Scanner scanner = new Scanner(System.in);
		String input;
		int num = 0;
		String[] babbling = new String[] { "aya", "ye", "woo", "ma" };

		System.out.print("옹알이 입력 : ");
		input = scanner.nextLine();
		for (int i = 0; i < babbling.length; i++) {
			if (input.contains(babbling[i])) {
				input = input.replaceAll(babbling[i], "");
				num++;
			}
		}
		System.out.println(num);
		scanner.close();
	}
}
