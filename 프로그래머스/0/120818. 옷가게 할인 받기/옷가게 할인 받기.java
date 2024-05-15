class Solution {
    public int solution(int price) {
        int answer = 0;
                if(price>=50_0000)
        	answer=(int)(price*0.8);
        else if(price>=30_0000)
        	answer=(int)(price*0.9);
        else if(price>=10_0000)
        	answer=(int)(price*0.95);
        else
        	answer=price;
        return answer;
    }
}