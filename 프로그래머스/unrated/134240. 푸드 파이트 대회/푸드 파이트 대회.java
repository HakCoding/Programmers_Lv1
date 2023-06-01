class Solution {
    public String solution(int[] food) {
        String answer = "";
        String str = ""; // 임시저장 변수
		for (int i = 1; i < food.length; i++) {
			if (food[i] != 0) { // 음식이 0인지 확인
				for (int j = 0; j < food[i] / 2; j++) {
					str += Integer.toString(i); // 음식의 수 반만큼 담기
				}
			}
		}
		str = str+"0"; // 준비된 음식에 물을 추가
		for (int i = str.length()-1; i >=0 ; i--) {
			str +=str.substring(i, i+1); // 기존음식 반대로 입력
		}
		answer = str.replaceFirst("0",""); // 물하나 제거
        return answer;
    }
}