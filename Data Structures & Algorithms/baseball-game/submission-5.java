class Solution {
    public int calPoints(String[] operations) {
        List<Integer> scores = new LinkedList<>();
        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("+")) {
                if (scores.size() > 1) {
                    scores.add(scores.get(scores.size() - 2) + scores.get(scores.size() - 1));
                }
            } else if (operations[i].equals("D")) {
                if (scores.size() > 0) {
                    scores.add(scores.get(scores.size() - 1) * 2);
                }
            } else if (operations[i].equals("C")) {
                if (scores.size() > 0) {
                    scores.remove(scores.size() - 1);
                }
            } else {
                scores.add(Integer.parseInt(operations[i]));
            }
        }

        int total = 0;
        for (Integer sc : scores) {
            total += sc;
        }
            
        return total;
    }
}