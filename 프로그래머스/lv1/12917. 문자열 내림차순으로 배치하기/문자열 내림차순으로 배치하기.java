import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(""); // 한글자씩 배열에 저장
		Arrays.sort(strArr, Collections.reverseOrder()); // 오름차순으로 정렬
		for (int i = 0; i < strArr.length; i++) {
			answer += strArr[i]; // 해당 인덱스 값을 문자열에 저장
		}
        return answer;
    }
}