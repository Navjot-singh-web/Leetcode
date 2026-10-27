class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int even =0;
        int odd =0;
        for(int j =0;j<n;j++){
           if(nums[j]%2 ==0)
            even++;
        }
        odd = n-even;
        int[] orr = new int[odd];
        int[] err = new int[even];
        int j =0;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2 ==0){
                err[j] = nums[i];
                j++;
            }
            else{
                orr[k]= nums[i];
                k++;
            }
        }
        for(int i =0;i<even;i++){
            nums[i] = err[i];
        }
        for(int i= even; i<(even+odd);i++)
           nums[i]= orr[i-even];
        
      return nums;
    }
}