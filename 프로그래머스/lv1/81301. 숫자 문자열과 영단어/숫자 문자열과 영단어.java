class Solution {
    public int solution(String s) {
        int answer = 0;
        s = s.replaceAll("zero", "0");
		s = s.replaceAll("one", "1");
		s = s.replaceAll("two", "2");
		s = s.replaceAll("three", "3");
		s = s.replaceAll("four", "4");
		s = s.replaceAll("five", "5");
		s = s.replaceAll("six", "6");
		s = s.replaceAll("seven", "7");
		s = s.replaceAll("eight", "8");
		s = s.replaceAll("nine", "9"); // 각 문자에 맞는 숫자로 변환
		answer = Integer.parseInt(s); // 문자열을 정수로 변환
        return answer;
    }
}