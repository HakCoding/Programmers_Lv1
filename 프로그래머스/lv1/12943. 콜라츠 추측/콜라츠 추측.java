class Solution {
    public int solution(long num) {
        int answer = 0;
        while (num != 1) {
			num = num % 2 == 0 ? num / 2 : (num * 3) + 1; // 홀수 짝수 계산식
			answer++; // 카운터 증가
			if (answer >= 500) { // 500회 이상이면 
				answer = -1; // -1 반환
				break;
			}
        }
        return answer;
    }
}