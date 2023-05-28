class Solution {
    public String solution(String a, String b) {
        String answer = "";
        String zero = ""; // 자리수 맞추는 변수
		String num1, num2, str=""; // 형변환 변수
		int sum=0, up=0; // 계산 변수
		int len = a.length() >= b.length() ? a.length()-b.length() : b.length()-a.length(); // 가장긴 길이 변수
		StringBuffer sb = null;
		
		for (int i = 0; i <len ; i++) { zero = zero+"0"; } // 두 수의 차 만큼 0 찍기
		if(a.length()>b.length()) { b = zero + b; } 
		else { a = zero + a;}  // 짧은 숫자 앞에 0으로 채우기
		
		char[] arrA = a.toCharArray(); // 배열에 한글자씩 저장
		char[] arrB = b.toCharArray(); // 배열에 한글자씩 저장
		
		for (int i = arrB.length-1; i >=0; i--) {
			num1 = String.valueOf(arrA[i]);
			num2 = String.valueOf(arrB[i]);
			sum = Integer.parseInt(num1) + Integer.parseInt(num2) + up; 			
			if(sum >= 10) {
				if(i == 0) {
					sum = sum % 10;
					str = str + sum + "1";
					break;
				}
				else {
					up = 1;
					sum = sum % 10;
				}
			}
			else { up = 0; }
			str = str + sum;		
		}		
		sb = new StringBuffer(str);
		answer = sb.reverse().toString();		
        return answer;
    }
}