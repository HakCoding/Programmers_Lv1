class Solution {
    public String solution(int num) {
        String answer = "";
        answer = num % 2 != 0 ? "Odd" : "Even" ; // 나머지가 0이 아니면 홀수 0이면 짝수
        return answer;
    }
}