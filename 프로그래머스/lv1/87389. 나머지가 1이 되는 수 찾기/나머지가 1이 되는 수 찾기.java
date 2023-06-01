class Solution {
    public int solution(int n) {
        int answer = 0;     
        for (int i = 1; i < n; i++) {
			if (n % i == 1) { // 나머지 1인지 확인
				answer = i; // 1이면 저장
				break; // 반복문 정지
			}
		}
        return answer;
    }
}