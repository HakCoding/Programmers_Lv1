package programmers_Lv0;

import java.util.ArrayList;
import java.util.Scanner;

public class String_Sort {

	public static void main(String[] args) {		
		
		// 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
		// my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을
		// return 하도록 함수를 완성해보세요.

		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> arr = new ArrayList<Character>();
		String input;																		// 변수 선언

		System.out.print("문자 입력 : ");
		input = scanner.nextLine();												// 입력
		for (int i = 0; i < input.length(); i++) {								// 배열에 소문자로 변한후
			arr.add(input.toLowerCase().charAt(i));		 				// 한글자씩 저장
		}																				
		
		arr.sort(null);
		System.out.printf("\"%s\"를 모두 소문자로 바꾸면 \"%s\"이고 이를 알파벳 순으로 정렬하면", input, input.toLowerCase());
		for (char i : arr) System.out.print(i + " ");							// 출력
		scanner.close();
	}
}
