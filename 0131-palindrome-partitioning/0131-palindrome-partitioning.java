class Solution {

    public void helper(String s , int ind , List<String> curr , List<List<String>> ans , boolean[][] isPal){

        if(ind>=s.length()){
            ans.add(new ArrayList<>(curr));
        }

        for(int i = ind ; i < s.length() ; i++){
            if(isPal[ind][i]){
                curr.add(s.substring(ind,i+1));
                helper(s,i+1,curr,ans,isPal);
                curr.remove(curr.size()-1);
            }
        }

    }

    public List<List<String>> partition(String s) {

        List<List<String>> ans = new ArrayList<>();

        int len = s.length();

        boolean[][] isPal = new boolean[len][len];

        for(int gap = 0 ; gap < len ; gap++){
            for(int i = 0 , j = gap ; j < len ; i++,j++){
                if(gap==0) isPal[i][j] = true;
                else if(gap==1) isPal[i][j] = s.charAt(i)==s.charAt(j);
                else if(s.charAt(i)==s.charAt(j)) isPal[i][j] = isPal[i+1][j-1];
            }
        }

        // now we have stored which substrings are pallindormes

        helper(s,0,new ArrayList<>(),ans,isPal);

        return ans;

        
    }
}