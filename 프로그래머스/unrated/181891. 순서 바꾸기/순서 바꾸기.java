class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
		int idx = 0; // 인덱스 변수
		for (int i = n; i <num_list.length; i++) { // n 부터 배열의 마지막 인덱스까지
			answer[idx] = num_list[i]; // 배열에 저장
			idx++; // 인덱스 증가
		}
		for (int i = 0; i < n; i++) { // 처음부터 n - 1 번째 인덱스 까지
			answer[idx] = num_list[i]; // 배열에 저장
			idx++; // 인덱스 증가
		}
        return answer;
    }
}