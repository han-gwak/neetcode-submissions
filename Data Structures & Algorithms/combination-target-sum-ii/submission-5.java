class Solution {
    List<List<Integer>> results;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); // O(n log n)
        results = new LinkedList<>();
        generateCombination(candidates, target, 0, new Stack(), 0);
        return results;
    }

    public void generateCombination(int[] candidates, int target, int index, List<Integer> stack, int total) {

        if (target == total) {
            System.out.println("Stack: " + stack.size());
            results.add(new ArrayList<>(stack));
            return;
        } 
        
        if (total > target || index == candidates.length) {
            return;
        }

        stack.add(candidates[index]);
        generateCombination(candidates, target, index + 1, stack, total + candidates[index]);
        stack.remove(stack.size() - 1); // backtrack

        while (index + 1 < candidates.length && candidates[index] == candidates[index + 1]) {
            index++;
        }
        generateCombination(candidates, target, index + 1, stack, total);
    }

}
