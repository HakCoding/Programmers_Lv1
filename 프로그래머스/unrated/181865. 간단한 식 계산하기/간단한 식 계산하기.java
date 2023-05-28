class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] arr = binomial.split(" "); // 공백 기준으로 배열에 저장
		if (arr[1].equals("+")) { // 배열에 1번 인덱스가 + 면
			answer = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]); // 형태 변환후 계산하여 저장
		}
		if (arr[1].equals("-")) { // 배열에 1번 인덱스가 - 면
			answer = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]); // 형태 변환후 계산하여 저장
		}
		if (arr[1].equals("*")) { // 배열에 1번 인덱스가 * 면
			answer = Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]); // 형태 변환후 계산하여 저장
		}		
        return answer;
    }
}