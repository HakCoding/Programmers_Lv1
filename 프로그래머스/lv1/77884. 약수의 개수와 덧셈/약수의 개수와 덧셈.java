class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        for(int i = left; i <= right; i++) {
            count = 0; // 홀수 짝수 구별하는 변수
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) count++; // 약수이면 변수 증가
            }            
            if(count % 2 == 0) answer += i; // 짝수이면 더하기
            else answer -= i; // 홀수이면 빼기
        }
        return answer;
    }
}