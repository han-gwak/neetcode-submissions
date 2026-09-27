class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            numbers.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            int j = numbers.getOrDefault(remainder, -1);
            if (j > -1 && j != i) {
                return new int[] {i, j};
            }
        }
        return null;
    }
}
