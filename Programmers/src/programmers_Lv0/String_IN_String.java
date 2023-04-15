package programmers_Lv0;

import java.util.Scanner;

public class String_IN_String {

	public static void main(String[] args) {
		
		// 문자열 str1, str2가 매개변수로 주어집니다. 
		// str1 안에 str2가 있다면 1을 없다면 2를 
		// return하도록 완성해주세요.

		Scanner scanner = new Scanner(System.in);
		String st1, st2;
		int result = 2;														// 변수 선언

		System.out.print("문자열 입력 : ");
		st1 = scanner.nextLine();
		System.out.print("찾을 문자 입력 : ");
		st2 = scanner.nextLine();									// 입력 값

		if (st1.contains(st2)) {											// st1문자에 st2가 존재 여부 판단
			result = 1;
			System.out.printf("%s에 %s가 존재하므로 %d을 return합니다", st1, st2, result);
		} 
		else {
			System.out.printf("%s에 %s가 없으므로 %d를 return합니다", st1, st2, result);
		}																			//	출력
		scanner.close();
	}
}
