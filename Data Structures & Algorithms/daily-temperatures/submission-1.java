class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // // want to find next time the temp is warmer than curr
        // int[] result = new int[temperatures.length];
        // for (int i = 0; i < temperatures.length; i++) {
        //     int curr = temperatures[i];
        //     for (int j = i + 1; j < temperatures.length; j++) {
        //         if (temperatures[j] > temperatures[i]) {
        //             result[i] = j - i;
        //             break;
        //         }
        //     }
        // }
        // return result;
        int[] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>(); // pair: [temp, index]
        for (int i = 0; i < temperatures.length; i++) {
            int curr = temperatures[i];
            while (!stack.isEmpty() && curr > stack.peek()[0]) {
                int[] tempIndex = stack.pop();
                result[tempIndex[1]] = i - tempIndex[1];
            }
            // add to stack to process later
            stack.push(new int[]{curr, i});
        }

        return result;
    }
}
