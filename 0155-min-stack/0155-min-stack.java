class MinStack {
    Stack<Long> st;
    long mini;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int value) {
        if (st.isEmpty()) {
            mini = value;
            st.push((long) value);
        }

        else if (value >= mini) {
            st.push((long) value);
        }

        else {

            st.push(2L * value - mini);

            mini = value;
        }
    }

    public void pop() {
        if (st.isEmpty())
            return;
        long top = st.pop();
        if (top < mini) {
            mini = 2 * mini - top;
        }
    }

    public int top() {
        long top = st.peek();
        if (top >= mini)
            return (int) top;
        return (int) mini;
    }

    public int getMin() {
        return (int) mini;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */