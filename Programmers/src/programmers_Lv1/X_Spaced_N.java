package programmers_Lv1;

import java.util.ArrayList;
import java.util.Scanner;

public class X_Spaced_N {
	
	// 함수 solution은 정수 x와 자연수 n을 입력 받아, 
	// x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
	// 다음 제한 조건을 보고, 조건을 만족하는 함수를 완성해주세요.

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int x, n, num;														// 변수 선언
		
		System.out.print("시작 정수 입력 : ");
		x = Integer.parseInt(scanner.nextLine());
		System.out.print("갯수 입력 : ");
		n = Integer.parseInt(scanner.nextLine());			// 입력
		
		for (int i = 1; arr.size() < n; i++) {
			num = i*x;														// 입력 값 계산
			arr.add(num);													// 입력 횟수만큼 저장
		}
		arr.forEach(i -> System.out.println(i));				// 출력
		scanner.close();
	}

}
