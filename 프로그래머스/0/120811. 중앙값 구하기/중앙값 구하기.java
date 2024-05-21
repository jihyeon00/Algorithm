import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        // 1. 배열 오름차순 정렬
        Arrays.sort(array);
        // 2. 배열의 중앙번호 가져오기
        int arrayLength = array.length;
        // 3. 배열의 중앙값 return
        return array[arrayLength/2]  ;
    }
}