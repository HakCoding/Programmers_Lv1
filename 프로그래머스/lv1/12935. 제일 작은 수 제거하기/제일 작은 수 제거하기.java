class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length-1 == 0) answer = new int[] {-1}; // 배열길이가 1이면 -1값 저장
		else answer = new int[arr.length-1]; // 아니면 배열길이의 -1만큼 지정
		
		int count = 0; // 배열 인덱스 변수
		int min = arr[0]; // 최솟값 임의로 지정
		for (int i = 0; i < arr.length; i++) {
			if(min >= arr[i]) min = arr[i]; // 최솟값 판단
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != min) { // 최솟값이 아니면
				answer[count] = arr[i]; // 배열에 저장
				count++; // 인덱스 증가
			}
		}
        return answer;
    }
}