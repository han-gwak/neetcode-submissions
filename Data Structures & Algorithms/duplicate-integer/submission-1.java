class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums == null) {
            return false;
        }
        int length = nums.length;
        Set<Integer> intSet = new HashSet<Integer>();
        for (int num : nums) {
            intSet.add(num);
        }
        return intSet.size() != length;
    }
}