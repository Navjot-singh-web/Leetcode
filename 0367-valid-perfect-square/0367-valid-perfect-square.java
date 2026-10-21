class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 0;
        int high = num;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long sqr = (long) mid * mid;
            if (sqr == num) 
                return true;
             else if (sqr<num) {
                low = mid + 1;
            } else 
                high = mid - 1;
        }

        return false;
    }
}