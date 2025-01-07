class Solution {
    public List<String> stringMatching(String[] words) {
        // Arrays.sort(words);
        List<String> ans = new ArrayList<>();
        for(int i = 0 ; i < words.length;i++){
            for(int j = 0 ; j<words.length ; j++){
                if(words[i].contains(words[j])&&words[i]!=words[j]){
                    if(!ans.contains(words[j])){
                        ans.add(words[j]);
                    }
                }
            }

        }
        return ans;
    }

}
