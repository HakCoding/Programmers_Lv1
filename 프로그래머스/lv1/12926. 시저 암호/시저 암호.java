import java.util.*;
class Solution {
    public String solution(String s, int n) {
       	String answer = "";
		char[] arr = s.toCharArray(); // 배열에 한글자씩 저장
		for (int i = 0; i < arr.length; i++) {
		    if (arr[i] == ' ') answer += ' '; // 공백이면 공백 추가
			else if (Character.isUpperCase(arr[i])) {
				int temp = (int) arr[i] + n; // 문자에 n 번째 만큼 증가
				if (temp > 90) answer += (char) (temp - 26); // Z 이상의 값이면 -26
				else answer += (char) temp; // 아니면 변수에 저장
            } 
			else {
				int temp = (int) arr[i] + n; // 문자에 n 번째 만큼 증가
				if (temp > 122) answer += (char) (temp - 26); // z 이상의 값이면 -26
				else answer += (char) temp; // 아니면 변수에 저장
			}
		}
        return answer;
    }
}