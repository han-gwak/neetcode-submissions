class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numCount = new HashMap<>();

        // insert nums then convert map by value set
        for (int num : nums) {
            int count = numCount.getOrDefault(num, 0);
            count++;
            numCount.put(num, count);
        }

        Queue<IntPair> countQueue = new PriorityQueue<>();
        for (Map.Entry<Integer, Integer> entry : numCount.entrySet()) {
            IntPair numPair = new IntPair(entry.getKey(), entry.getValue());
            countQueue.add(numPair);
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            IntPair res = countQueue.poll();
            result[i] = res.num;
        }

        return result;
    }

    class IntPair implements Comparable<IntPair> {
        int num;
        int count;

        public IntPair(int num, int count) {
            this.num = num;
            this.count = count;
        }

        @Override
        public int compareTo(IntPair other) {
            if (other == null) {
                return 1;
            }
            if (this.count > other.count) {
                return -1;
            } else if (this.count == other.count) {
                return 0;
            } else {
                return 1; 
            }
        }
    }

}
