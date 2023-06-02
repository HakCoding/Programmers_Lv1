class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
		for (int i = 0; i < b.length; i++) {
			answer +=  a[i] * b[i]; // 변수에 계산값 저장
		}
        return answer;
    }
}