class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0, r = n - 1;
        while (l <= r) {
            int midway = l + ((r - l) / 2);
            if (nums[midway] == target) {
                return midway;
            } else if (nums[midway] > target) {
                r = midway - 1;
            } else {
                l = midway + 1;
            }
        }
        return -1;
    }
}
