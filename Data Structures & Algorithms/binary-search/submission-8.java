class Solution {
    public int search(int[] nums, int target) {
        return search(0, nums.length - 1, nums, target);
    }

    public int search(int left, int right, int[] nums, int target) {
        int midpoint = left + ((right - left) / 2);
        if (left > right) {
            return -1;
        } else if (nums[midpoint] == target) {
            return midpoint;
        } else if (nums[midpoint] > target) {
            return search(left, midpoint - 1, nums, target);
        } else if (nums[midpoint] < target) {
            return search(midpoint + 1, right, nums, target);
        } else {
            return -1;
        }
    }
}
