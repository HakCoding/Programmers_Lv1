package programmers_Lv0;

import java.util.ArrayList;
import java.util.Scanner;

public class Next_Number {

	public static void main(String[] args) {

		// 등차수열 혹은 등비수열 common이 매개변수로 주어질 때,
		// 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> common = new ArrayList<Integer>();
		int input, num1, num2;
		String end;

		while (true) {
			System.out.println("일력이 끝났다면  \"끝\" 입력");
			System.out.print("수열 값 입력 : ");
			end = scanner.nextLine();
			if (end.equals("끝")) {
				break;
			} else {
				input = Integer.parseInt(end);
				common.add(input);
			}
		}
		for (int i = 0; i < common.size(); i++) {
			num1 = (int) common.get(i + 1) - (int) common.get(i);
			num2 = (int) common.get(i + 2) - (int) common.get(i + 1);
			if (num1 == num2) {
				System.out.print(common.toString());
				System.out.printf("는 공차가 %d인 등차 수열이므로 다음에 올 수는 %d이다", num1, (int) common.get(common.size() - 1) + num1);
				break;
			}
			num1 = (int) common.get(i + 1) / (int) common.get(i);
			num2 = (int) common.get(i + 1) / (int) common.get(i);
			if (num1 == num2) {
				System.out.print(common.toString());
				System.out.printf("는 공비가 %d인 등비수열이므로 다음에 올 수는 %d이다.", num1, (int) common.get(common.size() - 1) * num1);
				break;
			}
		}
		scanner.close();
	}
}