class Solution {
    public int removeElement(int[] nums, int val) {
        // //brute force
        // List<Integer> res = new LinkedList<>();
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] != val) {
        //         res.add(nums[i]);
        //     }
        // }
        // for (int i = 0; i < res.size(); i++) {
        //     nums[i] = res.get(i);
        // }
        // return res.size();

        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}