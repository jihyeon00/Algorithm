class Solution {
    public int solution(int n) {
        return n<8 ? 1 : n%7 == 0 ? n/7 : n/7+1;
    }
}