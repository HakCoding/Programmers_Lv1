import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length]; // 배열 길이 선언
        String[] strArr = new String[strings.length]; // 배열 길이 선언
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = strings[i].substring(n, n+1) + " " + strings[i]; // 조건에 맞는 인덱스 값 + 띄어쓰기 + 배열값으로 저장
		}
		Arrays.sort(strArr); // 오름차순 정렬
		for (int i = 0; i < strArr.length; i++) {
			answer[i] = strArr[i].substring(2, strArr[i].length()); // 띄어쓰기 이후 부터 배열에 저장
		}
        return answer;
    }
}