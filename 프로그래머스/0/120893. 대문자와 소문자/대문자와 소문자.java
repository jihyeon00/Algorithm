class Solution {
    public String solution(String my_string) {
        String answer = "";
         for(char ch : my_string.toCharArray()) {
        	if(ch>='a'&& ch<='z') { 		// 소문자이면
        		answer += (char)(ch-32);    // 대문자로 변경
        	}else if(ch>='A'&& ch<='Z'){	// 대문자이면
        		answer += (char)(ch+32);    // 소문자로 변경
        
        	}
        }
        return answer;
    }
}