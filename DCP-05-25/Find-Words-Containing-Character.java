class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        int idx = 0;
        for(String str : words){
            if(str.contains(x+"")){
                ans.add(idx++);
            }else
            idx++;
        }
        return ans;
    }
}