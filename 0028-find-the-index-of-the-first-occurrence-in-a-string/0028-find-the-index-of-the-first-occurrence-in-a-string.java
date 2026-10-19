class Solution {
    public int strStr(String haystack, String needle) {
        int idx = -1;
        if(haystack.contains(needle)){
            idx = haystack.indexOf(needle);
        }
        return idx;
    }
}