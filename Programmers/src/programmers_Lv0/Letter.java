package programmers_Lv0;

import java.util.Scanner;

public class Letter {

	public static void main(String[] args) {
		
		// 머쓱이는 할머니께 생신 축하 편지를 쓰려고 합니다. 
		// 할머니가 보시기 편하도록 글자 한 자 한 자를 가로 2cm 크기로 적으려고 하며, 
		// 편지를 가로로만 적을 때, 축하 문구 message를 적기 위해 필요한 편지지의 
		// 최소 가로길이를 return 하도록 함수를 완성해주세요.
		
		Scanner scanner = new Scanner(System.in);		
		char[] arr = null;
		String input;											//	 변수 선언
		
		System.out.print("편지 내용 입력: ");		
		input = scanner.nextLine();
		arr = input.toCharArray();						// 입력값 한글자씩 배열에 입력 
				
		System.out.printf("\"%s\"의 글자 수가 %d개로 최소 가로 %dcm의 편지지가 필요합니다",input, arr.length, arr.length*2);
		scanner.close();			// 출력
	}

}
