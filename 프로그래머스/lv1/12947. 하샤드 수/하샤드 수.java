class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int xx = x; // x 값 복사
		int sum = 0; // 합계 변수
		while (xx > 0) {			
			sum = sum + xx % 10; // 1의 자리 덧셈
			xx = xx / 10; // 1의자리 날림
		}		
		answer = x % sum == 0 ? true : false; //나머지가 0인지 아닌지 판단
        return answer;
    }
}