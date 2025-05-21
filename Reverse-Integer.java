import java.util.*;
class Solution {
    public int reverse(int x) {
        int newNum = 0;
        while(x!=0){
            int rem = x % 10;
            if (newNum > Integer.MAX_VALUE / 10 || newNum < Integer.MIN_VALUE / 10) {
                return 0; // overflow case
            }
            newNum = newNum*10 + rem;

            x/=10;
        }
        return newNum;
    }
}