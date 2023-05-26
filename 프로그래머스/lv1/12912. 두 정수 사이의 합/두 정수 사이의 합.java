class Solution {
    public long solution(int a, int b) {      
        long answer = 0;
        int start, end;
        start = a;
        end = b;
        
        if(start >= end){
            start = b;
            end = a;
        }
        for (int i = start; i <= end ; i++) {			
			answer = answer + i;
		}
		
        return answer;
    }
}