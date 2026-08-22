class Solution {
    public boolean checkDivisibility(int n) {
        int org =n;
        int sum =0;
        int prdct =1;
        while(n>0){
         int mod = n%10;
         sum = sum + mod;
         prdct = prdct*mod;
         n = n/10;
        }
        sum = sum +prdct;
        if(org%sum == 0)
        return true;
        else
        return false;
    }
}