import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) { // n이 0보다 클때까지 반복
        answer = answer + n % 10; // 1의자리 더하기
        n = n / 10 ; // 1의 자리 없애기
        }
        return answer;
    }
}