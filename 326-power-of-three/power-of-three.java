class Solution {
    public boolean isPowerOfThree(int n) {
        int pw = 1162261467;
        return n > 0 && pw % n == 0;
    }
}