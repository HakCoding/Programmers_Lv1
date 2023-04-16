package programmers_Lv0;

import java.util.ArrayList;
import java.util.Scanner;

public class OnceAppearText {

	public static void main(String[] args) {
		
		// 문자열 s가 매개변수로 주어집니다.
		// s에서 한 번만 등장하는 문자를 사전 순으로
		// 정렬한 문자열을 return 하도록 함수를 완성해보세요.
		// 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> arr = new ArrayList<Character>();
		ArrayList<Character> result = new ArrayList<Character>();
		String input;																//	 변수 선언
		
		System.out.print("문자 입력 : ");
		input = scanner.nextLine();										// 입력	
		
		for (int i = 0; i < input.length(); i++) {
			arr.add(input.charAt(i));																
			result.add(input.charAt(i));									//	두 배열에 한글자씩 저장																		
		}
		arr.forEach(i -> System.out.print(i));
		System.out.println();
		for (int i = 0; i <= arr.size()-1; i++) {		
			for (int j = i+1; j < arr.size(); j++) {
				if(arr.get(i).equals(arr.get(j))){							// 배열을 비교 하여 
					result.remove(arr.get(i));								// 같은 문자면
					result.remove(arr.get(j));								// 두 문자 삭제
				}																		
			}
		}
		result.sort(null);															// 정렬
		result.forEach(i -> System.out.print(i));						//	출력	
		scanner.close();
	}
}
