class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for(char x : chars){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int freq : map.values()){
            if(freq % 2==0){
                min = Math.min(freq,min);
            }else{
                max = Math.max(freq,max);
            }
        }

        return max-min;
        
    }
}