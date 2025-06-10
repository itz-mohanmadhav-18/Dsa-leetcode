class Solution {
    public int maxDifference(String s) {
        if (s == null || s.length() == 0)
            return 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // HashMap Implementation
        // Map<Character,Integer> map = new HashMap<>();

        // for(int i = 0 ; i<s.length() ; i++){
        //     char x = s.charAt(i);
        //     map.put(x,map.getOrDefault(x,0)+1);
        // }
        // for(int freq : map.values()){
        //     if(freq % 2 == 0){
        //         min = Math.min(freq,min);
        //     }else{
        //         max = Math.max(freq,max);
        //     }
        // }

        // array implementation

        int freq[] = new int[26];
        for (char x : s.toCharArray()) {
            freq[x - 'a']++;
        }

        for (int x : freq) {
            if (x != 0) {
                if (x % 2 == 0) {
                    min = Math.min(x, min);
                } else {
                    max = Math.max(x, max);
                }
            }

        }

        return max - min;

    }
}