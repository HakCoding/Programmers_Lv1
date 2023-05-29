class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] arr = phone_number.toCharArray(); // 배열에 한글자씩 저장	
		for (int i = 0; i < arr.length-4; i++) arr[i] = '*'; // 배열 끝 4개 이외는 * 로 표시
		for (int i = 0; i < arr.length; i++) answer = answer + String.valueOf(arr[i]); // 문자열로 변환
        return answer;
    }
}