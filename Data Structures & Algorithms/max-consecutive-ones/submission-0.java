class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;
        for (int i : nums) {
            if (i == 1) {
                current++;
            } else {
                current = 0;
            }
            max = (current > max) ? current : max;
        }
        return max;
    }
}