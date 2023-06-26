class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int day = 0; // 요일 계산
		String[] arr = new String[] { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" }; // 일주일 표시 배열
		int[] monthEnd = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 월말 일수 배열
		for (int i = 0; i < a - 1; i++) {
			day += monthEnd[i]; // 1월부터 조건의 달 -1 만큼 일수 더하기
		}		
		day += b - 1; // 조건의 일수 더하기
		answer = arr[day % 7]; // 일주일로 나눈 나머지의 인덱스 값
        return answer;
    }
}