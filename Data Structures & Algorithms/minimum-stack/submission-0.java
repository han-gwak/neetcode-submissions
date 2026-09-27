class MinStack {

    List<Integer> stack;
    int min;

    public MinStack() {
        this.stack = new LinkedList<>();
        this.min = Integer.MAX_VALUE;
        
    }
    
    public void push(int val) {
        if (this.stack != null) {
            if (min > val) {
                min = val;
            }
            stack.add(val);
        }
    }
    
    public void pop() {
        if (this.stack != null && stack.size() > 0) {
            int value = stack.remove(stack.size() - 1);
            if (min == value) {
                min = Integer.MAX_VALUE;
            }
        }
    }
    
    public int top() {
        if (this.stack == null) {
            return 0;
        }
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        if (min == Integer.MAX_VALUE && this.stack != null) {
            min = stack.get(0);
            for (Integer i : stack) {
                min = (min > i) ? i : min;
            }
        }
        return min;
    }
}
