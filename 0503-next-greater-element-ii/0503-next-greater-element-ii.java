class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int index = i % n;

            while (!stack.isEmpty() && nums[index] >= stack.peek())
                stack.pop();

            if (stack.empty())
                nge[index] = -1;
            else
                nge[index] = stack.peek();

            stack.push(nums[index]);
        }

        return nge;
    }
}