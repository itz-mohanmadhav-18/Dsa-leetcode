class Solution {
    public int longestPalindrome(String s) {
        int[] counts = new int[128];
        for(char ch : s.toCharArray()) {
            counts[ch]++;
        }
        int len = 0;
        boolean odd = false; 
        for(int count: counts) {
            if(count % 2 == 0) {
                len += count; 
            } else {
                len += count - 1;
                if(!odd) {
                    len += 1;
                    odd = true;
                }
            }
        }
        return len;
    }
}