class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i = 0; i < arr.length; i++) {
			answer = answer + arr[i]; // 모든값 더하기
		}
		answer = answer / arr.length; // 배열의 갯수만큼 나누기
        return answer;
    }
}