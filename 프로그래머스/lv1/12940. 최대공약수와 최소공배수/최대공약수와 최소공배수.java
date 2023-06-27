class Solution {
    public int[] solution(int n, int m) {        
        int up = Math.max(n, m); // 큰 값 구하기
		int down = Math.min(n, m); // 작은 값 구하기
		while (down != 0) { // 최대 공약수
			int tmp = up % down;
			up = down;
			down = tmp;
		}
		int gcd = n * m / up; // 최소 공배수
		int[] answer = new int[] { up, gcd }; // 배열에 저장
		return answer;
    }
}