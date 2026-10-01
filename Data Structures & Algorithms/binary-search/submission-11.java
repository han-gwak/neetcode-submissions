class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = r - l / 2;
            if (nums[mid] == target) {
                return mid;
            } else {
                if (nums[mid] > target) {
                    // search in left half
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return -1;
    }
    // recursive soln
    //     return search(0, nums.length - 1, nums, target);
    // }

    // public int search(int left, int right, int[] nums, int target) {
    //     if (left > right) {
    //         return -1;
    //     }

    //     int mid = (left + right) / 2;
    //     if (nums[mid] == target) {
    //         return mid;
    //     } else {
    //         if (nums[mid] < target) {
    //             return search(mid + 1, right, nums, target);
    //         } else {
    //             return search(left, mid - 1, nums, target);
    //         }
    //     }
    // }
}