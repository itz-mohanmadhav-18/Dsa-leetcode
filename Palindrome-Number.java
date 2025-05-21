import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        int origx = x;
        int revx = 0;
        while(x>0){
            int dig = x%10;
            revx = 10*revx+dig;
            x /= 10;
        }
        return origx == revx;
        
    }
}