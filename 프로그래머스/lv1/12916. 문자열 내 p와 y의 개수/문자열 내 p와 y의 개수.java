class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] arr = s.split(""); // 한글자씩 배열에 저장
		int p = 0, y = 0; // p, y 카운터 변수
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals("p") || arr[i].equals("P")) p++; // p나 P가 있으면 변수 증가 
			if(arr[i].equals("y") || arr[i].equals("Y")) y++; // y나 Y가 있으면 변수 증가
		}
		answer = p == y ? true : false ; // 갯수가 같은지 비교
        return answer;
    }
}