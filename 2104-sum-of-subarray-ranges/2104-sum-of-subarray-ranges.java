class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long minSum = 0;
        long maxSum = 0;

        int[] prevSmall = previousSmaller(nums);
        int[] nextSmall = nextSmaller(nums);

        int[] prevGreater = previousGreater(nums);
        int[] nextGreater = nextGreater(nums);

        for (int i = 0; i < n; i++) {
            long left = i - prevSmall[i];
            long right = nextSmall[i] - i;
            minSum += (long) nums[i] * left * right;

            left = i - prevGreater[i];
            right = nextGreater[i] - i;
            maxSum += (long) nums[i] * left * right;
        }

        return maxSum - minSum;
    }

    private int[] previousSmaller(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] > nums[i]) 
                st.pop();

            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return ans;
    }

    private int[] nextSmaller(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) 
                st.pop();

            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return ans;
    }

    private int[] previousGreater(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] < nums[i])
                st.pop();

            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return ans;
    }

    private int[] nextGreater(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i]) 
                st.pop();
    
            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        return ans;
    }
}