class Solution {
    public String maximumOddBinaryNumber(String s) {

        String ans = "";
        int num = 0 ;
        for(int i = 0 ; i <s.length() ; i++){
              if(s.charAt(i)=='1'){
                num++;
              }
        }
        System.out.println(num);
        while(num>1){
            ans+="1";
            num--;
        }
        int remainingLength = s.length()-ans.length();
        while(remainingLength>1){
            ans+="0";
            remainingLength--;
        }
        return ans+"1";
        
    }
}