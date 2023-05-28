class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";       
		String[] arr = my_string.split(""); // 배열에 한글자씩 저장
		for (int i = 0; i < indices.length; i++) {
			arr[indices[i]] = arr[indices[i]].replace(arr[indices[i]], ""); // 조건에 맞는 인덱스 공백 처리
		}
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i]; // 배열값 문자열로 저장
		}		
        return answer;
    }
}