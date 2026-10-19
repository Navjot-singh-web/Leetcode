class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j =0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ans.add(nums2[j]);
                    nums2[j]=-1;
                    break;
                }
            }
        }
        int[] arr = new int[ans.size()];
        for(int i =0;i<ans.size();i++)
           arr[i]=ans.get(i);
        return arr;
    }
}