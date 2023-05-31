class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n); // String값으로 변환
	    char[] s = str.toCharArray(); // 배열에 한글자씩 저장
	    int[] answer = new int[str.length()]; // 배열 길이 선언
	    for(int i=str.length()-1;i>=0;i--) {//뒤집어서 입력
	        answer[str.length()-1-i] = str.charAt(i)-'0'; // 배열에 저장
	    }
	    return answer;
    }
}