class Solution {
    public String solution(int[] numbers, String hand) {
        
        StringBuilder sb = new StringBuilder();
        
        int leftHand = 10;  // *
        int rightHand = 12; // #
        
        for(int number : numbers) {
            
            if(number == 0) number = 11; // 0
            
            switch(number % 3) {
                case 0 :  // right
                    rightHand = number;
                    sb.append("R");
                    break;
                    
                case 1 :  // left
                    leftHand = number;
                    sb.append("L");
                    break;
                    
                case 2 :  // middle
                    
                    int calL = leftHand - number;  // 왼손번호 - 눌러야할 번호
                    if(calL < 0) calL = calL * -1; // 음수일경우 -> 양수
                    
                    int calR = rightHand - number; // 오른손번호 - 눌러야할 번호
                    if(calR < 0) calR = calR * -1; // 음수일경우 -> 양수
                    
                    int distanceL = (calL % 3) + (calL / 3); // 번호와의 거리 (왼손)
                    int distanceR = (calR % 3) + (calR / 3); // 번호와의 거리 (오른손)
                    
                    if(distanceL < distanceR) { // 왼손의 거리가 더 짧을 경우
                        leftHand = number;
                        sb.append("L");
                        
                    }else if(distanceL > distanceR) { // 오른손의 거리가 더 짧을 경우
                        rightHand = number;
                        sb.append("R");
                        
                    }else { // 거리가 같을 경우
                        if("left".equals(hand)){
                            leftHand = number;
                            sb.append("L");
                        }else {
                            rightHand = number;
                            sb.append("R");
                        }
                    }
                    break;
            }
        }
        return sb.toString();
    }
    
}