class Solution {
    public String solution(int n) {
        String answer = "";
        String str1 = "수";
		String str2 = "수박";
        for (int i = 0; i < n/2; i++) {
			answer = answer + str2;
		} // n / 2 한만큼 "수박"을 찍는다
        answer = n%2 != 0 ? answer+str1 : answer; // 홀수이면 마지막에 "수"를 추가
        return answer;
    }
}