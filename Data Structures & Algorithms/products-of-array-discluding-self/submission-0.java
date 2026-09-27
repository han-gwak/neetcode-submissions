class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] results = new int[nums.length];
        int product = 1;
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
             if (nums[i] == 0) {
                zeroCount++;
             } else {
                product = product * nums[i];
             }
        }

            if (zeroCount > 1) {
                return results;
            } 

        for (int i = 0; i < results.length; i++) {
            if (zeroCount > 0) {
                if (nums[i] == 0) {
                    results[i] = product;
                } else {
                    results[i] = 0;
                }
            } else {
                results[i] = product / nums[i];
            }
        }
        return results;
    }
}  
