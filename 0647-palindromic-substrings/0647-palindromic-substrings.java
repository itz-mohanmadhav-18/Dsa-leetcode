class Solution {



    public int helper(String s , int idx){

        if(idx==s.length()) return 0;

        int ans = 0;

        for(int i = idx ; i<s.length() ; i++){

            if(isPalin(s.substring(idx,i+1))){
                ans++;
            }

        }

        int subsequentCalls = helper(s,idx+1);
        int finalAns = ans + subsequentCalls;
        
        return finalAns;

    }

    public int countSubstrings(String s) {

        return helper(s,0);
        
    }

    public boolean isPalin(String s){

        for(int i  = 0,j=s.length()-1 ; i<=j ; i++,j--){
            if(s.charAt(i)!=s.charAt(j)) return false;
        }

        return true;

    }


}