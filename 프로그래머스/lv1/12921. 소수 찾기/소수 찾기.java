class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
			int check = 1; // 소수인지 체크
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) { // 소수인지 체크
					check = 0; // 소수가 아니면 0
					break; // 반목문 중단
				}
			}
			if (check == 1) // 소수이면
				answer++; // 변수 증가
		}
        return answer;
    }
}