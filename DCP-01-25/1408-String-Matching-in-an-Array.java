class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String current = words[i];
            if (isSubstring(words, current, i)) {
                result.add(current);
            } 
        }

        return result;
    }

    private static boolean isSubstring(String[] words, String curr, int indexToExclude) {
        for (int j = 0; j < words.length; j++) {
            if (j == indexToExclude)
                continue;
            String other = words[j];
            if (other.contains(curr)) {
                return true;
            }
        }

        return false;
    }
}