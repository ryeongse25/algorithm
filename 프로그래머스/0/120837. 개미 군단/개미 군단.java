class Solution {
    public int solution(int hp) {
        int cnt = 0;
        for (int i : new int[] {5, 3, 1}) {
            cnt += hp / i;
            hp %= i;
        }
        return cnt;
    }
}