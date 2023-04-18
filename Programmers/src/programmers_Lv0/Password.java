package programmers_Lv0;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {

		// 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
		// 암호화된 문자열 cipher를 주고받습니다.
		// 그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
		// 문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된
		// 암호 문자열을 return하도록 함수를 완성해주세요.

		Scanner scanner = new Scanner(System.in);
		char[] arr = null;
		String input;
		int num;

		System.out.print("문자 입력 : ");
		input = scanner.nextLine();
		System.out.print("코드 입력 : ");
		num = Integer.parseInt(scanner.nextLine());					// 입력

		arr = input.toCharArray();												// 배열에 저장

		System.out.print(arr);
		System.out.print("의 ");
		for (int i = num - 1; i < arr.length; i = i + num) {			
			if (arr.length - i < num) {												//	마지막 암호는 , 생략
				System.out.print((i+1) + "번째 글자를 합친");
			} 
			else {
				System.out.print(i + 1 + "번째, ");							//	암호에 , 입력
			}
		}
		for (int i = num - 1; i < arr.length; i = i + num) {
			System.out.print(arr[i]);
		}
		System.out.println("을 return합니다");							// 출력
		scanner.close();
	}
}
