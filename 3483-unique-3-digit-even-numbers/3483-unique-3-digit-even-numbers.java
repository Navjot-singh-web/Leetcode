class Solution {
    public int totalNumbers(int[] digits) {
        int n = digits.length;
        HashSet<Integer> s = new HashSet<>();
        for(int i =0;i<n;i++){
            int a =digits[i];
            int idx = i ;
            
            for(int j=0;j<n;j++){
                if(j == idx)
                continue;
                for(int k =0;k<n;k++){
                    if(j == k)
                     continue;
                    if(i == k)
                     continue;
                    if(digits[i] != 0){
                    int num= (digits[i]*100)+(digits[j]*10)+digits[k];
                    if(num%2 == 0)
                       s.add(num);
                    }
                }
            }
        }
        return s.size();
    }
}