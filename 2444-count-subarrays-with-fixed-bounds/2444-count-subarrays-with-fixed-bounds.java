class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        int lastMin = -1;
        int lastMax = -1;
        int lastBad = -1;

        for (int right = 0; right < nums.length; right++) {
            int x = nums[right];

            if (x < minK || x > maxK) {
                lastBad = right;
            }

            if (x == minK) {
                lastMin = right;
            }

            if (x == maxK) {
                lastMax = right;
            }

            ans += Math.max(0, Math.min(lastMin, lastMax) - lastBad);
        }

        return ans;
    }
}