import java.util.*;
public class Solution {
    public int[] solution(int []arr) {         
       ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]); // 리스트 0번째에 배열 0번째 인덱스 저장
		int idx = 0; // 인덱스 변수
		for (int i = 0; i < arr.length; i++) {
			if(list.get(idx) != arr[i]) {
				list.add(arr[i]); // 해당 배열값 리스트에 저장
				idx++; // 인덱스 증가
			}
		}
		int[]answer = list.stream().mapToInt(i->i).toArray(); // 리스트를 배열로 전환
        return answer;
    }
}