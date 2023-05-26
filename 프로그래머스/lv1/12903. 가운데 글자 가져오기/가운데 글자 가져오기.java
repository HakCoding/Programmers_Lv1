class Solution {
    public String solution(String s) {
        String answer = "";
        int size = s.length()/2; // 중앙값 변수
		int len = 1; // 끝점 변수
		if(s.length()%2 == 0) size = s.length()/2-1; // 짝수면 -1
		if(s.length()%2 == 0) len = 2; // 짝수면 +1
		
		answer = s.substring(size, size+len); // 중앙값부터 끝지점 변수 까지
        return answer;
    }
}