class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int idx = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           if(nums[i] == nums[i+1]){
            idx=i;
            break;
           }
        }
        return nums[idx];
    }
}