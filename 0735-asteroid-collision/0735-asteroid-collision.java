class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int a : asteroids) {
            if (a > 0) {
                st.push(a);
            } else {
                while (!st.empty() && st.peek() > 0 && st.peek() < Math.abs(a)) {
                    st.pop();
                }
                if (!st.empty() && st.peek() > 0 && st.peek() == Math.abs(a)) {
                    st.pop();
                    continue;
                }
                if (st.empty() || st.peek() < 0) {
                    st.push(a);
                }
            }
        }
        int n = st.size();
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}