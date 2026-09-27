class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        for (int student : students) {
            queue.add(student);
        }
        
        // break condition: either no sandwiches, or no sandwiches that students will eat
        int res = students.length;
        
        for (int sandwich : sandwiches) {
            int count = 0;
            while ( count < students.length && queue.peek() != sandwich) {
                // back of the line
                queue.offer(queue.poll());
                count++;
            }
            if (queue.peek() == sandwich) {
                queue.poll(); // remove student from queue
                res--;
            } else {
                // no sandwiches that any student will eat
                break;
            }
        }

        return res;

    }
}