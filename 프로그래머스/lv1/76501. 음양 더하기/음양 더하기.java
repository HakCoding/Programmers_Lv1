class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
			if(signs[i])	answer += absolutes[i]; // true면 변수에 더하기
			if(!signs[i])	answer += (absolutes[i]*-1); // false면 곱하기 -1 후 더하기
		}
        return answer;
    }
}