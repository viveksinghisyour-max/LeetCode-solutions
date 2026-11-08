class Solution {
    public boolean isPowerOfThree(int n) {
        int pw = 1162261467;
        if(n > 0 && pw % n == 0){
            return true;
        }
        return false;
    }
}