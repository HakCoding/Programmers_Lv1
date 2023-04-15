package programmers_Lv0;

import java.util.Scanner;

public class String_Calculate {

	public static void main(String[] args) {		
		
		// my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 
		// 문자열 my_string이 매개변수로 주어질 때, 
		// 수식을 계산한 값을 return 하는 함수를 완성해주세요.
		
		Scanner scanner = new Scanner(System.in);
		String[] st;
		int n1, n2, sum;													//	변수
		
		System.out.print("수식 입력 : ");
		st = scanner.nextLine().split(" ");						//	입력 값을 띄어쓰기를 기준으로 배열에 저장
		
		n1 = (Integer.parseInt(st[0]));								// String >> int
		n2 = (Integer.parseInt(st[2]));								// String >> int
		sum = n1 + n2;														// 계산
		
		System.out.println(n1 + " + " + n2 + " = " + sum + "을 return 합니다");									
		scanner.close();													//출력
	}

}
