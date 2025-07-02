class Solution {
    public int possibleStringCount(String word) {
        // ==========================================
        // approach failed due to this situation "ere"
        // ==========================================

        // Map<Character,Integer> map = new HashMap<>();
        // for(char x : word.toCharArray()){
        //     map.put(x,map.getOrDefault(x,0)+1);
        // }
        // int count = 1;
        // for(Map.Entry<Character,Integer> entry:map.entrySet()){
        //     if(entry.getValue()>1){
        //         count+=entry.getValue()-1;
        //     }
        // }
        int count =1;
        for(int i = 1 ; i<word.length() ; i++){
            if(word.charAt(i)==word.charAt(i-1)) count++;
        }

        return count;
        
    }
}