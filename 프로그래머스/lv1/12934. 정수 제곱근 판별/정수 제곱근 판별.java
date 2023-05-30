class Solution {
    public long solution(long n) {
        long answer = -1;
        long num = 0;
        while (num * num < n) {
			num++; // 제곱근이 n보다 작은 최댓값을 구한다
		}
		if (num * num == n) {
			num++; // 제곱한 값이 n과 같다면 더하기 1을 한다
			answer = num * num; // num을 하여 값을 저장한다
		} 
        
		return answer;
    }
}