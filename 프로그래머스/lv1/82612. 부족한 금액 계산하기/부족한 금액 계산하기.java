class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for (int i = 0; i < count; i++) {
			answer = answer + (price * (i+1)); // 횟수만큼 금액이 증가한다
		}
		answer = money >= answer ? 0 : answer - money; // 필요한 금액 계산
        return answer;
    }
}