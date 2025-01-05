// import java.utils.*;
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int sum = 0;
        for (int i = shifts.length - 1; i >= 0; i--) {
            sum = (sum + shifts[i]) % 26;
            shifts[i] = sum;
        }
        StringBuilder replaced = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char charToBeReplaced = s.charAt(i);
            char newChar = (char) ('a' + (charToBeReplaced - 'a' + shifts[i]) % 26);
            replaced.append(newChar);
        }
        return replaced.toString();
    }
}