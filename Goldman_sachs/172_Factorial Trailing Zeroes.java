class Solution {
    public int trailingZeroes(int n) {
        int results=0;
        while(n>=5)
        {
            n/=5;
            results+=Math.floor(n);
        }
        return results;
    }
}