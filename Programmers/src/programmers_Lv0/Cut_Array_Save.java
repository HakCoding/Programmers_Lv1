package programmers_Lv0;

import java.util.ArrayList;
import java.util.Scanner;

public class Cut_Array_Save {

	public static void main(String[] args) {

		// 문자열 my_str과 n이 매개변수로 주어질 때,
		// my_str을 길이 n씩 잘라서 저장한 배열을
		// return하도록 solution 함수를 완성해주세요.

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		String input;
		int num;

		System.out.print("문자 입력 : ");
		input = scanner.nextLine();
		System.out.println();
		System.out.print("저장할 길이 입력 : ");
		num = Integer.parseInt(scanner.nextLine());
		System.out.println();

		while (input.length() >= num) {
			list.add(input.substring(0, num));
			input = input.substring(num, input.length());
		}
		list.add(input);
		System.out.println(list.toString());

		scanner.close();
	}
}
