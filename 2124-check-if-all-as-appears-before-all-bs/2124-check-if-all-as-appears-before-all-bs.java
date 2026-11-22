class Solution {
    public boolean checkString(String s) {
         int flag =0;
         for(char ch: s.toCharArray()){
            if(ch == 'b'){
                flag =1;
            }
            if(flag == 1 && ch == 'a')
              return false;
         }
         return true;
    }
}