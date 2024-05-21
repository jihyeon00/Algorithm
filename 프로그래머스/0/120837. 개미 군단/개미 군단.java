class Solution {
    public int solution(int hp) {
        return hp%5==1 || hp%5==3 ? hp/5 + 1 : hp%5==2 || hp%5==4 ? hp/5+2: hp/5;
    }
}