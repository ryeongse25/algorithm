class Solution {
    public int solution(int[] array, int height) {
        int cnt = 0;
        for (int h : array) {
            cnt += h > height ? 1 : 0;
        }
        return cnt;
    }
}