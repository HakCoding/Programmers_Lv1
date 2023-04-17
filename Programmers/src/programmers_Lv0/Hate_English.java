package programmers_Lv0;

import java.util.Scanner;

public class Hate_English {

	public static void main(String[] args) {
		// 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
		// 문자열 answer가 매개변수로 주어질 때,
		// answer를 정수로 바꿔 return 하도록 함수를 완성해 주세요.

		Scanner scanner = new Scanner(System.in);
		String input, answer;									// 변수 선언
		
		System.out.print("문자입력 : ");
		input = scanner.nextLine();						//	입력
		
		answer = input;
		answer = answer.replace("zero","0");
		answer = answer.replace("one","1");
		answer = answer.replace("two","2");
		answer = answer.replace("three","3");
		answer = answer.replace("four","4");
		answer = answer.replace("five","5");
		answer = answer.replace("six","6");
		answer = answer.replace("seven","7");
		answer = answer.replace("eight","8");
		answer = answer.replace("nine","9");			// 변환
		
		
		System.out.printf("%s를 숫자로 바꾼 %s를 return합니다", input, answer);						
        scanner.close();											// 출력
		
	}
}
