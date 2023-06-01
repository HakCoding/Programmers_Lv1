class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray(); // 배열에 한글자씩담기
		for (int i = 0; i < arr.length; i++) {
            if(s.length() !=4 && s.length() != 6){ // 문자열의 길이 판단
                answer = false; // 조건이 참이 아니면 false
                break; // 반복문 정지
            }
			if(arr[i] < '0' || arr[i] > '9') { // 배열값이 숫자인지 판단
				answer = false; // 숫자가 아니라면 false 저장
				break; // 반복문 정지 
			}
		}
        return answer;
    }
}