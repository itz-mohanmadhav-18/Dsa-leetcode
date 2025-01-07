class Solution {
    public List<String> stringMatching(String[] words) {
        // Arrays.sort(words);
        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
        Set<String> ans = new HashSet<>();
        for(int i = 0 ; i < words.length;i++){
            // System.out.print(words[i]+" ")
            for(int j = i+1 ; j<words.length ; j++){
            // System.out.print(words[i]+" ");
                if(words[j].contains(words[i])){
                       ans.add(words[i]);
                       break;
                    }
                
            }

        }
        return new ArrayList<>(ans);
    }
}
