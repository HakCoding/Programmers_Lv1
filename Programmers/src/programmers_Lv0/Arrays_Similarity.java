package programmers_Lv0;

import java.util.Scanner;

public class Arrays_Similarity {

	public static void main(String[] args) {
		
		// 두 배열이 얼마나 유사한지 확인해보려고 합니다.			// 1 ≤ s1, s2의 길이 ≤ 100
		// 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를		// 1 ≤ s1, s2의 원소의 길이 ≤ 10
		// return하도록 solution 함수를 완성해주세요.				// s1과 s2의 원소는 알파벳 소문자로만 이루어져 있습니다
																					// s1과 s2는 각각 중복된 원소를 갖지 않습니다.
		Scanner scanner = new Scanner(System.in);
		String[] s1 = null;
		String[] s2 = null;
		String[] output = new String[100];
		String input1, input2;
		int count = 0;													// 변수 선언

		System.out.print("첫번째 문자열 입력 : ");
		input1 = scanner.nextLine();
		System.out.print("두번째 문자열 입력 : ");
		input2 = scanner.nextLine();							// 입력

		s1 = input1.split(" ");										// 첫번째 문자열을 띄어쓰기 기준으로 배열에 저장
		s2 = input2.split(" ");										// 두번째 문자열을 띄어쓰기 기준으로 배열에 저장

		for (int i = 0; i < s1.length; i++) {					
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {							// 두 배열의 원소 값이 같은지 비교
					output[count] = s1[i];							// 출력 배열에 같은 값 저장
					count++;												// 카운터 증가
				}
			}
		}
		if (count == 0) {
			System.out.printf("같은 원소가 없으므로 %d을 return합니다", count);
		} else {
			for (int i = 0; i < count; i++) {
				if (i == count - 1) {
					System.out.printf("%s가 같으므로 %d를 return합니다", output[i], count);
				} else {
					System.out.printf("%s와", output[i]);
				}																//	출력
			}
		}
		scanner.close();
	}
}
