class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.replaceAll("A", "b"); // 모든 A를 b로
		myString = myString.replaceAll("B", "a"); // 모든 B를 a로
		myString = myString.toUpperCase(); // 모든 문자열 대문자로 변환
		if (myString.contains(pat)) answer = 1; // 포함여부 확인
        return answer;
    }
}