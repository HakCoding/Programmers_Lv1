package programmers_Lv0;

import java.util.ArrayList;
import java.util.Scanner;

public class Seven_Counter {

	public static void main(String[] args) {

		// 머쓱이는 행운의 숫자 7을 가장 좋아합니다.
		// 정수 배열 array가 매개변수로 주어질 때,
		// 7이 총 몇 개 있는지 return 하도록 완성해보세요'

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String input = "";
		int num = 0, cnt = 0;

		System.out.println("입력이 끝났으면 \"끝\" 입력");

		while (true) {
			System.out.print("정수 입력 : ");
			input = scanner.nextLine();
			if (input.equals("끝")) {
				break;
			}
			arr.add(Integer.parseInt(input));
		}

		for (int i = 0; i < arr.size(); i++) {
			num = arr.get(i);
			for (; num != 0;) {
				if (num % 10 == 7) {
					cnt++;
				}
				num = num / 10;
			}
		}
		System.out.println(cnt);
		scanner.close();
	}

}
