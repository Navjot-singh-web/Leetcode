class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int five =0;
        int ten =0;
        int twnty =0;
        for(int i =0;i<n;i++){
           if(bills[i] == 5)
              five++;
            if(bills[i] == 10){
                 if(five<=0)
                   return false;
                five--;
                ten++;
            } 
            if(bills[i] == 20){
                twnty++;
                if(five>0 && ten>0){
                    ten--;
                    five--;
                }
                else if(five >=3){
                    five-=3;
                }
                else
                  return false;
            }  
        }
        return true;
    }
}