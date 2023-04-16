package programmers_Lv0;

import java.util.Scanner;

public class Index_Change {

	public static void main(String[] args) {

		// 문자열 my_string과 정수 num1, num2가
		// 매개변수로 주어질 때, my_string에서 인덱스
		// num1과 인덱스 num2에 해당하는 문자를
		// 바꾼 문자열을 return 하도록 함수를 완성해보세요.
		
		Scanner scanner = new Scanner(System.in);
		char[] arr= null;
		String input;
		char tmp;		
		int num1, num2;														//	변수 선언
		
		System.out.print("문자열 입력 : ");
		input = scanner.nextLine();
		System.out.print("num1 입력 : ");
		num1 = Integer.parseInt(scanner.nextLine());
		System.out.print("num2 입력 : ");
		num2 = Integer.parseInt(scanner.nextLine());		//	입력
		
		arr = new char[input.length()];
		for (int i = 0; i < input.length(); i++) {
			arr[i] = input.charAt(i);										//	배열에 저장
		}
		tmp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = tmp;													//	문자 바꾸기
		
		for(char i : arr) { System.out.print(i);}					//	출력
		scanner.close();
	}
}
