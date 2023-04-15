package programmers_Lv0;

import java.util.ArrayList;
import java.util.Scanner;

public class Biggest_Num {

	public static void main(String[] args) {

		// 정수 배열 array가 매개변수로 주어질 때, 
		// 가장 큰 수와 그 수의 인덱스를 담은 배열을
		// return 하도록 함수를 완성해보세요.

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String input;
		int bigN, index = 0;																// 변수 선언

		while (true) {
			System.out.println("입력을 다하셨으면 \"끝\" 을 입력하세요");
			System.out.println("숫자 입력 : ");
			input = scanner.nextLine();

			if (input.equals("끝")) {
				break;
			}
			arr.add(Integer.parseInt(input));									// 입력 값을 배열에 저장
		}																							//	입력

		bigN = arr.get(0);
		for (int i = 0; i < arr.size(); i++) {
			if (bigN < arr.get(i)) {
				bigN = arr.get(i);
				index = i;																	
			}																						// 가장 큰 수 찾기 
		}
		System.out.print(arr.toString());
		System.out.printf("중 가장 큰 수는 %d이고 인덱스 %d에 있습니다", bigN, index); 		// 출력
		scanner.close();
	}
}
