class Solution {
    public boolean checkInclusion(String s1, String s2) {
           for (int i = 0; i <= s2.length() - s1.length(); i++){
            String s = s2.substring(i, i + s1.length());
            char[] a = s1.toCharArray();
            char[] b = s.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);
             if(Arrays.equals(a,b))
                return true;
        }
       
        return false;
    }
}