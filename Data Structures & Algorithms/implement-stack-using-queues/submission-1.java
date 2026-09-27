class MyStack {
    Queue<Integer> stackQ = new LinkedList<>();
    Queue<Integer> orderQ = new LinkedList<>();

    public MyStack() {
    }
    
    public void push(int x) {
        orderQ.add(x);
        while (!stackQ.isEmpty()) {
            orderQ.add(stackQ.poll());
        }
        Queue<Integer> temp = stackQ;
        stackQ = orderQ;
        orderQ = temp;
    }
    
    public int pop() {
        return stackQ.poll();
    }
    
    public int top() {
        return stackQ.peek();
    }
    
    public boolean empty() {
        return stackQ.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */