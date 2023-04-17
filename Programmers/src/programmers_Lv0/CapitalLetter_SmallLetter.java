package programmers_Lv0;

import java.util.Scanner;

public class CapitalLetter_SmallLetter {

	public static void main(String[] args) {

		// 문자열 my_string이 매개변수로 주어질 때, 
		// 대문자는 소문자로 소문자는 대문자로 변환한 
		// 문자열을 return하도록 함수를 완성해주세요.	
		
		Scanner scanner = new Scanner(System.in);
		char[] arr = null;
		String input;									//	변수 선언

		System.out.print("문자 입력 : ");
		input = scanner.nextLine();			// 입력
		
		arr = input.toCharArray();
		for (int i = 0; i < arr.length; ++i) {
			
			if (arr[i] >= 65 && arr[i] <= 90) {
				arr[i] = (char) (arr[i] + 32);		// 대문자 -> 소문자
			}															
			else if (arr[i] >= 97 && arr[i] <= 122) {
				arr[i] = (char) (arr[i] - 32);
			}													// 소문자 -> 대문자
		}
		System.out.print(arr);						// 출록
		scanner.close();
	}
}
