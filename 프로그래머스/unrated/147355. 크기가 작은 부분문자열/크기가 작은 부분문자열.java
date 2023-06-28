import java.math.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        BigInteger bigIntA = new BigInteger(p); // p를 BigInteger로 저장
		String str = "";
		for (int i = 0; i < t.length()-p.length()+1; i++) {
			str += t.substring(i,i+p.length()) + " "; // 조건에 맞는 문자열 + 띄어쓰기를 문자열로 저장
		}				
		String[] strArr = str.split(" "); // 띄어쓰기 마다 배열에 저장
		for (int i = 0; i < strArr.length; i++) {
			BigInteger bigIntB = new BigInteger(strArr[i]); // 비교를 위한 BigInteger 선언
			if(bigIntA.compareTo(bigIntB) == 1 || bigIntA.compareTo(bigIntB) == 0) answer++; // 비교하여 참이면 변수 증가
		}
        return answer;
    }
}