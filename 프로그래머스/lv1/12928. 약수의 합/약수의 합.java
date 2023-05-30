class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) { // 1부터 n 까지 숫자 비교
			for (int j = 1; j <= n; j++) {
				if (i * j == n) { // 1부터 곱해서 n이 나오면 그건 약수
					answer = answer + i; // 약수를 구했으면 그 값을 더한다
				}
			}
		}
        return answer;
    }
}