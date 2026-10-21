class Solution {
    public int reverseBits(int n) {
        String binary = Integer.toBinaryString(n);
        binary = String.format("%32s", binary).replace(' ', '0');
        StringBuilder sb = new StringBuilder(binary);
        sb.reverse();
        int ans = Integer.parseInt(sb.toString(), 2);
        return ans;
    }
}