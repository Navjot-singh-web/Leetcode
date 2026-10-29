class Solution {
    public int pivotIndex(int[] nums) {
        int N = nums.length;
        int sum = 0;
        for (int num : nums)
            sum += num;
        int lsum = 0;
        for (int i = 0; i < N; i++) {
            if (lsum == (sum - lsum - nums[i]))
                return i;
            lsum += nums[i];
        }
        return -1;
    }
}
