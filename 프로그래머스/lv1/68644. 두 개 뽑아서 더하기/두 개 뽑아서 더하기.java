import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int sum = 0; // 두수의 합 계산 변수
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				sum = numbers[i] + numbers[j]; // 해당인덱스와 그다음 인덱스를 더한다
				list.add(sum); // 리스트에 저장
			}
		}
		list.sort(null); // 오름차순 정렬
		List<Integer> intlist = list.stream().distinct().collect(Collectors.toList()); // 리스트 중복 제거
		int[] answer = intlist.stream().mapToInt(i -> i).toArray(); // 리스트를 정수형 배열로 변환
        return answer;
    }
}