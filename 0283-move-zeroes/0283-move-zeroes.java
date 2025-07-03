class Solution {
    public void moveZeroes(int[] arr) {
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[idx++] = arr[i];
            }
        }
        Arrays.fill(arr, idx, arr.length, 0);
    }

}
