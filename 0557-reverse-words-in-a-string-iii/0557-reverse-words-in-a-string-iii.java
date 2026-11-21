class Solution {
    public String reverseWords(String s) {
        List<String> ls = Arrays.asList(s.split(" "));
        for(int i=0;i<ls.size();i++){
            String rev = new StringBuffer(ls.get(i)).reverse().toString();
            ls.set(i,rev);
        }    
        String res = String.join(" ", ls);
        return res;
    }
}