class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum = 45; // 0 ~ 9 까지 더한값        
        for(int i = 0; i < numbers.length; i++) {
			sum = sum-numbers[i]; // 총합에서 배열에 값을 뺀다
		}
        answer = sum; // 변수에 저장
        return answer;
    }
}