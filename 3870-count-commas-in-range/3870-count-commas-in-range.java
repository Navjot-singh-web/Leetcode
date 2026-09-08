class Solution {
    public int countCommas(int n) {
        int org =n;
        int digit =0;
        while(org>0){
            org= org/10;
            digit++;
        }
        org =n;
        if(digit<4){
            return 0;
        }
        int a=n - 1000 +1;
        return a;
    }
}