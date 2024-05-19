class Solution {
    public int solution(int n, int k) {
        int eat=0;
        if(n>=10) {
        	eat = n/10;
        }
        return (12000*n)+((k-eat)*2000);
    }
}