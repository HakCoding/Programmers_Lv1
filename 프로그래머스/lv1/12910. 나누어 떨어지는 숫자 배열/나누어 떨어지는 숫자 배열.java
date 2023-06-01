import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) { // 나누어 떨어지는지 검사
				list.add(arr[i]); // 떨어진다면 list에 저장
			}
		}
		if(list.size() == 0) answer = new int[] {-1}; // list 사이즈가 0 이면 -1 저장
        else {
		    answer = new int[list.size()]; // 배열 크기 지정
		    for (int i = 0; i < answer.length; i++) {
			    answer[i] = list.get(i); // 배열에 list 값 저장
		    }
		    Arrays.sort(answer); // 오름차순 정렬
        }
        return answer;
    }
}