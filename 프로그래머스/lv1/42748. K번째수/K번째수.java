import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        String[] arr = new String[commands.length]; // 문자열 배열 선언
		for (int i = 0; i < commands.length; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>(); // 해당 인덱스를 참조하는 리시트 서언
			for (int j = commands[i][0]-1; j <= commands[i][1]-1; j++) {				
				list.add(array[j]); // 조건 범위의 배열값 리스트에 저장
			}
			list.sort(null); // 오름차순 정렬
			arr[i] = String.valueOf(list.get(commands[i][2]-1)); // 문자열로 변환 후 배열에 저장
		}		
		int[] answer = Arrays.asList(arr).stream().mapToInt(Integer::parseInt).toArray(); // 문자열 배열 정수 배열로 변환 후 저장
        return answer;
    }
}