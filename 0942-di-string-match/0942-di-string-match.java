class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int i =0;
        int j =n;
        int[] ans = new int[n+1];
        for(int k=0;k<n;k++){
            if(s.charAt(k) == 'I'){
                ans[k]=i;
                i++;
            }
            else{
                ans[k] =j;
                j--;
            }
        }
        ans[n]=i;
        return ans;
    }
}