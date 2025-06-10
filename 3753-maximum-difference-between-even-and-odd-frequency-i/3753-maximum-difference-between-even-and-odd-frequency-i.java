class Solution {
    public int maxDifference(String s) {
        if (s == null || s.length() == 0) return 0;

        Map<Character, Integer> freqMap = new HashMap<>();
        int minEven = Integer.MAX_VALUE;
        int maxOdd = Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (int freq : freqMap.values()) {
            if (freq % 2 == 0) {
                minEven = Math.min(minEven, freq);
            } else {
                maxOdd = Math.max(maxOdd, freq);
            }
        }

        // Handle edge case: if no even or no odd frequency
        if (minEven == Integer.MAX_VALUE || maxOdd == Integer.MIN_VALUE) {
            return 0;
        }

        return maxOdd - minEven;
    }
}
