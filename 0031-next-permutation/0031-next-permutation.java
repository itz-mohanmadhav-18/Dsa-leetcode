class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        boolean isNotSorted = true;
        int nextBigIdx = -1;
        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                for (int j = len - 1; j > i; j--) {
                    if (nums[j] > nums[i]) {
                        nextBigIdx = j;
                        break;
                    }
                }
                swap(nums, i, nextBigIdx);
                reverse(nums, i + 1, len - 1);
                isNotSorted = false;
                break;
            }
        }
        if (isNotSorted) {
            reverse(nums, 0, len - 1);
        }

    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i++, j--);
        }
    }
}