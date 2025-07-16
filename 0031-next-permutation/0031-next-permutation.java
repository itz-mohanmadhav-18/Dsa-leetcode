class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int nextMaxIdx = -1;
        boolean flag = false;

        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                // Step 1: Find just larger element on the right
                for (int j = len - 1; j > i; j--) {
                    if (nums[j] > nums[i]) {
                        nextMaxIdx = j;
                        break;
                    }
                }
                // Step 2: Swap and reverse
                swap(nums, i, nextMaxIdx);
                reverse(nums, i + 1, len - 1);
                flag = true;
                break;
            }
        }

        if (!flag) {
            reverse(nums, 0, len - 1);
        }
    }

    public void reverse(int[] arr, int i, int j) {
        for (; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
